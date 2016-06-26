package com.game.assistance.service;

import com.game.assistance.response.hero.HeroInfoResponse;

import java.util.List;

/**
 * Created by lenovo on 2016/6/23.
 */
public interface HeroService {

        List<HeroInfoResponse> getHeroByTeam(String appName, String teamId);

}
