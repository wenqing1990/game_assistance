package com.game.assistance.dao;

import com.game.assistance.model.StrategyInfoModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StrategyInfoModelMapper {

    /**
     * 根据时间顺序，获取攻略
     *
     * @param appName
     * @param startIndex
     * @param limitNum
     * @return
     */
    List<StrategyInfoModel> getStrategyListByTime(@Param("appName") String appName, @Param("startIndex") Integer startIndex, @Param("limitNum") Integer limitNum);


    /**
     * 获取所有攻略的总数
     *
     * @param appName
     * @return
     */
    int countStrategyByAppName(String appName);

}