package OtherProblems.Recursion.Intermediate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CheckPalindromeTest {
    CheckPalindrome checker = new CheckPalindrome();

    @Test
    public void testIsPalindromeEmptyArray() {
        int[] arr = {};
        assertTrue(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeSingleElement() {

        int[] arr = { 1 };
        assertTrue(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeTwoElementsTrue() {

        int[] arr = { 1, 1 };
        assertTrue(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeTwoElementsFalse() {

        int[] arr = { 1, 2 };
        assertFalse(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeOddLengthTrue() {

        int[] arr = { 1, 2, 1 };
        assertTrue(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeOddLengthFalse() {

        int[] arr = { 1, 2, 3 };
        assertFalse(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeEvenLengthTrue() {

        int[] arr = { 1, 2, 2, 1 };
        assertTrue(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeEvenLengthFalse() {

        int[] arr = { 1, 2, 3, 4 };
        assertFalse(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeWithNegativeNumbersTrue() {

        int[] arr = { -1, -2, -2, -1 };
        assertTrue(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeWithNegativeNumbersFalse() {

        int[] arr = { -1, -2, -3, -4 };
        assertFalse(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeMixedNumbersTrue() {

        int[] arr = { 1, -2, 3, -2, 1 };
        assertTrue(checker.isPalindrome(arr));
    }

    @Test
    public void testIsPalindromeMixedNumbersFalse() {

        int[] arr = { 1, -2, 3, 4, 5 };
        assertFalse(checker.isPalindrome(arr));
    }
}
