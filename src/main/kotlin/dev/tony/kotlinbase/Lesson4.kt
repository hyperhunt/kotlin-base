@file:JvmName("Main")

package dev.tony.kotlinbase

/*fun String?.isEmptyOrNull() : Boolean {
    return when {
        this == String() -> true
        this == "hello" -> false
        else -> true
    }
}*/

//fun String?.isEmptyOrNull() : Boolean = this?.isEmpty() ?: true
// "" true
// null true
// "hello" false

// Int.r() -> RationalNumber
// Pair<Int, Int>.r() -> RationalNumber
data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

// 34 sm 13 = 47
// 34.sm(13)

infix fun Int.sm(other: Int) : Int = this + other

open class Base
class Child : Base()

fun Base.hello() : String = "Hello Base!"
fun Child.hello() : String = "Hello Child!"

fun main() {
    println(42.r())
    println((25 to 45).r())
    println("${34.sm(13)}")
    println("${34 sm 23}")
/*    println("".isEmptyOrNull())
    println(null.isEmptyOrNull())
    println("hello".isEmptyOrNull())*/

    val child: Base = Child()
    println(child.hello()) // "Hello Base!" not override Base.
}