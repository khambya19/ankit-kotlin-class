package com.example.ankit

fun main(args : Array<String>){
    val number = arrayOf(1,2,3)
    print(number)
    println(" the first element of the index age is " + number[0])
    println(" the second element of the index age is " + number[1])
    println(" the third element of the index age is " + number[2])


    val names = arrayOf("ankit","ankita")
    names[1]= "krishma"
    println(" the first index of the names is "+ names[0])
    println(" the second index of the names is "+ names[1])
    println(names.size)

    var age2 = ArrayList<Int>()
    age2.add(10)
    age2.add(1, 20)
    age2.add(50)
    println(age2)

    var age3 = arrayListOf<Int>(1, 20, 5)
    print(age3)

}