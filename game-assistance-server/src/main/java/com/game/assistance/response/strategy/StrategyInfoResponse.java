package com.game.assistance.response.strategy;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by lenovo on 2016/6/15.
 */
public class StrategyInfoResponse {

    @ApiModelProperty(value = "攻略ID，唯一标识")
    private Integer strategyId;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "摘要")
    private String summary;

    @ApiModelProperty(value = "跳转链接")
    private String link;

    @ApiModelProperty(value = "标题图片url")
    private String titleImageUrl;

    @ApiModelProperty(value = "发布时间")
    private Date createTime;

    @ApiModelProperty(value = "热度")
    private Integer hot;

    public Integer getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitleImageUrl() {
        return titleImageUrl;
    }

    public void setTitleImageUrl(String titleImageUrl) {
        this.titleImageUrl = titleImageUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    @Override
    public String toString() {
        return "StrategyInfoResponse{" +
                "strategyId=" + strategyId +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", link='" + link + '\'' +
                ", titleImageUrl='" + titleImageUrl + '\'' +
                ", createTime=" + createTime +
                ", hot=" + hot +
                '}';
    }
}
