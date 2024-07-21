package OtherProblems.Recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PowerTest {
    Power power = new Power();

    @Test
    public void testPowerZeroExponent() {
        int base = 2;
        int exponent = 0;
        int expected = 1;
        assertEquals(expected, power.power(base, exponent));
    }

    @Test
    public void testPowerOneExponent() {

        int base = 2;
        int exponent = 1;
        int expected = 2;
        assertEquals(expected, power.power(base, exponent));
    }

    @Test
    public void testPowerPositiveExponent() {

        int base = 2;
        int exponent = 10;
        int expected = 1024;
        assertEquals(expected, power.power(base, exponent));
    }

    @Test
    public void testPowerLargeExponent() {

        int base = 2;
        int exponent = 20;
        int expected = 1048576;
        assertEquals(expected, power.power(base, exponent));
    }

    @Test
    public void testPowerBaseNegativeExponentEven() {

        int base = -2;
        int exponent = 4;
        int expected = 16;
        assertEquals(expected, power.power(base, exponent));
    }

    @Test
    public void testPowerBaseNegativeExponentOdd() {

        int base = -2;
        int exponent = 3;
        int expected = -8;
        assertEquals(expected, power.power(base, exponent));
    }

    @Test
    public void testPowerBaseOne() {

        int base = 1;
        int exponent = 100;
        int expected = 1;
        assertEquals(expected, power.power(base, exponent));
    }

    @Test
    public void testPowerExponentOne() {

        int base = 100;
        int exponent = 1;
        int expected = 100;
        assertEquals(expected, power.power(base, exponent));
    }

    @Test()
    public void testPowerNegativeExponent() {

        int base = 2;
        int exponent = -2;
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            power.power(base, exponent);
        });
        assertEquals("Exponent must be non-negative", ex.getMessage());
    }

    @Test
    public void testPowerZeroBaseZeroExponent() {

        int base = 0;
        int exponent = 0;
        int expected = 1; // 0^0 is typically defined as 1
        assertEquals(expected, power.power(base, exponent));
    }

    @Test
    public void testPowerZeroBasePositiveExponent() {

        int base = 0;
        int exponent = 5;
        int expected = 0;
        assertEquals(expected, power.power(base, exponent));
    }
}
