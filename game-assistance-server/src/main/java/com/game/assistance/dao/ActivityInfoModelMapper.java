package com.game.assistance.dao;

import com.game.assistance.model.ActivityInfoModel;

public interface ActivityInfoModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer activityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_info
     *
     * @mbggenerated
     */
    int insert(ActivityInfoModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_info
     *
     * @mbggenerated
     */
    int insertSelective(ActivityInfoModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_info
     *
     * @mbggenerated
     */
    ActivityInfoModel selectByPrimaryKey(Integer activityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActivityInfoModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivityInfoModel record);
}