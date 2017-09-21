package co.com.psl.challenges.lcdr.printer;

import co.com.psl.challenges.lcdr.printable.representation.DigitRepresentation;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 17/9/2017
 * By Jota Uribe
 **/

public class PrintingMatrixTest {

    @Test
    public void method(){
        PrintingMatrix pm = new PrintingMatrix(10);
        DigitRepresentation dr = DigitRepresentation.create('2', 2);
        DigitRepresentation dr2 = DigitRepresentation.create('4', 2);
        DigitRepresentation dr3 = DigitRepresentation.create('5', 2);
        pm.write(dr);
        pm.write(dr3);
        pm.write(dr2);
        System.out.print(pm);

    }

}