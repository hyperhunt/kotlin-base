package ui

fun main() {
/*    val btn = Button()
    btn.click()
    btn.whoAmI()

    println("")

    val btnTwo = ButtonTwo()
    btnTwo.click()
    btnTwo.whoAmI()*/

    val list: List<View> = mutableListOf()
    val v1: View = Button()
    val v2: View = TextView()

    v1.whoAmI()
    v2.whoAmI()

    val btn3 = Button()
    btn3.click()
    btn3.whoAmI()
}