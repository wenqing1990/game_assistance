package com.game.assistance.request;

import javax.validation.constraints.NotNull;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;

/**
 * Created by wenqing on 2016/6/14 0014.
 */
public class BannerRequest {

//    @NotNull(message = "appName is null")
    @HeaderParam("appName")
    private String appName;

    public String getAppName() {
        return appName;
    }

    public void setAppName( String appName) {
        this.appName = appName;
    }

    @Override public String toString() {
        return "BannerRequest{" +
                "appName='" + appName + '\'' +
                '}';
    }
}
