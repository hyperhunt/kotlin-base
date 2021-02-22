package org.hyperskill



//
// Kotlin - character
//

/*fun main() {
//    Write a program that reads a character and checks if it is a capital letter or a digit from 1 to 9.
//    The program must print either true or false.

//    val ch = 'A'.toChar()
//    if (ch.isUpperCase() || (ch.isDigit() in 1..9)) println(true) else println(false)

    val ch = readLine()!!.first().toChar()

    when {
        ch.isUpperCase() -> println(true)
        ch.isDigit() && ch.toString().toInt() in 1..9 -> println(true)
        else -> println(false)
    }
}*/

/*fun main() {
//    Write a program that reads four characters and checks for each character whether it is a digit.
//    The program must print either true or false for each character in a new line.

//    val ch1: Int = 3
//    val ch2: Char = '@'
//    val ch3: Int = 8
//    val ch4: Char = 'd'

//    val ch = listOf(3, '@', 8, 'd')


    val ch = mutableListOf<Char>()

    ch.add(readLine()!!.first())
    ch.add(readLine()!!.first())
    ch.add(readLine()!!.first())
    ch.add(readLine()!!.first())

    ch.forEach {
        if (it.isDigit()) println(true) else println(false)
    }
}*/

/*fun main() {
//     Unicode (UTF-16)
//    println('\u003F') / ?

//    val ch1 = 'a'.toInt()
//    val ch2 = 'b'.toInt()
//    val ch3 = 'c'.toInt()

    val ch1 = readLine()!!.first().toInt()
    val ch2 = readLine()!!.first().toInt()
    val ch3 = readLine()!!.first().toInt()
//    readLine()!!.first().toInt()

    val ch: Boolean = ((ch1 in ch1..ch1+2) && (ch2 in ch1..ch1+2) && (ch3 in ch1..ch1+2)) && (ch2 in (ch1 + 1) until ch3)
    println(ch)
//    println((ch1+2).toChar())
//    if (ch1 in ch1..(ch1+3)) println(true) else println(false)
}*/

/*fun main() {
    println(" ".repeat(7))
    println("bla".padStart(7))
}*/

/*fun main() {
    val x = 25 % 12
    println("x = $x")

    val y = 5
    println("y = ${8 % y}")
    println(13 % 6)

//    println(x = n⋅y + z)

}*/

/*

fun main() {
    */
/*val x = 0

    println((x % 3).toString() + " = 0")
    println((x % 2).toString() + " = 0")
    println((x % 2).toString() + " = 1")
    println((x % 4).toString() + " = 1")*//*


    val mod = listOf(
        Pair(3, 0),
        Pair(2, 0),
        Pair(2, 1),
        Pair(4, 1)
    )
    mod.forEach {  }

    var x = 0
    var modCheck: Boolean = false

    while (!modCheck) {
        mod.forEach { it: Pair<Int, Int> ->
            modCheck = x % it.first != it.second
            println(x.toString() + " mod " + it.first.toString() + " = " + it.second.toString() + " " + modCheck)

            if (modCheck) {
                modCheck = false
                return@forEach
            }

        }

        x++
        println(" ")
    }
}
*/

/*
class Person {
    val name: String = "Vlad"

    fun <T> print() {
        println(this@Person.name)
    }
}

fun main() = Person().print<String>()*/
