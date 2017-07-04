package com.sewerina.myadressbook;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PersonTest extends TestCase {

    public PersonTest(String name) {
        super(name);
    }


    public static Test suite() {
        return new TestSuite(PersonTest.class);
    }

    public void testIsPass() {
        assertTrue(new Person("Jone Morison").isPass("Jone"));
        assertFalse(new Person("Bill Gates").isPass("Jone"));
    }

    public void testIsPassCountry() {
        Address address1 = new Address("Russia", null, null);
        Address address2 = new Address("Germany", null, null);
        assertTrue(new Person("Severin", address1).isPassCountry("Russia"));
        assertFalse(new Person("Severina", address2).isPassCountry("Russia"));
    }

    public void testIsPassZip() {
        Address address1 = new Address(null,"50", null);
        Address address2 = new Address(null, "10", null);
        assertTrue(new Person(null, address1).isPassZip("50"));
        assertFalse(new Person(null, address2).isPassZip("50"));
    }

    public void testIsPassAddressLine() {
        Address address1 = new Address(null,null, "Fruit");
        Address address2 = new Address(null,null, "ABC");
        assertTrue(new Person(null, address1).isPassAddressLine("Fruit"));
        assertFalse(new Person(null, address2).isPassAddressLine("Fruit"));
    }


}
