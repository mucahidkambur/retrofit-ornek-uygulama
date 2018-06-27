package com.atinasoft.mucahitkambur.retrofit;

/**
 * Created by Muco on 25.06.2018.
 */

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Muco on 20.06.2018.
 */

public class ApiClient {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://yts.am/api/v2/";

    public static Retrofit getRetrofitInstance() {

        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}