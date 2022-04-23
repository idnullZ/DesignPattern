package adapter

fun main() {
    val groovy: Groovy = Adapter()
    groovy.invoke()
}


interface Groovy {
    fun invoke()
}

abstract class Java {
    fun execute() = println("executeJava")
}

class Adapter : Java(), Groovy {
    override fun invoke() = execute()
}
