package dev.localtime

/*
    public static void main() {
        LocalTimeSupplier timeSupplier = new LocalTimeSupplier();
        new Main().printTime(timeSupplier);
    }
}
*/

interface TimeSupplierInterface {
    fun getTime(): Long
}

open class TimeSupplier : TimeSupplierInterface {
    override fun getTime(): Long {
        return System.currentTimeMillis()
    }
}

class LocalTimeSupplier : TimeSupplier() {
    fun getLocalTime(): String {
        return "Local time."
    }
}

class POSIXTimeSupplier : TimeSupplier() {
    override fun getTime(): Long {
        return System.currentTimeMillis() / 1000
    }
}

class MainLocalTime {
    fun printTime(timeSupplier: TimeSupplierInterface) {
        println("POSIX time: ${timeSupplier.getTime()}")
    }
}

class TimeHolder(private var timeSupplier: TimeSupplierInterface) {

    fun printTime() {
        println("POSIX Holder: ${timeSupplier.getTime()}")
    }

    fun setTimeSupplier(supplier: TimeSupplierInterface) {
        timeSupplier = supplier
    }
}

fun main() {
//    val timeSupplier = LocalTimeSupplier()
//    println(timeSupplier.getLocalTime())
//    MainLocalTime().printTime(timeSupplier = LocalTimeSupplier().getLocalTime())
//    MainLocalTime().printTime(timeSupplier = LocalTimeSupplier())
//    MainLocalTime().printTime(timeSupplier = POSIXTimeSupplier())
    val holder = TimeHolder(TimeSupplier())
    holder.printTime()
    holder.setTimeSupplier(POSIXTimeSupplier())
    holder.printTime()
}

//private fun MainLocalTime.printTime(timeSupplier: String) {
//    println("POSIX time: ${timeSupplier}")
//}

//    val timeSeconds: Long = System.currentTimeMillis() / 1000
//    println(timeSeconds)

//    val start = System.currentTimeMillis()
//    for (i in 0..100000) {}
//    val end = System.currentTimeMillis()
//    println("Duration: ${end - start} msecs")
//}