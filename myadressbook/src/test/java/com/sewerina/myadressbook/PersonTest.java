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

}
