package OtherProblems.Recursion.Intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PrintAllIndexElementTest {

    PrintAllIndexElement finder = new PrintAllIndexElement();

    @Test
    public void testFindAllPositionsEmptyArray() {
        int[] arr = {};
        int element = 1;
        List<Integer> expected = List.of();
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

    @Test
    public void testFindAllPositionsSingleElementFound() {

        int[] arr = { 1 };
        int element = 1;
        List<Integer> expected = List.of(0);
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

    @Test
    public void testFindAllPositionsSingleElementNotFound() {

        int[] arr = { 1 };
        int element = 2;
        List<Integer> expected = List.of();
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

    @Test
    public void testFindAllPositionsMultipleElementsFound() {

        int[] arr = { 1, 2, 3, 2, 5 };
        int element = 2;
        List<Integer> expected = List.of(1, 3);
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

    @Test
    public void testFindAllPositionsMultipleElementsNotFound() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 6;
        List<Integer> expected = List.of();
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

    @Test
    public void testFindAllPositionsFirstElement() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 1;
        List<Integer> expected = List.of(0);
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

    @Test
    public void testFindAllPositionsLastElement() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 5;
        List<Integer> expected = List.of(4);
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

    @Test
    public void testFindAllPositionsNegativeNumbersFound() {

        int[] arr = { -1, -2, -3, -2, -5 };
        int element = -2;
        List<Integer> expected = List.of(1, 3);
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

    @Test
    public void testFindAllPositionsNegativeNumbersNotFound() {

        int[] arr = { -1, -2, -3, -4, -5 };
        int element = -6;
        List<Integer> expected = List.of();
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

    @Test
    public void testFindAllPositionsMixedNumbersFound() {

        int[] arr = { 1, -2, 3, -2, 5 };
        int element = -2;
        List<Integer> expected = List.of(1, 3);
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

    @Test
    public void testFindAllPositionsMixedNumbersNotFound() {

        int[] arr = { 1, -2, 3, -4, 5 };
        int element = 6;
        List<Integer> expected = List.of();
        assertEquals(expected, finder.findAllPositions(arr, element));
    }

}
