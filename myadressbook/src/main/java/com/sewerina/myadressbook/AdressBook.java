package com.sewerina.myadressbook;

public class AdressBook {

    private Person[] persons = new Person[0];

    public void add(Person person) {
        Person[] persons = new Person[this.persons.length + 1];
        copy(persons);
        persons[persons.length - 1] = person;
        this.persons = persons;
    }

    private void copy(Person[] persons) {
        for (int i = 0; i < this.persons.length; i++) {
            persons[i] = this.persons[i];
        }
    }

    public Person[] findByName(String name) {

        int counter = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].isPass(name)) {
                counter++;
            }
        }
        Person[] result = new Person[counter];

        int j = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].isPass(name)) {
                result[j] = persons[i];
                j++;
            }
        }

        return result;
    }

    public Person[] getAll() {
        return this.persons;
    }

    public void sort() {
        int size = persons.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (persons[i].compareTo(persons[j]) > 0) {
                    Person t = persons[i];
                    persons[i] = persons[j];
                    persons[j] = t;
                }
            }
        }
    }

    public Person[] findByCountry(String country) {
        int counter = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].isPassCountry(country)) {
                counter++;
            }
        }

        Person[] result = new Person[counter];
        int j = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].isPassCountry(country)) {
                result[j] = persons[i];
                j++;
            }
        }
        return result;
    }


}
