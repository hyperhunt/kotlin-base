package dev.tony

interface MainContract {
    interface Repository {
        fun loadMessage(): String
    }

    interface View {
        fun showView() {}
        interface ActionsListener {
            val actionsListener
                get() = View.showView()
        }
    }

    interface Presenter {
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
}

class MainPresenter(
    mView: MainView = MainView(),
    mRepository: MainRepository = MainRepository(),
) : MainContract.Presenter, MainContract.View.ActionsListener {

    init {
        mView.showView()
    }
}

fun main() {
    MainPresenter()
}