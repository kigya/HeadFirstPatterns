package com.kigya.patterns.kotlin.strategy

import com.kigya.patterns.kotlin.strategy.entity.DecoyDuck
import com.kigya.patterns.kotlin.strategy.entity.MallardDuck

fun main() {

    DecoyDuck().run {
        display()
        performQuack()
        performFly()
        swim()
    }

    MallardDuck().run {
        display()
        performQuack()
        performFly()
        swim()
    }

}