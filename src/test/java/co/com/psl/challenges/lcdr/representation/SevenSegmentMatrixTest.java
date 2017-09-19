package co.com.psl.challenges.lcdr.representation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created on 17/9/2017
 * By Jota Uribe
 **/

@RunWith(Parameterized.class)
public class SevenSegmentMatrixTest {

    private String[][] a;

    private int sizeA;

    private String[][] b;

    private int sizeB;

    private String[][] c;

    private int sizeC;

    private String[][] d;

    private int sizeD;

    private String[][] e;

    private int sizeE;

    private String[][] f;

    private int sizeF;

    private String[][] g;

    private int sizeG;

    public SevenSegmentMatrixTest(String[][] a, int sizeA,
                                  String[][] b, int sizeB,
                                  String[][] c, int sizeC,
                                  String[][] d, int sizeD,
                                  String[][] e, int sizeE,
                                  String[][] f, int sizeF,
                                  String[][] g, int sizeG) {
        this.a = a;
        this.sizeA = sizeA;
        this.b = b;
        this.sizeB = sizeB;
        this.c = c;
        this.sizeC = sizeC;
        this.d = d;
        this.sizeD = sizeD;
        this.e = e;
        this.sizeE = sizeE;
        this.f = f;
        this.sizeF = sizeF;
        this.g = g;
        this.sizeG = sizeG;
    }

    @Test
    public void drawSegmentA() throws Exception {
        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(sizeA);
        sevenSegmentMatrix.drawSegmentA();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = a;

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void drawSegmentB() throws Exception {
        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(sizeB);
        sevenSegmentMatrix.drawSegmentB();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = b;

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void drawSegmentC() throws Exception {
        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(sizeC);
        sevenSegmentMatrix.drawSegmentC();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = c;

        assertTrue(Arrays.deepEquals(s, ssm));
    }

    @Test
    public void drawSegmentD() throws Exception {
        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(sizeD);
        sevenSegmentMatrix.drawSegmentD();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = d;

        assertTrue(Arrays.deepEquals(s, ssm));
    }

    @Test
    public void drawSegmentE() throws Exception {
        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(sizeE);
        sevenSegmentMatrix.drawSegmentE();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = e;

        assertTrue(Arrays.deepEquals(s, ssm));
    }

    @Test
    public void drawSegmentF() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(sizeF);
        sevenSegmentMatrix.drawSegmentF();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = f;

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Test
    public void drawSegmentG() throws Exception {

        SevenSegmentMatrix sevenSegmentMatrix = new SevenSegmentMatrix(sizeG);
        sevenSegmentMatrix.drawSegmentG();

        String[][] ssm = sevenSegmentMatrix.getMatrix();

        String[][] s = g;

        assertTrue(Arrays.deepEquals(s, ssm));

    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getParameters(){
        List<Object[]> parameters = new ArrayList();

        parameters.add(
                new Object[]{
                        new String[][]{ //A
                                {" ", "-", "-", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "}
                        },
                        2,
                        new String[][]{ //B
                                {" ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", "|"},
                                {" ", " ", " ", " ", "|"},
                                {" ", " ", " ", " ", "|"},
                                {" ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " "}
                        },
                        3,
                        new String[][]{ //C
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", "|"},
                                {" ", " ", " ", "|"},
                                {" ", " ", " ", " "}
                        },
                        2,
                        new String[][]{ //D
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", "-", "-", " "}
                        },
                        2,
                        new String[][]{ //E
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {"|", " ", " ", " "},
                                {"|", " ", " ", " "},
                                {" ", " ", " ", " "}
                        },
                        2,
                        new String[][]{ //F
                                {" ", " ", " ", " "},
                                {"|", " ", " ", " "},
                                {"|", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "}
                        },
                        2,
                        new String[][]{ //G
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", "-", "-", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "},
                                {" ", " ", " ", " "}
                        },
                        2

                });
        parameters.add(new Object[]{
                new String[][]{ //A
                        {" ", "-", "-", "-", "-", "-", "-", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "}
                },
                6,
                new String[][]{ //B
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "}
                },
                6,
                new String[][]{ //C
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", "|"},
                        {" ", " ", " ", " ", " ", " ", " ", " "}
                },
                6,
                new String[][]{ //D
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", "-", "-", "-", "-", "-", "-", " "}
                },
                6,
                new String[][]{ //E
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "}
                },
                6,
                new String[][]{ //F
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {"|", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "}
                },
                6,
                new String[][]{ //G
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", "-", "-", "-", "-", "-", "-", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "}
                },
                6

        });

        return parameters;
    }

}