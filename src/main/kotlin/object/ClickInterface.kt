package `object`

interface ClickListener {
    fun click()
}

class View {
    fun setOnClickListener(listener: ClickListener) {}
}

fun main() {
    val listener: ClickListener = object : ClickListener {
        override fun click() {
            TODO("Not yet implemented")
        }

    }

    val view = View()
    view.setOnClickListener(listener)

/*    view.setOnClickListener(object : ClickListener {
        override fun click() {
            TODO("Not yet implemented")
        }
    })*/
}