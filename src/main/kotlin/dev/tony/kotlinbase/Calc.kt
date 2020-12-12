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

fun main() {
    println(eval(Sum(Num(2), Mul(
        Num(5),
        Num(6)
    ))))
}