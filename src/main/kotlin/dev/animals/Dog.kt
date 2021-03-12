package dev.animals

class Dog internal constructor(private val name: String) : Animals() {
    override val nameAnimals: String
        get() = name

    override fun getName(): String {
        return "Dog name: $nameAnimals"
    }
}