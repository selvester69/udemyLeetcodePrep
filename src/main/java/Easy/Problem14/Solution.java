package Easy.Problem14;

import Util.Util;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * 
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Constraints:
 * 
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */

public class Solution {

    public String longestCommonPrefix_0(String[] str) {
        if (str.length == 0)
            return "";
        else if (str.length == 1)
            return str[0];
        String op = "";
        int index = 0;
        String word = Util.getMinString(str);
        while (index < word.length()) {
            boolean isSame = true;
            for (int i = 1; i < str.length; i++) {
                if (str[i].charAt(index) != word.charAt(index)) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                op += word.charAt(index);
            } else {
                break;
            }
            index++;
        }
        return op;
    }

    // improvement
    public String longestCommonPrefix_1(String[] str) {
        String op = "";
        String minWord = Util.getMinString(str);
        for (int i = 0; i < minWord.length(); i++) {
            for (int j = 0; j < str.length; j++) {
                if (minWord.charAt(i) != str[j].charAt(i)) {
                    return op;
                }
            }
            op += minWord.charAt(i);
        }
        return op;
    }

    // improvement
    public String longestCommonPrefix_2(String[] str) {
        if (str.length == 0)
            return "";
        else if (str.length == 1)
            return str[0];
        String op = "";
        String minWord = str[0];
        for (int i = 0; i < minWord.length(); i++) {
            for (int j = 1; j < str.length; j++) {
                if (i >= str[j].length() || minWord.charAt(i) != str[j].charAt(i)) {
                    return op;
                }
            }
            op += minWord.charAt(i);
        }
        return op;
    }

    // improvement using StringBuilder
    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0)
            return "";
        else if (str.length == 1)
            return str[0];
        StringBuilder op = new StringBuilder("");
        int minLength = str[0].length();
        for (String s : str) {
            minLength = Math.min(minLength, s.length());
        }
        if (minLength == 0)
            return "";
        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < str.length; j++) {
                if (str[j].charAt(i) != str[j - 1].charAt(i)) {
                    return op.toString();
                }
            }
            op.append(str[0].charAt(i));
        }
        return op.toString();
    }

}
