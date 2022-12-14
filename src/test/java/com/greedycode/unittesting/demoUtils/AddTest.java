package com.greedycode.unittesting.demoUtils;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    Add add;

    @BeforeEach
    void setupBeforeEach() {
        add = new Add();
        System.out.println("Before each method called");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Tear down after each");
    }

    @BeforeAll
    static void setupBeforeAll() {
        System.out.println("Setup before all");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("Tear Down after all");
    }

    @Test
    @DisplayName("Given two number from client and check its availability")
    void addTwoNumber_ShouldBeEqualOrUnEqual() {
        // setup
        int expected = 7;
        int unexpected = 8;

        // execute
        int result = add.add(3, 4);

        // assert
        assertEquals(expected, result, "3+4 should be 7");
        assertNotEquals(unexpected, result, "3+4 should not be 8");
    }


}