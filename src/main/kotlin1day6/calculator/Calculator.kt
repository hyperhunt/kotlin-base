package calculator

class Calculator(private var result: Int = 0) {
    fun get() = result

    // add, mul, sub, div

    fun add(other: Int): Unit { result += other}
    fun mul(other: Int): Unit { result *= other}
    fun sub(other: Int): Unit { result -= other}
    fun div(other: Int): Unit {
        assert(other != 0) { "Division by zero" }
        result /= other
    }
}

fun main() {
    val calc = Calculator(0)
    calc.add(25)
    println(calc.get())
    calc.sub(10)
    println(calc.get())
    calc.mul(10)
    println(calc.get())
    calc.div(10)
    println(calc.get())
}