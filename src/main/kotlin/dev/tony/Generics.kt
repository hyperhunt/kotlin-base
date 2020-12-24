package dev.tony

/*fun <T> returnTwoElements(obj: T): List<T> {
    val list: List<T> = listOf(obj, obj)
    return list
}*/
fun <T> returnTwoElements(obj: T): List<T> = listOf(obj, obj)

fun <T> parePrint(obj: T, ch: Char) = when (ch) {
    '{', '}' -> println("{$obj}")
    '[', ']' -> println("[$obj]")
    '(', ')' -> println("($obj)")
    else -> println("Unknown parse symbol: '$ch'.")
}

class Something<T>(p: T) {
    val prop: T = p
}

fun main() {
    val number = 42
    val str = "str"
    val doubleNumber = 3.14

    println(returnTwoElements(number))
    println(returnTwoElements(str))
    println(returnTwoElements(doubleNumber))

    parePrint(number, '{')
    parePrint(str, '[')
    parePrint(doubleNumber, '(')
    parePrint(doubleNumber, '=')

    println("\nClass<T>")
    val aSomething: Something<Int> = Something(42)
    val sSomething: Something<String> = Something("String")
    println(aSomething.prop)
    println(sSomething.prop)
}