package com.coolweather.android.gson;

/**
 * author: Saint Lin
 * created on: 2018/5/17 15:03
 * description: 添加描述
 */

public class AQI {

    public  AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
