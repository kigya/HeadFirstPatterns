package com.kigya.patterns.java.decorator.decorators;

import com.kigya.patterns.java.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
