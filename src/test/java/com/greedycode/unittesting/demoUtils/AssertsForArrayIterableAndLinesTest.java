package com.greedycode.unittesting.demoUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssertsForArrayIterableAndLinesTest {

    AssertsForArrayIterableAndLines assertsObjects;

    @BeforeEach
    void setup(){
        assertsObjects = new AssertsForArrayIterableAndLines();
    }

    @DisplayName("Checking the arrays equal")
    @Test
    void checkingArrays(){
        int[] numbers = {1,3,5};

        assertArrayEquals(numbers, assertsObjects.getNumbers(), "Array must be equal");
    }

    @DisplayName("Checking the Iterable equality")
    @Test
    void iterableChecking(){
        List<String> names = List.of("Feezan", "khattak");
        assertIterableEquals(names, assertsObjects.getNames(), "Iterable must be equal");
    }

    @DisplayName("Checking the Lines equality")
    @Test
    void lineChecking(){
        List<String> names = List.of("Feezan", "khattak");
        assertIterableEquals(names, assertsObjects.getNames(), "Lines must be equal");
    }


}