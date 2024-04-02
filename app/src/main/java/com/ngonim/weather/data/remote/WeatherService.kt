package com.ngonim.weather.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") lon: Double
    ):WeatherDto
}