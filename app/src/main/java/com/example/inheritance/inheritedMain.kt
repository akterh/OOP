package com.example.inheritance

fun main(){
    val car = Car(5)
    println("the property like speed    and door of car  is : ${car.speed} and ${car.doors}")
    println("the method of car is ${car.upSpeed()} and ${car.move()}")

    val truck = Truck(1000)
    println("the property like speed    and door of truck  is : ${truck.speed} and ${truck.doors}")
    println("the method of truck is ${truck.upSpeed()} and ${truck.cargoWeight()}")

}