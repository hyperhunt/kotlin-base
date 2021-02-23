package org.hyperskill

import kotlin.random.Random

fun genericNumber() {
    val numberGeneric: Sequence<String> =
        generateSequence { Random.nextInt(0, 10).toString() }
    numberGeneric.take(20).forEach { println(it) }
}

fun main() {
    genericNumber()
}