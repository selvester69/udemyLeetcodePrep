package OtherProblems.Sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    BubbleSort sorter = new BubbleSort();

    @Test
    public void testBubbleSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorter.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortSingleElement() {

        int[] arr = { 1 };
        int[] expected = { 1 };
        sorter.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortAlreadySorted() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };
        sorter.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortReverseSorted() {

        int[] arr = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };
        sorter.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortUnsortedArray() {

        int[] arr = { 4, 2, 7, 1, 3 };
        int[] expected = { 1, 2, 3, 4, 7 };
        sorter.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithDuplicates() {

        int[] arr = { 4, 2, 7, 1, 3, 2, 4 };
        int[] expected = { 1, 2, 2, 3, 4, 4, 7 };
        sorter.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithNegativeNumbers() {

        int[] arr = { 4, -2, 7, -1, 3 };
        int[] expected = { -2, -1, 3, 4, 7 };
        sorter.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithMixedNumbers() {

        int[] arr = { 0, 2, -1, 3, -3 };
        int[] expected = { -3, -1, 0, 2, 3 };
        sorter.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortAllSameNumbers() {

        int[] arr = { 2, 2, 2, 2, 2 };
        int[] expected = { 2, 2, 2, 2, 2 };
        sorter.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // ==================optimized======================
    @Test
    public void testBubbleSortOptimizedEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorter.bubbleSortOptimized(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortOptimizedSingleElement() {

        int[] arr = { 1 };
        int[] expected = { 1 };
        sorter.bubbleSortOptimized(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortOptimizedAlreadySorted() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };
        sorter.bubbleSortOptimized(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortOptimizedReverseSorted() {

        int[] arr = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };
        sorter.bubbleSortOptimized(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortOptimizedUnsortedArray() {

        int[] arr = { 4, 2, 7, 1, 3 };
        int[] expected = { 1, 2, 3, 4, 7 };
        sorter.bubbleSortOptimized(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortOptimizedWithDuplicates() {

        int[] arr = { 4, 2, 7, 1, 3, 2, 4 };
        int[] expected = { 1, 2, 2, 3, 4, 4, 7 };
        sorter.bubbleSortOptimized(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortOptimizedWithNegativeNumbers() {

        int[] arr = { 4, -2, 7, -1, 3 };
        int[] expected = { -2, -1, 3, 4, 7 };
        sorter.bubbleSortOptimized(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortOptimizedWithMixedNumbers() {

        int[] arr = { 0, 2, -1, 3, -3 };
        int[] expected = { -3, -1, 0, 2, 3 };
        sorter.bubbleSortOptimized(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortOptimizedAllSameNumbers() {

        int[] arr = { 2, 2, 2, 2, 2 };
        int[] expected = { 2, 2, 2, 2, 2 };
        sorter.bubbleSortOptimized(arr);
        assertArrayEquals(expected, arr);
    }
}
