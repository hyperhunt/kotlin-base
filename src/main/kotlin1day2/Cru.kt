enum class Cru (var level: Int) {
    CRU(80),
    PREMIER(90),
    GRAND(100);

    override fun toString() = when(this) {
            CRU -> "Base cru"
            PREMIER -> "Premier cru"
            GRAND -> "Grand cru"
        }
}

fun main() {
    println(Cru.GRAND)

    val cru = Cru.valueOf("PREMIER")
    println("$cru \n")

    Cru.values().forEach { println("# $it") }
}