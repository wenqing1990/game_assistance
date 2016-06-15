package com.game.assistance.aop;

import com.game.assistance.annotation.SkipParamCheck;
import com.game.assistance.exception.ParamException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by wenqing on 2016/6/12 0012.
 */
@Aspect
@Component
@Order(3)
public class ParamValidAop {
    private static Logger LOGGER = LoggerFactory.getLogger(ParamValidAop.class);

    /**
     * 定义Controller的切面
     * <p>
     * 必须在 com.huami.controller 下，方法上必须有 RequestMapping 注解
     */
    @Pointcut("execution(* com.game.assistance.controller..*.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void paramValidAspect() {
    }

    /**
     * 对切面执行 around 处理
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("paramValidAspect()")
    public Object doController(ProceedingJoinPoint pjp) throws Throwable {
        LOGGER.info("paramValidAspect start");
        //跳过一键注册参数检查
        Signature signature = pjp.getSignature();
        if (signature instanceof MethodSignature) {
            MethodSignature methodSignature = (MethodSignature) signature;
            Method method = methodSignature.getMethod();

            //使用SkipParamCheck跳过检查
            SkipParamCheck skipParamCheck = method.getAnnotation(SkipParamCheck.class);
            if (skipParamCheck != null && skipParamCheck.value()) {
                // 业务逻辑处理
                return  pjp.proceed();
            }
        }

        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof BindingResult && ((BindingResult) args[i]).hasErrors()) {
                List<ObjectError> errors = ((BindingResult) args[i]).getAllErrors();
                for (ObjectError err : errors) {
                    LOGGER.info(err.getDefaultMessage());
                    throw new ParamException(err.getDefaultMessage());
                }
            }
        }
        // 业务逻辑处理
        return pjp.proceed();
    }
}
