package org.hyperskill



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
