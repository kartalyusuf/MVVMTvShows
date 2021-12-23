package com.kartal.mvvmtvshows.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVShowDetails {

    @SerializedName("url")
    private String url ;

    @SerializedName("description")
    private String description;

    @SerializedName("runtime")
    private String runtime ;

    @SerializedName("image_path")
    private String imagepath ;

    @SerializedName("rating")
    private String rating ;

    @SerializedName("genres")
    private String[] genres;

    @SerializedName("pictures")
    private String[] pictures ;

    @SerializedName("episodes")
    private List<Episode> episodes ;


    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getImagepath() {
        return imagepath;
    }

    public String getRating() {
        return rating;
    }

    public String[] getGenres() {
        return genres;
    }

    public String[] getPictures() {
        return pictures;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}


