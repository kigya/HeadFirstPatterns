package com.kigya.patterns.java.strategy.implementation;

import com.kigya.patterns.java.strategy.behaviour.QuackBehaviour;
import lombok.extern.flogger.Flogger;

import java.util.logging.Level;

@Flogger
public class MuteQuack implements QuackBehaviour {
    public void quack() {
        log.at(Level.INFO).log("Silence", MuteQuack.class.toString());
    }
}
