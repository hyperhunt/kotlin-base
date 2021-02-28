package org.hyperskill

fun String.prin() {
    println("--> $this")
}



// Multi-dimensional arrays

//fun main() {
//
//    val charStar = '*'
//    val text = readLine()!!
//
//    repeat(text.length + 4) {
//        print(charStar)
//    }
//    println("")
//
//    println("* $text *")
//
//    repeat(text.length + 4) {
//        print(charStar)
//    }
//    println("")
//}

//fun main() {
//    val str1 = "aaabbcccdaa"
//    var str2 = " "
//
//    for (ch in str1) {
//        if (ch != str2.last()) {
//            str2 += ch
//        }
//    }
//
//    println(str2)
//}

//fun main() {
//
//    val numbers = arrayOf(1, 2, 3, 4, 5)
//
//    var sum = 0
//    for (i in numbers.lastIndex downTo 0) {
//        sum += numbers[i]
//    }
//
//    println(sum)
//}

//fun main() {
//    // Напишите программу, которая читает слово и печатает количество символов, которые появляются только один раз.
//    val word = "abracadabra"
//
//    var counter = 0
//    for (ch in word) {
//        if (word.count { it == ch } < 2) counter++ else continue
//    }
//    println(counter)
//}

//fun main() {
//
////Напишите программу, которая читает слово и печатает все буквы, которых нет в этом слове.
////Учитываются только строчные буквы.
//
//    val word = "hello"
//
//    for (ch in 'a'..'z') {
//        if (ch !in word) print(ch) else continue
//    }
//
//}

//fun main() {
//    val word = "abcd37lnj"
//    for (ch in word) {
//        if (ch.isDigit()) {
//            println(ch)
//            break
//        }
//    }
//}

//fun main() {
//    for (i in 1..4) {
//        loop@ for (j in 1..3) {
//            for (k in 1..2) {
//                if (i == 2 || j == 3 || k == 2) break@loop
//                print("$k")
//            }
//        }
//    }
//}

// String arrays

//val capitals = arrayOf("Tokyo", "Moscow", "Paris", "Washington", "Beijing")
//capitals[0] = "Tokyo"
//capitals[1] = "Moscow"
//capitals[2] = "Paris"
//capitals[3] = "Washington"
//capitals[4] = "Beijing"
//
//println(capitals)

//fun main() {
//    "content".substring(1,1).prin()
//    "content".substring(0,0).prin()
////    "content".substring(-1,-1).prin()
//    "content".substringAfter("t").prin()
//    "content".substring(0,1).prin()
//    "content".substringBefore("c").prin()
//}