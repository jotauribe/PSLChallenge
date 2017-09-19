package co.com.psl.challenges.lcdr.representation;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created on 17/9/2017
 * By Jota Uribe
 **/
public class SevenSegmentMatrixTest {

    @Test
    public void drawSegmentA() throws Exception {
        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(2);
        sevenSegmentMatrix.drawSegmentA();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", "-", "-", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void drawSegmentB() throws Exception {
        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(2);
        sevenSegmentMatrix.drawSegmentB();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", " ", " ", " "},
                {" ", " ", " ", "|"},
                {" ", " ", " ", "|"},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void drawSegmentC() throws Exception {
        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(2);
        sevenSegmentMatrix.drawSegmentC();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", "|"},
                {" ", " ", " ", "|"},
                {" ", " ", " ", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));
    }

    @Test
    public void drawSegmentD() throws Exception {
        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(2);
        sevenSegmentMatrix.drawSegmentD();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", "-", "-", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));
    }

    @Test
    public void drawSegmentE() throws Exception {
        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(2);
        sevenSegmentMatrix.drawSegmentE();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {"|", " ", " ", " "},
                {"|", " ", " ", " "},
                {" ", " ", " ", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));
    }

    @Test
    public void drawSegmentF() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(2);
        sevenSegmentMatrix.drawSegmentF();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", " ", " ", " "},
                {"|", " ", " ", " "},
                {"|", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void drawSegmentG() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(2);
        sevenSegmentMatrix.drawSegmentG();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = {
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", "-", "-", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "}
        };

        assertTrue(Arrays.deepEquals(s, ssm));

    }

}