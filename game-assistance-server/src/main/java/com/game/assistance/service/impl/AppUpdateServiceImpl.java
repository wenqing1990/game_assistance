package com.game.assistance.service.impl;

import com.game.assistance.dao.AppUpdateInfoModelMapper;
import com.game.assistance.model.AppUpdateInfoModel;
import com.game.assistance.response.app.AppUpdateResponse;
import com.game.assistance.service.AppUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wenqing on 2016/7/4 0004.
 */
@Service
public class AppUpdateServiceImpl implements AppUpdateService{

    @Autowired
    private AppUpdateInfoModelMapper appUpdateInfoModelMapper;

    @Override
    public AppUpdateResponse getLatestAppUpdate(String appName) {
        AppUpdateInfoModel appUpdateInfoModel=appUpdateInfoModelMapper.getLatestAppUpdate(appName);
        if(appUpdateInfoModel==null){
            return null;
        }
        return new AppUpdateResponse(appUpdateInfoModel);
    }
}
