package operators

/*
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {
    val point1 = Point(3,3)
    val point2 = Point(5,5)

    println(point1 + point2)
}*/

data class RationalNumber(val numerator: Int, val denominator: Int)

operator fun RationalNumber.plus(r: RationalNumber): RationalNumber {
    return RationalNumber(
        numerator * r.denominator + r.numerator * denominator,
        r.denominator * denominator
    )
}

operator fun RationalNumber.times(r: RationalNumber): RationalNumber {
    return RationalNumber(
        numerator * r.numerator,
        r.denominator * denominator
    )
}

operator fun RationalNumber.unaryMinus(): RationalNumber = RationalNumber(-numerator, -denominator)

fun main() {
    val rn1 = RationalNumber(1, 2)
    val rn2 = RationalNumber(3, 4)
    println(rn1 + rn2)
    println(rn1 * rn2)
}