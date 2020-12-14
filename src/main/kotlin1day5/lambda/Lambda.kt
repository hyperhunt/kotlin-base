package lambda

data class Person(val name: String, val age: Int)

val people = listOf(
    Person("Tony", 42),
    Person("Harper", 18),
    Person("Mock", 13),
    Person("Moskvin", 13),
)

val list = listOf(1, 2, 3, 4, 5, 6, 7)
val nullableList: List<Int?> = listOf(1, 2, 3, null, 6, 8)
val nullableList2: List<Int?>? = listOf(1, 2, 3, null, 6, 8)
val listDistinct = listOf('a', 'A', 'b', 'B', 'A', 'B', 'c')
val mapData = mapOf(1 to "one", 2 to "two", 3 to "three")

val listOfList = listOf(
    listOf("abc", "fvf", "cdc"),
    listOf("Apple", "Linux", "ARM"),
    listOf("Tony", "Mock", "Harper"),
)

fun main() {

    println(
//        list.filter { x: Int -> x % 3 == 0 }
        list.filter { it % 3 == 0 }
    )

    println(people.filter { it.age > 18 })
    println(nullableList.filter { x -> x != null && x % 3 == 0 })
    println(nullableList2?.filter { x -> x != null && x % 3 == 0 })

    people.filter { it.age == 13 }.forEach {
        println("${it.javaClass} ${it.name} ${it.age}")
    }

    println(people.maxByOrNull { it.age }?.age)

    println(listDistinct.distinct()) // Без дубликатов
//    println(listDistinct.distinctBy { it.isLowerCase() })
    println(listDistinct.distinctBy { it.toLowerCase() }) // Только в нижнем регистре
    println(listDistinct.distinctBy { it.toUpperCase() }) // Только в нижнем регистре

    listDistinct.distinctBy { it.toUpperCase() to it.toLowerCase() }.forEach { println(it) }
/*    val sum = { x: Int, y: Int -> x + y } // (Int, Int) -> Int
    println("Hello")

    val result = sum(3, 18)
    println(
        result::class::simpleName.get()
    )
    println(sum.invoke(8, 108))*/

    println(people.map { it.name + " " + it.age })
    println(people.filter { it.age >= 18 }.map { it.name })
    println(list.map { it * it }.filter { it % 3 == 0 })

//    println(mapData.mapValues { it.value.toUpperCase() })
    mapData.mapValues { it.value.toUpperCase() }.forEach { println(it) }

    // any none all
    println(people.any { it.age == 13 }) // true критерий соответствия Boolean

    // count countBy

    println("Count: " + people.count())
    println("Сколько человек кому 13 лет: " + people.count { it.age == 13 })
    println(people.find { it.age == 13 && it.name.contains('k') })

    // Поиск
//    val peopleAllAge = people.filter { it.age >= 0 }.map { it.age }
    val peopleAllAge = people.map { it.age.toFloat() }
    println("Среднее значение по возрасту: " + peopleAllAge.average())
    println("Сумма всех возрастов: " + peopleAllAge.sumBy { it.toInt() })

    // fold
    println(list)
//    println(list.fold(initial = 0, { acc: Int, nextElem -> acc + nextElem}))
    println("Fold: " + list.fold(initial = 0) { acc: Int, nextElem -> acc + nextElem })

    // reduce
    println("Reduce: " + list.reduce { acc: Int, nextElem -> acc + nextElem })

    // Группировка данных по критериями
    people.groupBy { it.age }.keys.forEach { println(it)  } // gtoupBy -> map
    people.groupBy { it.age }.forEach { println(it)  } // gtoupBy -> map

    people.associateBy { it.age }.forEach { println(it) }

    // partition -> 1 elem is 2 collections
    people.partition { it.age > 13 }.first.forEach { println(it) }

    println("=== === ===")

    // Из листа листов сделать листив стригов
    println(listOfList.flatten()) // Объединяет из листов в один лист
    println(listOfList.flatten().flatMap { it.toList() }) // Разделить на листы каждый элемент
    println(listOfList.flatten().map { it.toList() }) // Из каждого элемента делает лист.

    // Zip для объединения пар из разных листов
    println(people.zip(list))
}