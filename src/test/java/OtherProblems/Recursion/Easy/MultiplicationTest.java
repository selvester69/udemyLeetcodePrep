package OtherProblems.Recursion.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    Multiplication multiplication = new Multiplication();

    @Test
    public void testMultiplyZeroByAnyNumber() {
        int a = 0;
        int b = 5;
        int expected = 0;
        assertEquals(expected, multiplication.multiply(a, b));
    }

    @Test
    public void testMultiplyAnyNumberByZero() {

        int a = 5;
        int b = 0;
        int expected = 0;
        assertEquals(expected, multiplication.multiply(a, b));
    }

    @Test
    public void testMultiplyPositiveNumbers() {

        int a = 3;
        int b = 5;
        int expected = 15;
        assertEquals(expected, multiplication.multiply(a, b));
    }

    @Test
    public void testMultiplyNegativeAndPositiveNumbers() {

        int a = -3;
        int b = 5;
        int expected = -15;
        assertEquals(expected, multiplication.multiply(a, b));
    }

    @Test
    public void testMultiplyPositiveAndNegativeNumbers() {

        int a = 3;
        int b = -5;
        int expected = -15;
        assertEquals(expected, multiplication.multiply(a, b));
    }

    @Test
    public void testMultiplyNegativeNumbers() {

        int a = -3;
        int b = -5;
        int expected = 15;
        assertEquals(expected, multiplication.multiply(a, b));
    }

    @Test
    public void testMultiplyWithOne() {

        int a = 1;
        int b = 7;
        int expected = 7;
        assertEquals(expected, multiplication.multiply(a, b));
    }

    @Test
    public void testMultiplyByOne() {

        int a = 7;
        int b = 1;
        int expected = 7;
        assertEquals(expected, multiplication.multiply(a, b));
    }

    @Test
    public void testMultiplyLargeNumbers() {

        int a = 1234;
        int b = 5678;
        int expected = 1234 * 5678; // Using the actual multiplication for the expected value
        assertEquals(expected, multiplication.multiply(a, b));
    }

    @Test
    public void testMultiplyNegativeLargeNumbers() {

        int a = -1234;
        int b = 5678;
        int expected = -1234 * 5678; // Using the actual multiplication for the expected value
        assertEquals(expected, multiplication.multiply(a, b));
    }
}
