package org.hyperskill

//
// FontASCII
//

enum class FontASCII(val ch: List<String>) {

    A(listOf(
        """
        ____
    """.trimIndent(),
        """
        |__|
    """.trimIndent(),
        """
        |  |
    """.trimIndent()
    ));


}

fun main() {




}


//
// Data types and variables
//

//    val dictionary = mutableMapOf<Char, listOf>()
//    dictionary['a'] = font.a

//    operator fun get(i: Int): Any? {
//        return a.ch
//    }
//    val a = listOf(
//        """
//        ____
//    """.trimIndent(),
//        """
//        |__|
//    """.trimIndent(),
//        """
//        |  |
//    """.trimIndent()
//    )

/*object fontASCII {
    val a = """
        ____
        |__|
        |  |
    """.trimIndent()

}*/

//
//class FontASCII {
//    val a = """
//        ____
//        |__|
//        |  |
//    """.trimIndent()
//
//    val b = """
//        ___
//        |__]
//        |__]
//    """.trimIndent()
//
//    val c = """
//        ____
//        |
//        |___
//    """.trimIndent()
//
//    val d = """
//        ___
//        |  \
//        |__/
//    """.trimIndent()
//
//    val e = """
//        ____
//        |___
//        |___
//    """.trimIndent()
//
//    val f = """
//        ____
//        |___
//        |
//    """.trimIndent()
//
//    val g = """
//        ____
//        | __
//        |__]
//    """.trimIndent()
//
//    val h = """
//        _  _
//        |__|
//        |  |
//    """.trimIndent()
//
//    val i = """
//        _
//        |
//        |
//    """.trimIndent()
//
//    val j = """
//         _
//         |
//        _|
//    """.trimIndent()
//
//    val k = """
//        _  _
//        |_/
//        | \_
//    """.trimIndent()
//
//    val l = """
//        _
//        |
//        |___
//    """.trimIndent()
//
//    val m = """
//        _  _
//        |\/|
//        |  |
//    """.trimIndent()
//
//    val n = """
//        _  _
//        |\ |
//        | \|
//    """.trimIndent()
//
//    val o = """
//        ____
//        |  |
//        |__|
//    """.trimIndent()
//
//    val p = """
//        ___
//        |__]
//        |
//    """.trimIndent()
//
//    val q = """
//        ____
//        |  |
//        |_\|
//    """.trimIndent()
//
//    val r = """
//        ____
//        |__/
//        |  \
//    """.trimIndent()
//
//    val s = """
//        ____
//        [__
//        ___]
//    """.trimIndent()
//
//    val t = """
//        ___
//         |
//         |
//    """.trimIndent()
//
//    val u = """
//        _  _
//        |  |
//        |__|
//    """.trimIndent()
//
//    val v = """
//        _  _
//        |  |
//         \/
//    """.trimIndent()
//
//    val w = """
//        _ _ _
//        | | |
//        |_|_|
//    """.trimIndent()
//
//    val x = """
//        _  _
//         \/
//        _/\_
//    """.trimIndent()
//
//    val y = """
//        _   _
//         \_/
//          |
//    """.trimIndent()
//
//    val z = """
//        ___
//          /
//         /__
//    """.trimIndent()
//
//    val space = """
//        #
//        #
//        #
//    """.trimIndent()
//}
//
//fun main() {
//    for (i in 'a'..'z') {
//        print("$i ")
//    }
//
//    println("")
//
//    val font = FontASCII()
//
//    val dictionary: MutableMap<Char, String> = mutableMapOf()
//    dictionary['a'] = font.a
//    dictionary['b'] = font.b
//    dictionary['c'] = font.c
//    dictionary['d'] = font.d
//    dictionary['e'] = font.e
//    dictionary['f'] = font.f
//    dictionary['g'] = font.g
//    dictionary['h'] = font.h
//    dictionary['i'] = font.i
//    dictionary['j'] = font.j
//    dictionary['k'] = font.k
//    dictionary['l'] = font.l
//    dictionary['m'] = font.m
//    dictionary['n'] = font.n
//    dictionary['o'] = font.o
//    dictionary['p'] = font.p
//    dictionary['q'] = font.q
//    dictionary['r'] = font.r
//    dictionary['s'] = font.s
//    dictionary['t'] = font.t
//    dictionary['u'] = font.u
//    dictionary['v'] = font.v
//    dictionary['w'] = font.w
//    dictionary['x'] = font.x
//    dictionary['y'] = font.y
//    dictionary['z'] = font.z
//
//    val l1 = mutableListOf<Char>('a','b','c')
//    val l2 = arrayListOf<Char>('a','b','c')
//    val l3 = arrayOf('a','b','c')
//
//    println(l1.add('s'))
//    println(l1)
//
//    l2.add('e')
//    println(l2)
//
//    l3[0] = 'd'
//    l3.forEach { print(it) }
//
//    val l4 = CharArray(3)
//    l4[0] = 'a'
//    l4[1] = 'b'
//    l4[2] = 'c'
//
//    print("\n--> ")
//    l4.forEach { print(it) }
//
//
////    println(dictionary['a'][0])
////    for (i in 'a'..'m') print("${dictionary[i]} ${font.space}")
////    println("")
////    for (i in 'n'..'z') print("${dictionary[i]}")
////    println("")
//}


//    val ch = arrayListOf<String>(
//    ____ ___  ____ ___  ____ ____ ____ _  _ _  _ _  _ _    _  _
//    |__| |__] |    |  \ |___ |___ | __ |__| |  | |_/  |    |\/|
//    |  | |__] |___ |__/ |___ |    |__] |  | | _| | \_ |___ |  |
//    _  _ ____ ___  ____ ____ ____ ___ _  _ _  _ _ _ _ _  _ _   _ ___
//    |\ | |  | |__] |  | |__/ [__   |  |  | |  | | | |  \/   \_/    /
//    | \| |__| |    |_\| |  \ ___]  |  |__|  \/  |_|_| _/\_   |    /__
//    )
//
/*    val fontASCII = listOf(Pair("a","""
        ____
        |__|
        |  |
    """.trimIndent()
    ))

    println(fontASCII[0].first)
    println(fontASCII[0].second)*/

//    val fontASCII =

//    println(fontASCII[0].first)
//    println(fontASCII[0].second)
//}


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
