package com.example.futballive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val base_url = "https://apiv2.allsportsapi.com/"
class LivescoresActivity : AppCompatActivity() {

    lateinit var matchesAdapter: LivescoresAdapter
    lateinit var linearLayoutManager: LinearLayoutManager
    var listView: RecyclerView = findViewById(R.id.liveScores_recycler)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livescores)


        listView.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(this)
        listView.layoutManager = linearLayoutManager
        getLivescoresData()
    }

    private fun getLivescoresData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(base_url).build().create(LivescoresApi::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<LivescoresDataItem>?> {
            override fun onResponse(
                call: Call<List<LivescoresDataItem>?>,
                response: Response<List<LivescoresDataItem>?>
            ) {
                val responseBody = response.body()!!
                matchesAdapter = LivescoresAdapter(baseContext, responseBody)
                matchesAdapter.notifyDataSetChanged()
                listView.adapter = matchesAdapter

                for(liveData in responseBody) {
                    Log.d("TAG", liveData.country_name)
                }
            }

            override fun onFailure(call: Call<List<LivescoresDataItem>?>, t: Throwable) {
                t.message?.let { Log.d("TAG", it) }
            }
        })
    }
}