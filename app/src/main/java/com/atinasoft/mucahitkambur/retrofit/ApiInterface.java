package com.atinasoft.mucahitkambur.retrofit;


import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Muco on 20.06.2018.
 */

public interface ApiInterface {

    @GET("list_movies.json?sort_by=date_added")
    Call<MovieResponse> getLastMovies();
}