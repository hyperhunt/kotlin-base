package dev.animals

fun main() {
    val birds = listOf(Bird("Hungry"), Bird("Awesome"))
    val dog = listOf(Dog("Gav"), Dog("Uf"))
    printAnimals(birds)
    printAnimals(dog)
}

fun printAnimals(animals: List<Animals>) {
    animals.forEach { println(it.getName()) }
}