package OtherProblems.Recursion.Easy;

public class GeometricSum {

    public double geometricSum(int n) {
        if (n < 0) {
            return 1.0;
        }

        // base case
        if (n == 0)
            return 1.0;

        // recursive case
        double smallAns = geometricSum(n - 1);

        return 1 / Math.pow(2, n) + smallAns;

    }

}
