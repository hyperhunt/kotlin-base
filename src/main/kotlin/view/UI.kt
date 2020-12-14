package view

import JavaClickListener
import JavaView

data class Person(val name: String, val age: Int)

val people = listOf(
    Person("Tony", 42),
    Person("Harper", 30),
    Person("Moskvin", 13),
)

fun hi() = println("hi")

fun Person.isAdult() : Boolean = age >= 18

fun main() {

//    println(people.filter { it -> it.age < 30 })
    println(people.minByOrNull { x: Person -> x.age })
    println(people.minOf { x: Person -> x.age })

    var counter = 0
    people.forEach { _ -> counter++ }
    println("counter: $counter")

    val create = ::Person
    println(create("Tony", 42))

    val adult = Person::isAdult
    println(
        people.filter(adult)
    )

    val harpName = create("Harp", 11)
    val harpAge = harpName::age
    println("harpAge: ${harpAge.get()}")

    val personAge = Person::age // Ссылка на метод класс
    val hello = ::hi // Ссылка на функцию
    run(hello) // Вызов функции по ссылке


    val javaView = JavaView()
    javaView.setOnClickListener(object: JavaClickListener {
        override fun onClick(view: JavaView?) {
            println("javaView -> object")
        }
    })

    javaView.setOnClickListener { view -> println("javaView -> lambda") }

    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y}
    println(sum(5, 8))

    /*
    { println("Hello")} ()
    run { println("Hello") }
     */
}