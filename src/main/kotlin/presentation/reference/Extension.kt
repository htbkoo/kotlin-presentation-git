package presentation.reference

fun Int.plusTwo(): Int {
    return this + 2
}

fun Int.minusThree(): Int {
    return this - 3
}

fun main(args: Array<String>) {
    val a = 2
    val b = 10

    println(a.plusTwo())
    println(b.minusThree())
}