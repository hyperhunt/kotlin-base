import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class RectangleTest() {
    @Test
    fun rectangleBoolean() {
        assertTrue(Rectangle(8,8).isSquare)
        assertFalse(Rectangle(8,81).isSquare)
    }
}