package presentation.reference

import java.util.ArrayList
import java.util.Arrays


/**
 *
 */

fun mutableCollections() {
//    Unmodifiability
//    The collections (e.g. List, Set, Map) unmodifiable ,i.e. does not support add/remove operations, "by default"
//    In case we need to add/remove, we need to use Mutable Collections (e.g. MutableList, MutableSet, MutableMap)

    val unmodifiableList: List<Int> = Arrays.asList(1, 2, 3);
    // Cannot - would cause compilation error
//    unmodifiableList.add(1);
//    unmodifiableList.remove(1);

//    Gotcha - The Arrays.asList function from Java return an UnmodifiableList - not something specific to Kotlin though
//    val modifiableList: MutableList<Int> = Arrays.asList(1, 2, 3);
    val modifiableList: MutableList<Int> = ArrayList(Arrays.asList(1, 2, 3));
    modifiableList.add(4);
    println(modifiableList.toString());

    val unmodifiableListIsStillMutable: List<MutableList<Int>> = Arrays.asList(modifiableList);
    modifiableList.remove(1);
    println(unmodifiableListIsStillMutable.toString());
    // Cannot - would cause compilation error
//    unmodifiableListIsStillMutable.add(modifiableList);
}

fun main(args: Array<String>){
    mutableCollections();
}