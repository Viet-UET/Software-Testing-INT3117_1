package com.example.ktdongdieukhien;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testCase65() {
        assertEquals("A", FooCheck.foo(65));
    }

    @Test
    public void testCase66() {
        assertEquals("B", FooCheck.foo(66));
    }

    @Test
    public void testCase67() {
        assertEquals("C", FooCheck.foo(67));
    }

    @Test
    public void testDefaultCase() {
        assertEquals("haven't check", FooCheck.foo(100));
    }
}
