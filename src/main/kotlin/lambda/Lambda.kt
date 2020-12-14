package lambda

data class Person(val name: String, val age: Int)

val people = listOf(
    Person("Tony", 42),
    Person("Harper", 18),
    Person("Moskvin", 13),
    Person("Mock", 13),
)

val list = listOf(1, 2, 3, 4, 5, 6, 7)
val nullableList: List<Int?> = listOf(1, 2, 3, null, 6, 8)
val nullableList2: List<Int?>? = listOf(1, 2, 3, null, 6, 8)

fun main() {

    println(
//        list.filter { x: Int -> x % 3 == 0 }
        list.filter { it % 3 == 0 }
    )

    println(people.filter { it.age > 18 })
    println(nullableList.filter { x -> x != null && x % 3 == 0 })
    println(nullableList2?.filter { x -> x != null && x % 3 == 0 })

    people.filter { it.age == 13 }.forEach { println(it) }

/*    val sum = { x: Int, y: Int -> x + y } // (Int, Int) -> Int
    println("Hello")

    val result = sum(3, 18)
    println(
        result::class::simpleName.get()
    )
    println(sum.invoke(8, 108))*/
}