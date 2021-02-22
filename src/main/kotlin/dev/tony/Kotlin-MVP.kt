package dev.tony

interface MainContract {
    interface Repository {
        fun loadMessage(): String
    }

    interface View {
        fun showView() {}
    }

    interface Presenter

    interface ActionsListener {
        fun onButtonPressed()
    }
}

class MainRepository : MainContract.Repository {
    private val tag: String = "MainRepository"

    override fun loadMessage(): String {
        return tag
    }
}

class MainView : MainContract.View {
    override fun showView() {
        println("loadMessage")
    }

    fun listenerForView() {}
}

class MainPresenter(
    view: MainView = MainView(),
    mRepository: MainRepository = MainRepository(),
) : MainContract.Presenter, MainContract.ActionsListener {

    init {
//        view.showView()
    }

    val viewForPresenter = MainView()

    override fun onButtonPressed() {
        TODO("Not yet implemented")
    }
}

fun main() {
//    MainPresenter()

    val presenter = MainPresenter()
    val view = MainView()

//    presenter.viewForPresenter = view
//    view.listenerForView = presenter
}