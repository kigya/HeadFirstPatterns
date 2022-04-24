package com.kigya.patterns.java.strategy;

import com.kigya.patterns.java.strategy.entity.DecoyDuck;
import com.kigya.patterns.java.strategy.entity.MallardDuck;
import lombok.extern.flogger.Flogger;

@Flogger
public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        mallardDuck.swim();
        decoyDuck.swim();
    }
}
