package com.sariaydinalparslan.retrofit2.retrofit

import com.sariaydinalparslan.retrofit2.model.CharactersCevap
import retrofit2.Call
import retrofit2.http.GET

interface DaoInterface {
    @GET("api/character")
    fun downloadFromAPI():Call<CharactersCevap>
}