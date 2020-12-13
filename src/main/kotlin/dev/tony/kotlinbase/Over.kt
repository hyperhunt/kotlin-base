@file:JvmName("Main")

package dev.tony.kotlinbase

interface Clickable {
    fun click()
    fun add()
    fun delete()
}

open class RichButton : Clickable {
    final override fun click() {}
    override fun add() {}
    override fun delete() {
        println("delete")
    }

    open fun disable() {}
    fun focus() {} // Нельзя override, так как функция не open.
}

abstract class Animated { // abstract - открыт для наследования, нельзя final.
    abstract fun animate() // можно прооверрай  дить в подклассах
    fun startAnimate() {} // нет open, но есть реализация.
    open fun stopAnimate() {}
}

class Animator : Animated() {
    override fun animate() {}
    override fun stopAnimate() {}
}

class AnimatedButton : RichButton() {
    //    override fun click() {} // final
    override fun disable() {}
}

class Outer { // Внешний
    class Nested {} // Вложенный. Не содержит ссылку на Внешний класс.
    inner class Internal {
        fun getOuter(): Outer = this@Outer // Вернуть ссылку на Внешний класс.
    } // Внутренний.
}

open class Base {
    init {
        println("init Base")
    }
}

data class User(val name: String = "Empty") : Base() {
    init {
        println("init block...")
    }

    constructor(name: String, data: Int) : this(name) {
        println("With data...: $name $data")
    }
}

class Secret private constructor() {
}


/*class Client (val name: String, val address: String, val index: Int) {
    override fun toString(): String {
        return "$name $address $index"
    }

    override fun equals(other: Any?): Boolean {
        return when {
            other == null || other !is Client -> false
            else -> name == other.name && index == other.index
        }
    }
}*/

data class Client (val name: String, val address: String, val index: Int)

fun main() {

    val tony = Client("Tony", "Moscow", 42)
    val harper = Client("Tony", "Moscow", 42)
    println(tony)
    println(harper)
    println(tony == harper) // equals false

    val set = hashSetOf(tony)
    println("set: " + set.contains(harper))

    val face = AnimatedButton()
    face.delete()

    val outer = Outer()
    val nested = Outer.Nested()
    val internal = Outer().Internal() // outer.Internal()

//    val user = User()
    val user = User("Tony", 42)
    println(user.toString())
}