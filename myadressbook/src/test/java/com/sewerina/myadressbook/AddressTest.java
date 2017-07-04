package com.sewerina.myadressbook;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddressTest {

    @Test
    public void testIsContainsCountry() {
        assertTrue(new Address("Russia", null, null).isContainsCountry("Russia"));
        assertFalse(new Address("France", null, null).isContainsCountry("Russia"));
    }

    @Test
    public void testIsContainsZip() {
        assertTrue(new Address(null, "111", null).isContainsZip("111"));
        assertFalse(new Address(null, "100", null).isContainsZip("111"));
    }

    @Test
    public void testIsContainsAddressLine() {
        assertTrue(new Address(null, null, "Honey").isContainsAddressLine("Honey"));
        assertFalse(new Address(null, null, "ABC").isContainsAddressLine("Honey"));
    }

}
