package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Easy.Problem169.Solution;

public class Problem169 {

    Solution solution = new Solution();

    @Test
    public void testMajorityElementSingleElement() {

        int[] nums = { 1 };
        int expected = 1;
        int result = solution.majorityElement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElementAllSame() {

        int[] nums = { 2, 2, 2, 2, 2 };
        int expected = 2;
        int result = solution.majorityElement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElementSimpleCase() {

        int[] nums = { 3, 2, 3 };
        int expected = 3;
        int result = solution.majorityElement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElementWithNegativeNumbers() {

        int[] nums = { -1, -1, -1, 2, 2 };
        int expected = -1;
        int result = solution.majorityElement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElementComplexCase() {

        int[] nums = { 1, 1, 2, 2, 1, 1, 2, 2, 1 };
        int expected = 1;
        int result = solution.majorityElement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElementMixedNumbers() {

        int[] nums = { 0, 1, 0, 1, 0 };
        int expected = 0;
        int result = solution.majorityElement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElementEdgeCase() {

        int[] nums = { 5, 5, 5, 5, 6, 6, 5 };
        int expected = 5;
        int result = solution.majorityElement(nums);
        assertEquals(expected, result);
    }

}
