package OtherProblems.Recursion.Intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LastIndexElementTest {

    LastIndexElement finder = new LastIndexElement();

    @Test
    public void testFindLastIndexEmptyArray() {
        
        int[] arr = {};
        int element = 1;
        int expected = -1;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }

    @Test
    public void testFindLastIndexSingleElementFound() {
        
        int[] arr = { 1 };
        int element = 1;
        int expected = 0;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }

    @Test
    public void testFindLastIndexSingleElementNotFound() {
        
        int[] arr = { 1 };
        int element = 2;
        int expected = -1;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }

    @Test
    public void testFindLastIndexMultipleElementsFound() {
        
        int[] arr = { 1, 2, 3, 2, 5 };
        int element = 2;
        int expected = 3;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }

    @Test
    public void testFindLastIndexMultipleElementsNotFound() {
        
        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 6;
        int expected = -1;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }

    @Test
    public void testFindLastIndexFirstElement() {
        
        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 1;
        int expected = 0;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }

    @Test
    public void testFindLastIndexLastElement() {
        
        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 5;
        int expected = 4;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }

    @Test
    public void testFindLastIndexNegativeNumbersFound() {
        
        int[] arr = { -1, -2, -3, -2, -5 };
        int element = -2;
        int expected = 3;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }

    @Test
    public void testFindLastIndexNegativeNumbersNotFound() {
        
        int[] arr = { -1, -2, -3, -4, -5 };
        int element = -6;
        int expected = -1;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }

    @Test
    public void testFindLastIndexMixedNumbersFound() {
        
        int[] arr = { 1, -2, 3, -2, 5 };
        int element = -2;
        int expected = 3;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }

    @Test
    public void testFindLastIndexMixedNumbersNotFound() {
        
        int[] arr = { 1, -2, 3, -4, 5 };
        int element = 6;
        int expected = -1;
        assertEquals(expected, finder.findLastIndex(arr, element));
    }
}
