package com.game.assistance.dao;

import com.game.assistance.model.HeroInfoModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HeroInfoModelMapper {

    List<HeroInfoModel> getHerosByStarsTeam(@Param("appName") String appName, @Param("teamId") String teamId);

}