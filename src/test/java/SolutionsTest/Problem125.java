package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Easy.Problem125.Solution;

public class Problem125 {

    Solution solution = new Solution();

    @Test
    public void testValidPalindrome() {

        String input = "A man, a plan, a canal: Panama";
        assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void testInvalidPalindrome() {

        String input = "race a car";
        assertFalse(solution.isPalindrome(input));
    }

    @Test
    public void testEmptyString() {

        String input = "";
        assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void testStringWithOnlySpaces() {

        String input = "     ";
        assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void testSingleCharacter() {

        String input = "a";
        assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void testStringWithNonAlphanumericCharacters() {

        String input = ".,";
        assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void testMixedCasePalindrome() {

        String input = "No lemon, no melon";
        assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void testPalindromeWithNumbers() {

        String input = "12321";
        assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void testInvalidPalindromeWithNumbers() {

        String input = "12345";
        assertFalse(solution.isPalindrome(input));
    }

    @Test
    public void testLongValidPalindrome() {

        String input = "Able was I ere I saw Elba";
        assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void testLongInvalidPalindrome() {

        String input = "This is not a palindrome";
        assertFalse(solution.isPalindrome(input));
    }

}
