private fun Int.prin() {
    println(this)
}

fun fibo(n: Int): Int {
    return if (n == 1 || n == 2) {
        1
    } else {
        fibo(n - 1) + fibo(n - 2)
    }

}


fun main() {
    // Fibonacci 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, …
    fibo(7).prin()

    val list = listOf(1,2,3,4,5)
    println(list.fold(15) { total, next -> total + next})
}


/*fun fib(n: Int, a: Int = 0, b: Int = 1): String {

    when (n) {
        0 -> a
        1 -> b
        else -> fib(n - 1, b, a + b)
    }

    println(n)
    return ""
}*/

/*
fun Any.print(): String = when (this) {
    is String -> "Striiiing!"
    is Int -> "Int"
    else -> "Unknown"
}

fun main() {
    println("asd".print())
    println(1.print())
    println('1'.print())
}*/
