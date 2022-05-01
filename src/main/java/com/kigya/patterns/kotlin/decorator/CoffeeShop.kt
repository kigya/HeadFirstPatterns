package com.kigya.patterns.kotlin.decorator

import com.kigya.patterns.kotlin.decorator.component.Espresso
import com.kigya.patterns.kotlin.decorator.component.HouseBlend
import com.kigya.patterns.kotlin.decorator.decorators.Mocha
import com.kigya.patterns.kotlin.decorator.decorators.Soy
import com.kigya.patterns.kotlin.decorator.decorators.Whip

fun main() {

    val beverage = Espresso()

    println("${beverage.description} $${beverage.cost()}")

    val beverage2 =
        Whip(
            Mocha(
                Soy(
                    HouseBlend()
                )
            )
        )

    println("${beverage2.description} $${beverage2.cost()}")

}