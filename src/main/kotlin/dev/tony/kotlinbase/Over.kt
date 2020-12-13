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

class AnimatedButton : RichButton() {
//    override fun click() {} // final
    override fun disable() {}
}

fun main() {
    val face = AnimatedButton()
    face.delete()
}