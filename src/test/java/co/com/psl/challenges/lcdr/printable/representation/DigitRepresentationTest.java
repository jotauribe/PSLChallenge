package co.com.psl.challenges.lcdr.printable.representation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by Jota Uribe on 19/9/2017.
 */
public class DigitRepresentationTest {

    @Rule
    public ExpectedException exceptionThrown = ExpectedException.none();

    @Test()
    public void create_ANonDigitParameterPassed_ExceptionThrown() throws Exception {

        exceptionThrown.expect(IllegalArgumentException.class);
        exceptionThrown.expectMessage("A digit must be provided");
        DigitRepresentation.create('a', 2);
    }

}