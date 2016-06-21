package com.game.assistance.controller;

import com.game.assistance.Route;
import com.game.assistance.constants.Constants;
import com.game.assistance.request.news.NewsRequest;
import com.game.assistance.response.BaseDataResponse;
import com.game.assistance.response.news.NewsInfoListExtResponse;
import com.game.assistance.response.news.NewsInfoResponse;
import com.game.assistance.response.strategy.StrategyInfoResponse;
import com.game.assistance.service.NewsService;
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
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by lenovo on 2016/6/14.
 */
@RestController
@Api(value = "新闻类接口", produces = MediaType.APPLICATION_JSON)
public class NewsController {
    private static Logger LOGGER = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    private NewsService newsService;

    @ApiOperation(value = "获取新闻接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "appName", value = "app名称，唯一标示", required = true, dataType = "String", paramType = "header"),
            @ApiImplicitParam(name = "type", value = "获取新闻的方式，分为首页，热度和时间", required = true, dataType = "String", paramType = "path", allowableValues = "index,hot,time"),
            @ApiImplicitParam(name = "pageNum", value = "页码，从0开始", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小，一页显示的个数", required = true, dataType = "int", paramType = "query")
    })
    @RequestMapping(value = Route.News.GA_NEWS, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    public BaseDataResponse<NewsInfoListExtResponse> getNews(@ApiIgnore @Valid NewsRequest newsRequest, BindingResult bindResult, @RequestHeader("appName") @NotNull String appName) {
        LOGGER.info("news begin,{}", newsRequest);
        LOGGER.info(appName);
        List<NewsInfoResponse> listResult = null;
        int totalSize = 0;
        if (Constants.NewsConstants.TYPE_INDEX.equals(newsRequest.getType())) {

        } else if (Constants.NewsConstants.TYPE_HOT.equals(newsRequest.getType())) {

        } else if (Constants.NewsConstants.TYPE_TIME.equals(newsRequest.getType())) {
            totalSize = newsService.countNewsTotal(appName);
            listResult = newsService.getNewsByTime(appName, newsRequest.getPageNum(), newsRequest.getPageSize());
        }

        return new BaseDataResponse<>(new NewsInfoListExtResponse(totalSize, listResult));
    }
}
