package factory

import java.lang.RuntimeException

interface Application {
    fun work()
}

class Android() : Application {
    override fun work() {
        println(this)
    }
}

class IOS() : Application {
    override fun work() {
        println(this)
    }
}

class Windows() : Application {
    override fun work() {
        println(this)
    }

    val app = ApplicationFactory()
}

class ApplicationFactory() {
    fun create(value: String): Application {
        return when (value) {
            "Swift" -> IOS()
            "Kotlin" -> Android()
            "C#" -> Windows()
            else -> throw RuntimeException("App not found")
        }
    }
}

fun main() {
    val app = ApplicationFactory()
    val android = app.create("Kotlin")
    android.work()
}