package com.sewerina.myadressbook;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AdressBookTest extends TestCase {

    public AdressBookTest(String name) {
        super(name);
    }


    public static Test suite() {
        return new TestSuite(AdressBookTest.class);
    }

    public void testFindByName_returnNotZeroArray_afterAddPerson() {
        AdressBook adressBook = new AdressBook();
        adressBook.add(new Person("Jone Morison"));
        Person[] persons = adressBook.findByName("Jone");
        assertTrue(persons.length > 0);
    }

    public void testFindByName_returnSamePerson_afterAddPerson() {
        AdressBook adressBook = new AdressBook();
        Person person = new Person("Jone Morison");
        adressBook.add(person);
        Person[] persons = adressBook.findByName("Jone");
        assertTrue(persons[0].equals(person));
    }

    public void testFindByName_returnTwoPersons_afterAddTwoPersons() {
        AdressBook adressBook = new AdressBook();
        adressBook.add(new Person("Jone Morison"));
        adressBook.add(new Person("Jone Morgan"));
        Person[] persons = adressBook.findByName("Jone");
        assertTrue(persons.length == 2);
    }

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

    public void testFindByName_returnTwoPersons_afterAddThreePersons() {
        AdressBook adressBook = new AdressBook();
        adressBook.add(new Person("Jone Morison"));
        adressBook.add(new Person("Jone Morgan"));
        adressBook.add(new Person("Bill Gates"));
        Person[] persons = adressBook.findByName("Jone");
        assertTrue(persons.length == 2);
    }

    public void test_getAll() {
        AdressBook adressBook = new AdressBook();
        adressBook.add(new Person("Jone Morison"));
        adressBook.add(new Person("Jone Morgan"));
        adressBook.add(new Person("Bill Gates"));
        Person[] persons = adressBook.getAll();
        assertTrue(persons.length == 3);
    }

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

}
