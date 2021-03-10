package com.example.inheritance.modifier

open class B : A() {
    val propertyB : String = "proB"
    fun functionB(){
        println("the property of class b is : ${propertyA}")
    }
}