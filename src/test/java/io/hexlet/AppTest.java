package io.hexlet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @ParameterizedTest
    @ValueSource(ints = {3, 9, 18, 21})
    void testFizz(int number) {
        assertEquals("Fizz", FizzBuzz.determine(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    void testBuzz(int number) {
        assertEquals("Buzz", FizzBuzz.determine(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60})
    void testFizzBuzz(int number) {
        assertEquals("FizzBuzz", FizzBuzz.determine(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 11, 14})
    void testRegularNumber(int number) {
        assertEquals(String.valueOf(number), FizzBuzz.determine(number));
    }
}
