package OtherProblems.Recursion.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GeometricSumTest {

    private static final double DELTA = 1e-6; // Tolerance for floating-point comparison
    GeometricSum geometricSum = new GeometricSum();

    @Test
    public void testGeometricSumZero() {
        int input = 0;
        double expected = 1.0;
        assertEquals(expected, geometricSum.geometricSum(input), DELTA);
    }

    @Test
    public void testGeometricSumOne() {

        int input = 1;
        double expected = 1.0 + 0.5;
        assertEquals(expected, geometricSum.geometricSum(input), DELTA);
    }

    @Test
    public void testGeometricSumTwo() {

        int input = 2;
        double expected = 1.0 + 0.5 + 0.25;
        assertEquals(expected, geometricSum.geometricSum(input), DELTA);
    }

    @Test
    public void testGeometricSumThree() {

        int input = 3;
        double expected = 1.0 + 0.5 + 0.25 + 0.125;
        assertEquals(expected, geometricSum.geometricSum(input), DELTA);
    }

    @Test
    public void testGeometricSumFive() {

        int input = 5;
        double expected = 1.0 + 0.5 + 0.25 + 0.125 + 0.0625 + 0.03125;
        assertEquals(expected, geometricSum.geometricSum(input), DELTA);
    }

    @Test
    public void testGeometricSumTen() {

        int input = 10;
        double expected = 1.0 + 0.5 + 0.25 + 0.125 + 0.0625 + 0.03125 + 0.015625 + 0.0078125 + 0.00390625 + 0.001953125
                + 0.0009765625;
        assertEquals(expected, geometricSum.geometricSum(input), DELTA);
    }

    @Test
    public void testGeometricSumNegative() {

        int input = -1;
        double expected = 1.0; // Assuming geometricSum(-1) is treated as geometricSum(0)
        assertEquals(expected, geometricSum.geometricSum(input), DELTA);
    }
}