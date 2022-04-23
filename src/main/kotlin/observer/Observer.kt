package observer

import kotlin.random.Random

class Station {
    private val subscribers: MutableList<StationSubscriber> = ArrayList()

    var value = 0
    fun addSubscriber(subscriber: StationSubscriber) {
        subscribers.add(subscriber)
    }

    fun deleteSubscriber(subscriber: StationSubscriber) {
        subscribers.remove(subscriber)
    }

    fun update() {
        value = Random.nextInt(100)
        subscribers.forEach {
            it.goAction(value = value)
        }

    }
}

class User(val name: String) : StationSubscriber {
    override fun goAction(value: Int) {
        println(value)
    }

}

interface StationSubscriber {
    fun goAction(value: Int)
}


fun main() {
    val station = Station()
    station.addSubscriber(User(name = "Maike"))
    station.addSubscriber(User(name = "Jon"))

    for (i in 0..10) {
        Thread.sleep(1000)
        station.update()
    }
}