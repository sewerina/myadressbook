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

}
