package com.greedycode.unittesting.demoUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameAndNotSameTest {

    SameAndNotSame sameAndNotSame;

    @BeforeEach
    void setUp(){
        sameAndNotSame = new SameAndNotSame();
    }

    @DisplayName("Checking That object are same or not")
    @Test
    void checkingSameAndNotSame(){
        assertSame(sameAndNotSame.getName(), sameAndNotSame.getDuplicateName(), "The object must be same");
        assertNotSame(sameAndNotSame.getName(), "Khan", "The object should not be equal");
    }

}