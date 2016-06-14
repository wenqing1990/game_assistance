package com.game.assistance.controller;

import com.game.assistance.Route;
import com.game.assistance.aop.ControllerLogAop;
import com.game.assistance.request.BannerRequest;
import com.game.assistance.response.BaseDataResponse;
import com.game.assistance.response.banner.BannerInfoResponse;
import com.game.assistance.service.BannerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by wenqing on 2016/6/14 0014.
 */
@RestController
@Api(value = "轮播图类接口", produces = MediaType.APPLICATION_JSON)
public class BannerController {

    private static Logger LOGGER = LoggerFactory.getLogger(BannerController.class);

    @Autowired
    private BannerService bannerService;

    @ApiOperation(value = "获取轮播接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "appName", value = "app名称，唯一标示", required = true, dataType = "String", paramType = "header")
    })
    @RequestMapping(value = Route.Banner.GA_BANNERS, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    public BaseDataResponse<List<BannerInfoResponse>> getBanners(@ApiIgnore @Valid BannerRequest bannerRequest,BindingResult bindResult,@RequestHeader("appName") @NotNull String appName){
        LOGGER.info("banner begin,{}",bannerRequest);
        LOGGER.info(appName);
        List<BannerInfoResponse> list=bannerService.getBannerListByAppName(appName);

        return new BaseDataResponse(list);
    }

}
