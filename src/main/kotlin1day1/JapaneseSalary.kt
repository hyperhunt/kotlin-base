import kotlin.Exception

fun main() {
//    val words: ClosedRange<String> = "Java".."Yaml"
//
//    if ("Kotlin" in words) {
//        println("true")
//    }
    //    val lambda = { println("#Hello#") }
//    lambda.invoke()


    salary(-10, 5)
}

fun salary(base: Int, years: Int): Unit {
    try {
        require(base > 0) { "Значение не может быть меньше нуля." }
        println("${base + (years * 10_000)}")
    } catch (e: Exception) {
        println(e.message)
    }
}
