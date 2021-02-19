package dev.tony

interface MainContract {
    interface Repository {
        fun loadMessage(): String
    }

    interface View {
        fun getShowView(loadMessage: String)
    }

    interface Presenter {
        fun initPresenter()
    }
}

class MainRepository : MainContract.Repository {
    private val tag: String = "MainRepository"

    override fun loadMessage(): String {
        return tag
    }
}

class MainView : MainContract.View {
    override fun getShowView(loadMessage: String) {
        println(loadMessage)
    }
}

class MainPresenter : MainContract.Presenter {
    private val mView: MainView = MainView()
    private val mRepository: MainRepository = MainRepository()

    override fun initPresenter() {
        if (mRepository.loadMessage().isNotEmpty()) {
            mView.getShowView(mRepository.loadMessage())
        }
    }
}

fun main() {
    MainPresenter().initPresenter()
}