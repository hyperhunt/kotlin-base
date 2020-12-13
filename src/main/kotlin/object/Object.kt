package `object`

// Реализация object
// 1 - для шаблона singleton

object Singleton {
    init {
        println("Init Singleton.")
    }
    val name: String = "Tony"

    fun hello() = println("Object Singleton")
}

fun main() {
    println(Singleton.name)
    Singleton.hello()
}