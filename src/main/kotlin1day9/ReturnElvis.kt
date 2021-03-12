package org.hyperskill

class Person(val name: String? = null)

fun main() {

    val person = Person()
//    println(person.name?)
    val r = person.name ?: return

    println("#")
    println("r --> ${r.isEmpty()}")
    println("r --> ${r}")
}