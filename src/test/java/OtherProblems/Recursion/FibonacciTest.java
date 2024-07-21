package OtherProblems.Recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    FibonacciNumber fibonacci = new FibonacciNumber();

    @Test
    public void testFibonacciZero() {
        int input = 0;
        int expected = 0;
        assertEquals(expected, fibonacci.fibonacci(input));
    }

    @Test
    public void testFibonacciOne() {

        int input = 1;
        int expected = 1;
        assertEquals(expected, fibonacci.fibonacci(input));
    }

    @Test
    public void testFibonacciTwo() {

        int input = 2;
        int expected = 1;
        assertEquals(expected, fibonacci.fibonacci(input));
    }

    @Test
    public void testFibonacciThree() {

        int input = 3;
        int expected = 2;
        assertEquals(expected, fibonacci.fibonacci(input));
    }

    @Test
    public void testFibonacciFour() {

        int input = 4;
        int expected = 3;
        assertEquals(expected, fibonacci.fibonacci(input));
    }

    @Test
    public void testFibonacciFive() {

        int input = 5;
        int expected = 5;
        assertEquals(expected, fibonacci.fibonacci(input));
    }

    @Test
    public void testFibonacciTen() {

        int input = 10;
        int expected = 55;
        assertEquals(expected, fibonacci.fibonacci(input));
    }

    @Test
    public void testFibonacciFifteen() {

        int input = 15;
        int expected = 610;
        assertEquals(expected, fibonacci.fibonacci(input));
    }

    @Test
    public void testFibonacciTwenty() {

        int input = 20;
        int expected = 6765;
        assertEquals(expected, fibonacci.fibonacci(input));
    }
}