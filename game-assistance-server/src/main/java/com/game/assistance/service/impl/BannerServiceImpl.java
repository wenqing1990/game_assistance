package com.game.assistance.service.impl;

import com.game.assistance.dao.BannerInfoModelMapper;
import com.game.assistance.model.BannerInfoModel;
import com.game.assistance.response.banner.BannerInfoResponse;
import com.game.assistance.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenqing on 2016/6/14 0014.
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerInfoModelMapper bannerInfoModelMapper;

    @Override public List<BannerInfoResponse> getBannerListByAppName(String appName) {
        List<BannerInfoModel> result = bannerInfoModelMapper.selectByAppNameASC(appName);
        if (result == null) {
            return null;
        }
        List<BannerInfoResponse> returnResult = new ArrayList<>(result.size());
        for (BannerInfoModel model : result) {
            returnResult.add(new BannerInfoResponse(model));
        }
        return returnResult;
    }
}
