package com.game.assistance.response.app;

import com.game.assistance.model.AppUpdateInfoModel;

/**
 * Created by wenqing on 2016/7/4 0004.
 */
public class AppUpdateResponse {

    private String version;

    private Integer forceUpdate;

    private String updateUrl;

    public AppUpdateResponse(AppUpdateInfoModel model) {
        this.version = model.getVersion();
        this.forceUpdate = model.getForceUpdate();
        this.updateUrl = model.getUpdateUrl();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(Integer forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    @Override
    public String toString() {
        return "AppUpdateResponse{" +
                "version='" + version + '\'' +
                ", forceUpdate=" + forceUpdate +
                ", updateUrl='" + updateUrl + '\'' +
                '}';
    }
}
