package com.greedycode.unittesting.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("Test if number is divisible by 3")
    @Order(0)
    void testForNumberIsDivisibleBy3(){
        // given
        String expected = "Fizz";

        // execute and assert
        assertEquals(expected, fizzBuzz.solveFor(3), "It should give Fizz");
    }

    @Test
    @DisplayName("Test if number is divisible by 5")
    @Order(1)
    void testForNumberIsDivisibleBy5(){
        // given
        String expected = "Buzz";

        // execute and assert
        assertEquals(expected, fizzBuzz.solveFor(5), "It should give Buzz");
    }

    @Test
    @DisplayName("Test if number is divisible by 3 or 5")
    @Order(2)
    void testForNumberIsDivisibleBy3Or5(){
        // given
        String expected = "FizzBuzz";

        // execute and assert
        assertEquals(expected, fizzBuzz.solveFor(15), "It should give FizzBuzz");
        assertNotEquals(expected, fizzBuzz.solveFor(12), "It should not be FizzBuzz");
    }

    @Test
    @DisplayName("Test if number is not divisible by 3 or 5")
    @Order(3)
    void testForNotNumberIsDivisibleBy3Or5(){
        // given
        String expected = "2";

        // execute and assert
        assertEquals(expected, fizzBuzz.solveFor(2), "It should give 2");
        assertNotEquals(expected, fizzBuzz.solveFor(17), "It should not be FizzBuzz");
    }

}