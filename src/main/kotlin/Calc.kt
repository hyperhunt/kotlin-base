fun Any.print(): String = when (this) {
    is String -> "Striiiing!"
    is Int -> "Int"
    else -> "Unknown"
}

fun main() {
    println("asd".print())
    println(1.print())
    println('1'.print())
}