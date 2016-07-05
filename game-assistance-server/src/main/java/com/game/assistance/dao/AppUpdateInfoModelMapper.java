package com.game.assistance.dao;

import com.game.assistance.model.AppUpdateInfoModel;
import org.apache.ibatis.annotations.Param;

public interface AppUpdateInfoModelMapper {

    AppUpdateInfoModel getLatestAppUpdate(@Param("appName") String appName);

}