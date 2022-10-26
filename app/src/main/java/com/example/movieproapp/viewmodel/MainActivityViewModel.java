package com.example.movieproapp.viewmodel;

import android.app.Application;
import android.text.method.MovementMethod;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.movieproapp.model.Movie;
import com.example.movieproapp.model.MovieRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private MovieRepository movieRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.movieRepository = new MovieRepository(application);
    }
    public LiveData<List<Movie>> getAllMovies(){
        return movieRepository.getMutableLiveData();

    }

}
