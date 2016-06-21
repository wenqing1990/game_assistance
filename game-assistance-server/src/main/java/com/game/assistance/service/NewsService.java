package com.game.assistance.service;

import com.game.assistance.response.news.NewsInfoResponse;

import java.util.List;

/**
 * Created by lenovo on 2016/6/21.
 */
public interface NewsService {

    List<NewsInfoResponse> getNewsByTime(String appName, Integer pageNum, Integer pageSize);

    int countNewsTotal(String appName);

}
