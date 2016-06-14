package com.game.assistance.aop;

import com.game.assistance.constants.ResponseEnum;
import com.game.assistance.exception.ParamException;
import com.game.assistance.response.BaseDataResponse;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * Log 并且处理 统一处理Exception
 *
 * Created by wenqing on 2016/6/12 0012.
 */
@Aspect
@Component
@Order(1)
public class ControllerLogAop {
    private static Logger LOGGER = LoggerFactory.getLogger(ControllerLogAop.class);

    @Autowired
    private HttpServletRequest request;

    /**
     * 定义Controller的切面
     * <p>
     * 必须在 com.huami.controller 下，方法上必须有 RequestMapping 注解
     */
    @Pointcut("execution(* com.game.assistance.controller..*.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void controllerAspect() {
    }

    /**
     * 对切面执行 around 处理
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("controllerAspect()")
    public Object doController(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        // 监控关键metric
        String monitorKey = this.getMonitorKey(pjp);
        Object result = null;
        //业务逻辑
        try {
            //监控日志
            this.monitorLog(pjp);

            result = pjp.proceed();
        } catch (ParamException e) {
            LOGGER.error("Param validate exception{}", e.getMessage());
            result = new BaseDataResponse(ResponseEnum.PARAM_ERROR.getCode(),
                    ResponseEnum.PARAM_ERROR.getMessage() + e.getMessage());
        } catch (Exception e) {
            LOGGER.error("business exception", e);
            result = new BaseDataResponse(ResponseEnum.SYSTEM_ERROR.getCode(),
                    ResponseEnum.SYSTEM_ERROR.getMessage() + e.getMessage());
        } finally {
            // 记录日志
            long lastTime = System.currentTimeMillis() - startTime;
            LOGGER.info(monitorKey + "【api end】cost time: {},response result: {} ",
                    new Object[] { lastTime, result });
        }
        return result;
    }

    /**
     * 获取监控的Key
     *
     * @param pjp
     * @return
     */
    private String getMonitorKey(ProceedingJoinPoint pjp) {
        Signature signature = pjp.getSignature();
        if (signature instanceof MethodSignature) {
            MethodSignature methodSignature = (MethodSignature) signature;
            Method method = methodSignature.getMethod();
            // 此处需要考虑一下性能问题
            return method.getDeclaringClass().getSimpleName() + "." + method.getName() + "-"
                    + System.currentTimeMillis();
        }

        return "NONE_Interface_MonitorKey";
    }

    /**
     * 打印监控日志
     *
     * @param point
     */
    private void monitorLog(JoinPoint point) {
        String className = point.getTarget().getClass().getName(); // 拦截类
        String methodName = point.getSignature().getName() + "()";
        Object[] paramValues = point.getArgs(); // 拦截类的入参数
        LOGGER.info(
                "【api start】invoke class name: {}, invoke method name: {},  parameter value: {}, ip:{} ",
                new Object[] { className, methodName, paramValues, getIpAddr(request) });
    }

    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

}
