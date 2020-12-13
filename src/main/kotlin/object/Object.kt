package `object`

// Реализация object
// 1 - для реализации шаблона singleton
// 2 - статика в классе
// 3- создание анонимных внутренних классов

object Singleton {
    init {
        println("Init Singleton.")
    }
    val name: String = "Tony"

    fun hello() = println("Object Singleton")
}

class Outer//    private val data: String = "Harper"
private constructor() {
    companion object Hello {
        fun hello() = println("Outer companion object")
        fun get(): Outer = Outer()
    }
    companion object Loader {
        fun  hello() = println("Hello from Loader")
    }
}

fun main() {
    println(Singleton.name)
    Singleton.hello()

//    val outer = Outer.hello()
    val outer = Outer.get()
    Outer.hello()
}