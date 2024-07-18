package Easy.Problem125;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 * 
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric
 * characters.
 * Since an empty string reads the same forward and backward, it is a
 * palindrome.
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */

public class Solution {

    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        int start = 0;
        int end = s.length() - 1;
        s = s.toUpperCase();
        while (start < end) {
            if (!((s.charAt(start) >= 'A' && s.charAt(start) <= 'Z')
                    || (s.charAt(start) >= '0' && s.charAt(start) <= '9'))) {
                start++;
                continue;
            }
            if (!((s.charAt(end) >= 'A' && s.charAt(end) <= 'Z') || (s.charAt(end) >= '0' && s.charAt(end) <= '9'))) {
                end--;
                continue;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println((int) '9');
    }
}
