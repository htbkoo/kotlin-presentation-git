package presentation.reference

interface implementMe {
    fun doStuff(): String
    fun defaultStuff() = "I do some default stuff"
}

class superClass: implementMe {
    override fun doStuff(): String {
        return "I implemented you"
    }

    fun doMoreStuff() = "I can do even better"
}

fun main(args: Array<String>) {
    val classVal = superClass()

    println(classVal.doStuff())
    println(classVal.doMoreStuff())
    println(classVal.defaultStuff())

    val interfaceVal: implementMe = superClass()
    println(interfaceVal.doStuff())
    println(interfaceVal.defaultStuff())
}