package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Easy.Problem1047.Solution;

public class Problem1047 {

    Solution solution = new Solution();

    @Test
    public void testEmptyString_usingRecursion() {

        String input = "";
        String expected = "";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testNoDuplicates_usingRecursion() {

        String input = "abc";
        String expected = "abc";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testSingleCharacter_usingRecursion() {

        String input = "a";
        String expected = "a";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testAdjacentDuplicates_usingRecursion() {

        String input = "abbaca";
        String expected = "ca";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testMultipleAdjacentDuplicates_usingRecursion() {

        String input = "azxxzy";
        String expected = "ay";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testAllCharactersAreDuplicates_usingRecursion() {

        String input = "aaaa";
        String expected = "";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testComplexCase1_usingRecursion() {

        String input = "abbcccbba";
        String expected = "aca";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testComplexCase2_usingRecursion() {

        String input = "abccba";
        String expected = "";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testSinglePairOfAdjacentDuplicates_usingRecursion() {

        String input = "aabb";
        String expected = "";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testStringWithNoRemovals_usingRecursion() {

        String input = "abcdefg";
        String expected = "abcdefg";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testStringEndsWithDuplicates_usingRecursion() {

        String input = "abcddee";
        String expected = "abc";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    @Test
    public void testStringStartsWithDuplicates_usingRecursion() {

        String input = "aabccba";
        String expected = "a";
        assertEquals(expected, solution.removeDuplicates_recursion(input));
    }

    // ==============================> Using stack <=======================

    @Test
    public void testEmptyString() {

        String input = "";
        String expected = "";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testNoDuplicates() {

        String input = "abc";
        String expected = "abc";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testSingleCharacter() {

        String input = "a";
        String expected = "a";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testAdjacentDuplicates() {

        String input = "abbaca";
        String expected = "ca";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testMultipleAdjacentDuplicates() {

        String input = "azxxzy";
        String expected = "ay";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testAllCharactersAreDuplicates() {

        String input = "aaaaaaaaa";
        String expected = "a";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testComplexCase1() {

        String input = "abbcccbba";
        String expected = "aca";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testComplexCase2() {

        String input = "abccba";
        String expected = "";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testSinglePairOfAdjacentDuplicates() {

        String input = "aabb";
        String expected = "";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testStringWithNoRemovals() {

        String input = "abcdefg";
        String expected = "abcdefg";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testStringEndsWithDuplicates() {

        String input = "abcddee";
        String expected = "abc";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

    @Test
    public void testStringStartsWithDuplicates() {

        String input = "aabccba";
        String expected = "a";
        assertEquals(expected, solution.removeDuplicates_stack(input));
    }

}
