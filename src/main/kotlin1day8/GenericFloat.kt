import kotlin.random.Random

fun genericDouble() {
    val numberGeneric: Sequence<String> =
        generateSequence { Random.nextDouble(0.0, 1.0).toString().take(3) }
    numberGeneric.take(10).forEach { println(it) }
}

fun genericNumber() {
    val numberGeneric: Sequence<String> =
        generateSequence { Random.nextInt(0, 10).toString().take(3) }
    numberGeneric.take(10).forEach { println(it) }
}

fun main() {
//    genericDouble()
    genericNumber()
    println(List(10) { Random.nextFloat() })
//    val randomValues = List(10) { Random.nextDouble(0.0, 1.0).toString().take(3) }
//    println(randomValues)
}