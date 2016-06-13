package com.game.assistance.dao;

import com.game.assistance.model.BannerInfoModel;
import com.game.assistance.model.BannerInfoModelKey;

public interface BannerInfoModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BannerInfoModelKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_info
     *
     * @mbggenerated
     */
    int insert(BannerInfoModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_info
     *
     * @mbggenerated
     */
    int insertSelective(BannerInfoModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_info
     *
     * @mbggenerated
     */
    BannerInfoModel selectByPrimaryKey(BannerInfoModelKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BannerInfoModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BannerInfoModel record);
}