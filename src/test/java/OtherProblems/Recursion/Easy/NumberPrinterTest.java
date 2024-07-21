package OtherProblems.Recursion.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import OtherProblems.Recursion.Easy.NumberPrinter;

public class NumberPrinterTest {

    NumberPrinter numberPrinter = new NumberPrinter();

    @Test
    public void testPrintNumbersZero() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        numberPrinter.printNumbers(0);

        assertEquals("", outContent.toString().trim());
    }

    @Test
    public void testPrintNumbersOne() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        numberPrinter.printNumbers(1);

        assertEquals("1", outContent.toString().trim());
    }

    @Test
    public void testPrintNegativeNumber() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        numberPrinter.printNumbers(-5);

        assertEquals("", outContent.toString().trim());
    }
}