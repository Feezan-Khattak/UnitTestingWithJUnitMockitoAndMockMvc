package com.greedycode.unittesting.demoUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrueAndFalseTest {

    TrueAndFalse trueAndFalse;

    @BeforeEach
    void setup(){
        trueAndFalse = new TrueAndFalse();
    }

    @DisplayName("Checking the boolean true and false")
    @Test
    void TrueAndNotTrue(){
        assertTrue(trueAndFalse.isNumberEqual(10, 6), "10 is greater than 6");
        assertFalse(trueAndFalse.isNumberEqual(10, 115), "10 must be less than 115");
    }

}