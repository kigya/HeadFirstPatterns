package com.kigya.patterns.java.strategy.implementation;

import com.kigya.patterns.java.strategy.behaviour.FlyBehaviour;
import lombok.extern.flogger.Flogger;

import java.util.logging.Level;

@Flogger
public class FlyWithWings implements FlyBehaviour {
    public void fly() {
        log.at(Level.INFO).log("I'm flying!!", FlyWithWings.class.toString());
    }
}
