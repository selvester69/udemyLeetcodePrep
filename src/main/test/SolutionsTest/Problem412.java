package main.test.SolutionsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.EasyProblems.Problem412.Solution;

public class Problem412 {
    Solution solution = new Solution();

    @Test
    public void testFizzBuzzWith3() {

        List<String> expected = Arrays.asList("1", "2", "Fizz");
        assertEquals(expected, solution.fizzBuzz(3));
    }

    @Test
    public void testFizzBuzzWith5() {

        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expected, solution.fizzBuzz(5));
    }

    @Test
    public void testFizzBuzzWith15() {

        List<String> expected = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, solution.fizzBuzz(15));
    }

    @Test
    public void testFizzBuzzWith1() {

        List<String> expected = Arrays.asList("1");
        assertEquals(expected, solution.fizzBuzz(1));
    }

    @Test
    public void testFizzBuzzWith0() {

        List<String> expected = Arrays.asList();
        assertEquals(expected, solution.fizzBuzz(0));
    }

    @Test
    public void testFizzBuzzWith2() {

        List<String> expected = Arrays.asList("1", "2");
        assertEquals(expected, solution.fizzBuzz(2));
    }

    @Test
    public void testFizzBuzzWith10() {

        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz");
        assertEquals(expected, solution.fizzBuzz(10));
    }

    @Test
    public void testFizzBuzzWith20() {

        List<String> expected = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz");
        assertEquals(expected, solution.fizzBuzz(20));
    }

}
