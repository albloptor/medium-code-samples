package com.albertolopez.mediumcodesamples.testdatabuilders

class AddressBuilder {

    private line = "Elm Street"
    private city = "London"
    private country = "United Kingdom"

    private AddressBuilder() {}

    static anAddress() {
        new AddressBuilder()
    }

    def withCountry(String country) {
        tap { it.country = country }
    }

    def build() {
        new Address(line, city, country)
    }
}
