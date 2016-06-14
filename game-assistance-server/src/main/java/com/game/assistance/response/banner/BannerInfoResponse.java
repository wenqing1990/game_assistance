package com.game.assistance.response.banner;

import com.game.assistance.model.BannerInfoModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by wenqing on 2016/6/14 0014.
 */
public class BannerInfoResponse {

    @ApiModelProperty(value = "序号，从0开始")
    private Integer index;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "摘要")
    private String summary;

    @ApiModelProperty(value = "跳转链接")
    private String link;

    @ApiModelProperty(value = "图片url")
    private String imageUrl;

    public BannerInfoResponse(){

    }

    public BannerInfoResponse(BannerInfoModel model) {
        this.index = model.getOrderNum();
        this.title = model.getTitle();
        this.summary = model.getSummary();
        this.link = model.getLink();
        this.imageUrl = model.getImageUrl();
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override public String toString() {
        return "BannerInfoResponse{" +
                "index=" + index +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", link='" + link + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
