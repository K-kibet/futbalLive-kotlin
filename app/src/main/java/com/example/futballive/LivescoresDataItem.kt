package com.example.futballive

data class LivescoresDataItem(
    val away_team_key: String,
    val country_logo: String,
    val country_name: String,
    val event_away_team: String,
    val event_country_key: String,
    val event_date: String,
    val event_final_result: String,
    val event_ft_result: String,
    val event_halftime_result: String,
    val event_home_team: String,
    val event_key: String,
    val event_live: String,
    val event_penalty_result: String,
    val event_referee: String,
    val event_stadium: String,
    val event_status: String,
    val event_time: String,
    val home_team_key: String,
    val league_key: String,
    val league_logo: String,
    val league_name: String,
    val league_round: String,
    val league_season: String
)