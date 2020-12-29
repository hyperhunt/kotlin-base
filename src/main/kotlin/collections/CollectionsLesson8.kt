package collections// Коллекции List Set Map

class Box<T : Any?>(t: T) {
    var value = t
}

fun <T> List<T>.getByNumbers(vararg args: Int): List<T> {
    val result = mutableListOf<T>()
    for (i in args) {
        result.add(this[i])
    }
    return result
}

class Bitmap
class Result<T : Any>(val result: T?, val t: Throwable?)

fun main() {

    val bitmap = Bitmap()
    val result = Result(bitmap, null)
    val throwable = Throwable("Error")
    val error = Result<Bitmap>(null, throwable)

    val intBox = Box<Int>(1)
    val numerBox: Box<Number> = Box<Number>(3.183)
    val nullBox = Box(null) // NUllable

    val list = mutableListOf(1, 2, 3, 4, 5).getByNumbers(2, 4)
    println(list)

/*    val list = listOf(1, 2, 3, 4)
    val list2 = listOf(1, 2, 3, 4)
    println(list == list2)
//    list[2] = 12
    val mutableList = mutableListOf(1, 2, 3, 4)
    mutableList[2] = 12
    println(mutableList)

    val set = setOf("one", "two", "three") // LinkedHashSet HashSet SortedSet
    setOf(set)

    val map = mapOf(1 to "one", 2 to "two") // LinkedHashMap HashMap SortedMap*/
}