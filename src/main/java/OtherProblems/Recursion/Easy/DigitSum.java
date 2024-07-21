package OtherProblems.Recursion.Easy;

public class DigitSum {

    public int sumOfDigits(int n) {
        // edge case
        n = Math.abs(n);
        // base case
        if (n == 0)
            return 0;
        // recursive case
        int smallAns = sumOfDigits(n / 10);
        // calculations
        return n % 10 + smallAns;
    }

}
