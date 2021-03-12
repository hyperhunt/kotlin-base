package dev.tony

fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House.factory(rooms, price)
    println(House.totalPrice(house))
}

open class House(rooms: Int, price: Int) {
    var price = price
        set(value) {
            field = when {
                value < 0 -> 0
                value > 1_000_000 -> 1_000_000
                else -> price
            }
        }

    open val coefficient: Double = 1.0
    companion object {
        fun factory(rooms: Int, price: Int): House {
            return when (rooms) {
                in Int.MIN_VALUE..1 -> Cabin(rooms, price)
                2, 3 -> Bungalow(rooms, price)
                4 -> Cottage(rooms, price)
                in 5..7 -> Mansion(rooms, price)
                else -> Palace(rooms, price)
            }
        }

        fun totalPrice(house: House): Int = (house.price * house.coefficient).toInt()
    }
}

class Cabin(rooms: Int, price: Int) : House (rooms, price) {
    override val coefficient: Double = 1.0
}
class Bungalow(rooms: Int, price: Int) : House (rooms, price) {
    override val coefficient: Double = 1.2
}
class Cottage(rooms: Int, price: Int) : House (rooms, price) {
    override val coefficient: Double = 1.25
}
class Mansion(rooms: Int, price: Int) : House (rooms, price) {
    override val coefficient: Double = 1.4
}
class Palace(rooms: Int, price: Int) : House (rooms, price) {
    override val coefficient: Double = 1.6
}
