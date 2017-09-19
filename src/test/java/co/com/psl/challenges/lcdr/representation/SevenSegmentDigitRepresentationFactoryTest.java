package co.com.psl.challenges.lcdr.representation;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Jota Uribe on 19/9/2017.
 */
public class SevenSegmentDigitRepresentationFactoryTest {

    @Test
    public void getRepresentationOfZero() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = SevenSegmentDigitRepresentationFactory.getRepresentationOf('0', 2);

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", "-", "-", " "},
                {"|", " ", " ", "|"},
                {"|", " ", " ", "|"},
                {" ", " ", " ", " "},
                {"|", " ", " ", "|"},
                {"|", " ", " ", "|"},
                {" ", "-", "-", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void getRepresentationOfOne() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = SevenSegmentDigitRepresentationFactory.getRepresentationOf('1', 3);

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", " ", " ", " ", " "},
                {" ", " ", " ", " ", "|"},
                {" ", " ", " ", " ", "|"},
                {" ", " ", " ", " ", "|"},
                {" ", " ", " ", " ", " "},
                {" ", " ", " ", " ", "|"},
                {" ", " ", " ", " ", "|"},
                {" ", " ", " ", " ", "|"},
                {" ", " ", " ", " ", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void getRepresentationOfTwo() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = SevenSegmentDigitRepresentationFactory.getRepresentationOf('2', 2);

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", "-", "-", " "},
                {" ", " ", " ", "|"},
                {" ", " ", " ", "|"},
                {" ", "-", "-", " "},
                {"|", " ", " ", " "},
                {"|", " ", " ", " "},
                {" ", "-", "-", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void getRepresentationOfThree() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = SevenSegmentDigitRepresentationFactory.getRepresentationOf('3', 2);

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", "-", "-", " "},
                {" ", " ", " ", "|"},
                {" ", " ", " ", "|"},
                {" ", "-", "-", " "},
                {" ", " ", " ", "|"},
                {" ", " ", " ", "|"},
                {" ", "-", "-", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void getRepresentationOfFour() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = SevenSegmentDigitRepresentationFactory.getRepresentationOf('4', 2);

        String[][] ssm = sevenSegmentMatrix.getMatrix();


        String[][] s = {
                {" ", " ", " ", " "},
                {"|", " ", " ", "|"},
                {"|", " ", " ", "|"},
                {" ", "-", "-", " "},
                {" ", " ", " ", "|"},
                {" ", " ", " ", "|"},
                {" ", " ", " ", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void getRepresentationOfFive() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = SevenSegmentDigitRepresentationFactory.getRepresentationOf('5', 2);

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", "-", "-", " "},
                {"|", " ", " ", " "},
                {"|", " ", " ", " "},
                {" ", "-", "-", " "},
                {" ", " ", " ", "|"},
                {" ", " ", " ", "|"},
                {" ", "-", "-", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void getRepresentationOfSix() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = SevenSegmentDigitRepresentationFactory.getRepresentationOf('6', 2);

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", "-", "-", " "},
                {"|", " ", " ", " "},
                {"|", " ", " ", " "},
                {" ", "-", "-", " "},
                {"|", " ", " ", "|"},
                {"|", " ", " ", "|"},
                {" ", "-", "-", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void getRepresentationOfSeven() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = SevenSegmentDigitRepresentationFactory.getRepresentationOf('7', 2);

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", "-", "-", " "},
                {" ", " ", " ", "|"},
                {" ", " ", " ", "|"},
                {" ", " ", " ", " "},
                {" ", " ", " ", "|"},
                {" ", " ", " ", "|"},
                {" ", " ", " ", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void getRepresentationOfEight() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = SevenSegmentDigitRepresentationFactory.getRepresentationOf('8', 6);

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", "-", "-", "-", "-", "-", "-", " "},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {" ", "-", "-", "-", "-", "-", "-", " "},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {"|", " ", " ", " ", " ", " ", " ", "|"},
                {" ", "-", "-", "-", "-", "-", "-", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void getRepresentationOfNine() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = SevenSegmentDigitRepresentationFactory.getRepresentationOf('9', 2);

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", "-", "-", " "},
                {"|", " ", " ", "|"},
                {"|", " ", " ", "|"},
                {" ", "-", "-", " "},
                {" ", " ", " ", "|"},
                {" ", " ", " ", "|"},
                {" ", " ", " ", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }




}