import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestGreeting {

    @Test
    fun `Приветствие пользователя`() {
        assertEquals("Hello, Tony Hunt!", greeting("Tony", "Hunt"))
    }
}