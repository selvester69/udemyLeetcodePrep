package OtherProblems.Recursion.Easy;

public class Multiplication {

    public int multiply(int n, int m) {
        // edge case handle negative numbers
        if (n < 0 && m < 0) {
            return multiply(-n, -m);
        }
        if (n < 0) {
            return -multiply(-n, m);
        }
        if (m < 0) {
            return -multiply(n, -m);
        }
        // base case
        if (m == 0)
            return 0;

        // recursive case
        // calcualtions
        return n + multiply(n, m - 1);
    }
}
