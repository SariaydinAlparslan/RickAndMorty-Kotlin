package com.sariaydinalparslan.retrofit2.model


import com.google.gson.annotations.SerializedName

data class CharactersCevap(
    @SerializedName("info")
    val info: İnfo,
    @SerializedName("results")
    val results: List<Result>
)