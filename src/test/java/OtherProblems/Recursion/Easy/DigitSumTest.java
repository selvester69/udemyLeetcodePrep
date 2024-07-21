package OtherProblems.Recursion.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import OtherProblems.Recursion.Easy.DigitSum;

public class DigitSumTest {

    DigitSum digitSum = new DigitSum();

    @Test
    public void testSumOfDigitsZero() {
        int input = 0;
        int expected = 0;
        assertEquals(expected, digitSum.sumOfDigits(input));
    }

    @Test
    public void testSumOfDigitsSingleDigitPositive() {

        int input = 7;
        int expected = 7;
        assertEquals(expected, digitSum.sumOfDigits(input));
    }

    @Test
    public void testSumOfDigitsSingleDigitNegative() {

        int input = -3;
        int expected = 3;
        assertEquals(expected, digitSum.sumOfDigits(input));
    }

    @Test
    public void testSumOfDigitsMultipleDigitsPositive() {

        int input = 12345;
        int expected = 15;
        assertEquals(expected, digitSum.sumOfDigits(input));
    }

    @Test
    public void testSumOfDigitsMultipleDigitsNegative() {

        int input = -9876;
        int expected = 30;
        assertEquals(expected, digitSum.sumOfDigits(input));
    }

    @Test
    public void testSumOfDigitsLargeNumber() {

        int input = 1234567890;
        int expected = 45;
        assertEquals(expected, digitSum.sumOfDigits(input));
    }

    @Test
    public void testSumOfDigitsNegativeLargeNumber() {

        int input = -123456789;
        int expected = 45;
        assertEquals(expected, digitSum.sumOfDigits(input));
    }

    @Test
    public void testSumOfDigitsAllZeros() {

        int input = 1000;
        int expected = 1;
        assertEquals(expected, digitSum.sumOfDigits(input));
    }

    @Test
    public void testSumOfDigitsAllNines() {

        int input = 9999;
        int expected = 36;
        assertEquals(expected, digitSum.sumOfDigits(input));
    }
}