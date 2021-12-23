package com.kartal.mvvmtvshows.responses;

import com.google.gson.annotations.SerializedName;
import com.kartal.mvvmtvshows.models.TVShowDetails;

public class TVShowDetailsResponse {

    @SerializedName("tvShow")
    private TVShowDetails tvShowDetails;

    public TVShowDetails getTvShowDetails() {
        return tvShowDetails;
    }
}
