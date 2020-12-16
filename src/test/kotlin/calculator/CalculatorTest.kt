package calculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Использовать один класс для всех тестов
class CalculatorTest {
    init {
        println("Init...")
    }

    @Test
    fun calcAdd() {
        println("calcAdd")
        val calculator = Calculator(15)
        calculator.add(2)
        assertEquals(
            17,
            calculator.get(),
            "calcAdd: [15 + 2 should give 17]"
        )
    }

    @Test
    fun calcMul() {
        println("calcMul")
        val calculator = Calculator(25)
        calculator.mul(2)
        assertEquals(
            50,
            calculator.get(),
            "calcMul: [25 * 2 should give 50]"
        )
    }
}