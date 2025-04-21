package com.example.a1stapp

fun main() {
    val numbers= listOf("one", "two", "three", "four")

    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("fourth element: ${numbers.get(3)}")
    println("Index of element ${numbers.indexOf("two")}")


}

//fun main(){
//    //Immutable list
//    val lst = listOf("one","two","three")
//    println("Mutable list")
//    for(i in lst.indices){
//        println(lst[i])
//    }
//}


fun set() {

    val numbers = setOf(1, 2, 3, 4)
    for (elements in numbers) {
        println(elements)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println ("The sets are equal: ${numbers==numbersBackwards}")
}


fun map() {

val countriesCapitals = mapOf(
"Nepal" to "Kathmandu",
"China" to "Beijing",
"India" to "New Delhi"
)
println("All keys: ${countriesCapitals.keys}")
println("All values: ${countriesCapitals.values}")
println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")
}