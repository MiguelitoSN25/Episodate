package com.oxcoding.moviemvvm.data.api

import com.oxcoding.moviemvvm.data.vo.MovieDetails
import com.oxcoding.moviemvvm.data.vo.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {

    // https://api.themoviedb.org/3/movie/popular?api_key=840dccc8886ed89f5da8598a0e0ec1a7&page=1
    // https://api.themoviedb.org/3/movie/299534?api_key=840dccc8886ed89f5da8598a0e0ec1a7
    // https://api.themoviedb.org/3/

    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>
}