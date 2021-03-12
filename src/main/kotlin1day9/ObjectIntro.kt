package org.hyperskill

//Intro in Objects

fun main() {
    "Hello".filter { it == 'l' }.prin()

    fun String.isNotDot() = this.filter { it != '.' }
    "H.e.l.l.o".isNotDot().prin()

    fun isNotTilda(char: Char): Boolean = char != '~'
    "H~e~l~l~o".filter(::isNotTilda).prin()
}

//fun main() {
//    fun applyAndSum(a: Int, b: Int, transformation: (Int) -> Int): Int {
//        return transformation(a) + transformation(b)
//    }
//
//    fun same(x: Int) = x
//    fun square(x: Int) = x * x
//    fun triple(x: Int) = 3 * x
//
//    println(applyAndSum(1,2, ::same))
//    println(applyAndSum(1,2, ::square))
//    println(applyAndSum(1,2, ::triple))
//}

//fun main() {
//    fun getRealGrade(x: Double) = x
//    fun getGradeWithPenalty(x: Double) = x -1
//
//    fun getScoringFunction(isCheater: Boolean): (Double) -> Double {
//        if (isCheater) return ::getGradeWithPenalty
//        return ::getRealGrade
//    }
//
//    val wantedFunction = getScoringFunction(true)
//    println(wantedFunction(9.0))
//}

//fun main() {
//    fun sum(first: Int, second: Int): Int {
//        return first + second
//    }
//
//    val link: (first: Int, second: Int) -> Int = ::sum
//
//    println(link(5,4))
//}