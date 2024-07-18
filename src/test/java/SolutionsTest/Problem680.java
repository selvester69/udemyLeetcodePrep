package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Easy.Problem680.Solution;

public class Problem680 {

    Solution solution = new Solution();

    @Test
    public void testValidPalindromeWithoutDeletion() {

        String input = "aba";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testValidPalindromeWithOneDeletion() {

        String input = "abca";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testInvalidPalindrome() {

        String input = "abc";
        assertFalse(solution.validPalindrome(input));
    }

    @Test
    public void testEmptyString() {

        String input = "";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testSingleCharacter() {

        String input = "a";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testTwoIdenticalCharacters() {

        String input = "aa";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testRandomCharacters() {

        String input = "eeccccbebaeeabebccceea";
        assertFalse(solution.validPalindrome(input));
    }

    @Test
    public void testTwoDifferentCharacters() {

        String input = "ab";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testValidPalindromeWithDeletionAtBeginning() {

        String input = "abca";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testValidPalindromeWithDeletionAtEnd() {

        String input = "abac";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testLongPalindromeWithOneDeletion() {

        String input = "deeee";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testLongInvalidPalindrome() {

        String input = "abcdefg";
        assertFalse(solution.validPalindrome(input));
    }

    @Test
    public void testValidPalindromeWithMiddleDeletion() {

        String input = "racecarxracecar";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testValidPalindromeWithMultipleOptionsForDeletion() {

        String input = "abccbab";
        assertTrue(solution.validPalindrome(input));
    }

    @Test
    public void testInvalidPalindromeWithNoPossibleSingleDeletion() {

        String input = "abccd";
        assertFalse(solution.validPalindrome(input));
    }

}
