package Medium.Problem1209;

import java.util.Stack;

/**
 * You are given a string s and an integer k, a k duplicate removal consists of
 * choosing k adjacent and equal letters from s and removing them, causing the
 * left and the right side of the deleted substring to concatenate together.
 * 
 * We repeatedly make k duplicate removals on s until we no longer can.
 * 
 * Return the final string after all such duplicate removals have been made. It
 * is guaranteed that the answer is unique.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abcd", k = 2
 * Output: "abcd"
 * Explanation: There's nothing to delete.
 * Example 2:
 * 
 * Input: s = "deeedbbcccbdaa", k = 3
 * Output: "aa"
 * Explanation:
 * First delete "eee" and "ccc", get "ddbbbdaa"
 * Then delete "bbb", get "dddaa"
 * Finally delete "ddd", get "aa"
 * Example 3:
 * 
 * Input: s = "pbbcggttciiippooaais", k = 2
 * Output: "ps"
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105
 * 2 <= k <= 104
 * s only contains lowercase English letters.
 */

public class Solution {

    // =====>Method1<=======fails on one case on leetcode env==
    public String removeDuplicates_1(String s, int k) {
        Stack<Character> st = new Stack<>();
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            if (st.isEmpty() || st.peek() != ch) {
                st.push(ch);
                arr[ch - 97] = arr[ch - 97] + 1;
            } else {
                arr[ch - 97] = arr[ch - 97] + 1;
                if (arr[ch - 97] >= k) {
                    st.pop();
                    arr[ch - 97] = arr[ch - 97] - k;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            char ch = st.pop();
            while (arr[ch - 97] > 0) {
                sb.append(ch);
                arr[ch - 97] = arr[ch - 97] - 1;
            }
        }
        return sb.reverse().toString();

    }

    /**
     * InnerClass
     */
    class Pair {
        char character;
        int frequency;

        Pair(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
        }
    }

    // =====>Method2<======works on leetcode env===
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() || s.charAt(i) != st.peek().character) {
                st.push(new Pair(s.charAt(i), 1));
            } else {
                st.peek().frequency++;
                if (st.peek().frequency == k) {
                    st.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            Pair p = st.peek();
            for (int i = 0; i < p.frequency; i++) {
                sb.append(p.character);
            }
            st.pop();
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeDuplicates("yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy", 2));
    }

}
