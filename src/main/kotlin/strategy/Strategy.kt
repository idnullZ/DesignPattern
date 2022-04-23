package strategy

fun main() {

    val behavior = Behavior()

    behavior.strategy = Middle()
    behavior.execute()

    behavior.strategy = Max()
    behavior.execute()

    behavior.strategy = Min()
    behavior.execute()

}

interface Strategy {
    fun work()
}

class Behavior {
    var strategy: Strategy? = null

    fun execute() {
        strategy?.work()
    }
}

class Max : Strategy {
    override fun work() {
        println("Max")
    }
}

class Min : Strategy {
    override fun work() {
        println("Min")
    }
}

class Middle : Strategy {
    override fun work() {
        println("Middle")
    }
}