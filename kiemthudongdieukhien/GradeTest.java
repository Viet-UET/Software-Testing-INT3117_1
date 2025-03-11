package com.example.ktdongdieukhien;

// GradeTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeTest {
    @Test
    public void testInvalidGrade() {
        assertEquals('I', MainActivity.Grade(-1));
    }

    @Test
    public void testGradeA() {
        assertEquals('A', MainActivity.Grade(9));
    }

    @Test
    public void testGradeB() {
        assertEquals('B', MainActivity.Grade(8));
    }

    @Test
    public void testGradeC() {
        assertEquals('C', MainActivity.Grade(7));
    }

    @Test
    public void testGradeD() {
        assertEquals('D', MainActivity.Grade(5));
    }

    @Test
    public void testGradeF() {
        assertEquals('F', MainActivity.Grade(4));
    }
}
