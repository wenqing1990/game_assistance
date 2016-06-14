package com.game.assistance.controller;

import com.game.assistance.Route;
import com.game.assistance.constants.Constants;
import com.game.assistance.request.strategy.StrategyRequest;
import com.game.assistance.response.BaseDataResponse;
import com.game.assistance.response.strategy.StrategyInfoResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by lenovo on 2016/6/15.
 */
@RestController
@Api(value = "攻略类接口", produces = MediaType.APPLICATION_JSON)
public class StrategyController {

    private static Logger LOGGER = LoggerFactory.getLogger(StrategyController.class);
    @ApiOperation(value = "获取攻略接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "appName", value = "app名称，唯一标示", required = true, dataType = "String", paramType = "header"),
            @ApiImplicitParam(name = "type", value = "获取攻略的方式，分为首页，热度和时间", required = true, dataType = "String", paramType = "path", allowableValues = "index,hot,time"),
            @ApiImplicitParam(name = "pageNum", value = "页码，从0开始", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小，一页显示的个数", required = true, dataType = "int", paramType = "query")
    })
    @RequestMapping(value = Route.Strategy.GA_STRATEGIES, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    public BaseDataResponse<List<StrategyInfoResponse>> getStrategies(@ApiIgnore @Valid StrategyRequest strategyRequest, BindingResult bindResult, @RequestHeader("appName") @NotNull String appName) {
        LOGGER.info("strategyRequest begin,{}", strategyRequest);
        LOGGER.info(appName);

        if (Constants.StrategyConstants.TYPE_INDEX.equals(strategyRequest.getType())) {

        } else if (Constants.StrategyConstants.TYPE_HOT.equals(strategyRequest.getType())) {

        } else if (Constants.StrategyConstants.TYPE_TIME.equals(strategyRequest.getType())) {

        }

        return null;
    }
}
