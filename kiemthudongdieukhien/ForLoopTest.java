package com.example.ktdongdieukhien;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ForLoopTest {
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
        int[] a = {1, 2, 3, 4};
        int n = 4;
        assertEquals(10, SumCal.Sum(a, n));
    }

    @Test
    public void testNegativeNumbers() {
        int[] a = {-1, -2, -3};
        int n = 3;
        assertEquals(-6, SumCal.Sum(a, n));
    }

    @Test
    public void testLargeNumbers() {
        int[] a = {1000, 2000, 3000};
        int n = 3;
        assertEquals(6000, SumCal.Sum(a, n));
    }

    @Test
    public void testZeros() {
        int[] a = {0, 0, 0};
        int n = 3;
        assertEquals(0, SumCal.Sum(a, n));
    }

    @Test
    public void testSameNumbers() {
        int[] a = {3, 3, 3, 3};
        int n = 4;
        assertEquals(12, SumCal.Sum(a, n));
    }
}

