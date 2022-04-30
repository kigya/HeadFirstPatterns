package com.kigya.patterns.java.observer;

import com.kigya.patterns.java.observer.subscribers.CurrentConditionsDisplay;
import com.kigya.patterns.java.observer.subscribers.ForecastDisplay;
import com.kigya.patterns.java.observer.subscribers.HeatIndexDisplay;
import com.kigya.patterns.java.observer.subscribers.StatisticsDisplay;
import com.kigya.patterns.java.observer.publisher.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.removeObserver(heatIndexDisplay);
        weatherData.removeObserver(statisticsDisplay);
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
