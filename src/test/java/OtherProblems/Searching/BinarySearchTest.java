package OtherProblems.Searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    BinarySearch bs = new BinarySearch();

    @Test
    public void testBinarySearchEmptyArray() {
        int[] arr = {};
        int target = 5;
        int expected = -1;
        int result = bs.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchSingleElementFound() {

        int[] arr = { 5 };
        int target = 5;
        int expected = 0;
        int result = bs.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchSingleElementNotFound() {

        int[] arr = { 5 };
        int target = 3;
        int expected = -1;
        int result = bs.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchMultipleElementsFound() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int expected = 2;
        int result = bs.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchMultipleElementsNotFound() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 6;
        int expected = -1;
        int result = bs.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchTargetAtStart() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 1;
        int expected = 0;
        int result = bs.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchTargetAtEnd() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 5;
        int expected = 4;
        int result = bs.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchNegativeNumbers() {

        int[] arr = { -5, -4, -3, -2, -1 };
        int target = -3;
        int expected = 2;
        int result = bs.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchMixedNumbers() {

        int[] arr = { -3, -1, 0, 2, 4, 6 };
        int target = 0;
        int expected = 2;
        int result = bs.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchDuplicates() {

        int[] arr = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 2;
        int expected = 3; // or 2 or 1, any valid index is acceptable
        int result = bs.binarySearch(arr, target);
        assertEquals(expected, result);
    }

}
