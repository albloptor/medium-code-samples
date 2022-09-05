package com.albertolopez.mediumcodesamples.testdatabuilders

import spock.lang.Specification

import static com.albertolopez.mediumcodesamples.testdatabuilders.AddressBuilder.anAddress
import static com.albertolopez.mediumcodesamples.testdatabuilders.PersonBuilder.aPerson

class PersonTest extends Specification {

    def "when a person eats food, their calorie intake is increased"() {
        given:
        def person = aPerson()
                .withCalorieIntake(100)
                .build()

        when:
        person.eatFood(500)

        then:
        person.calorieIntake == 600
    }

    def "a person can calculate their Body Mass Index"() {
        given:
        def person = aPerson()
                .withHeightInM(1.8)
                .withWeightInKg(80)
                .build()

        expect:
        person.bmi() == 24.69d
    }

    def "some nested Test Data Builder test"() {
        given:
        def person = aPerson().with(
                anAddress().withCountry("Spain").build()
        ).build()

        expect:
        true
    }

    def "a person cannot have a negative age"() {
        when:
        def person = aPerson()
                .withInvalidAge(-1)
                .build()

        then:
        thrown(InvalidAgeException)
    }
}
