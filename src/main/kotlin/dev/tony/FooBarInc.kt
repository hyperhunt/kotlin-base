package dev.tony

fun <T> (T).prin() = println(this)

fun main() {
    println("""
        foo -> foo1
        foobar23 -> foobar24
        foo0042 -> foo0043
        foo9 -> foo10
        foo099 -> foo100
    """.trimIndent())
    println("")


    fun inc(str: String): String {
        return "${str}"
    }

    inc("123").prin()

    fun getRealGrade(str: String) = str
    fun getGradeWithPenalty(str: String) = str // -1

    fun getScoringFunction(stringWithNumbers: Boolean): (String) -> String {
        if (stringWithNumbers) return ::getGradeWithPenalty
        return ::getRealGrade
    }

//    getScoringFunction("true".isDigital)
//    wantedFunction("foo").prin()
//    println("true".isDigital())

//    val pattern = Pattern.compile("\\d+")
//    val matcher = Pattern.matches("pattern".tit)

//    val line =
//    val pattern = """.*\d{3}.*""".toRegex()
//    val regexp = """<[^\\][a-z_0-9]*>?"""
//    val regexp = """<[^/][a-z_0-9]*>?"""
//    val regexp = """<[^>/]+>?"""
    val data = "abc012"
    val regexp = """\d+"""
    val found: Sequence<MatchResult> = regexp.toRegex().findAll(data)
    var dataPlusOne = 1

//    for (result in found) {
//        dataPlusOne = if (result.value.take(0) == 0) {} else {}
//        println(result.value)
//    }

    println(dataPlusOne)
}