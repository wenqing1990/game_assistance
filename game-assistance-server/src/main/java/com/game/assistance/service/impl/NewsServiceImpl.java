package com.game.assistance.service.impl;

import com.game.assistance.Route;
import com.game.assistance.dao.NewsInfoModelMapper;
import com.game.assistance.model.NewsInfoModel;
import com.game.assistance.response.news.NewsInfoResponse;
import com.game.assistance.response.strategy.StrategyInfoResponse;
import com.game.assistance.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/6/21.
 */
@Service
public class NewsServiceImpl implements NewsService {

    private static Logger LOGGER = LoggerFactory.getLogger(StrategyServiceImpl.class);

    @Autowired
    private NewsInfoModelMapper newsInfoModelMapper;

    @Override
    public List<NewsInfoResponse> getNewsByTime(String appName, Integer pageNum, Integer pageSize) {
        Integer startIndex = pageNum * pageSize;
        LOGGER.info(startIndex + ":" + pageSize);

        List<NewsInfoModel> list = newsInfoModelMapper.getNewsListByTime(appName, startIndex, pageSize);
        if (list == null) {
            return null;
        }
        List<NewsInfoResponse> listResult = new ArrayList<>(list.size());
        for (NewsInfoModel model : list) {
            LOGGER.info("news model:{}", model);
            listResult.add(new NewsInfoResponse(model, startIndex++));
        }
        return listResult;
    }

    @Override
    public int countNewsTotal(String appName) {
        return newsInfoModelMapper.countNewsByAppName(appName);
    }
}
