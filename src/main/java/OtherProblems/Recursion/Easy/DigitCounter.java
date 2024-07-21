package OtherProblems.Recursion.Easy;

//count number of digits in a number 
public class DigitCounter {

    public int countDigits(int n) {
        // edge case
        n = Math.abs(n);
        // base case
        if (n == 0)
            return 1;
        if (n < 10)
            return 1;

        // recursive case
        int smallAns = countDigits(n / 10);
        // calculations
        return 1 + smallAns;
    }

}
