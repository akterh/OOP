package com.example.inheritance

 open class Vehicle(val speed:Int =60,val doors:Int = 3,val wheels:Int = 6,val driverName:String = "Akter") {
    fun upSpeed() = speed* 10
    fun stop() = 0
    fun move() = speed * 5
}