package presentation.reference

infix fun String.and(anotherString: String): String {
    return this + " and " + anotherString
}

fun helloTo(name: String = "you") = "hello to $name"

fun say(what: String = "something", to: String = "someone") = "say $what to $to"

fun main(args: Array<String>) {
    println(helloTo())
    println(helloTo("Rustam"))

    println(say())
    println(say(to="Broderick", what = "Hi"))
    println(say("hello", to="everyone"))

    println("Procter" and "Gamble")
}