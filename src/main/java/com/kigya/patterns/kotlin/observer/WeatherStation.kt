package com.kigya.patterns.kotlin.observer

import com.kigya.patterns.kotlin.observer.publisher.WeatherData
import com.kigya.patterns.kotlin.observer.subscibers.CurrentConditionsDisplay

fun main() {
    val weatherData = WeatherData()

    CurrentConditionsDisplay(weatherData)

    weatherData.setMeasurements(80f, 60f, 30.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.2f)
}