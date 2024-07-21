package OtherProblems.Recursion.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountZerosTest {

    CountZeros zeroCounter = new CountZeros();

    @Test
    public void testCountZerosZero() {
        int input = 0;
        int expected = 1;
        assertEquals(expected, zeroCounter.countZeros(input));
    }

    @Test
    public void testCountZerosSingleDigitNonZero() {

        int input = 7;
        int expected = 0;
        assertEquals(expected, zeroCounter.countZeros(input));
    }

    @Test
    public void testCountZerosSingleDigitZero() {

        int input = -0;
        int expected = 1;
        assertEquals(expected, zeroCounter.countZeros(input));
    }

    @Test
    public void testCountZerosMultipleDigitsNoZeros() {

        int input = 12345;
        int expected = 0;
        assertEquals(expected, zeroCounter.countZeros(input));
    }

    @Test
    public void testCountZerosMultipleDigitsWithZeros() {

        int input = 102030;
        int expected = 3;
        assertEquals(expected, zeroCounter.countZeros(input));
    }

    @Test
    public void testCountZerosMultipleDigitsWithLeadingZeros() {

        int input = 10005;
        int expected = 3;
        assertEquals(expected, zeroCounter.countZeros(input));
    }

    @Test
    public void testCountZerosLargeNumber() {

        int input = 1000000000;
        int expected = 9;
        assertEquals(expected, zeroCounter.countZeros(input));
    }

    @Test
    public void testCountZerosNegativeNumberWithZeros() {

        int input = -902000;
        int expected = 4;
        assertEquals(expected, zeroCounter.countZeros(input));
    }

    @Test
    public void testCountZerosNegativeNumberNoZeros() {

        int input = -12345;
        int expected = 0;
        assertEquals(expected, zeroCounter.countZeros(input));
    }

    @Test
    public void testCountZerosAllZeros() {

        int input = 0000;
        int expected = 1; // Since 0000 is essentially 0, it has 1 zero
        assertEquals(expected, zeroCounter.countZeros(input));
    }
}
