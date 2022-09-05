package com.albertolopez.mediumcodesamples.testdatabuilders

import static com.albertolopez.mediumcodesamples.testdatabuilders.AddressBuilder.anAddress

class PersonBuilder {

    private name = "Kevin"
    private age = 35
    private weightInKG = 80.0
    private heightInM = 1.8
    private calorieIntake = 0
    private Address address = anAddress().build()

    private PersonBuilder() {}

    static aPerson() {
        new PersonBuilder()
    }

    def withWeightInKg(double weightInKg) {
        tap { it.weightInKG = weightInKg }
    }

    def withHeightInM(double heightInM) {
        tap { it.heightInM = heightInM }
    }

    def withInvalidAge(int invalidAge) {
        tap { age = invalidAge }
    }

    def withCalorieIntake(int calorieIntake) {
        tap {it.calorieIntake = calorieIntake }
    }

    def with(Address address) {
        tap { it.address = address }
    }

    def build() {
        new Person(name, age, weightInKG, heightInM, calorieIntake, address)
    }
}
