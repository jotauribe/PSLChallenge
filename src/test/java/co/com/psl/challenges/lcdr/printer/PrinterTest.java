package co.com.psl.challenges.lcdr.printer;

import co.com.psl.challenges.lcdr.printable.representation.SevenSegmentDigitRepresentationFactory;
import co.com.psl.challenges.lcdr.printable.representation.SevenSegmentMatrix;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created on 16/9/2017
 * By Jota Uribe
 **/
public class PrinterTest {

    private ByteArrayOutputStream outContent;
    private PrintStream testOut;
    private PrintStream systemOut;


    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        testOut = new PrintStream(outContent);
        systemOut = System.out;
        System.setOut(new PrintStream(testOut));
    }

    @After
    public void cleanUp() {
        System.setOut(systemOut);
    }

    @Test
    public void process() throws Exception {
        Printer.process(new Command("2,9"), 2);
        SevenSegmentMatrix ssm = SevenSegmentDigitRepresentationFactory.getRepresentationOf('9', 2);
        assertEquals(ssm.toString(), outContent.toString());
    }

    @Test
    public void process2() throws Exception {
        Printer.process(new Command("2,923"), 2);

        String[][] s = {
                {" ", "-", "-", " ", " ", " ", " ", "-", "-", " ", " ", " ", " ", "-", "-", " "},
                {"|", " ", " ", "|", " ", " ", " ", " ", " ", "|", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", "|", " ", " ", " ", " ", " ", "|", " ", " ", " ", " ", " ", "|"},
                {" ", "-", "-", " ", " ", " ", " ", "-", "-", " ", " ", " ", " ", "-", "-", " "},
                {" ", " ", " ", "|", " ", " ", "|", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
                {" ", " ", " ", "|", " ", " ", "|", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
                {" ", "-", "-", " ", " ", " ", " ", "-", "-", " ", " ", " ", " ", "-", "-", " "}
        };

        StringBuilder printableStringMatrix = new StringBuilder();

        for(int i = 0; i < 7; i++){
            StringBuilder line = new StringBuilder();
            for(int j = 0; j < s[0].length; j++){
                line.append(s[i][j]);
            }
            line.append("\n");
            printableStringMatrix.append(line);
        }

        String comparable = printableStringMatrix.toString();

        assertEquals(comparable, outContent.toString());
    }

}