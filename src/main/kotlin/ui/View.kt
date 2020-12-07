package ui

interface View {
    fun click()
    fun whoAmI() = println("I'm a view! ")
}

interface Shape {
    fun whoAmI() = println("I'm a shape!")
}

class Button : View, Shape {
    override fun click() = println("Button click")
    override fun whoAmI() {
        super<View>.whoAmI()
        super<Shape>.whoAmI()
    }
}

class ButtonTwo : View {
    override fun click() {
        println("ButtonTwo clicked!")
    }

    override fun whoAmI() {
        println("whoAmI")
    }
}

class TextView : View {
    override fun click() = println("TextView clicked.")
    override fun whoAmI() = println("I'm a textview.")
}