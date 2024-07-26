package OtherProblems.Sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import OtherProblems.Sorting.SelectionSort;

public class TestSelectionSort {

    SelectionSort sorter = new SelectionSort();

    @Test
    public void testSelectionSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorter.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortSingleElement() {

        int[] arr = { 1 };
        int[] expected = { 1 };
        sorter.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortAlreadySorted() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };
        sorter.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortReverseSorted() {

        int[] arr = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };
        sorter.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortUnsortedArray() {

        int[] arr = { 4, 2, 7, 1, 3 };
        int[] expected = { 1, 2, 3, 4, 7 };
        sorter.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortWithDuplicates() {

        int[] arr = { 4, 2, 7, 1, 3, 2, 4 };
        int[] expected = { 1, 2, 2, 3, 4, 4, 7 };
        sorter.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortWithNegativeNumbers() {

        int[] arr = { 4, -2, 7, -1, 3 };
        int[] expected = { -2, -1, 3, 4, 7 };
        sorter.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortWithMixedNumbers() {

        int[] arr = { 0, 2, -1, 3, -3 };
        int[] expected = { -3, -1, 0, 2, 3 };
        sorter.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortAllSameNumbers() {

        int[] arr = { 2, 2, 2, 2, 2 };
        int[] expected = { 2, 2, 2, 2, 2 };
        sorter.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }
}
