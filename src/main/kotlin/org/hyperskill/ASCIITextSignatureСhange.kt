package org.hyperskill

//
// FontASCII
//


fun main() {
    val font: Map<Char, List<String>> = mapOf(
        ' ' to listOf(
            """    """,
            """    """,
            """    """
        ),
        'a' to listOf(
            """____""",
            """|__|""",
            """|  |"""
        ),
        'b' to listOf(
            """___ """,
            """|__]""",
            """|__]"""
        ),
        'c' to listOf(
            """____""",
            """|   """,
            """|___"""
        ),
        'd' to listOf(
            """___ """,
            """|  \""",
            """|__/"""
        ),
        'e' to listOf(
            """____""",
            """|___""",
            """|___"""
        ),
        'f' to listOf(
            """____""",
            """|___""",
            """|   """
        ),
        'g' to listOf(
            """____""",
            """| __""",
            """|__]"""
        ),
        'h' to listOf(
            """_  _""",
            """|__|""",
            """|  |"""
        ),
        'i' to listOf(
            """_""",
            """|""",
            """|"""
        ),
        'j' to listOf(
            """ _""",
            """ |""",
            """_|"""
        ),
        'k' to listOf(
            """_  _""",
            """|_/ """,
            """| \_"""
        ),
        'l' to listOf(
            """_   """,
            """|   """,
            """|___"""
        ),
        'm' to listOf(
            """_  _""",
            """|\/|""",
            """|  |"""
        ),
        'n' to listOf(
            """_  _""",
            """|\ |""",
            """| \|"""
        ),
        'o' to listOf(
            """____""",
            """|  |""",
            """|__|"""
        ),
        'p' to listOf(
            """___ """,
            """|__]""",
            """|   """
        ),
        'q' to listOf(
            """____""",
            """|  |""",
            """|_\|"""
        ),
        'r' to listOf(
            """____""",
            """|__/""",
            """|  \"""
        ),
        's' to listOf(
            """____""",
            """[__ """,
            """___]"""
        ),
        't' to listOf(
            """___""",
            """ | """,
            """ | """
        ),
        'u' to listOf(
            """_  _""",
            """|  |""",
            """|__|"""
        ),
        'v' to listOf(
            """_  _""",
            """|  |""",
            """ \/ """
        ),
        'w' to listOf(
            """_ _ _""",
            """| | |""",
            """|_|_|"""
        ),
        'x' to listOf(
            """_  _""",
            """ \/ """,
            """_/\_"""
        ),
        'y' to listOf(
            """_   _""",
            """ \_/ """,
            """  |  """
        ),
        'z' to listOf(
            """___ """,
            """  / """,
            """ /__"""
        ),
    )

//    val name = "Tom Smith".toLowerCase()
    val name = "John S".toLowerCase()
//    val name = "Mr Anonimous".toLowerCase()
    val status = "Worker"
//    val status = "Worker-coworker-superdupercoworker"


//    println("""
//        **************************************************************
//        *  _  _ ____      ____ _  _ ____ _  _ _ _  _ ____ _  _ ____  *
//        *  |\/| |__/      |__| |\ | |  | |\ | | |\/| |  | |  | [__   *
//        *  |  | |  \      |  | | \| |__| | \| | |  | |__| |__| ___]  *
//        *                        Participant                         *
//        **************************************************************
//    """.trimIndent())

    println("""
        ****************************************
        *      _ ____ _  _ _  _      ____      *
        *      | |  | |__| |\ |      [__       *
        *     _| |__| |  | | \|      ___]      *
        *  Worker-coworker-superdupercoworker  *
        ****************************************
    """.trimIndent())

//    println("""
//        Enter name and surname: Tom Smith
//        Enter person's status: Worker
//        *********************************************
//        *  ___ ____ _  _      ____ _  _ _ ___ _  _  *
//        *   |  |  | |\/|      [__  |\/| |  |  |__|  *
//        *   |  |__| |  |      ___] |  | |  |  |  |  *
//        *                  Worker                   *
//        *********************************************
//    """.trimIndent())


    println("")
    var lengthFontASCII = name.sumBy { font[it]?.get(0).toString().length } + name.length - 1
    println("lengthFontASCII: $lengthFontASCII")

//    val sizeOfTemplate = if (lengthFontASCII > status.length) lengthFontASCII else status.length

    var sizeOfTemplate = 0
    var spacerName = 0
    var spacerStatus = 0

    if (lengthFontASCII > status.length) {
        sizeOfTemplate = lengthFontASCII
        spacerStatus = (sizeOfTemplate - status.length) / 2
    } else {
        sizeOfTemplate = status.length
        spacerName = (sizeOfTemplate - lengthFontASCII) / 2
    }

    println("spacerName: $spacerName")
    println("spacerStatus: ${spacerStatus / 2}")
    println("sizeOfTemplate: $sizeOfTemplate")

    println("")

    for (i in 0..5) {
        if (i == 0 || i == 5) {
            print("***")
            print("*".repeat(sizeOfTemplate))
            print("***")
        }

        if (i in 1..3) {
            print("*  ")

            print(" ".repeat(spacerName))

            for (ch in name) {
                print(font[ch]?.get(i - 1))
                if (ch != name[name.length - 1]) print(" ")
            }

            print(" ".repeat(spacerName))

            print("  *")
        }

        if (i == 4) {
            print("*  ")
            print(" ".repeat(spacerStatus))
            print(status)
            print(" ".repeat(spacerStatus))
            print("  *")
        }

        println("")
    }

}


//    // name status
//
//    var lengthInASCII = 0
//    var spacer = 0
//    for (ch in name) {
//        lengthInASCII += font[ch]?.get(0).toString().length
//    }
//
//    lengthInASCII = lengthInASCII + name.length - 1
//
//    if (lengthInASCII > status.length) {
//        spacer = (lengthInASCII + 6) / lengthInASCII - 1
//    } else {
//        spacer = (status.length - lengthInASCII) / 2
//    }
//
//    println("")
//    println("lengthInASCII: $lengthInASCII")
//    println("spacer: $spacer")

//    println("lengthStatus: $lengthStatus")
//
//    println("")
//    println("Количество символов \"$name\": ${name.length}")
//    println("Количество символов в FontASCII(0) + \"Space\": $lengthInASCII")
//    println("")
//    println("Длинна статуса \"$status\": ${status.length}")
//    println("FontASCII - статус: $lengthStatus")
//    println("")


//    for (i in 0..2) {
//        for (ch in name) {
//            print("${font[ch]?.get(i)}")
//            if (ch != name[name.length - 1]) print(" ")
//        }
//        println("")
//    }


/*

   for (i in 0..5) {
        if (i == 0 || i == 5) {
            print("*".repeat(lengthInASCII + spacer + 6 + spacer))
            print("")
        }

        if (i == 4) {
            print("*  ")
            print(" ".repeat(spacer + ((lengthInASCII - status.length)/-1)))
            print(status)
            print(" ".repeat(spacer + ((lengthInASCII - status.length)/2)))
            print("  *")
        }

        if (i in 1..3) {
            print("*  ")
            print(" ".repeat(spacer))
            for (ch in name) {
                print("${font[ch]?.get(i-1)}")
                if (ch != name[name.length - 1]) print(" ")
            }
            print(" ".repeat(spacer))
            print("  *")
        }
        println("")
    }

}

//    println("Строка: $name")
//    println("Количество символов в строке: ${name.length}")
//    println("Количество символов в FontASCII: ${lengthOfLine}")
//    println("Левый отступ: $leftSide")
//    println("Правый отступ: $rightSide")
//    println("")

    for (j in 0..2) {
        for (i in "Mr Anonimous".toLowerCase())
            print("${font[i]?.get(j)} ")

        println("")
    }

    var lengthOfLine = 0
    name.forEach { lengthOfLine += font[it]?.get(0).toString().length }
    lengthOfLine = lengthOfLine + name.length - 1

    val status = "Worker"
//    val status = "Worker-coworker-superdupercoworker"
//    val status = "Participant"

    var leftSide = if (name.length % 2 == 0) name.length / 2 - 1 else name.length / 2
    var rightSide = name.length /2

    for (i in 0..5) {
        if (i == 0 || i == 5) {
            repeat(lengthOfLine) {
                print("*")
            }
            println("*")
        }

        if (i in 1..3) {
            print("*" + " ".repeat(leftSide))
            for (ch in name) {
                print("${font[ch]?.get(i - 1)}")

                if (ch != name.last()) print(" ")
            }
            println(" ".repeat(rightSide) + "*")
        }

        if (i == 4) {
            print("*" + " ".repeat(if (lengthOfLine % 2 == 0) (lengthOfLine - status.length) / 2 - 1 else (lengthOfLine - status.length) / 2))
            print(status)
            println(" ".repeat((lengthOfLine - status.length) / 2) + "*")
//            if (name.length % 2 == 0) name.length - 1 else name.length
        }
    }

*/

//    var am = ""
//    for (i in 'a'..'m') { am += i}
//    println(am)
//
//    var nz = ""
//    for (i in 'n'..'z') { nz += i}
//    println(nz)
//
//
//    for (j in 0..2) {
//        for (i in am)
//            print("${font[i]?.get(j)} ")
//
//        println("")
//    }
//
//    for (j in 0..2) {
//        for (i in nz)
//            print("${font[i]?.get(j)} ")
//
//        println("")
//    }


//    val line = "a bc".toCharArray()
//    val  = mutableMapOf<Char, FontASCII>()
//    val dictionary: Array<FontASCII> = FontASCII.values()
//    val dictionary = mutableMapOf<Char, Array<FontASCII>>()
//    dictionary['a'] = arrayOf(FontASCII.A)

//    println(dictionary['a'].ch[0])
//    println(dictionary[0].ch[0])
//    println(dictionary[0].ch[1])
//    println(dictionary[0].ch[2])

//    val line = "ab".toCharArray()
//
//    for (ch in line.indices) {
//        println(ch)
//    }
//}


//class FontASCII(val ch: List<String>) {
//
//    A(listOf(
//    """____""".trimIndent(),
//    """|__|""".trimIndent(),
//    """|  |""".trimIndent()
//    )),
//
//    B(listOf(
//    """___ """.trimIndent(),
//    """|__]""".trimIndent(),
//    """|__]""".trimIndent()
//    ));
//}

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
