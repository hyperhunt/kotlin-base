package strings

//fun String.lastCharOf() : Char = this.get(this.length - 1)
fun String.lastCharOf(): Char  = get(length - 1) // Получить последний символ строки

val StringBuilder.lastCh: Char
    get() {
//        return this[this.length - 1]
        return (this.length - 1).toChar()
    }


fun List<String>.firstItem(): String = get(0) // Получить первый элемент листа

fun String.allMatchesOf(pattern: String): List<String> {
    val ref = mutableListOf<String>()
    val found = pattern.toRegex().findAll(this)

    for (data in found) {
        ref.add(data.value)
    }
    return ref
}