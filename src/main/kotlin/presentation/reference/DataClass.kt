package presentation.reference

/**
 *
 */

// Copied from https://kotlinlang.org/docs/reference/data-classes.html

/*
The compiler automatically derives the following members from all properties declared in the primary constructor:

    1. equals()/hashCode() pair,
    2. toString() of the form "User(name=John, age=42)",
    3. componentN() functions corresponding to the properties in their order of declaration,
    4. copy() function (see below).

If any of these functions is explicitly defined in the class body or inherited from the base types, it will not be generated.

Criteria of data class:
1. The primary constructor needs to have at least one parameter;
2. All primary constructor parameters need to be marked as val or var;
3. Data classes cannot be abstract, open, sealed or inner;

* */

data class User(val name: String, val age: Int)

//Copying
//It's often the case that we need to copy an object altering some of its properties, but keeping the rest unchanged. This is what copy() function is generated for. For the User class above, its implementation would be as follows:
//fun copy(name: String = this.name, age: Int = this.age) = User(name, age)
//This allows us to write


//Data Classes and Destructuring Declarations
//Component functions generated for data classes enable their use in destructuring declarations:

fun main(args: Array<String>) {
    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
    val (name, age) = olderJack
    println("$name, $age years of age") // prints "jack, 2 years of age"


    val jane = User("Jane", 35)
    val (nameJ, ageJ) = jane
    println("$nameJ, $ageJ years of age") // prints "Jane, 35 years of age"

}
