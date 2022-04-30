package com.kigya.patterns.java.observer.subscribers;

import com.kigya.patterns.java.observer.publisher.WeatherData;
import lombok.extern.flogger.Flogger;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

@Flogger
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(@NotNull WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        String mutableState;
        if (currentPressure > lastPressure) {
            mutableState = "Improving weather on the way!";
        } else if (currentPressure == lastPressure) {
            mutableState = "More of the same";
        } else {
            mutableState = "Watch out for cooler, rainy weather";
        }
        log.at(Level.INFO).log("Forecast: " + mutableState);
    }
}
