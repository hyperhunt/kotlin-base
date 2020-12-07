import org.junit.jupiter.api.Test
import strings.allMatchesOf
import kotlin.test.assertEquals

class ExtensionText {
    @Test
    fun testExtensionFunction() {
        assertEquals(
            listOf("<html>","<head>"),
            "<html><head>hello".allMatchesOf("""<[^>/]+>?""")
        )
    }
}