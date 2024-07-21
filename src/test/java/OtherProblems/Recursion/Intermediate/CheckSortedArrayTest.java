package OtherProblems.Recursion.Intermediate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CheckSortedArrayTest {

    CheckSortedArray checker = new CheckSortedArray();

    @Test
    public void testArraySortedEmpty() {
        int[] arr = {};
        assertTrue(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedSingleElement() {

        int[] arr = { 1 };
        assertTrue(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedTwoElementsSorted() {

        int[] arr = { 1, 2 };
        assertTrue(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedTwoElementsUnsorted() {

        int[] arr = { 2, 1 };
        assertFalse(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedMultipleElementsSorted() {

        int[] arr = { 1, 2, 3, 4, 5 };
        assertTrue(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedMultipleElementsUnsorted() {

        int[] arr = { 1, 3, 2, 4, 5 };
        assertFalse(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedMultipleElementsWithDuplicates() {

        int[] arr = { 1, 2, 2, 3, 4 };
        assertTrue(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedDescendingOrder() {

        int[] arr = { 5, 4, 3, 2, 1 };
        assertFalse(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedAllSameElements() {

        int[] arr = { 2, 2, 2, 2, 2 };
        assertTrue(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedNegativeNumbers() {

        int[] arr = { -3, -2, -1, 0, 1 };
        assertTrue(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedMixedNumbers() {

        int[] arr = { -3, -2, -1, 0, 1, 3 };
        assertTrue(checker.isArraySorted(arr));
    }

    @Test
    public void testArraySortedMixedUnsortedNumbers() {

        int[] arr = { 1, -1, 0, 2, -2, 3 };
        assertFalse(checker.isArraySorted(arr));
    }

}
