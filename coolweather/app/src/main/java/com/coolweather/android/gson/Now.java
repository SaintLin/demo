package com.coolweather.android.gson;

import android.view.Menu;

import com.google.gson.annotations.SerializedName;

/**
 * author: Saint Lin
 * created on: 2018/5/17 15:06
 * description: 添加描述
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
