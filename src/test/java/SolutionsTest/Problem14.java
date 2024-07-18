package test.java.SolutionsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.java.Easy.Problem14.Solution;

public class Problem14 {

    Solution solution = new Solution();

    @Test
    public void testCommonPrefix() {
        String[] input = { "flower", "flow", "flight" };
        String expected = "fl";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testNoCommonPrefix() {

        String[] input = { "dog", "racecar", "car" };
        String expected = "";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testSingleString() {

        String[] input = { "single" };
        String expected = "single";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testEmptyArray() {

        String[] input = {};
        String expected = "";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testIdenticalStrings() {

        String[] input = { "test", "test", "test" };
        String expected = "test";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testPrefixInFirstStringOnly() {

        String[] input = { "prefix", "suffix", "affix" };
        String expected = "";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testMixedLengthStrings() {

        String[] input = { "short", "shorter", "shortest" };
        String expected = "short";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testEmptyStrings() {

        String[] input = { "", "", "" };
        String expected = "";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testCommonPrefixWithSpace() {

        String[] input = { "hello world", "hello there", "hello everyone" };
        String expected = "hello ";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testNoCommonPrefixDueToCase() {

        String[] input = { "case", "Case", "cases" };
        String expected = "";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testNoCommonPrefixDueToCase_1() {

        String[] input = { "ab", "a" };
        String expected = "a";
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

}
