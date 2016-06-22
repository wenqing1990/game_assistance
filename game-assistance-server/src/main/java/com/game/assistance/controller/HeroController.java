package com.game.assistance.controller;

import com.game.assistance.Route;
import com.game.assistance.request.strategy.StrategyRequest;
import com.game.assistance.response.BaseDataResponse;
import com.game.assistance.response.strategy.StrategyInfoListExtResponse;
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

/**
 * Created by lenovo on 2016/6/22.
 */
@RestController
@Api(value = "数据库接口", produces = MediaType.APPLICATION_JSON)
public class HeroController {

    private static Logger LOGGER = LoggerFactory.getLogger(HeroController.class);

    @ApiOperation(value = "获取英雄列表接口（阵营）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "appName", value = "app名称，唯一标示", required = true, dataType = "String", paramType = "header"),
            @ApiImplicitParam(name = "teamID", value = "所在阵营的ID", required = true, dataType = "String", paramType = "path", allowableValues = "shu,wei,wu,qun")
    })
    @RequestMapping(value = Route.Hero.GA_HEROES, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    public BaseDataResponse getHeroes(@PathVariable("teamID") String teamID, @RequestHeader("appName") @NotNull String appName) {

        return null;
    }
}
