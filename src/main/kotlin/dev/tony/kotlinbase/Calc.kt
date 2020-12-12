@file:JvmName("Main")

package dev.tony.kotlinbase

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
class Mul(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    return when (e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        is Mul -> eval(e.left) * eval(e.right)
        else -> throw IllegalArgumentException("Unknown expr.")
    }
}

// Функция расширения свойства
var StringBuilder.lastCharOf : Char
    get() = get(length - 1)
    set(value) = setCharAt(length - 1, value)

fun main() {
    println(eval(Sum(Num(2), Mul(
        Num(5),
        Num(6)
    ))))

    var ch = StringBuilder("Hello")
    ch.lastCharOf = '!'
    println(ch)
}