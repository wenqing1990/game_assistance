package com.game.assistance.service.impl;

import com.game.assistance.dao.HeroInfoModelMapper;
import com.game.assistance.model.HeroInfoModel;
import com.game.assistance.response.hero.HeroInfoResponse;
import com.game.assistance.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/6/27.
 */
@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    private HeroInfoModelMapper heroInfoModelMapper;

    @Override
    public List<HeroInfoResponse> getHeroByTeam(String appName, String teamId) {
        List<HeroInfoModel> list = heroInfoModelMapper.getHerosByStarsTeam(appName, teamId);
        if (list == null) {
            return null;
        }
        int index=0;
        List<HeroInfoResponse> listResponse=new ArrayList<>(list.size());
        for (HeroInfoModel model : list) {
            listResponse.add(new HeroInfoResponse(index++,model));
        }
        return listResponse;
    }
}
