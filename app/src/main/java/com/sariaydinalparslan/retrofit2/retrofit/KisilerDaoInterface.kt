package com.sariaydinalparslan.retrofit2.retrofit

import com.sariaydinalparslan.retrofit2.model.CharactersCevap
import retrofit2.Call
import retrofit2.http.GET

interface KisilerDaoInterface {

    @GET("api/character")
    fun tumKısıler():Call<CharactersCevap>
}