package com.game.assistance.response.news;

import com.game.assistance.model.NewsInfoModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by lenovo on 2016/6/14.
 */
public class NewsInfoResponse {

    public NewsInfoResponse(NewsInfoModel model, Integer index) {
        this.index = index;
        this.newsId = model.getNewsId();
        this.title = model.getTitle();
        this.summary = model.getSummary();
        this.link = model.getLink();
        this.titleImageUrl = model.getTitleImageUrl();
        this.createTime = model.getCreateTime();
    }

    @ApiModelProperty(value = "序号，从0开始")
    private Integer index;

    @ApiModelProperty(value = "新闻ID，唯一标识")
    private Integer newsId;

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


    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
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
        return "NewsInfoResponse{" +
                "index=" + index +
                ", newsId=" + newsId +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", link='" + link + '\'' +
                ", titleImageUrl='" + titleImageUrl + '\'' +
                ", createTime=" + createTime +
                ", hot=" + hot +
                '}';
    }
}
