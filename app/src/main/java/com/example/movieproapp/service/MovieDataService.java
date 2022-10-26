package com.example.movieproapp.service;

import com.example.movieproapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService  {

    //https://api.themoviedb.org/3/movie/popular?api_key=51a75e6e1141c68a79286d9da69c43d5
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
