package com.sewerina.myadressbook;

/**
 * Created by anatoliy on 01.07.17.
 */
public class Person {
    private final String name;
    private final Address address;

    public Person(String name) {
        this.name = name;
        address = null;
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public boolean isPass(String name) {
        return this.name.contains(name);
    }

    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }

    public boolean isPassCountry(String country) {
        return this.address.isContainsCountry(country);
    }


    public boolean isPassZip(String zip) {
        return this.address.isContainsZip(zip);
    }

    public boolean isPassAddressLine(String addressLine) {
        return this.address.isContainsAddressLine(addressLine);
    }
}
