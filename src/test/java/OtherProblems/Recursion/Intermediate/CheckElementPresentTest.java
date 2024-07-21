package OtherProblems.Recursion.Intermediate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CheckElementPresentTest {

    CheckElementPresent checker = new CheckElementPresent();

    @Test
    public void testElementPresentInEmptyArray() {
        int[] arr = {};
        int element = 1;
        assertFalse(checker.isElementPresent(arr, element));
    }

    @Test
    public void testElementPresentSingleElementFound() {

        int[] arr = { 1 };
        int element = 1;
        assertTrue(checker.isElementPresent(arr, element));
    }

    @Test
    public void testElementPresentSingleElementNotFound() {

        int[] arr = { 1 };
        int element = 2;
        assertFalse(checker.isElementPresent(arr, element));
    }

    @Test
    public void testElementPresentMultipleElementsFound() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 3;
        assertTrue(checker.isElementPresent(arr, element));
    }

    @Test
    public void testElementPresentMultipleElementsNotFound() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 6;
        assertFalse(checker.isElementPresent(arr, element));
    }

    @Test
    public void testElementPresentFirstElement() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 1;
        assertTrue(checker.isElementPresent(arr, element));
    }

    @Test
    public void testElementPresentLastElement() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 5;
        assertTrue(checker.isElementPresent(arr, element));
    }

    @Test
    public void testElementPresentNegativeNumbersFound() {

        int[] arr = { -1, -2, -3, -4, -5 };
        int element = -3;
        assertTrue(checker.isElementPresent(arr, element));
    }

    @Test
    public void testElementPresentNegativeNumbersNotFound() {

        int[] arr = { -1, -2, -3, -4, -5 };
        int element = -6;
        assertFalse(checker.isElementPresent(arr, element));
    }

    @Test
    public void testElementPresentMixedNumbersFound() {

        int[] arr = { 1, -2, 3, -4, 5 };
        int element = -2;
        assertTrue(checker.isElementPresent(arr, element));
    }

    @Test
    public void testElementPresentMixedNumbersNotFound() {

        int[] arr = { 1, -2, 3, -4, 5 };
        int element = 6;
        assertFalse(checker.isElementPresent(arr, element));
    }
}
