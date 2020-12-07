open class Rectangle(val height: Int, val width: Int) {
    open val isSquare: Boolean
        get() = height == width
}

fun main() {
    println(Rectangle(12,13).isSquare)
    println(Rectangle(8,8).isSquare)
}