fun isValidId(string: String) : Boolean {
    return string.matches("""[a-zA-Z0-9]\w{4,}""".toRegex())
}

fun main() {
    println("[Rexexp]")
//    val found = "(e)+".toRegex().findAll("Sample test")
//    found.forEach { println(it.value) }

    println(isValidId("test1")) // true
    println(isValidId("")) // false
    println(isValidId("b_13a")) // true
    println(isValidId("abc")) // false
    println(isValidId("_abc")) // false
}