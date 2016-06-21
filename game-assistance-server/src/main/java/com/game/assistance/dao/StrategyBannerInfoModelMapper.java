package com.game.assistance.dao;

import com.game.assistance.model.StrategyBannerInfoModel;
import com.game.assistance.model.StrategyBannerInfoModelKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StrategyBannerInfoModelMapper {

    List<StrategyBannerInfoModel> getStrategyBannersByAppName(String appName);

}