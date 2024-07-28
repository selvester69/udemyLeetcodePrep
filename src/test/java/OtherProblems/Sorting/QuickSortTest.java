package OtherProblems.Sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class QuickSortTest {

    QuickSort sorter = new QuickSort();

    @Test
    public void testQuickSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorter.quickSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortSingleElement() {

        int[] arr = { 1 };
        int[] expected = { 1 };
        sorter.quickSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortAlreadySorted() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };
        sorter.quickSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortReverseSorted() {

        int[] arr = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };
        sorter.quickSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortUnsortedArray() {

        int[] arr = { 4, 2, 7, 1, 3 };
        int[] expected = { 1, 2, 3, 4, 7 };
        sorter.quickSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortWithDuplicates() {

        int[] arr = { 4, 2, 7, 1, 3, 2, 4 };
        int[] expected = { 1, 2, 2, 3, 4, 4, 7 };
        sorter.quickSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortWithNegativeNumbers() {

        int[] arr = { 4, -2, 7, -1, 3 };
        int[] expected = { -2, -1, 3, 4, 7 };
        sorter.quickSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortWithMixedNumbers() {

        int[] arr = { 0, 2, -1, 3, -3 };
        int[] expected = { -3, -1, 0, 2, 3 };
        sorter.quickSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortAllSameNumbers() {

        int[] arr = { 2, 2, 2, 2, 2 };
        int[] expected = { 2, 2, 2, 2, 2 };
        sorter.quickSort(arr);
        assertArrayEquals(expected, arr);
    }

}
