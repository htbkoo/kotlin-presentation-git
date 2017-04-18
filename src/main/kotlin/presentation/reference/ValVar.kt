package presentation.reference

/**
 *
 */

fun valVar() {
    val finalString: String = ""
    var canResssignString: String = ""

    // Cannot - would cause compilation error
    // finalString = "cannot do this"

    // but this is ok
    canResssignString = "reassigned"
}