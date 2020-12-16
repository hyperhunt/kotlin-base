package functions

// Функции расширения Int
// iOdd isEven()
//fun Int.isOdd(): Boolean = this % 2 != 0
//fun Int.isEven(): Boolean = this % 2 == 0

// Сделать как свойство расширения
val isOdd: Int.() -> Boolean = { this % 2 != 0 }
val isEven: Int.() -> Boolean = { this % 2 == 0 }

class LazyClass(val initializer: () -> Int) {
    val initial: Int by lazy { initializer() }
    // 1. initial == initializer()
    // 2. ... значение
}

class Counter {
    var numberOgGets: Int = 0

    val number: Int
        get() = this.numberOgGets.plus(1).also { numberOgGets = it }
}

fun main() {
    val count = Counter()
    count.number
    count.number
    println("Счетчик: " + count.numberOgGets)

    val init: () -> Int = {
        println("Init...")
        3
    }
    val lazyClass = LazyClass(init)
    lazyClass.initial
    lazyClass.initial
    lazyClass.initial

//    println(2.isOdd())
//    println(2.isEven())

//    println((2).isOdd())
//    println((2).isEven())
}