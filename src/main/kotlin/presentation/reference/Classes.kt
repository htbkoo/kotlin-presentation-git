package presentation.reference

class Foo (private val a: Int): Bar() {
    val b: Int

    init {
        b = 0
    }
}

open class Bar {
    var value = ""

    constructor(): this("")

    constructor(value: String) {
        this.value = value
    }
}

class Container {
    companion object {
        val staticValues = "static values"
    }

    val foo = Foo(1)
    val bar = Bar()
    val barWithValue = Bar("barWithValue")
}

fun main(args: Array<String>) {
    println(Container.staticValues)

    val container = Container()

    println(container.foo.b)
    println(container.bar.value)
    println(container.barWithValue.value)

    with(container) {
        println(foo.b)
        println(bar.value)
        println(barWithValue.value)
    }
}