package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author: Saint Lin
 * created on: 2018/5/17 15:21
 * description: 添加描述
 */

public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
