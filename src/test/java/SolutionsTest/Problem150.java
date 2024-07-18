package test.java.SolutionsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.Medium.Problem150.Solution;

public class Problem150 {

    Solution solution = new Solution();

    @Test
    public void testSingleNumber() {

        String[] tokens = { "3" };
        int expected = 3;
        assertEquals(expected, solution.evalRPN(tokens));
    }

    @Test
    public void testAddition() {

        String[] tokens = { "2", "1", "+" };
        int expected = 3;
        assertEquals(expected, solution.evalRPN(tokens));
    }

    @Test
    public void testSubtraction() {

        String[] tokens = { "4", "13", "5", "/", "-" };
        int expected = 2;
        assertEquals(expected, solution.evalRPN(tokens));
    }

    @Test
    public void testMultiplication() {

        String[] tokens = { "2", "3", "*" };
        int expected = 6;
        assertEquals(expected, solution.evalRPN(tokens));
    }

    @Test
    public void testDivision() {

        String[] tokens = { "6", "3", "/" };
        int expected = 2;
        assertEquals(expected, solution.evalRPN(tokens));
    }

    @Test
    public void testComplexExpression1() {

        String[] tokens = { "2", "1", "+", "3", "*" };
        int expected = 9;
        assertEquals(expected, solution.evalRPN(tokens));
    }

    @Test
    public void testComplexExpression2() {

        String[] tokens = { "4", "13", "5", "/", "+" };
        int expected = 6;
        assertEquals(expected, solution.evalRPN(tokens));
    }

    @Test
    public void testComplexExpression3() {

        String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        int expected = 22;
        assertEquals(expected, solution.evalRPN(tokens));
    }

    @Test
    public void testNegativeNumbers() {

        String[] tokens = { "-2", "1", "+", "3", "*" };
        int expected = -3;
        assertEquals(expected, solution.evalRPN(tokens));
    }

    @Test
    public void testDivisionByNegativeNumber() {

        String[] tokens = { "6", "-3", "/" };
        int expected = -2;
        assertEquals(expected, solution.evalRPN(tokens));
    }
}
