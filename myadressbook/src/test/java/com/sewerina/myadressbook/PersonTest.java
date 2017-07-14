package com.sewerina.myadressbook;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest{

    @Test
    public void testIsPass() {
        assertTrue(new Person("Jone Morison").isPass("Jone"));
        assertFalse(new Person("Bill Gates").isPass("Jone"));
    }

    @Test
    public void testIsPassCountry() {
        Address address1 = new Address("Russia", null, null);
        Address address2 = new Address("Germany", null, null);
        assertTrue(new Person("Severin", address1).isPassCountry("Russia"));
        assertFalse(new Person("Severina", address2).isPassCountry("Russia"));
    }

    @Test
    public void testIsPassZip() {
        Address address1 = new Address(null,"50", null);
        Address address2 = new Address(null, "10", null);
        assertTrue(new Person(null, address1).isPassZip("50"));
        assertFalse(new Person(null, address2).isPassZip("50"));
    }

    @Test
    public void testIsPassAddressLine() {
        Address address1 = new Address(null,null, "Fruit");
        Address address2 = new Address(null,null, "ABC");
        assertTrue(new Person(null, address1).isPassAddressLine("Fruit"));
        assertFalse(new Person(null, address2).isPassAddressLine("Fruit"));
    }

    @Test
    public void testSerialize() {
        Person person = new Person("Pickachu", new Address("Japan", "ABC", "Fruit"));
        String s = person.serialize();
        Assert.assertEquals("Pickachu,Japan,ABC,Fruit", s);
    }


}
