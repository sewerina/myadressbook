package com.sewerina.myadressbook;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AdressBookTest{

    @Test
    public void testFindByName_returnNotZeroArray_afterAddPerson() {
        AdressBook adressBook = new AdressBook();
        adressBook.add(new Person("Jone Morison"));
        Person[] persons = adressBook.findByName("Jone");
        assertTrue(persons.length > 0);
    }

    @Test
    public void testFindByName_returnSamePerson_afterAddPerson() {
        AdressBook adressBook = new AdressBook();
        Person person = new Person("Jone Morison");
        adressBook.add(person);
        Person[] persons = adressBook.findByName("Jone");
        assertTrue(persons[0].equals(person));
    }

    @Test
    public void testFindByName_returnTwoPersons_afterAddTwoPersons() {
        AdressBook adressBook = new AdressBook();
        adressBook.add(new Person("Jone Morison"));
        adressBook.add(new Person("Jone Morgan"));
        Person[] persons = adressBook.findByName("Jone");
        assertTrue(persons.length == 2);
    }

    @Test
    public void testFindByName_returnTwoSamePersons_afterAddTwoPersons() {
        AdressBook adressBook = new AdressBook();
        Person person1 = new Person("Jone Morison");
        adressBook.add(person1);
        Person person2 = new Person("Jone Morgan");
        adressBook.add(person2);
        Person[] persons = adressBook.findByName("Jone");
        assertTrue(persons[0].equals(person1) || persons[0].equals(person2));
        assertTrue(persons[1].equals(person1) || persons[1].equals(person2));
    }

    @Test
    public void testFindByName_returnTwoPersons_afterAddThreePersons() {
        AdressBook adressBook = new AdressBook();
        adressBook.add(new Person("Jone Morison"));
        adressBook.add(new Person("Jone Morgan"));
        adressBook.add(new Person("Bill Gates"));
        Person[] persons = adressBook.findByName("Jone");
        assertTrue(persons.length == 2);
    }

    @Test
    public void test_getAll() {
        AdressBook adressBook = new AdressBook();
        adressBook.add(new Person("Jone Morison"));
        adressBook.add(new Person("Jone Morgan"));
        adressBook.add(new Person("Bill Gates"));
        Person[] persons = adressBook.getAll();
        assertTrue(persons.length == 3);
    }

    @Test
    public void test_sort() {
        AdressBook adressBook = new AdressBook();

        Person c = new Person("C");
        adressBook.add(c);

        Person a = new Person("A");
        adressBook.add(a);

        Person b = new Person("B");
        adressBook.add(b);

        adressBook.sort();

        Person[] persons = adressBook.getAll();
        assertTrue(persons[0] == a);
        assertTrue(persons[1] == b);
        assertTrue(persons[2] == c);
    }

    @Test
    public void test_findByCountry() {
        AdressBook adressBook = new AdressBook();

        Address address1 = new Address("Russia", "101", "Moscow");
        Person person1 = new Person("Severin", address1);

        Address address2 = new Address("USA", "900", "Boston");
        Person person2 = new Person("Severin", address2);

        adressBook.add(person1);
        adressBook.add(person2);

        Person[] persons = adressBook.findByCountry("Russia");
        assertTrue(persons.length > 0);
        assertTrue(persons[0] == person1);
    }

    @Test
    public void test_findByZip() {
        AdressBook adressBook = new AdressBook();

        Address address1 = new Address(null,"555", null);
        Person person1 = new Person(null, address1);

        Address address2 = new Address(null, "777", null);
        Person person2 = new Person(null, address2);

        Address address3 = new Address(null, "555", null);
        Person person3 = new Person(null, address3);

        adressBook.add(person1);
        adressBook.add(person2);
        adressBook.add(person3);

        Person[] persons = adressBook.findByZip("777");
        assertTrue(persons.length > 0);
        assertTrue(persons[0] == person2);
    }

    @Test
    public void test_findByAddressLine() {
        AdressBook adressBook = new AdressBook();

        Address address1 = new Address(null, null, "Honey");
        Person person1 = new Person(null, address1);

        Address address2 = new Address(null, null, "Fruit");
        Person person2 = new Person(null, address2);

        adressBook.add(person1);
        adressBook.add(person2);

        Person[] persons = adressBook.findByAddressLine("Fruit");
        assertTrue(persons.length > 0);
        assertTrue(persons[0] == person2);
    }

}
