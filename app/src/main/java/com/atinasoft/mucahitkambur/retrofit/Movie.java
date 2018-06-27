package com.atinasoft.mucahitkambur.retrofit;

/**
 * Created by Muco on 25.06.2018.
 */

import com.google.gson.annotations.SerializedName;

/**
 * Created by Muco on 20.06.2018.
 */

public class Movie {

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("year")
    private String year;

    @SerializedName("rating")
    private String rating;

    @SerializedName("summary")
    private String summary;

    @SerializedName("large_cover_image")
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
