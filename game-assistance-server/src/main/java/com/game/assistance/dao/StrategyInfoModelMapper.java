package com.game.assistance.dao;

import com.game.assistance.model.StrategyInfoModel;

public interface StrategyInfoModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer strategyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_info
     *
     * @mbggenerated
     */
    int insert(StrategyInfoModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_info
     *
     * @mbggenerated
     */
    int insertSelective(StrategyInfoModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_info
     *
     * @mbggenerated
     */
    StrategyInfoModel selectByPrimaryKey(Integer strategyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(StrategyInfoModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table strategy_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(StrategyInfoModel record);
}