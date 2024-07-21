package OtherProblems.Recursion.Intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FirstIndexElementTest {

    FirstIndexElement firstIndexElement = new FirstIndexElement();

    @Test
    void testElementAtBeginning() {
        int[] arr = { 5, 3, 2, 1, 4 };
        int x = 5;
        int expectedIndex = 0;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testElementInMiddle() {
        int[] arr = { 5, 3, 2, 1, 4 };
        int x = 2;
        int expectedIndex = 2;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testElementAtEnd() {
        int[] arr = { 5, 3, 2, 1, 4 };
        int x = 4;
        int expectedIndex = 4;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testElementNotPresent() {
        int[] arr = { 5, 3, 2, 1, 4 };
        int x = 6;
        int expectedIndex = -1;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int x = 5;
        int expectedIndex = -1;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testMultipleOccurrences() {
        int[] arr = { 5, 3, 5, 1, 5 };
        int x = 5;
        int expectedIndex = 0;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testAllElementsAreTarget() {
        int[] arr = { 7, 7, 7, 7, 7 };
        int x = 7;
        int expectedIndex = 0;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testSingleElementArrayMatching() {
        int[] arr = { 10 };
        int x = 10;
        int expectedIndex = 0;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testSingleElementArrayNonMatching() {
        int[] arr = { 10 };
        int x = 5;
        int expectedIndex = -1;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testLargeArrayTargetAtEnd() {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i;
        }
        arr[arr.length - 1] = 9999;
        int x = 9999;
        int expectedIndex = arr.length - 1;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testLargeArrayTargetInMiddle() {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int x = 5000;
        int expectedIndex = 5000;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

    @Test
    void testArrayWithNegativeNumbers() {
        int[] arr = { -5, -3, -2, -1, -4 };
        int x = -2;
        int expectedIndex = 2;
        assertEquals(expectedIndex, firstIndexElement.findFirstIndex(arr, x));
    }

}
