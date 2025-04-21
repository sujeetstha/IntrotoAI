package com.example.a1stapp

fun main() {
    println("Hello world")

//    var dname= "Sujeet"
//    dname = "Shrestha"

    // mutable variable
    var firstname = "Sujeet"
    var lname = "Shrestha"

    //to print in kotlin
    println("${firstname.length} $lname")

    //to declare the variable(name diyera)

    var name: String = "Sujeet"
    var age: Int = 123

    //array

    // var address = arrayOf("ktm", "chitwan")
    // to access array list

    var address = arrayListOf("ktm")
    address.add("hetauda")

    println("$address")

    //Dictionary

    var dictionary = mapOf(
    "Apple" to "This is fruit",
    "Samsung" to "THis is brand"
    )

    //println("the value of apple is $dictionary ${"Apple"});


}