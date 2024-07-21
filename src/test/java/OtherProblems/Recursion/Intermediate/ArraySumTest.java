package OtherProblems.Recursion.Intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArraySumTest {

    ArraySum arraySum = new ArraySum();

    @Test
    public void testSumArrayEmpty() {
        int[] arr = {};
        int expected = 0;
        assertEquals(expected, arraySum.sumArray(arr));
    }

    @Test
    public void testSumArraySingleElement() {

        int[] arr = { 5 };
        int expected = 5;
        assertEquals(expected, arraySum.sumArray(arr));
    }

    @Test
    public void testSumArrayTwoElements() {

        int[] arr = { 1, 2 };
        int expected = 3;
        assertEquals(expected, arraySum.sumArray(arr));
    }

    @Test
    public void testSumArrayMultipleElements() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int expected = 15;
        assertEquals(expected, arraySum.sumArray(arr));
    }

    @Test
    public void testSumArrayWithNegativeNumbers() {

        int[] arr = { -1, -2, -3, -4, -5 };
        int expected = -15;
        assertEquals(expected, arraySum.sumArray(arr));
    }

    @Test
    public void testSumArrayWithMixedNumbers() {

        int[] arr = { 1, -2, 3, -4, 5 };
        int expected = 3;
        assertEquals(expected, arraySum.sumArray(arr));
    }

    @Test
    public void testSumArrayWithAllZeros() {

        int[] arr = { 0, 0, 0, 0, 0 };
        int expected = 0;
        assertEquals(expected, arraySum.sumArray(arr));
    }

    @Test
    public void testSumArrayLargeNumbers() {

        int[] arr = { 1000000, 2000000, 3000000, 4000000, 5000000 };
        int expected = 15000000;
        assertEquals(expected, arraySum.sumArray(arr));
    }

    @Test
    public void testSumArraySingleNegativeElement() {

        int[] arr = { -5 };
        int expected = -5;
        assertEquals(expected, arraySum.sumArray(arr));
    }

    @Test
    public void testSumArrayLargeNegativeNumbers() {

        int[] arr = { -1000000, -2000000, -3000000, -4000000, -5000000 };
        int expected = -15000000;
        assertEquals(expected, arraySum.sumArray(arr));
    }
}