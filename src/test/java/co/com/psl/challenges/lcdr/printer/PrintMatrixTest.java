package co.com.psl.challenges.lcdr.printer;

import co.com.psl.challenges.lcdr.printable.representation.DigitRepresentation;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jota Uribe on 21/9/2017.
 */
public class PrintMatrixTest {
    @Test
    public void write() throws Exception {
        PrintMatrix pm = new PrintMatrix(10);
        DigitRepresentation dr = DigitRepresentation.create('2', 2);
        DigitRepresentation dr2 = DigitRepresentation.create('4', 2);
        DigitRepresentation dr3 = DigitRepresentation.create('5', 2);
        pm.write(dr);
        pm.write(dr3);
        pm.write(dr2);
        //System.out.print(pm);

    }

}