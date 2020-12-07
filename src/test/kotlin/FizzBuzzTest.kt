import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    @Test
    fun fizzbuzzTest() {
        assertEquals("3: Fizz", fizzbuzz(3))
        assertEquals("5: Buzz", fizzbuzz(5))
        assertEquals("", fizzbuzz(1))
        assertEquals("15: FizzBuzz", fizzbuzz(15))
//        assertEquals("Yes", fizzbuzz(1))
    }
}