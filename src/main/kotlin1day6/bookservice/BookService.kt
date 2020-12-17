package bookservice

class LendBookManager(val bookService:BookService) {
    fun checkout(bookId: Int, memberId: Int) {
        if(bookService.inStock(bookId)) {
            bookService.lend(bookId, memberId)
        } else {
            throw IllegalStateException("Book is not available")
        }
    }
}

interface BookService {
    fun inStock(bookId: Int): Boolean
    fun lend(bookId: Int, memberId: Int)
}

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