package com.game.assistance.service.impl;

import com.game.assistance.aop.ControllerLogAop;
import com.game.assistance.dao.StrategyBannerInfoModelMapper;
import com.game.assistance.dao.StrategyInfoModelMapper;
import com.game.assistance.model.StrategyBannerInfoModel;
import com.game.assistance.model.StrategyInfoModel;
import com.game.assistance.response.strategy.StrategyInfoResponse;
import com.game.assistance.service.StrategyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/6/19.
 */
@Service
public class StrategyServiceImpl implements StrategyService {
    private static Logger LOGGER = LoggerFactory.getLogger(StrategyServiceImpl.class);

    @Autowired
    private StrategyBannerInfoModelMapper strategyBannerInfoModelMapper;

    @Autowired
    private StrategyInfoModelMapper strategyInfoModelMapper;

    @Override
    public List<StrategyInfoResponse> getIndexStrategies(String appName) {
        List<StrategyBannerInfoModel> list = strategyBannerInfoModelMapper.getStrategyBannersByAppName(appName);
        if (list == null) {
            return null;
        }
        List<StrategyInfoResponse> listResult = new ArrayList<>(list.size());

        for (StrategyBannerInfoModel model : list) {
            LOGGER.info("banner model {}", model);
            listResult.add(new StrategyInfoResponse(model));
        }
        return listResult;
    }

    @Override
    public List<StrategyInfoResponse> getStrategiesByTime(String appName, Integer pageNum, Integer pageSize) {
        Integer startIndex = pageNum * pageSize;
        LOGGER.info(startIndex + ":" + pageSize);
        List<StrategyInfoModel> list = strategyInfoModelMapper.getStrategyListByTime(appName, startIndex, pageSize);
        if (list == null) {
            return null;
        }
        List<StrategyInfoResponse> listResult = new ArrayList<>(list.size());
        for (StrategyInfoModel model : list) {
            LOGGER.info("strategy model {}", model);
            listResult.add(new StrategyInfoResponse(model, startIndex++));
        }
        return listResult;
    }

    @Override
    public int countStrategyTotal(String appName) {
        return strategyInfoModelMapper.countStrategyByAppName(appName);
    }
}
