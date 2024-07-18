package test.java.SolutionsTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import main.java.Easy.Problem344.*;

public class Problem344 {
    Solution solution = new Solution();

    @Test
    public void testMultipleCharacters() {

        char[] input = { 'h', 'e', 'l', 'l', 'o' };
        char[] expected = { 'o', 'l', 'l', 'e', 'h' };
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleCharacter() {

        char[] input = { 'a' };
        char[] expected = { 'a' };
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEvenNumberOfCharacters() {

        char[] input = { 'A', 'B', 'C', 'D' };
        char[] expected = { 'D', 'C', 'B', 'A' };
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testOddNumberOfCharacters() {

        char[] input = { '1', '2', '3', '4', '5' };
        char[] expected = { '5', '4', '3', '2', '1' };
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testCharactersWithSpaces() {

        char[] input = { ' ', 'a', ' ', 'b', ' ' };
        char[] expected = { ' ', 'b', ' ', 'a', ' ' };
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEmptyArray() {

        char[] input = {};
        char[] expected = {};
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testPalindromicString() {

        char[] input = { 'r', 'a', 'c', 'e', 'c', 'a', 'r' };
        char[] expected = { 'r', 'a', 'c', 'e', 'c', 'a', 'r' };
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testNumbersAndLetters() {

        char[] input = { '1', 'a', '2', 'b', '3' };
        char[] expected = { '3', 'b', '2', 'a', '1' };
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSpecialCharacters() {

        char[] input = { '!', '@', '#', '$', '%' };
        char[] expected = { '%', '$', '#', '@', '!' };
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }
}
