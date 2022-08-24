package com.albertolopez.mediumcodesamples.testdatabuilders;

class Person(
    val name: String,
    val age: Int,
    val weightInKg: Double,
    val heightInCm: Int,
    var energy: Int
) {

    fun sleep() = apply { energy = 100; }
}
