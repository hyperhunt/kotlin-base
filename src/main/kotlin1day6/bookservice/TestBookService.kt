package bookservice

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import java.lang.IllegalStateException

/*
* Тестируем бизнес логику класса LendBookManager
* Part 1:
* 1. Создаем мок LendBookService
* 2. Настраиваем мок чтобы BookService.inStock(100) -> должен возвратить true
* 3. Создаем экземляр LendBookManager и передаем в конструктор настроенный мок BookService
* 4. Вызываем Bookservice.checkout(...)
* 5. Нужно убедиться, что у мока Bookservice вызывался метод lend с нужным параметром
* 6. Проверить, что вызывается метод BookService.lend(100, 10)
*
* Part 2.
* LendBookManager.checkout(200, 10)
* BookService.inStock(200) -> должен возвратить false
* Проверить, что вылетает исключение IllegalStateException("Book is not available")
* */

class TestBookService {
    @Test
    fun testLendIsCalled() {
        val bookService = Mockito.mock(BookService::class.java) // Для конфигурации мока
        `when`(bookService.inStock(100)).thenReturn(true)

        val lendBookManager = LendBookManager(bookService) // Для проверки бизнес логики
        lendBookManager.checkout(100, 10)

        verify(bookService).lend(100, 10)
    }

    @Test
    fun testCheckoutException() {
        val bookService = Mockito.mock(BookService::class.java) // Для конфигурации мока
        `when`(bookService.inStock(200)).thenReturn(false)

        val lendBookManager = LendBookManager(bookService) // Для проверки бизнес логики

        val thrown = assertThrows<IllegalStateException> {
            lendBookManager.checkout(200,20)
        }
        assertEquals(thrown.message, "Book is not available")
    }
}