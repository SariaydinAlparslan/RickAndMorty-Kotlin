package com.sariaydinalparslan.retrofit2.Utils

import com.sariaydinalparslan.retrofit2.retrofit.KisilerDaoInterface
import com.sariaydinalparslan.retrofit2.retrofit.RetrofitClient

class ApiUtills {

    companion object{
        //https://rickandmortyapi.com/api/character
        val BASE_URL = "https://rickandmortyapi.com/"
        fun getKisilerDaoInterface(): KisilerDaoInterface {
            return RetrofitClient.getClient(BASE_URL).create(KisilerDaoInterface::class.java)
        }
    }
}