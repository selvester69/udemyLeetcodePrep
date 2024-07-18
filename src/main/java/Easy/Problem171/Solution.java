package Easy.Problem171;

/**
 * Given a string columnTitle that represents the column title as appears in an
 * Excel sheet, return its corresponding column number.
 * 
 * For example:
 * 
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 
 * 
 * Example 1:
 * 
 * Input: columnTitle = "A"
 * Output: 1
 * Example 2:
 * 
 * Input: columnTitle = "AB"
 * Output: 28
 * Example 3:
 * 
 * Input: columnTitle = "ZY"
 * Output: 701
 * 
 * 
 * Constraints:
 * 
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 */

public class Solution {

    // 1ms solution
    public int titleToNumber_0(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int n = s.length();
        int pow = 1;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            int index = s.charAt(i) - 64;
            if (ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else {
                ans = ans + index * pow;
                pow = pow * 26;
            }
        }
        return ans;
    }

    // 0ms solution
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result *= 26;
            result += (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
