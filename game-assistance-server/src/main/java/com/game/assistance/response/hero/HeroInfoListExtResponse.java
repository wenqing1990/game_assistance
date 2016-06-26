package com.game.assistance.response.hero;

import java.util.List;

/**
 * Created by lenovo on 2016/6/27.
 */
public class HeroInfoListExtResponse {

    private Integer totalSize;

    private List<HeroInfoResponse> list;

    public HeroInfoListExtResponse(Integer totalSize, List<HeroInfoResponse> list) {
        this.totalSize = totalSize;
        this.list = list;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public List<HeroInfoResponse> getList() {
        return list;
    }

    public void setList(List<HeroInfoResponse> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "HeroInfoListExtResponse{" +
                "totalSize=" + totalSize +
                ", list=" + list +
                '}';
    }
}
