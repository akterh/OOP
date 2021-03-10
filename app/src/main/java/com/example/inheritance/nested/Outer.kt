package com.example.inheritance.nested

class Outer {
    val outerClass : Int = 10
    inner class Nested {
        val  nestedProperty : String = "Nested"
        fun nestedFun(){
            println("the innner property value is: ${nestedProperty}")
        }
    }
}