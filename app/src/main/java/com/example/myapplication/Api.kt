package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "81e821564ae9e5484f07c1ceb07abcbe",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "81e821564ae9e5484f07c1ceb07abcbe",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

}