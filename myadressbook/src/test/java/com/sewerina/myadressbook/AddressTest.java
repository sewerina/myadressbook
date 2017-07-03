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

}
