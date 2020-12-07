fun main() {
//    val line = "abc 123 def"
    val line = "abc 123 def"
    val pattern = """.*\d{3}.*""".toRegex()
//    println(line.matches(pattern))

    println(date("12 JAN 2020"))
}

fun date(date: String): Boolean {
    // 12 JAN 2020
    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
    val pattern = """^\d{2} $month \d{4}$"""

    return date.matches(pattern.toRegex())
}