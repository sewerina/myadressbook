package com.sewerina.myadressbook;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by anatoliy on 04.07.17.
 */
public class AddressTest extends TestCase {

    public static Test suite() {
        return new TestSuite(AddressTest.class);
    }

    public void testIsContainsCountry() {
        assertTrue(new Address("Russia", null, null).isContainsCountry("Russia"));
        assertFalse(new Address("France", null, null).isContainsCountry("Russia"));
    }

    public void testIsContainsZip() {
        assertTrue(new Address(null, "111", null).isContainsZip("111"));
        assertFalse(new Address(null, "100", null).isContainsZip("111"));
    }

    public void testIsContainsAddressLine() {
        assertTrue(new Address(null, null, "Honey").isContainsAddressLine("Honey"));
        assertFalse(new Address(null, null, "ABC").isContainsAddressLine("Honey"));
    }

}
