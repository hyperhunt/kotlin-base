package calculator

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.provider.CsvSource

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Использовать один класс для всех тестов
//@DisplayName("Calculator Add test func")
class CalculatorTest {
    init {
        println("Init...")
    }

    @BeforeAll
    fun prepare() {
        println("prepare() BeforeAll")
    }

    @AfterAll
    fun tearDown() {
        println("tearDown() AfterAll")
    }

    @BeforeEach
    fun prepareTest() {
        println("prepareTest() BeforeEach")
    }

    //    @DisplayName("Calculator Add test func")
    @Test
    fun `Calculator Method Add`() {
        println("calcAdd")
        val calculator = Calculator(15)
        calculator.add(2)
        assertEquals(
            17,
            calculator.get(),
            "calcAdd: [15 + 2 should give 17]"
        )
    }

    //    @DisplayName("\uD83D\uDC4D")
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

    @ParameterizedTest
    @CsvSource(
        "0,1,1",
        "10,5,15",
        "1,100,101",
    )
    fun `pairAdd with @CsvSource`(f: Int, s: Int, r: Int) {
        println("pairAdd with @CsvSource")
        val calculator = Calculator(f)
        calculator.add(s)
        assertEquals(
            r,
            calculator.get(),
            "pairAdd: [$f + $s should give $r]"
        )
    }
}