package main.java.EasyProblems.Problem58;

/**
 * Given a string s consisting of words and spaces, return the length of the
 * last word in the string.
 * 
 * A word is a maximal
 * substring
 * consisting of non-space characters only.
 * Example 1:
 * 
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * Example 2:
 * 
 * Input: s = " fly me to the moon "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * Example 3:
 * 
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 */

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLastWord("Python"));
        System.out.println(sol.lengthOfLastWord("   This   is   a   test  "));
        System.out.println(sol.lengthOfLastWord("cat   "));
        System.out.println(sol.lengthOfLastWord("a"));
        System.out.println(sol.lengthOfLastWord("       "));
        System.out.println(sol.lengthOfLastWord("    Test     "));
        System.out.println(sol.lengthOfLastWord("  Hello World        "));
        System.out.println(sol.lengthOfLastWord("Test"));
    }

    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean space = false;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                space = true;
            } else if (s.charAt(i) != ' ' && space) {
                count = 1;
                space = false;
            } else {
                count++;
            }
            i++;
        }
        return count;
    }

    public int lengthOfLastWord_0(String s) {
        int count = 0;
        int i = 0, n = s.length();
        while (i < n) {
            if (s.charAt(i) != ' ') {
                count++;
                i++;
            } else {
                while (i < n && s.charAt(i) == ' ')
                    i++;
                if (i == n) {
                    return count;
                } else {
                    count = 0;
                }
            }
        }
        return count;

    }

}
