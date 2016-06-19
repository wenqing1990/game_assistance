package com.game.assistance.response.strategy;

import java.util.List;

/**
 * Created by lenovo on 2016/6/20.
 */
public class StrategyInfoListExtResponse {

    private Integer totalSize;
    private List<StrategyInfoResponse> list;

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public List<StrategyInfoResponse> getList() {
        return list;
    }

    public void setList(List<StrategyInfoResponse> list) {
        this.list = list;
    }

    public StrategyInfoListExtResponse(Integer totalSize, List<StrategyInfoResponse> list) {
        this.totalSize = totalSize;
        this.list = list;
    }

    @Override
    public String toString() {
        return "StrategyInfoListExtResponse{" +
                "totalSize=" + totalSize +
                ", list=" + list +
                '}';
    }
}
