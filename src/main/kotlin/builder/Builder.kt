package builder

data class Home(val window: String, val door: String, val wall: String, val roof: String)

fun main() {
    val result = HomeBuilder()
        .setDoor("My door")
        .setWall("my Wall")
        .build()
    println(result)
}

class HomeBuilder() {
    private var window: String = ""
    private var door: String = ""
    private var wall: String = ""
    private var roof: String = ""


    fun setWindow(value: String): HomeBuilder {
        this.window = value
        return this
    }

    fun setDoor(value: String): HomeBuilder {
        this.door = value
        return this
    }

    fun setWall(value: String): HomeBuilder {
        this.wall = value
        return this
    }

    fun setRoof(value: String): HomeBuilder {
        this.roof = value
        return this
    }
    fun build() = Home(
        window = window,
        roof = roof,
        door = door,
        wall = wall
    )

}
