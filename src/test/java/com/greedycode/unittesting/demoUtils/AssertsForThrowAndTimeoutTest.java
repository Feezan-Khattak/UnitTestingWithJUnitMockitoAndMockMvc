package com.greedycode.unittesting.demoUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AssertsForThrowAndTimeoutTest {

    AssertsForThrowAndTimeout assertsForThrowAndTimeout;

    @BeforeEach
    void setup(){
        assertsForThrowAndTimeout = new AssertsForThrowAndTimeout();
    }

    @DisplayName("Assert Throw")
    @Test
    void assertThrowAndNotThrow(){
        assertThrows(Exception.class, () -> assertsForThrowAndTimeout.checkNumber(-23), "It must throw an exception.");
        assertDoesNotThrow(() -> assertsForThrowAndTimeout.checkNumber(9), "It must not throw any exception");
    }

    @DisplayName("checking time out")
    @Test
    void checkingTimeOut(){
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> assertsForThrowAndTimeout.checkTimeout(), "Method should execute in 3 seconds");
    }


}