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

data class Abc(val str: String = "Hello Class") {
    companion object Loader {
        fun hello() = println("Outer companion object")
        fun get(): Abc = Abc()
    }
    fun helloAbc() = println("Hello from Outer hello")
}

fun main() {
    println(Singleton.name)
    Singleton.hello()

//    val outer = Outer.hello()
    val outer = Abc()
    println(outer.toString())

    Abc.Loader.hello()
    outer.helloAbc()

    val data = Abc.Loader
    data.hello()
    data.get()
}