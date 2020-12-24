package dev.tony

/*fun <T> returnTwoElements(obj: T): List<T> {
    val list: List<T> = listOf(obj, obj)
    return list
}*/
fun <T> returnTwoElements(obj: T): List<T> = listOf(obj, obj)

fun main() {
    val number = 42
    val str = "str"
    val doubleNumber = 3.14

    println(returnTwoElements(number))
    println(returnTwoElements(str))
    println(returnTwoElements(doubleNumber))
}