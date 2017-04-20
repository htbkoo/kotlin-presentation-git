package presentation.feature

/**
 *
 */

fun main(args: Array<String>) {
    var nullableString: String? = null
    val normalString: String = "Normal String"

}

fun printLength(s: String?) {
    println(s?.length)
    s?.let { println(s.length) }
}

fun printLength(fromString: String?, defaultLengthIfNull: Int = 0) {
    val length = fromString?.length ?: defaultLengthIfNull
    println(length)
}

fun printWithNpe(s: String?) {
    println(s!!.length)
}

fun printSafeLength(s: String) {
    println(s.length)
}
