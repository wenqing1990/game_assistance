package com.game.assistance.response.hero;

import com.game.assistance.model.HeroInfoModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by lenovo on 2016/6/23.
 */
public class HeroInfoResponse {

    @ApiModelProperty(value = "序号，从0开始")
    private Integer index;

    @ApiModelProperty(value = "英雄ID")
    private Integer heroId;

    @ApiModelProperty(value = "英雄名称")
    private String name;

    @ApiModelProperty(value = "英雄类型，shushi，ceshi等")
    private String type;

    @ApiModelProperty(value = "团队属性，shu,wei,wu,qun")
    private String teamId;

    @ApiModelProperty(value = "星级")
    private Integer stars;

    @ApiModelProperty(value = "图片跳转链接")
    private String link;

    @ApiModelProperty(value = "图片url")
    private String imageUrl;

    public HeroInfoResponse(Integer index, HeroInfoModel model) {
        this.index = index;
        this.heroId = model.getHeroId();
        this.name = model.getName();
        this.type = model.getType();
        this.teamId = model.getTeamId();
        this.stars = model.getStars();
        this.link = model.getLink();
        this.imageUrl = model.getImageUrl();
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
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

    @Override
    public String toString() {
        return "HeroInfoResponse{" +
                "index=" + index +
                ", heroId=" + heroId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", teamId='" + teamId + '\'' +
                ", stars=" + stars +
                ", link='" + link + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
