package main.test.Problem58;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.Problem58.Solution58;

public class SolutionTest {
    Solution58 solution = new Solution58();

    @Test
    public void testMultipleWords_0() {
        assertEquals(5, solution.lengthOfLastWord_0("Hello World"));
    }

    @Test
    public void testSingleWordNoSpaces_0() {
        assertEquals(4, solution.lengthOfLastWord_0("Test"));
    }

    @Test
    public void testTrailingSpaces_0() {
        assertEquals(5, solution.lengthOfLastWord_0("Hello World   "));
    }

    @Test
    public void testSingleWordWithSpaces_0() {
        assertEquals(4, solution.lengthOfLastWord_0("  Test  "));
    }

    @Test
    public void testOnlySpaces_0() {
        assertEquals(0, solution.lengthOfLastWord_0("      "));
    }

    @Test
    public void testEmptyString_0() {
        assertEquals(0, solution.lengthOfLastWord_0(""));
    }

    @Test
    public void testSingleLetterWord_0() {
        assertEquals(1, solution.lengthOfLastWord_0("a"));
    }

    @Test
    public void testLastWordAtBeginning_0() {
        assertEquals(3, solution.lengthOfLastWord_0("cat   "));
    }

    @Test
    public void testMultipleSpacesBetweenWords_0() {
        assertEquals(4, solution.lengthOfLastWord_0("   This   is   a   test  "));
    }

    @Test
    public void testSingleWordNoSpacesVaryingCharacters_0() {
        assertEquals(6, solution.lengthOfLastWord_0("Python"));
    }

    //// ===========method 2==========////

    @Test
    public void testMultipleWords() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    public void testSingleWordNoSpaces() {
        assertEquals(4, solution.lengthOfLastWord("Test"));
    }

    @Test
    public void testTrailingSpaces() {
        assertEquals(5, solution.lengthOfLastWord("Hello World   "));
    }

    @Test
    public void testSingleWordWithSpaces() {
        assertEquals(4, solution.lengthOfLastWord("  Test  "));
    }

    @Test
    public void testOnlySpaces() {
        assertEquals(0, solution.lengthOfLastWord("      "));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, solution.lengthOfLastWord(""));
    }

    @Test
    public void testSingleLetterWord() {
        assertEquals(1, solution.lengthOfLastWord("a"));
    }

    @Test
    public void testLastWordAtBeginning() {
        assertEquals(3, solution.lengthOfLastWord("cat   "));
    }

    @Test
    public void testMultipleSpacesBetweenWords() {
        assertEquals(4, solution.lengthOfLastWord("   This   is   a   test  "));
    }

    @Test
    public void testSingleWordNoSpacesVaryingCharacters() {
        assertEquals(6, solution.lengthOfLastWord("Python"));
    }

}
