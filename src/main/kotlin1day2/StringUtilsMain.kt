import strings.*

fun main() {

    val list = listOf<String>("abc", "cdb", "ert")
    println(list.firstItem())

    println("Harper".lastCharOf())
//    println("")

    println("youtube".reversed())

    val html = "<html><title>Hello</title><body><h1>Heading</h1>Body text.</body></html>"
    val regexp = """<[^>/]+>?"""
//    val found = regexp.toRegex().allMatchesOf(html)
    html.allMatchesOf(regexp).forEach { println(it) }

    val ch = StringBuilder("asd").lastCh
    println(ch)

}