package com.ngonim.weather.data.remote

import com.squareup.moshi.Json

data class WeatherDataDto(
    val time: List<String>,
    @field:Json(name="temperature_2m")
    val temperatureList: List<Double>,
    @field:Json(name="weather_code")
    val weatherCodeList: List<Int>,
    @field:Json(name="pressure_msl")
    val pressureList: List<Double>,
    @field:Json(name="wind_speed_10m")
    val windSpeedList: List<Double>,
    @field:Json(name="relative_humidity_2m")
    val humidityList: List<Double>
)
