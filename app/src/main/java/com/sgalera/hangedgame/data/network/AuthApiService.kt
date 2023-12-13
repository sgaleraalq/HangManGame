package com.sgalera.hangedgame.data.network

import retrofit2.http.POST
import retrofit2.http.Path

interface AuthApiService {
    @POST("/auth/signup/{username}")
    suspend fun getSignUp(@Path("username") username: String)
}