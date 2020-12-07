fun main() {
//    println(greeting("Tony", "Hunt"))
    println(greeting("", ""))
}

fun greeting(firstName: String,
             lastName: String): String {
    try {
        require(firstName.isNotBlank()) { "Нужно указать Имя!" }
        require(lastName.isNotBlank()) { "Нужно указать Фамилию!" }
    } catch (e: Exception) {
        println(e.message)
    }
    return "Hello, $firstName $lastName!"
}