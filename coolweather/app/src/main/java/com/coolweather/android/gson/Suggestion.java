package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author: Saint Lin
 * created on: 2018/5/17 15:13
 * description: 添加描述
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
