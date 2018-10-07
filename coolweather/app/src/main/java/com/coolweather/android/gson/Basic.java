package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author: Saint Lin
 * created on: 2018/5/17 14:58
 * description: 添加描述
 */

public class Basic {

    // @SerializedName注解让JSON字段和Java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
