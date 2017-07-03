package com.sewerina.myadressbook;

public class Address {

    private final String country;
    private final String zip;
    private final String addressLine;

    public Address(String country, String zip, String addressLine) {
        this.country = country;
        this.zip = zip;
        this.addressLine = addressLine;
    }


    public boolean isContainsCountry(String country) {
        return this.country.contains(country);
    }

}
