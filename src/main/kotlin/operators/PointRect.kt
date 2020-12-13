package operators

// Перегрузка операторов

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

class Rect(val upperLeft: Point, val lowerRight: Point)
operator fun Rect.contains(p: Point) : Boolean {
    return p.x in upperLeft.x .. lowerRight.x && p.y in upperLeft.y .. lowerRight.y
}

fun main() {
    val point1 = Point(3, 3)
    val point2 = Point(5, 5)
    println(point1 + point2)

    val rect = Rect(Point(4, 4), Point(20, 10))
    println(point1 in rect)
    println(point2 in rect)
}