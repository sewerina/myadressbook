package com.sewerina.myadressbook;

/**
 * Created by anatoliy on 01.07.17.
 */
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean isPass(String name) {
        return this.name.contains(name);
    }

    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }
}
