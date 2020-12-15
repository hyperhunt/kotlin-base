package functions

class Counter {
    var numberOgGets: Int = 0

    val number: Int
        get() = this.numberOgGets.plus(1).also { numberOgGets = it }
}

fun main() {
    val count = Counter()
    count.number
    count.number
    println(count.numberOgGets)
}