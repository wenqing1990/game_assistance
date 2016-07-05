package com.game.assistance.service;

import com.game.assistance.response.app.AppUpdateResponse;

/**
 * Created by wenqing on 2016/7/4 0004.
 */
public interface AppUpdateService {

    AppUpdateResponse getLatestAppUpdate(String appName);

}
