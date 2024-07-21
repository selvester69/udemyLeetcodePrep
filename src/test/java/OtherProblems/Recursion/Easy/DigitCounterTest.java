package OtherProblems.Recursion.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import OtherProblems.Recursion.Easy.DigitCounter;

public class DigitCounterTest {

    DigitCounter digitCounter = new DigitCounter();

    @Test
    public void testCountDigitsZero() {
        int input = 0;
        int expected = 1;
        assertEquals(expected, digitCounter.countDigits(input));
    }

    @Test
    public void testCountDigitsSingleDigitPositive() {
        DigitCounter digitCounter = new DigitCounter();
        int input = 7;
        int expected = 1;
        assertEquals(expected, digitCounter.countDigits(input));
    }

    @Test
    public void testCountDigitsSingleDigitNegative() {
        DigitCounter digitCounter = new DigitCounter();
        int input = -3;
        int expected = 1;
        assertEquals(expected, digitCounter.countDigits(input));
    }

    @Test
    public void testCountDigitsMultipleDigitsPositive() {
        DigitCounter digitCounter = new DigitCounter();
        int input = 12345;
        int expected = 5;
        assertEquals(expected, digitCounter.countDigits(input));
    }

    @Test
    public void testCountDigitsMultipleDigitsNegative() {
        DigitCounter digitCounter = new DigitCounter();
        int input = -9876;
        int expected = 4;
        assertEquals(expected, digitCounter.countDigits(input));
    }

    @Test
    public void testCountDigitsLargeNumber() {
        DigitCounter digitCounter = new DigitCounter();
        int input = 1234567890;
        int expected = 10;
        assertEquals(expected, digitCounter.countDigits(input));
    }

    @Test
    public void testCountDigitsNegativeLargeNumber() {
        DigitCounter digitCounter = new DigitCounter();
        int input = -123456789;
        int expected = 9;
        assertEquals(expected, digitCounter.countDigits(input));
    }
}
