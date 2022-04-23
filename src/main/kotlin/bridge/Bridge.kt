package bridge

fun main() {
    val programs = arrayOf(
        BankSystem(JavaDeveloper()),
        StockExchange(CppDeveloper())
    )
    for (program in programs) {
        program.developProgram()
    }
}
class BankSystem(developer: Developer) : Program(developer) {
    override fun developProgram() {
        println("Bank System ")
        developer.writeCode()
    }
}

class CppDeveloper : Developer {
    override fun writeCode() {
        println("write C++ code ")
    }
}

interface Developer {
    fun writeCode()
}

class JavaDeveloper : Developer {
    override fun writeCode() {
        println("write Java code ")
    }
}

abstract class Program ( var developer: Developer) {
    abstract fun developProgram()
}

class StockExchange (developer: Developer) : Program(developer) {
    override fun developProgram() {
        println("Stock Exchange ")
        developer.writeCode()
    }
}