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

    public boolean isContainsZip(String zip) {
        return this.zip.contains(zip);
    }

    public boolean isContainsAddressLine(String addressLine) {
        return this.addressLine.contains(addressLine);
    }

}
