package OtherProblems.Sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestMergeSort {

    MergeSort sorter = new MergeSort();

    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorter.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortSingleElement() {

        int[] arr = { 1 };
        int[] expected = { 1 };
        sorter.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortAlreadySorted() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };
        sorter.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortReverseSorted() {

        int[] arr = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };
        sorter.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortUnsortedArray() {

        int[] arr = { 4, 2, 7, 1, 3 };
        int[] expected = { 1, 2, 3, 4, 7 };
        sorter.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithDuplicates() {

        int[] arr = { 4, 2, 7, 1, 3, 2, 4 };
        int[] expected = { 1, 2, 2, 3, 4, 4, 7 };
        sorter.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithNegativeNumbers() {

        int[] arr = { 4, -2, 7, -1, 3 };
        int[] expected = { -2, -1, 3, 4, 7 };
        sorter.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithMixedNumbers() {

        int[] arr = { 0, 2, -1, 3, -3 };
        int[] expected = { -3, -1, 0, 2, 3 };
        sorter.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortAllSameNumbers() {

        int[] arr = { 2, 2, 2, 2, 2 };
        int[] expected = { 2, 2, 2, 2, 2 };
        sorter.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

}
