package com.kigya.patterns.kotlin.strategy.entity

data class DecoyDuck(
    override var quackBehaviour: Quack = ::flyNoWay,
    override var flyBehaviour: Fly = ::muteQuack
) : Duck() {

    override fun display(): Unit = logger.info {
        "I'm a duck Decoy: " + DecoyDuck::class.simpleName.toString()
    }
}