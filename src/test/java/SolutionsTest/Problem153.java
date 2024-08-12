package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Medium.Problem153.Solution;

public class Problem153 {

    Solution solution = new Solution();

    @Test
    public void testEmptyArray() {

        int[] nums = {};
        try {
            solution.findMin(nums);
        } catch (Exception e) {
            assertEquals("java.lang.ArrayIndexOutOfBoundsException", e.getClass().getName());
        }
    }

    @Test
    public void testSingleElement() {

        int[] nums = { 1 };
        int expected = 1;
        int result = solution.findMin(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testNoRotation() {

        int[] nums = { 1, 2, 3, 4, 5 };
        int expected = 1;
        int result = solution.findMin(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testRotation() {

        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int expected = 0;
        int result = solution.findMin(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testRotationWithMinimumAtEnd() {

        int[] nums = { 2, 3, 4, 5, 1 };
        int expected = 1;
        int result = solution.findMin(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testRotationWithMinimumAtStart() {

        int[] nums = { 3, 4, 5, 1, 2 };
        int expected = 1;
        int result = solution.findMin(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testRotationWithMinimumInMiddle() {

        int[] nums = { 4, 5, 1, 2, 3 };
        int expected = 1;
        int result = solution.findMin(nums);
        assertEquals(expected, result);
    }

}
