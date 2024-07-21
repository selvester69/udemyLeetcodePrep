package OtherProblems.Recursion;

/** Print nth fibonacci number */
public class FibonacciNumber {

    public int fibonacci(int n) {
        // 1. base case
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // 2. recursive case;
        int smallOutput1 = fibonacci(n - 1);
        int smallOutput2 = fibonacci(n - 2);

        // 3. calculation
        return smallOutput1 + smallOutput2;
    }

    public static void main(String[] args) {
        System.out.println(new FibonacciNumber().fibonacci(10));
    }
}
