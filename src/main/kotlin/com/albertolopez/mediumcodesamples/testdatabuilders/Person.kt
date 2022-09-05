package com.albertolopez.mediumcodesamples.testdatabuilders;

import java.math.RoundingMode

class Person(
    val name: String,
    val age: Int,
    val weightInKg: Double,
    val heightInM: Double,
    var calorieIntake: Int,
    var address: Address
) {

    init {
       if (age < 0) throw InvalidAgeException()
    }

    fun bmi(): Double {
        val weightInKgBD = weightInKg.toBigDecimal()
            .setScale(2, RoundingMode.HALF_EVEN)
        val heightInMSquaredBD = heightInM.toBigDecimal().pow(2)
        return weightInKgBD.div(heightInMSquaredBD).toDouble()
    }

    fun eatFood(calories: Int) {
        calorieIntake += calories
    }
}
