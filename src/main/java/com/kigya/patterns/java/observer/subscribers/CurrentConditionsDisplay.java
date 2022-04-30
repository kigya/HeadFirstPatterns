package com.kigya.patterns.java.observer.subscribers;

import com.kigya.patterns.java.observer.publisher.WeatherData;
import lombok.extern.flogger.Flogger;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

@Flogger
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(@NotNull WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        log.at(Level.INFO).log("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
