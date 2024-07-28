package Easy.Problem169;

import java.util.Arrays;

/**
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. .
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * 
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * 
 * 
 * Constraints:
 * 
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 * 
 * You may assume that the majority element always exists in the array;
 */

public class Solution {

    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int el = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (el == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    el = nums[i];
                    count = 1;
                }
            }
        }
        // if given condtions that majority element is not always present, then we have
        // to count
        // final int el2 = el;
        // int count2 = (int) Arrays.stream(nums).filter(val -> val == el2).count();
        // if (count2 > (nums.length / 2))
        // return el;
        // else
        // return -1;

        // we can return the ans if we assume majority element is always present.
        return el;
    }

}
