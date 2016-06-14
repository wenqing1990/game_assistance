package com.game.assistance.service;

import com.game.assistance.response.banner.BannerInfoResponse;

import java.util.List;

/**
 * Created by wenqing on 2016/6/14 0014.
 */
public interface BannerService {

    List<BannerInfoResponse> getBannerListByAppName(String appName);


}
