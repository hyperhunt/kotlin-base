package org.hyperskill

import com.github.ajalt.mordant.rendering.TextColors

//
// Kotlin - Control flow - If expression
//

fun main() {

//    println("Box 1 = Box 2")
//    println("Box 1 <= box 2")
//    println("Box 1 > Box 2")
//    println("Incomparable")

/*

//
//    println("${30 % 2}")
//    println("${25 % 2}")

//    val ch: Int = box1.reduce { total, next -> total + next }.toInt()

//    println((box1[2] <= box2[2]) )
//    println("${box1[2]} ${box2[2]}")

/*    when {

        (box1.reduce { acc, n -> acc + n }.toInt() == box2.reduce { acc, n -> acc + n }.toInt()) &&
                (box1[0] == box2[1] || box1[0] == box2[1] || box1[0] == box2[2] ) &&
                (box1[1] == box2[1] || box1[0] == box2[1] || box1[0] == box2[2] ) &&
                (box1[2] == box2[1] || box1[0] == box2[1] || box1[0] == box2[2] ) -> println("Box 1 = Box 2")
        else -> when {
            (box1.reduce { acc, n -> acc + n }.toInt() < box2.reduce { acc, n -> acc + n }.toInt()) &&
                    (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) -> println("Box 1 < Box 2")
            (box1.reduce { acc, n -> acc + n }.toInt() > box2.reduce { acc, n -> acc + n }.toInt()) &&
                    (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) -> println("Box 1 > Box 2")
            else -> println("Incomparable")}
    }*/



 */

//    val box1 = readLine()!!.split(" ").sorted()
//    val box2 = readLine()!!.split(" ").sorted()

//    val box1: List=String> = "1 2 3".split(" ").sorted()
//    val box2: List=String> = "4 3 1".split(" ").sorted()

//    val box1: List<Int> = "2 2 2".split(" ").map { it.toInt() }
//    val box2: List<Int> = "1 2 2".split(" ").map { it.toInt() }

//    val box1: List<Int> = "10 20 30".split(" ").map { it.toInt() }
//    val box2: List<Int> = "5 15 25".split(" ").map { it.toInt() }

//    val box1: List<Int> = "1 2 3".split(" ").map { it.toInt() }
//    val box2: List<Int> = "2 3 1".split(" ").map { it.toInt() }

//    val box1: List<Int> = "2 3 4".split(" ").map { it.toInt() }
//    val box2: List<Int> = "1 3 5".split(" ").map { it.toInt() }

//    val box1: List<Int> = "977 301 378".split(" ").map { it.toInt() }
//    val box2: List<Int> = "635 394 435".split(" ").map { it.toInt() }

//    println("${box1.sorted()}\n${box2.sorted()}")

//    val box1: List<Int> = readLine()!!.split(" ").map { it.toInt() } // "1 2 3"
//    val box2: List<Int> = readLine()!!.split(" ").map { it.toInt() } // "2 3 1"

//    val box1: List<Int> = "10 20 30".split(" ").map { it.toInt() % 2 }.sorted()
//    val box2: List<Int> = "5 15 25".split(" ").map { it.toInt() % 2 }.sorted()

//    354 257 476
//    479 178 200
//    val box1: List<Int> = "354 257 476".split(" ").map { it.toInt() }.sorted()
//    val box2: List<Int> = "479 178 200".split(" ").map { it.toInt() }.sorted()

    fun boxes(line1: String, line2: String, check: String) {

        var box1: List<Int> = line1.split(" ").map { it.toInt() }.sorted().reversed()
        var box2: List<Int> = line2.split(" ").map { it.toInt() }.sorted().reversed()

        println("${box1}\n${box2}")

        val boxSummary = box1.reduce { acc, n -> acc + n }.toInt() == box2.reduce { acc, n -> acc + n }.toInt()

//        Коробка со сторонами x1, x2, x3, x1 >= x2 >= x3,
//        помещается в коробку со сторонами y1, y2, y3, y1 >= y2 >= y3,
//        если x1 < y1, x2 < y2, x3 < y3

        val result = when {
            boxSummary && box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2] -> "Box 1 == Box 2"
            box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]  -> "Box 1 < Box 2"
            box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]  -> "Box 1 > Box 2"
            else -> "Incomparable"
        }

/*        val result = when {
            boxSummary || box1 in box2 || box2 in box1 -> "Box 1 == Box 2"
            box1 < box2 -> "Box 1 < Box 2"
            box2 in box1 && box1 !in box2 -> "Box 1 > Box 2"
            else -> "Incomparable"
        }*/

        println("--> R [$result] --> C [$check]\n" +
                "--> Check: ${if (result == check) TextColors.green("Right") else TextColors.red("Wrong")}\n")


/*        val result = when {
            (box1[0] + box1[1] + box1[2]) == (box2[0] + box2[1] + box2[2]) &&
                    (box1[0] == box2[0] || box1[0] == box2[1] || box1[0] == box2[2]) &&
                    (box1[1] == box2[0] || box1[1] == box2[1] || box1[1] == box2[2]) &&
                    (box1[2] == box2[0] || box1[2] == box2[1] || box1[2] == box2[2]) -> "Box 1 = Box 2"
            (box1[0] + box1[1] + box1[2]) <= (box2[0] + box2[1] + box2[2]) &&
                    (box1[0] <= box2[0] || box1[0] <= box2[1] || box1[0] <= box2[2]) &&
                    (box1[1] <= box2[0] || box1[1] <= box2[1] || box1[1] <= box2[2]) &&
                    (box1[2] <= box2[0] || box1[2] <= box2[1] || box1[2] <= box2[2]) -> "Box 1 < Box 2"
            (box1[0] + box1[1] + box1[2]) >= (box2[0] + box2[1] + box2[2]) &&
                    (box1[0] >= box2[0] || box1[0] >= box2[1] || box1[0] >= box2[2]) &&
                    (box1[1] >= box2[0] || box1[1] >= box2[1] || box1[1] >= box2[2]) &&
                    (box1[2] >= box2[0] || box1[2] >= box2[1] || box1[2] >= box2[2]) -> "Box 1 > Box 2"
            else -> "Incomparable"
        }*/

//        val globalResult: Boolean = result == result2

//        println("-> check: ${if (result == check) TextColors.green("true") else TextColors.red("false")}\n")
//        println("[$result] .. [$result2] .. [$check]\n" +
//                "--> check: ${if (globalResult) TextColors.green("true") else TextColors.red("false")}\n")

    }

    boxes("2 2 2", "2 2 2", "Box 1 = Box 2")
    boxes("1 2 3", "2 3 1", "Box 1 = Box 2")
    boxes("1 1 1", "2 2 2", "Box 1 < Box 2")
    boxes("2 2 2", "1 1 1", "Box 1 > Box 2")
    boxes("2 2 2", "1 2 2", "Box 1 > Box 2")
    boxes("2 3 4", "1 3 5", "Incomparable")

}

/*fun main() {
//    Read three natural numbers a, b, c. Define if a triangle with such side lengths exists.
//    If the triangle exists, output the YES string, otherwise output NO.
//    Note that a triangle is formed by three connected points that are not located on a single straight line.

//    val ch1 = 3
//    val ch2 = 4
//    val ch3 = 5

    val ch1 = readLine()!!.toInt()
    val ch2 = readLine()!!.toInt()
    val ch3 = readLine()!!.toInt()

    if ((ch1 < ch2 + ch3) && (ch2 < ch1 + ch3) && (ch3 < ch1 + ch2)) println("YES") else println("NO")

}*/

/*@ExperimentalTime
fun main() {
    var sum = 0.0f
    val time = measureTime {
        for (i in 1..100) sum+=0.01f
    }
    println(time)
}*/

/*fun main() {
    val startTime = System.currentTimeMillis();
    for (i in 1..1000 step 1) {
        println(i)
    }
    println((System.currentTimeMillis() - startTime));
}*/

/*fun main() {
    // Write a program that reads a number and prints EVEN if it is even. Otherwise, the program should print ODD.

    val ch = readLine()!!.toInt()

    if (ch % 2 != 0) println("ODD") else println("EVEN")
}*/

//
// Kotlin - Data types and variables - Ranges String templates
//

// Yaaay!
//You completed String templates

//fun main() {
//    val ch = readLine()!!
//    val indexCh = readLine()!!.toInt()
//    println("Symbol # $indexCh of the string \"$ch\" is '${ch[indexCh-1]}'")
//}

/*fun main() {
//    23:59:59 12/12/2018
    val ch1 = readLine()!!.split(" ")
    val ch2 = readLine()!!.split(" ")
    println("${ch1[0]}:${ch1[1]}:${ch1[2]} ${ch2[0]}/${ch2[1]}/${ch2[2]}")
}*/

/*fun main() {

    val ch1 = readLine()!!.toInt()
    val ch2 = readLine()!!.toInt()

    println("$ch1 plus $ch2 equals ${ch1 + ch2}")
//    12 plus 34 equals 46
//    val s = "string"
//    print("$s.first()")
}*/

//
// Kotlin - Data types and variables - Ranges
//

/*fun main() {
//    Write a program that reads five integer numbers. The first and the second numbers create one range, the third and the fourth ones create another range.
//    Output "true" if the fifth number is within at least one range, otherwise output "false".

    val ch1 = readLine()!!.toInt()
    val ch2 = readLine()!!.toInt()
    val ch3 = readLine()!!.toInt()
    val ch4 = readLine()!!.toInt()
    val ch5 = readLine()!!.toInt()

    if ((ch5 in ch1..ch2) || (ch5 in ch3..ch4)) println(true) else println(false)
}*/

/*fun main() {
//    Write a program that reads three integer numbers and prints "true" if the first number is between the second and the third ones (inclusive). Otherwise, it is to print "false". Guaranteed that the second number is less than the third one.
//    Use ranges to solve the problem.

    val ch1 = readLine()!!.toInt()
    val ch2 = readLine()!!.toInt()
    val ch3 = readLine()!!.toInt()

    if ((ch1 in ch2..ch3) && (ch2 < ch3)) println(true) else println(false)
}*/

/*fun main() {
//    Julia wants to get a job. Although by the law of the country she lives in, she can work only if her age is within 18 to 59 years inclusive.
//    For a particular age of Julia output "true" if she can get a job, otherwise output "false".

    val age = readLine()!!.toInt()
    println(age in 18..59)
}*/

//Yay! You've completed Stage 2/4!

//
// Kotlin - Strings
//

/*fun main() {
//Write a program that reads five words from the standard input and outputs each word in a new line.
//The words can be placed in the input stream in any way.
//To solve the problem, use Scanner .

    val scanner = Scanner(System.in)
    val fiveWords = mutableListOf<String>()

    while (fiveWords.size < 5) {
        scanner.nextLine().split(" ").forEach {
            if (fiveWords.size < 5) fiveWords.add(it)
        }
    }

    fiveWords.forEach { println(it) }

//    while (fiveWords.size < 5) {
//        val line = scanner.nextLine().split(" ")
//    }
//    println(fiveWords)
//    var line: String = ""
//    for (i in 0 until 5 step 1) line += scanner.nextLine()
//
//    line.split(" ").forEach { println(it) }
//    for (i in line) {
//        println(i)
//    }

//    line.split(" ").forEach { println(it) }
//    println(scanner.hasNextLine())
//

//    while ( != 0) {
//
//        line.split(" ").forEach { println(it) }
//    }

//    val str = """
//        This course
//        teach you Kotlin
//    """.trimIndent()

//    str.split(" ").forEach { println(it) }
}*/


/*fun main() {
    val scanner = "Tony"

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    // reading a name

    val yourName= readLine()!!
    println("What a great name you have, ${yourName}!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders

    val age = readLine()!!.split(" ")
    println(age)
    val remainder3 = age[0].toInt()
    val remainder5 = age[1].toInt()
    val remainder7 = age[2].toInt()
    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is ${yourAge}; that's a good time to start programming!")
}*/

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
