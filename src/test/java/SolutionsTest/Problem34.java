package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Medium.Problem34.Solution;

public class Problem34 {

    Solution solution = new Solution();

    @Test
    public void testEmptyArray() {

        int[] nums = {};
        int target = 0;
        int[] expected = { -1, -1 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSingleElementFound() {

        int[] nums = { 5 };
        int target = 5;
        int[] expected = { 0, 0 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSingleElementNotFound() {

        int[] nums = { 5 };
        int target = 3;
        int[] expected = { -1, -1 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMultipleElementsFound() {

        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] expected = { 3, 4 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMultipleElementsNotFound() {

        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 6;
        int[] expected = { -1, -1 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTargetAtStart() {

        int[] nums = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 1;
        int[] expected = { 0, 0 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTargetAtEnd() {

        int[] nums = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 5;
        int[] expected = { 6, 6 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAllElementsSameAsTarget() {

        int[] nums = { 2, 2, 2, 2, 2 };
        int target = 2;
        int[] expected = { 0, 4 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMixedNegativeNumbers() {

        int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2 };
        int target = -3;
        int[] expected = { 2, 2 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

}
