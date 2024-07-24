package OtherProblems.Recursion.Advanced;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConsecutiveDuplicateRemoverTest {

    RemoveConsecutiveDuplicates remover = new RemoveConsecutiveDuplicates();

    @Test
    public void testRemoveConsecutiveDuplicatesEmptyString() {
        String str = "";
        String expected = "";
        assertEquals(expected, remover.removeDuplicates(str.toCharArray()));
    }

    @Test
    public void testRemoveConsecutiveDuplicatesSingleCharacter() {

        String str = "a";
        String expected = "a";
        assertEquals(expected, remover.removeDuplicates(str.toCharArray()));
    }

    @Test
    public void testRemoveConsecutiveDuplicatesNoDuplicates() {

        String str = "abc";
        String expected = "abc";
        assertEquals(expected, remover.removeDuplicates(str.toCharArray()));
    }

    @Test
    public void testRemoveConsecutiveDuplicatesAllDuplicates() {

        String str = "aaa";
        String expected = "a";
        assertEquals(expected, remover.removeDuplicates(str.toCharArray()));
    }

    @Test
    public void testRemoveConsecutiveDuplicatesMixed() {

        String str = "aabbcc";
        String expected = "abc";
        assertEquals(expected, remover.removeDuplicates(str.toCharArray()));
    }

    @Test
    public void testRemoveConsecutiveDuplicatesWithSpaces() {

        String str = "aa bb cc";
        String expected = "a b c";
        assertEquals(expected, remover.removeDuplicates(str.toCharArray()));
    }

    @Test
    public void testRemoveConsecutiveDuplicatesComplex() {

        String str = "abccba";
        String expected = "abcba";
        assertEquals(expected, remover.removeDuplicates(str.toCharArray()));
    }

    @Test
    public void testRemoveConsecutiveDuplicatesNumbers() {

        String str = "112233";
        String expected = "123";
        assertEquals(expected, remover.removeDuplicates(str.toCharArray()));
    }

    @Test
    public void testRemoveConsecutiveDuplicatesMixedNumbersAndLetters() {

        String str = "a1a1b2b2";
        String expected = "a1a1b2b2";
        assertEquals(expected, remover.removeDuplicates(str.toCharArray()));
    }

    @Test
    public void testRemoveConsecutiveDuplicatesSymbols() {

        String str = "!!@@##";
        String expected = "!@#";
        assertEquals(expected, remover.removeDuplicates(str.toCharArray()));
    }
}
