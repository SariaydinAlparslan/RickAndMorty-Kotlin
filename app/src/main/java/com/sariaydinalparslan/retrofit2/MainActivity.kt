package com.sariaydinalparslan.retrofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sariaydinalparslan.cryptoapp.adapter.RecyclerViewAdapter
import com.sariaydinalparslan.retrofit2.Utils.ApiUtills
import com.sariaydinalparslan.retrofit2.model.CharactersCevap
import com.sariaydinalparslan.retrofit2.model.Result
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private var recyclerViewAdapter : RecyclerViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this)
        reycylerView.layoutManager = layoutManager
        tumKısıler()
    }

    fun tumKısıler(){
        val kdi = ApiUtills.getKisilerDaoInterface()
        kdi.tumKısıler().enqueue(object : Callback<CharactersCevap> {
            override fun onResponse(call: Call<CharactersCevap>, response: Response<CharactersCevap>) {
                if (response.isSuccessful){
                    val cryptoModels = response.body()!!.results
                    cryptoModels?.let {
                        recyclerViewAdapter = RecyclerViewAdapter(it as ArrayList<Result>)
                        reycylerView.adapter = recyclerViewAdapter
                    }
                }
            }
            override fun onFailure(call: Call<CharactersCevap>, t: Throwable) {
                Log.e("alp","olmadı")
            }
        })
    }
}