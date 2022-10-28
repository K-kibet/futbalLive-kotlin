package com.example.futballive

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity(), View.OnClickListener {

    val livescoresCard = findViewById<CardView>(R.id.liveScoresCard)
    val livestreamCard = findViewById<CardView>(R.id.liveStreamCard)
    val leaguesCard = findViewById<CardView>(R.id.leaguesCard)

    /*lateinit var mAdView : AdView */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        livescoresCard.setOnClickListener(this@MainActivity)
        livestreamCard.setOnClickListener(this@MainActivity)
        leaguesCard.setOnClickListener(this@MainActivity)

        /*
        MobileAds.initialize(this@MainActivity)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest) */
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.liveScoresCard->{
                // do some work here
                Toast.makeText(this, "First Button", Toast.LENGTH_SHORT).show()
            }

            R.id.liveStreamCard->{
                // do some work here
                Toast.makeText(this, "First Button", Toast.LENGTH_SHORT).show()
            }

            R.id.leaguesCard->{
                // do some work here
                Toast.makeText(this, "First Button", Toast.LENGTH_SHORT).show()
            }
        }
    }


}
