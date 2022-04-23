package command

fun main() {
    val currency = Currency()
    val bank = Bank(
        EurCommand(currency),
        UsdCommand(currency),
    )
    bank.getEur()
    bank.getUsd()
}


interface Command {
    fun execute()
}

class Currency {
    fun usd() = println("withdraw usd")

    fun eur() = println("withdraw eur")
}


class EurCommand(var currency: Currency) : Command {
    override fun execute() {
        currency.eur()
    }
}

class UsdCommand(var currency: Currency) : Command {
    override fun execute() {
        currency.usd()
    }
}


class Bank(var usd: Command, var eur: Command) {
    fun getUsd() = usd.execute()

    fun getEur() = eur.execute()

}