package com.game.assistance.request.news;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.PathParam;

/**
 * Created by lenovo on 2016/6/14.
 */
public class NewsRequest {

    @Min(1)
    @Max(30)
    private Integer pageSize;

    @Min(0)
    @Max(1000)
    private Integer pageNum;

    @NotNull(message = "type is null")
    @PathParam("type")
    private String type;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NewsRequest{" +
                "pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", type='" + type + '\'' +
                '}';
    }
}
