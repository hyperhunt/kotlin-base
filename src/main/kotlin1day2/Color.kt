enum class Color(var r: Int, var g: Int, var b: Int, val op: Double = 1.0) {
    RED(55,2,1, 0.5),
    GREEN(12, 3, 4);

    fun prin(): String {
        return "$r $g $b $op"
    }
}

fun main() {
    println(Color.RED.prin())
    println(Color.GREEN)
    println(Color.GREEN.prin())
}