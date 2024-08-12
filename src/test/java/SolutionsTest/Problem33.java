package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Medium.Problem33.Solution;

public class Problem33 {

    Solution solution = new Solution();

    @Test
    public void testEmptyArray() {

        int[] nums = {};
        int target = 5;
        int expected = -1;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleElementFound() {

        int[] nums = { 5 };
        int target = 5;
        int expected = 0;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleElementNotFound() {

        int[] nums = { 5 };
        int target = 3;
        int expected = -1;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testMultipleElementsTargetFound() {

        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int expected = 4;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testMultipleElementsTargetNotFound() {

        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 3;
        int expected = -1;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testTargetAtStart() {

        int[] nums = { 6, 7, 0, 1, 2, 4, 5 };
        int target = 6;
        int expected = 0;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testTargetAtEnd() {

        int[] nums = { 6, 7, 0, 1, 2, 4, 5 };
        int target = 5;
        int expected = 6;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testTargetInMiddle() {

        int[] nums = { 6, 7, 0, 1, 2, 4, 5 };
        int target = 1;
        int expected = 3;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testNoRotation() {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 4;
        int expected = 3;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testRotationWithDuplicates() {

        int[] nums = { 2, 2, 2, 3, 4, 2, 2 };
        int target = 3;
        int expected = 3;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

}
