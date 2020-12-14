package operators

data class Dote(val x: Int, val y: Int)

class Rectangle(val upperLeft: Dote, val downRight: Dote)

operator fun Rectangle.contains(dote: Dote): Boolean {
    return dote.x in upperLeft.x..downRight.x && dote.y in upperLeft.y..downRight.y
}

fun main() {
    val snake = Dote(13, 5)
    val rect = Rectangle(Dote(0, 0), Dote(10, 10))
    println(snake)
    println(rect)
    println(snake in rect)
}