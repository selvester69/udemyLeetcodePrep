package OtherProblems.Recursion;

public class NumberPrinter {

    public void printNumbers(int n) {
        // base case
        if (n <= 0)
            return;
        // recursive case
        printNumbers(n - 1);
        // calculation
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.println();
        new NumberPrinter().printNumbers(10);
    }
}
