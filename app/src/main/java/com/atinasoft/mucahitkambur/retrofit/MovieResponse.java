package com.atinasoft.mucahitkambur.retrofit;

/**
 * Created by Muco on 25.06.2018.
 */

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muco on 20.06.2018.
 */

public class MovieResponse {

    @SerializedName("data")
    private Movies data;

    public Movies getData() {
        return data;
    }

    public void setData(Movies data) {
        this.data = data;
    }
}