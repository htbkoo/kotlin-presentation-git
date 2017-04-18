package presentation.reference

open class Parent {
    open fun getString() = "value"
    fun getMeaningOfLife() = 42

    open val property = "a property"
}

class Child: Parent() {
    override val property = "new property"
    override fun getString() = "newString"
}
