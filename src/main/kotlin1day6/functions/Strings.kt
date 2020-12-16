package functions

import kotlin.reflect.typeOf

fun Collection<String>.formatString(
    prefix: String = "[",
    suffix: String = "]",
    delim: String = ",",
    processor: ((String) -> String)? = null
): String {
    val str = StringBuilder()
    str.append(prefix)
    for ((index, element) in this.withIndex()) {
        if (index != 0) str.append(delim)
        str.append(element)
    }
    str.append(suffix)


    if (processor != null) {
        str.append(" -> ")

        str.append(prefix)
        for ((index, element) in this.withIndex()) {
            if (index != 0) str.append(delim)
            str.append(processor(element))
        }
        str.append(suffix)
    }

    return str.toString()
}

fun main() {
    println(
        listOf("abc", "def", "jnk").formatString(
            "{",
            "}",
            ",",
        ) //{ "" + it.toUpperCase() } // { "" + it.length }  // [abc, def, jnk] -> {3, 3, 3}
    )
}