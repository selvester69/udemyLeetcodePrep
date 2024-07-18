package Easy.Problem680;

public class Solution {

    // O(N^2) //Time exceeded in leetcode
    public boolean validPalindrome_bruteForce(String s) {
        if (s == null || s.length() == 0 || s.length() == 1)
            return true;
        boolean isValid = false;
        if (!isPalindrome(s)) {
            for (int i = 0; i < s.length(); i++) {
                isValid = isValid || isPalindrome(s.substring(0, i) + s.substring(i + 1));
                if (isValid) {
                    break;
                }
            }
        } else {
            return true;
        }
        return isValid;
    }

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return isValid(s, start + 1, end) || isValid(s, start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isValid(String s, int start, int end) {

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "helleh";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, i) + s.substring(i + 1));
        }
    }

}

// ee cccc bebaeeabeb ccc ee a