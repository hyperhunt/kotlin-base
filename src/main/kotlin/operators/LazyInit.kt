package operators

val lazyValue: String by lazy {
    println("Init Lazy...")
    "Hello, Kotlin World!"
}

class LateInit {
    val name: String = "Tony"
    lateinit var late: String

    fun init() {
        println(this::late.isInitialized) // Проверка инициализации переменной
        late = "Initialized"
        println(this::late.isInitialized)
    }
}

fun main() {
    println(lazyValue)
    println("...")

    val lateInit = LateInit()
//    lateInit.late // UninitializedPropertyAccessException
    lateInit.init()
    println(lateInit.late)
}