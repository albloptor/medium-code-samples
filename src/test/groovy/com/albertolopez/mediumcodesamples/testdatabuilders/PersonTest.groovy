package com.albertolopez.mediumcodesamples.testdatabuilders

import mediumcodesamples.testdatabuilders.Person
import spock.lang.Specification

class PersonTest extends Specification {

    def "when a person sleeps, their energy is restored"() {
        given:
        def person = new Person("kevin", 35, 80, 180, 20)

        when:
        person.sleep()

        then:
        person.energy == 100
    }
}
