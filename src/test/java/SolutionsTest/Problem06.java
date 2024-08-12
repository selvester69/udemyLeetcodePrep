package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Medium.Problem06.Solution;

public class Problem06 {

    Solution solution = new Solution();

    @Test
    public void testSingleRow() {

        String s = "PAYPALISHIRING";
        int numRows = 1;
        String expected = "PAYPALISHIRING";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testTwoRows() {

        String s = "PAYPALISHIRING";
        int numRows = 2;
        String expected = "PYAIHRNAPLSIIG";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testThreeRows() {

        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testFourRows() {

        String s = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyString() {

        String s = "";
        int numRows = 3;
        String expected = "";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleCharacter() {

        String s = "A";
        int numRows = 2;
        String expected = "A";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testNumRowsGreaterThanStringLength() {

        String s = "AB";
        int numRows = 5;
        String expected = "AB";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testNumRowsEqualToStringLength() {

        String s = "ABCD";
        int numRows = 4;
        String expected = "ABCD";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testSpecialCharacters() {

        String s = "A!B@C#D$E%F^G&H*";
        int numRows = 3;
        String expected = "A@C%E&G!B#D$F^H*";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

}
