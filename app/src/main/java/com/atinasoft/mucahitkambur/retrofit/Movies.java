package com.atinasoft.mucahitkambur.retrofit;

/**
 * Created by Muco on 25.06.2018.
 */
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Muco on 20.06.2018.
 */

public class Movies {

    @SerializedName("movies")
    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
