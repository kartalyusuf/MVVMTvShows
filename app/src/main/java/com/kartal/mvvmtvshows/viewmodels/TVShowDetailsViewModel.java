package com.kartal.mvvmtvshows.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.kartal.mvvmtvshows.repositories.TVShowDetailsRepository;
import com.kartal.mvvmtvshows.responses.TVShowDetailsResponse;

public class TVShowDetailsViewModel extends ViewModel {

    private TVShowDetailsRepository tvShowDetailsRepository;

    public TVShowDetailsViewModel() {

        tvShowDetailsRepository = new TVShowDetailsRepository();
    }

    public LiveData<TVShowDetailsResponse> getTVShowDetails(String tvShowId) {
        return tvShowDetailsRepository.getTVShowDetails(tvShowId);

        
    }
}
