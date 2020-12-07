package ui

interface View {
    fun click()
    fun whoAmI() = println("I'm a view! ")
}