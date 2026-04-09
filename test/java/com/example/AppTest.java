package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", App.checkEvenOdd(4));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", App.checkEvenOdd(5));
    }
}