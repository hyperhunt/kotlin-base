package mockito

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.*
import org.mockito.Mockito.*
import java.util.*

class TestingMockito {
    @Test
    fun test1() {
        val test: MyClass = mock(MyClass::class.java)
//        test.getUniquedId()
        `when`(test.getUniquedId()).thenReturn(43)
        assertEquals(43, test.getUniquedId())
    }

    @Test
    fun testTwoReturns() {
        val iter = mock(Iterator::class.java) as Iterator<String>
        `when`(iter.next()).thenReturn("Hello").thenReturn("World")
        val result = iter.next() + " " + iter.next()
        assertEquals("Hello World", result)
    }

    // Comparable<String> -> 2
    // compareTo("Hello") -> 4
    @Test
    fun testComparableReturns() {
        val compare = mock(Comparable::class.java) as Comparable<String>
        `when`(compare.compareTo("Hello")).thenReturn(2)
        `when`(compare.compareTo("World")).thenReturn(4)
        assertEquals(2, compare.compareTo("Hello"))
        assertEquals(4, compare.compareTo("World"))
    }

    @Test
    fun testThrows() {
        val props = mock(Properties::class.java)
        `when`(props["Linux"]).thenReturn("Ok")
        `when`(props["Android"]).thenThrow(IllegalArgumentException("Unknow type properties"))
        assertEquals("Ok", props["Linux"])

        val thrown = assertThrows<IllegalArgumentException> {
            props["Android"]
        }
        assertEquals(thrown.message, "Unknow type properties")
    }

    @Disabled
    // Spy - dont worked.
    @Test
    fun testSpyWrong() {
        val list: List<String> = LinkedList()
        list.apply { "asd" }
        val spy: List<String> = spy(list)
//        doReturn("HelloSpy").`when`(spy)[0]
        `when`(spy[0]).thenReturn("HelloSpy")
        assertEquals(spy[0], "HelloSpy")
    }

    @Test
            /*
            * Какие методы вызывались, сколько раз вызывались, какие не вызывались.
            * */
    fun testVerify() {
        val test = mock(MyClass::class.java)
        `when`(test.getUniquedId()).thenReturn(43)
        test.testing(12)
        test.getUniquedId()
        test.getUniquedId()
        verify(test).testing(ArgumentMatchers.eq(12))
        verify(test, times(2)).getUniquedId()
        verify(test, atLeastOnce()).getUniquedId()
        verify(test, atLeast(1)).getUniquedId()
        verify(test, atMost(10)).getUniquedId()
        verify(test, never()).someMethod("Never called.")
//        verifyNoInteractions(test)
    }

    // Captor - позволяет смотреть, что в реальных объектах вызывалось.
    @Captor
    lateinit var stringCaptor: ArgumentCaptor<String>

    @Disabled
    @Test
    fun shouldContainsString() {
        stringCaptor = ArgumentCaptor.forClass(String::class.java) // Какого рода аргументы будем запоминать

        val list = LinkedList<String>()
        val spy = spy(list)
        spy.add("Hello")

        verify(spy).add(stringCaptor.capture())
        assertTrue(stringCaptor.value == "Hello")
    }
}