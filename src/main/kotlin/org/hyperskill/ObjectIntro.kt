package org.hyperskill

//Intro in Objects

fun main() {
    fun getRealGrade(x: Double) = x
    fun getGradeWithPenalty(x: Double) = x -1

    fun getScoringFunction(isCheater: Boolean): (Double) -> Double {
        if (isCheater) return ::getGradeWithPenalty
        return ::getRealGrade
    }

    val wantedFunction = getScoringFunction(true)
    println(wantedFunction(9.0))
}

//fun main() {
//    fun sum(first: Int, second: Int): Int {
//        return first + second
//    }
//
//    val link: (first: Int, second: Int) -> Int = ::sum
//
//    println(link(5,4))
//}