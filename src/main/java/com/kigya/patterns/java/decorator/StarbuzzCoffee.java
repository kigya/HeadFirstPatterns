package com.kigya.patterns.java.decorator;

import com.kigya.patterns.java.decorator.component.Beverage;
import com.kigya.patterns.java.decorator.component.DarkRoast;
import com.kigya.patterns.java.decorator.component.Espresso;
import com.kigya.patterns.java.decorator.component.HouseBlend;
import com.kigya.patterns.java.decorator.decorators.Mocha;
import com.kigya.patterns.java.decorator.decorators.Soy;
import com.kigya.patterns.java.decorator.decorators.Whip;
import lombok.extern.flogger.Flogger;

import java.util.logging.Level;

@Flogger
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        log.at(Level.INFO).log(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        log.at(Level.INFO).log(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        log.at(Level.INFO).log(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
