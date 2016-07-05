package com.game.assistance.model;

import java.util.Date;

public class AppUpdateInfoModel {
    private Integer appUpdateId;

    private String appName;

    private String version;

    private Integer forceUpdate;

    private String updateUrl;

    private Date createTime;

    public Integer getAppUpdateId() {
        return appUpdateId;
    }

    public void setAppUpdateId(Integer appUpdateId) {
        this.appUpdateId = appUpdateId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
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
        this.updateUrl = updateUrl == null ? null : updateUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}