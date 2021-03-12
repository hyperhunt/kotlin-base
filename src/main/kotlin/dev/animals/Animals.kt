package dev.animals

//interface AnimalsInterface {
//    fun getName(): String
//}

abstract class Animals {
    protected abstract val nameAnimals: String

    open fun getName(): String {
        return nameAnimals
    }
}