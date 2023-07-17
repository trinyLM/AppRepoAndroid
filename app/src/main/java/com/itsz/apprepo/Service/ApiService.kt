package com.itsz.apprepo.Service

import com.itsz.apprepo.models.request.UserInfoLoginRequest
import com.itsz.apprepo.models.response.UserInfoLoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("/auth/login")
    suspend fun login(@Body request: UserInfoLoginRequest):Response<UserInfoLoginResponse>
}