package dev.tony

import java.io.File

fun main() {
    val file = File("src/main/resources/numbers.txt").readText().split(" ")
    println("${file.filter { it.toInt() > 0 } }")
}