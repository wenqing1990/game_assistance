package com.game.assistance.response.news;

import java.util.List;

/**
 * Created by lenovo on 2016/6/21.
 */
public class NewsInfoListExtResponse {

    public NewsInfoListExtResponse(Integer totalSize, List<NewsInfoResponse> list) {
        this.totalSize = totalSize;
        this.list = list;
    }

    private Integer totalSize;

    private List<NewsInfoResponse> list;

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public List<NewsInfoResponse> getList() {
        return list;
    }

    public void setList(List<NewsInfoResponse> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "NewsInfoListExtResponse{" +
                "totalSize=" + totalSize +
                ", list=" + list +
                '}';
    }
}
