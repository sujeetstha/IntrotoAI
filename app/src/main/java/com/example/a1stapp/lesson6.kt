package com.example.a1stapp

fun main(){

    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0
    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result= num1 * num2
            println("num1 num2 is $result")
    result =num1 / num2
            println("num1 / num2 is $result")
    result =num1 % num2
            println("num1 % num2 is $result")


    var x:Int = 20
    var y:Int = 10
    var z:Int = 0
    z = x+y
    println("z = x + y = $z")
    z += x
    println("z += x = $z")
    z -= x
    println("z -= X = $z")
    z *= x
    println("z = x = $z")
    z /= x
    println("z /= x = $z")
    z %= x
    println("z %= x = $z")


    var number: Double = 7.6
    var isCheck: Boolean = true;
    println("+number = ${+number}" );
    println("-number = ${-number}");
    println("++number = ${++number}");
    println("--number = ${--number}" );
    println("!isCheck = ${!isCheck}" );
    println("--------------------")

    println("result :$result")

//when the result++ is executed, the original value is evaluated first
//and value of result is increased only after that
    println("result++ :" + result++)





    print("Enter name:: ")
    var name: String? = readln();
// The data user inputs is always a String so,
//type conversion for data type other than String print("Enter age:: ")
    var age: Int = readln()!!.toInt();
}