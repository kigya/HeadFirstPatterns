package com.kigya.patterns.java.decorator.component;

import lombok.Getter;

@Getter
public abstract class Beverage {
    String description = "Unknown Beverage";

    public abstract double cost();
}
