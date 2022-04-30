package com.kigya.patterns.kotlin.observer.subscibers

import com.kigya.patterns.kotlin.observer.publisher.Subject
import com.kigya.patterns.kotlin.observer.publisher.WeatherData
import com.kigya.patterns.kotlin.strategy.entity.logger

class CurrentConditionsDisplay(weatherData: Subject<WeatherData>) : Observer<WeatherData>, DisplayElement<WeatherData> {

    init {
        weatherData.registerObserver(this)
    }

    override fun update(data: WeatherData) = display(data)

    override fun display(data: WeatherData) =
        logger.info {
            "Current conditions: ${data.temperature} F degrees and ${data.humidity}% humidity"
        }
}