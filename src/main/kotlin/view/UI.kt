package view

import JavaClickListener
import JavaView

fun main() {
    val javaView = JavaView()
    javaView.setOnClickListener(object: JavaClickListener {
        override fun onClick(view: JavaView?) {
            println("javaView -> object")
        }
    })

    javaView.setOnClickListener { view -> println("javaView -> lambda") }

    val sum = { x: Int, y: Int -> x + y}
    println(sum(5, 8))

    /*
    { println("Hello")} ()
    run { println("Hello") }
     */
}