package com.albertolopez.mediumcodesamples.constructorcoupling

import mediumcodesamples.constructorcoupling.Developer
import mediumcodesamples.constructorcoupling.EnergyOutOfRangeException
import mediumcodesamples.constructorcoupling.TooTiredToEvenPretendToWorkException
import spock.lang.Specification

class DeveloperTest extends Specification {

    def "cannot instantiate a developer with invalid energy"() {
        when:
        new Developer("Alberto", energy)

        then:
        thrown(EnergyOutOfRangeException)

        where:
        energy << [-1, 101]
    }

    def "pretending to work makes a developer spend energy"() {
        given:
        def developer = new Developer("Alberto", 100)

        when:
        developer.pretendToWork()

        then:
        developer.energy == 80
    }

    def "pretending to work cannot decrease a developer's energy below the minimum"() {
        given:
        def developer = new Developer("Alberto", 19)

        when:
        developer.pretendToWork()

        then:
        thrown(TooTiredToEvenPretendToWorkException)
    }

    def "drinking coffee restores a developer's energy"() {
        given:
        def developer = new Developer("Alberto", 50)

        when:
        developer.drinkCoffee()

        then:
        developer.energy == 100
    }
}
