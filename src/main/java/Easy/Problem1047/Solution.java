package Easy.Problem1047;

import java.util.Stack;

/**
 * You are given a string s consisting of lowercase English letters. A duplicate
 * removal consists of choosing two adjacent and equal letters and removing
 * them.
 * 
 * We repeatedly make duplicate removals on s until we no longer can.
 * 
 * Return the final string after all such duplicate removals have been made. It
 * can be proven that the answer is unique.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent
 * and equal, and this is the only possible move. The result of this move is
 * that the string is "aaca", of which only "aa" is possible, so the final
 * string is "ca".
 * Example 2:
 * 
 * Input: s = "azxxzy"
 * Output: "ay"
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 */

public class Solution {

    // ====> Method 1 <====
    public String removeDuplicates_recursion(String s) {
        String s1 = "";
        while (s1.length() != s.length()) {
            s1 = s;
            s = check(s);
        }
        return s;
    }

    public String check(String s) {
        String ans = "";
        int i = 0;
        int n = s.length();
        while (i < n) {
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                // while (i < n - 1 && s.charAt(i) == s.charAt(i + 1))
            } else {
                ans += s.charAt(i);
            }
            i++;
        }
        return ans;
    }

    // ====> Method 2 using stack <====
    public String removeDuplicates_stack(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    // ====> Method 3 using stack pointer instead of actual stack <====
    public String removeDuplicates_CharArray(String s) {
        char[] charArr = s.toCharArray();
        int stackPtr = -1;
        for (int i = 0; i < charArr.length; i++) {
            if (stackPtr == -1 || charArr[i] != charArr[stackPtr]) {
                stackPtr++;
                charArr[stackPtr] = charArr[i];
            } else {
                stackPtr--;
            }
        }

        return new String(charArr, 0, stackPtr + 1);
    }
}
