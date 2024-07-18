package SolutionsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Easy.Problem171.Solution;

public class Problem171 {
    Solution solution = new Solution();

    @Test
    public void testSingleLetterA() {
        String input = "A";
        int expected = 1;
        assertEquals(expected, solution.titleToNumber(input));
    }

    @Test
    public void testSingleLetterZ() {

        String input = "Z";
        int expected = 26;
        assertEquals(expected, solution.titleToNumber(input));
    }

    @Test
    public void testDoubleLettersAA() {

        String input = "AA";
        int expected = 27;
        assertEquals(expected, solution.titleToNumber(input));
    }

    @Test
    public void testDoubleLettersAB() {

        String input = "AB";
        int expected = 28;
        assertEquals(expected, solution.titleToNumber(input));
    }

    @Test
    public void testTripleLettersAAA() {

        String input = "AAA";
        int expected = 703;
        assertEquals(expected, solution.titleToNumber(input));
    }

    @Test
    public void testRandomLettersAZ() {

        String input = "AZ";
        int expected = 52;
        assertEquals(expected, solution.titleToNumber(input));
    }

    @Test
    public void testRandomLettersZY() {

        String input = "ZY";
        int expected = 701;
        assertEquals(expected, solution.titleToNumber(input));
    }

    @Test
    public void testLongerColumnTitle() {

        String input = "FXSHRXW";
        int expected = 2147483647;
        assertEquals(expected, solution.titleToNumber(input));
    }

    @Test
    public void testAnotherTripleLetterAAB() {

        String input = "AAB";
        int expected = 704;
        assertEquals(expected, solution.titleToNumber(input));
    }

    @Test
    public void testEmptyString() {

        String input = "";
        int expected = 0;
        assertEquals(expected, solution.titleToNumber(input));
    }
}
