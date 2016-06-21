package com.game.assistance.dao;

import com.game.assistance.model.NewsInfoModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsInfoModelMapper {

    /**
     * 根据时间
     *
     * @param appName
     * @param startIndex
     * @param limitNum
     * @return
     */
    List<NewsInfoModel> getNewsListByTime(@Param("appName") String appName, @Param("startIndex") Integer startIndex, @Param("limitNum") Integer limitNum);


    /**
     * 获取所有新闻的总数
     *
     * @param appName
     * @return
     */
    int countNewsByAppName(String appName);

}