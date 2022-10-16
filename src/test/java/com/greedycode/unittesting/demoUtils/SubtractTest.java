package com.greedycode.unittesting.demoUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class SubtractTest {
    Subtract subtract;

    @BeforeEach
    void setupBeforeEach(){
        subtract = new Subtract();
    }`

    @Test
    void givenTwoNumber_checkEqualAndNotEqual(){
        // execute and assert
        assertEquals(8, subtract.subtract(10, 2), "10-2 should return 8");
        assertNotEquals(10, subtract.subtract(14, 3), "14-3 should not be 10");
    }
}