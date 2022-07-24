package uz.umarxon.roomcoroutines.data.api

import retrofit2.http.GET
import uz.umarxon.roomcoroutines.data.model.ApiUser

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<ApiUser>

    @GET("more-users")
    suspend fun getMoreUsers(): List<ApiUser>

    @GET("error")
    suspend fun getUsersWithError(): List<ApiUser>

}