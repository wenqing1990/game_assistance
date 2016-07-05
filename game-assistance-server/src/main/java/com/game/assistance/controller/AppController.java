package com.game.assistance.controller;

import com.game.assistance.Route;
import com.game.assistance.request.banners.BannerRequest;
import com.game.assistance.response.BaseDataResponse;
import com.game.assistance.response.app.AppUpdateResponse;
import com.game.assistance.service.AppUpdateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import javax.ws.rs.core.MediaType;

/**
 * Created by wenqing on 2016/7/4 0004.
 */
@RestController
@Api(value = "App类接口", produces = MediaType.APPLICATION_JSON)
public class AppController {

    private static Logger LOGGER = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private AppUpdateService appUpdateService;

    @ApiOperation(value = "获取App更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "appName", value = "app名称，唯一标示", required = true, dataType = "String", paramType = "header")
    })
    @RequestMapping(value = Route.App.GA_APP_UPDATE, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    public BaseDataResponse<AppUpdateResponse> getAppUpdate(@RequestHeader("appName") @NotNull String appName){
        AppUpdateResponse appUpdateResponse=appUpdateService.getLatestAppUpdate(appName);
        return new BaseDataResponse(appUpdateResponse);
    }

}
