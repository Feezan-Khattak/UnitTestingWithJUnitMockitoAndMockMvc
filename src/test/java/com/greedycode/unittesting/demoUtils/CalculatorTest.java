package com.greedycode.unittesting.demoUtils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void addTwoNumber_ShouldBeEqualOrUnEqual() {
        // setup
        Calculator calculator = new Calculator();
        int expected = 7;
        int unexpected = 8;

        // execute
        int result = calculator.add(3,  4);

        // assert
        assertEquals(expected, result, "3+4 should be 7");
        assertNotEquals(unexpected, result, "3+4 should not be 8");
    }

}