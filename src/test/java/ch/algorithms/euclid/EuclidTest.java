package ch.algorithms.euclid;

import org.junit.Test;

import static org.junit.Assert.*;

public class EuclidTest {

    @Test
    public void gcd_1() {
        assertEquals(7, Euclid.gcd(224, 105));
    }

    @Test
    public void gcd_2() {
        assertEquals(21, Euclid.gcd(1071, 462));
    }

}