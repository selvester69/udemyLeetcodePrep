package Medium.Problem34;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value.
 * 
 * If target is not found in the array, return [-1, -1].
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 * 
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 * 
 * 
 * Constraints:
 * 
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 */

// Problem describes descending order of sorting and log n time complexity.

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        // brute force
        // return bruteforce(nums, target);

        // optimized:
        int[] res = new int[] { -1, -1 };
        res[0] = search(nums, target, true);
        if (res[0] == -1)
            return res;
        res[1] = search(nums, target, false);
        return res;
    }

    public int search(int nums[], int target, boolean first) {
        // write code for binary search
        int start = 0, end = nums.length - 1;

        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // target is equal to mid
                ans = mid;
                if (first) {// search for first index in lower section
                    end = mid - 1;
                } else { // search for last index in upper section
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    public int[] bruteforce(int[] nums, int target) {
        // linear search
        // Time Complexity: O(n)
        // Auxiliary Space: O(1)
        int[] res = new int[] { -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (res[0] == -1) {
                    res[0] = i;
                }
                res[1] = i;
            }
        }
        return res;
    }
}
