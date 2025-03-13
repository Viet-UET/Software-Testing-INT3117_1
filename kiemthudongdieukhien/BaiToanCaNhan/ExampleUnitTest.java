package com.example.myproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    @Test
    public void testEvaluateLoanOfferCase1() {
        int income = 4000000;
        int creditScore = 200;
        int workYears = -1;

        String expected = "X";
        String actual = MainActivity.evaluateLoanOffer(income, creditScore, workYears);

        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateLoanOfferCase2() {
        int income = 60000000;
        int creditScore = 800;
        int workYears = 12;

        String expected = "A";
        String actual = MainActivity.evaluateLoanOffer(income, creditScore, workYears);

        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateLoanOfferCase3() {
        int income = 35000000;
        int creditScore = 720;
        int workYears = 6;

        String expected = "B";
        String actual = MainActivity.evaluateLoanOffer(income, creditScore, workYears);

        assertEquals(expected, actual);
    }


    @Test
    public void testEvaluateLoanOfferCase4() {
        int income = 20000000;
        int creditScore = 650;
        int workYears = 4;

        String expected = "C";
        String actual = MainActivity.evaluateLoanOffer(income, creditScore, workYears);

        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateLoanOfferCase5() {
        int income = 12000000;
        int creditScore = 550;
        int workYears = 2;

        String expected = "D";
        String actual = MainActivity.evaluateLoanOffer(income, creditScore, workYears);

        assertEquals(expected, actual);
    }


    @Test
    public void testEvaluateLoanOfferCase6() {
        int income = 8000000;
        int creditScore = 400;
        int workYears = 0;

        String expected = "E";
        String actual = MainActivity.evaluateLoanOffer(income, creditScore, workYears);

        assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateLoanOfferCase7() {
        int income = 1200000;
        int creditScore = 200;
        int workYears = 0;

        String expected = "X";
        String actual = MainActivity.evaluateLoanOffer(income, creditScore, workYears);

        assertEquals(expected, actual);
    }

}