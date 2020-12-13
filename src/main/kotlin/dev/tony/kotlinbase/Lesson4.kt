@file:JvmName("Main")

package dev.tony.kotlinbase

/*fun String?.isEmptyOrNull() : Boolean {
    return when {
        this == String() -> true
        this == "hello" -> false
        else -> true
    }
}*/

fun String?.isEmptyOrNull() : Boolean = this?.isEmpty() ?: true

// "" true
// null true
// "hello" false

fun main() {
    println("".isEmptyOrNull())
    println(null.isEmptyOrNull())
    println("hello".isEmptyOrNull())
}