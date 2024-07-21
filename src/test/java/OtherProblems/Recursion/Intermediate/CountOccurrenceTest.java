package OtherProblems.Recursion.Intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountOccurrenceTest {
    CountOccurrence counter = new CountOccurrence();

    @Test
    public void testCountOccurrencesEmptyArray() {
        int[] arr = {};
        int element = 1;
        int expected = 0;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

    @Test
    public void testCountOccurrencesSingleElementFound() {

        int[] arr = { 1 };
        int element = 1;
        int expected = 1;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

    @Test
    public void testCountOccurrencesSingleElementNotFound() {

        int[] arr = { 1 };
        int element = 2;
        int expected = 0;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

    @Test
    public void testCountOccurrencesMultipleElementsFound() {

        int[] arr = { 1, 2, 3, 2, 5 };
        int element = 2;
        int expected = 2;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

    @Test
    public void testCountOccurrencesMultipleElementsNotFound() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 6;
        int expected = 0;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

    @Test
    public void testCountOccurrencesFirstElement() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 1;
        int expected = 1;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

    @Test
    public void testCountOccurrencesLastElement() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 5;
        int expected = 1;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

    @Test
    public void testCountOccurrencesNegativeNumbersFound() {

        int[] arr = { -1, -2, -3, -2, -5 };
        int element = -2;
        int expected = 2;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

    @Test
    public void testCountOccurrencesNegativeNumbersNotFound() {

        int[] arr = { -1, -2, -3, -4, -5 };
        int element = -6;
        int expected = 0;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

    @Test
    public void testCountOccurrencesMixedNumbersFound() {

        int[] arr = { 1, -2, 3, -2, 5 };
        int element = -2;
        int expected = 2;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

    @Test
    public void testCountOccurrencesMixedNumbersNotFound() {

        int[] arr = { 1, -2, 3, -4, 5 };
        int element = 6;
        int expected = 0;
        assertEquals(expected, counter.countOccurrences(arr, element));
    }

}
