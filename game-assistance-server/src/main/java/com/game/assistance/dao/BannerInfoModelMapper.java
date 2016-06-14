package com.game.assistance.dao;

import com.game.assistance.model.BannerInfoModel;
import com.game.assistance.model.BannerInfoModelKey;

import java.util.List;

public interface BannerInfoModelMapper {
    int deleteByPrimaryKey(BannerInfoModelKey key);

    int insert(BannerInfoModel record);

    int insertSelective(BannerInfoModel record);

    BannerInfoModel selectByPrimaryKey(BannerInfoModelKey key);

    int updateByPrimaryKeySelective(BannerInfoModel record);

    int updateByPrimaryKey(BannerInfoModel record);

    List<BannerInfoModel> selectByAppNameASC(String appName);
}