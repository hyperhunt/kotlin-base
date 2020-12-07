// 4 -> Fizz
// del 3 -> Fizz, del 5 -> Buzz, del 3&&5 -> FizzBuzz

fun fizzbuzz(data: Int): String {
//    var data = "None"
/*    if (i % 3 == 0) {
        data = "Fizz"
    }
    if (i % 5 == 0) {
        data = "Buzz"
    }
    if (i % 3 == 0 && i % 5 == 0) {
        data = "FizzBuzz"
    }*/

    return when {
        data % 3 == 0 && data % 5 == 0 -> "$data: FizzBuzz"
        data % 3 == 0 -> "$data: Fizz"
        data % 5 == 0 -> "$data: Buzz"
        else -> ""
    }
}

fun main() {
    for (i in 1..25) {
        println(fizzbuzz(i))
    }
}