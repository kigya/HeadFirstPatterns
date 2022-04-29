package com.kigya.patterns.kotlin.strategy.entity

class MallardDuck(
    override var quackBehaviour: Quack = ::flyWithWings,
    override var flyBehaviour: Fly = ::squeak
) : Duck() {
    override fun display(): Unit = logger.info {
        "I'm a real Mallard duck: " + MallardDuck::class.java.toString()
    }
}