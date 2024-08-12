package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Easy.Problem136.Solution;

public class Problem136 {

    Solution solution = new Solution();

    @Test
    public void testSingleElement() {

        int[] nums = { 1 };
        int expected = 1;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testTwoElements() {

        int[] nums = { 2, 1, 2 };
        int expected = 1;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMultipleElements() {

        int[] nums = { 4, 1, 2, 1, 2 };
        int expected = 4;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testNegativeNumbers() {

        int[] nums = { -1, -2, -1, -3, -2 };
        int expected = -3;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMixedNumbers() {

        int[] nums = { 3, 3, 2, 2, 1 };
        int expected = 1;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testLargeNumbers() {

        int[] nums = { 100000, 100001, 100000, 100002, 100001 };
        int expected = 100002;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testAllNegativeNumbers() {

        int[] nums = { -3, -3, -2, -2, -1 };
        int expected = -1;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testZerosAndOnes() {

        int[] nums = { 0, 1, 0 };
        int expected = 1;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleNegativeNumber() {

        int[] nums = { -42 };
        int expected = -42;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }

}
