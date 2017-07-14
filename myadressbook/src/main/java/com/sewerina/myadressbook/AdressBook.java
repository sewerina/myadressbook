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

    public Person[] findByZip(String zip) {
        int counter = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].isPassZip(zip)) {
                counter++;
            }
        }

        Person[] result = new Person[counter];
        int j = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].isPassZip(zip)) {
                result[j] = persons[i];
                j++;
            }
        }

        return result;
    }


    public Person[] findByAddressLine(String addressLine) {
        int counter = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].isPassAddressLine(addressLine)) {
                counter++;
            }
        }

        Person[] result = new Person[counter];
        int j = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].isPassAddressLine(addressLine)) {
                result[j] = persons[i];
                j++;
            }
        }

        return result;
    }

    public void deletePersonByIndex(int index) {
        Person[] result = new Person[persons.length - 1];

        for (int i = 0; i < index; i++) {
            result[i] = persons[i];
        }

        for (int i = index; i < result.length; i++) {
            result[i] = persons[i + 1];
        }

        persons = result;
    }


    public void deletePersonByName(String delname) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].isPass(delname)) {
                deletePersonByIndex(i);
                i--;
            }
        }
    }

    public String serialize() {
        StringBuffer sb = new StringBuffer();
        for (Person p : persons) {
            sb.append(p.serialize());
            sb.append("\n");
        }

//        if (!sb.toString().equals("")) {
//            sb.deleteCharAt(sb.length() - 1);
//        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }

    public void deserialize(String s) {
        String[] rows = s.split("\n");
        for (String row : rows) {
            String[] fields = row.split(",");
            Person person = new Person(fields[0], new Address(fields[1], fields[2], fields[3]));
            add(person);
        }
    }
}
