@file:JvmName("Main")

package dev.tony.kotlinbase

// Goat, Dog, Cat -> method say()

interface Animals {
    fun say()
}

class Goat : Animals {
    override fun say() {
        println("Bee-bee...")
    }
}

class Cat : Animals {
    override fun say() {
        println("May-may...")
    }
}

class Dog : Animals {
    override fun say() {
        println("Bark-bark...")
    }
}

fun main() {
    val farm = listOf<Animals>(Cat(), Goat(), Dog())
    farm.forEach { it.say() }
}