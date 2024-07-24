package OtherProblems.Recursion.Advanced;

/**
 * this problem is diferent from leetcode problem 8 as this is a simple problem
 * for much less edge cases
 * no special character and alpha handling
 */

public class StringToInteger {

    public int convertStringToInt(String s, int n) {
        // base case
        if (n == 0)
            return 0;
        // recursive case
        int smallAns = convertStringToInt(s, n - 1);
        // calculations
        int ch = s.charAt(n - 1) - '0';
        return smallAns * 10 + ch;

    }

}
