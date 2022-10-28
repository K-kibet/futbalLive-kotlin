package com.example.futballive

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LivescoresAdapter(val context: Context, val Matches: List<LivescoresDataItem> ): RecyclerView.Adapter<LivescoresAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var homeTeam: TextView
        var awayTeam: TextView
        var finalResults: TextView
        var leagueName: TextView
        var countryFlag: ImageView

        init {
            homeTeam = itemView.findViewById(R.id.teamOneTV)
            countryFlag = itemView.findViewById(R.id.countryFlagTV)
            awayTeam = itemView.findViewById(R.id.teamTwoTV)
            finalResults = itemView.findViewById(R.id.resultsTV)
            leagueName = itemView.findViewById(R.id.leagueTV)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = android.view.LayoutInflater.from(context).inflate(R.layout.livescore_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.homeTeam.text = Matches[position].event_home_team
        holder.awayTeam.text = Matches[position].event_away_team
        holder.finalResults.text = Matches[position].event_final_result
        holder.homeTeam.text = Matches[position].event_home_team
        holder.homeTeam.text = Matches[position].event_home_team
    }

    override fun getItemCount(): Int {
        return  Matches.size
    }

}