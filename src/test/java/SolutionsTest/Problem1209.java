package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Medium.Problem1209.Solution;

public class Problem1209 {

    Solution solution = new Solution();

    @Test
    public void testEmptyString() {

        String input = "";
        int k = 2;
        String expected = "";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testNoDuplicates() {

        String input = "abcd";
        int k = 2;
        String expected = "abcd";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testSingleCharacter() {

        String input = "a";
        int k = 2;
        String expected = "a";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testAllCharactersAreDuplicates() {

        String input = "aaaa";
        int k = 2;
        String expected = "";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testMultipleAdjacentDuplicates() {

        String input = "deeedbbcccbdaa";
        int k = 3;
        String expected = "aa";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testComplexCase1() {

        String input = "pbbcggttciiippooaais";
        int k = 2;
        String expected = "ps";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testComplexCase2() {

        String input = "aabbccddeeffgg";
        int k = 2;
        String expected = "";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testStringEndsWithDuplicates() {

        String input = "abcddee";
        int k = 2;
        String expected = "abc";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testStringStartsWithDuplicates() {

        String input = "aabccba";
        int k = 2;
        String expected = "a";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testNoRemovalWhenKIsLarger() {

        String input = "aabb";
        int k = 3;
        String expected = "aabb";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testSingleRemoval() {

        String input = "aabbcc";
        int k = 2;
        String expected = "";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

    @Test
    public void testRemovalWithNestedDuplicates() {

        String input = "aaabbbcccaaa";
        int k = 3;
        String expected = "";
        assertEquals(expected, solution.removeDuplicates(input, k));
    }

}
