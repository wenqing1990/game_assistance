package com.game.assistance.service;

import com.game.assistance.response.strategy.StrategyInfoResponse;

import java.util.List;

/**
 * Created by lenovo on 2016/6/19.
 */
public interface StrategyService {

    List<StrategyInfoResponse> getIndexStrategies(String appName);

}
