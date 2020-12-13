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

fun main() {
    val face = AnimatedButton()
    face.delete()
}