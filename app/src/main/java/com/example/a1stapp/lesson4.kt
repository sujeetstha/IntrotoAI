package com.example.a1stapp

fun main(){
    var age = arrayOf(1,2,3)
    println(age)
    println("The first element of age is" + age[0])
    println("The second element of age is" + age[1])
    println("The third element of age is" + age[2])

    println("*********************************")

    var name = arrayOf("ram", "shyam", "hari")
    name[1]= "sujeet"
    println("The first element of name is" + name[0])
    println(" The second element of name is "+ name[1])
    println(" The third element of name is "+ name[2])

    println(name.size)

    println("*********************************")

    var age1= ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)

    //we can add value directly in array while initializing variables
//    var age2= arrayListOf<Int>(1,20,5)
//
//    var age2= arrayListOf<String>("sujeet", "ram","hari")
//    name.add("shyam")
//    name.add(4,"sita")
//
//    name.remove("hari")
//    name.removeAt(0)

    println(name)


}

