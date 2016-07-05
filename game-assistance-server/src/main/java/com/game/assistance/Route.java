package com.game.assistance;

/**
 * Created by wenqing on 2016/6/12 0012.
 */
public class Route {

    public static class Banner {
        public final static String GA_BANNERS = "/v1/ga/banners";
    }

    public static class News {
        public final static String GA_NEWS = "/v1/ga/news/{type}";
    }

    public static class Strategy {
        public final static String GA_STRATEGIES = "/v1/ga/strategies/{type}";
    }

    public static class Hero{
        public final static String GA_HEROES = "/v1/ga/heroes/{teamId}";
    }

    public static class App{
        public final static String GA_APP_UPDATE = "/v1/ga/app/update";
    }

}
