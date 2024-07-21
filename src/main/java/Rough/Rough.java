package Rough;

public class Rough {
    public static void main(String[] args) {
        System.out.println(new Rough().fibo_rec(10));
    }

    public int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(a);
        }

        return 0;
    }

    public int fibo_rec(int n) {
        // base case
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        // recursive case
        int small1 = fibo_rec(n - 1);
        int small2 = fibo_rec(n - 2);
        // System.out.println(small1 + small2);
        // calculation
        return small1 + small2;

    }

}
