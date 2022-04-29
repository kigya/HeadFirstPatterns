package com.kigya.patterns.kotlin.strategy.entity

import com.kigya.patterns.java.strategy.entity.Duck
import mu.KotlinLogging

typealias Quack = () -> Unit
typealias Fly = () -> Unit

val logger = KotlinLogging.logger { }

abstract class Duck {

    abstract var quackBehaviour: Quack
    abstract var flyBehaviour: Fly

    abstract fun display()

    fun performQuack() = quackBehaviour.invoke()
    fun performFly() = flyBehaviour.invoke()

    open fun swim() = logger.info {
        "All ducks float, even decoys: " + this::class.simpleName.toString()
    }

}

fun muteQuack() = logger.info { "Silence: " + Duck::performQuack::class.java.toString() }
fun squeak() = logger.info { "Squeak: " + Duck::performQuack::class.java.toString()  }
fun flyNoWay() = logger.info { "I can't fly: " + Duck::performFly::class.java.toString()}
fun flyWithWings() = logger.info { "I'm flying!: " + Duck::performFly::class.java.toString()}