package com.kartal.mvvmtvshows.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.kartal.mvvmtvshows.R;
import com.kartal.mvvmtvshows.databinding.ActivityTvshowDetailsBinding;
import com.kartal.mvvmtvshows.viewmodels.TVShowDetailsViewModel;

public class TVShowDetailsActivity extends AppCompatActivity {

    private ActivityTvshowDetailsBinding activityTvshowDetailsBinding;
    private TVShowDetailsViewModel tvShowDetailsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTvshowDetailsBinding = DataBindingUtil.setContentView(this,R.layout.activity_tvshow_details);
        doInitialization();
    }

    private void doInitialization(){
        tvShowDetailsViewModel = new ViewModelProvider(this).get(TVShowDetailsViewModel.class);
        getTVShowDetails();
    }

    private void getTVShowDetails() {
        activityTvshowDetailsBinding.setIsLoading(true);
        String tvShowId = String.valueOf(getIntent().getIntExtra("id",-1));
        tvShowDetailsViewModel.getTVShowDetails(tvShowId).observe(
                this,tvShowDetailsResponse -> {
                    activityTvshowDetailsBinding.setIsLoading(false);
                    Toast.makeText(getApplicationContext(), tvShowDetailsResponse.getTvShowDetails().getUrl(), Toast.LENGTH_SHORT).show();
                }
        );
    }
}