package org.hyperskill

//
// Data types and variables
//

//You completed Arrays

/*fun main() {
//    val longs = longArrayOf(100_000_000_001, 100_000_000_002, 100_000_000_003)
//    println(longs.joinToString())

//    val numbers = intArrayOf(12, 17, 8, 101, 33)

    val numbers = IntArray(100)
    numbers[0] = 1
    numbers[9] = 10
    numbers[99] = 100

    numbers.forEach { print( "$it ") }

}*/

/*object p1 {
    val c1 = "c"
}

object p2 {
    val c1= "c"
}

object p3 {
    val asd = 123
}

fun main() {
    println("p1 == p2 --> ${p1.c1 == p2.c1} ")
}*/

/*interface SpaceColor {
    var color: String?
}

calendar

open class Engine(override var color: String? = null) : SpaceColor
data class SpaceShip(override var color: String? = "White") : Engine(color)

fun main() {
    val spaceship = SpaceShip().
    println(spaceship.color)
}*/

/* Print star.
fun main() {

    val charStar = '*'
    val text = readLine()!!

    repeat(text.length + 4) {
        print(charStar)
    }
    println("")

    println("* $text *")

    repeat(text.length + 4) {
        print(charStar)
    }
    println("")
}*/

/* "Hyper Skill"

fun main() {
    val charLineVertical = '|'
    val charLineHorizontal = '_'
    val charDote = '•'

    val text = "Hyper Skill"

    print(" ")
    repeat(text.length + 2) {
        print(charLineHorizontal)
    }
    println("")

    print(charLineVertical)
    print(" $text ")
    println(charLineVertical)

    print(" ")
    repeat(text.length + 2) {
        print(charDote)
    }
    println("")
}*/
