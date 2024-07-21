package OtherProblems.Recursion;

public class Power {

    public int power(int x, int n) {
        // edge case
        if (n < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        // 1. base case
        if (n == 0)
            return 1;
        // 2. recursive case
        int smallOutput = power(x, n - 1);
        // 3. calculations
        return x * smallOutput;
    }

    public static void main(String[] args) {
        System.out.println(new Power().power(5, 3));
    }

}
