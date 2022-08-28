package com.sariaydinalparslan.retrofit2.Utils

import com.sariaydinalparslan.retrofit2.retrofit.DaoInterface
import com.sariaydinalparslan.retrofit2.retrofit.RetrofitClient

class ApiUtills {

    companion object{
        //https://rickandmortyapi.com/api/character
        val BASE_URL = "https://rickandmortyapi.com/"
        fun getDaoInterface(): DaoInterface {
            return RetrofitClient.getClient(BASE_URL).create(DaoInterface::class.java)
        }
    }
}