package com.game.assistance.dao;

import com.game.assistance.model.ActivityInfoModel;

public interface ActivityInfoModelMapper {
    int deleteByPrimaryKey(Integer activityId);

    int insert(ActivityInfoModel record);

    int insertSelective(ActivityInfoModel record);

    ActivityInfoModel selectByPrimaryKey(Integer activityId);

    int updateByPrimaryKeySelective(ActivityInfoModel record);

    int updateByPrimaryKey(ActivityInfoModel record);
}