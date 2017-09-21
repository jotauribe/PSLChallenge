package co.com.psl.challenges.lcdr.printable.representation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jota Uribe on 19/9/2017.
 */
public class DigitRepresentationTest {

    @Test(expected = IllegalArgumentException.class)
    public void create_ANonDigitParameterPassed_ExceptionThrown() throws Exception {
        DigitRepresentation.create('a', 2);
    }

}