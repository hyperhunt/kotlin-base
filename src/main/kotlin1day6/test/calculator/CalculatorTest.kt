package calculator

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource
import java.lang.AssertionError
import java.util.stream.Stream

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

    fun data(): Stream<Arguments> = Stream.of(
        Arguments.of(0, 0, 0),
        Arguments.of(0, 3, 0),
        Arguments.of(12, 3, 36),
        Arguments.of(3, 6, 18),
    )

    @ParameterizedTest(name = "{0} * {1} = {2}")
    @MethodSource("data") // использование метода
    fun `paraMul with @MethodSource`(f: Int, s: Int, r: Int) {
        println("paraMul with @MethodSource")
        val calculator = Calculator(f)
        calculator.mul(s)
        assertEquals(
            r,
            calculator.get(),
            "pairAdd: [$f * $s should give $r]"
        )
    }

    @Test
    fun divisionByZeroThrowsException() {
        val calculator = Calculator(10)

        val exception = assertThrows<AssertionError> {
            calculator.div(0)
        }

        assertEquals("Division by zero", exception.message, "Exception should be 'Division by zero'.")
    }

    @Test
    fun combineAddAndMul() {
        val calculator = Calculator(15)

        assertAll(
            "Checking...",
            {
                assertEquals(
                    15,
                    calculator.get()
                )
            },
            {
                calculator.add(2)
                assertEquals(
                    17,
                    calculator.get()
                )
            },
            {
                calculator.mul(3)
                assertEquals(
                    51,
                    calculator.get()
                )
            },
        )


    }
}