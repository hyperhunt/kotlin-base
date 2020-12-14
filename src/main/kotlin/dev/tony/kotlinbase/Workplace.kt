@file:JvmName("Main")

package dev.tony.kotlinbase

import kotlin.math.expm1

data class Emp(
    val name: String,
    val gender: String,
    val age: Int,
    val position: String,
)

fun main() {
    val employees = listOf(
        Emp("Max Petrov", "Male", 22, "programmer"),
        Emp("Ivan Shapovalov", "Male", 33, "analyst"),
        Emp("Semen Deznev", "Male", 55, "manager"),
        Emp("Oleg Petrov", "Male", 19, "intern"),
        Emp("Katerina Drogova", "female", 31, "programmer"),
        Emp("Nikolay Spivakov", "Male", 33, "analyst"),
        Emp("Boris Moiseev", "Male", 48, "manager"),
        Emp("Petr Sveshnikov", "Male", 37, "programmer"),
        Emp("Maria Kasatonova", "female", 33, "analyst"),
        Emp("Olga Filimonova", "female", 27, "programmer")
    )

    var i = 0 // счетчик для номерации тасков в консоле

    // самый молодой
//    employees.minByOrNull(Emp::age)
    println("[${++i}] " + employees.map { it }.minByOrNull { it.age })

    // количество программистов
//    employees.filter { it.position == "programmer" }.count()
    println("[${++i}] " + employees.count { it.position == "programmer" })

    // распечатать все имена программистов
    println("[${++i}] " + employees.filter { it.position == "programmer" }.map { it.name.substringBefore(" ") })

    // средний возраст
    println("[${++i}] " + employees.map { it.age }.average())

    // разделить на две группы - старше 40 и младше
    println("[${++i}] " + employees.partition { it.age >= 40 }.first)
    // найти профессию самого старого из молодых
    println("[${++i}] " + employees.partition { it.age >= 40 }.second.maxByOrNull { it.age })

    // сгруппировать по профессии и распечатать профессию и количество работников в ней
    println("[${++i}] " + employees.groupBy { it.position }.mapValues { it.value.count() })

    // вернуть в виде пары средний возраст женщин и мужчин
//    println("[${++i}] " + employees.partition { it.gender == "male" })
    println("[${++i}] " + employees.groupBy { it.gender }.mapValues { it.value.count() })
//    println(
//        "[${++i}] " + employees.filter { it.gender == "female" }.map { it }
//    )

    // распечатать работников с самым часто встрающимся возрастом
//    println("[${++i}] " + employees.map { it.age })
//    println("[${++i}] " + employees.map { it.age }.groupBy { it }.maxByOrNull { it.value.count() })
    println("[${++i}] " + employees.groupBy { it.age }.maxByOrNull { it.value.count() })

    // пару из работников с самой большой разницей в возрасте
    println("[${++i}] " + employees.flatMap { emp -> employees.map { it -> Pair(it, emp) } }
        .maxByOrNull { it.first.age - it.second.age })
}