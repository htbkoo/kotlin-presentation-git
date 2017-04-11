package presentation.reference

/**
 *
 */

fun nullSafety(){

//    Cannot - would cause compilation error
//    val nonNullableString:String = null;

    val nonNullableString:String = "";
    val nullableString:String? = null;

    nonNullableString.toLowerCase();
//    Cannot - would cause compilation error
//    nullableString.toLowerCase();
//    need
    nullableString!!.toLowerCase();
//    or
    val anotherNullableString:String? = null;
    anotherNullableString?.toLowerCase();

    //    but it is smart - would know that it cannot be null here or excpetion would have been thrown
    nullableString.toLowerCase();

}