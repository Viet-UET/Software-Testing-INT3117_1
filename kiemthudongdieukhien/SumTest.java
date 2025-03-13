package com.example.ktdongdieukhien;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumTest {

    @Test
    public void testEmptyArray() {
        int[] a = {};
        int n = 0;
        assertEquals(0, SumCal.Sum(a, n));
    }

    @Test
    public void testSingleElement() {
        int[] a = {5};
        int n = 1;
        assertEquals(5, SumCal.Sum(a, n));
    }

    @Test
    public void testMultipleElements() {
        int[] a = {1, 2, 3};
        int n = 3;
        assertEquals(6, SumCal.Sum(a, n));
    }
}
