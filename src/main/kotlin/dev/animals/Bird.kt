package dev.animals

class Bird internal constructor(private val name: String) : Animals() {
    override val nameAnimals: String
        get() = name

    override fun getName(): String {
        return "Bird name: $nameAnimals"
    }
}

//class Bird(private val nameBird: String) : Animals() {
//    override fun getName(): String {
//        return "Bird name: $nameBird"
//    }
//}
//    override getName()
//    fun isFlying(): Boolean {
//        return isFlying
//    }
//}