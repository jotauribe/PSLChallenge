package co.com.psl.challenges.lcdr.printer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 16/9/2017
 * By Jota Uribe
 **/

@RunWith(value = Parameterized.class)
public class CommandTest {

    private String invalidSeparator;
    private String notNumericParameter;
    private String sizeParameterOutOfValidBounds;
    private String commandWithInvalidNumberOfParameters;

    public CommandTest(String invalidSeparator,
                       String notNumericParameter,
                       String sizeParameterOutOfValidBounds,
                       String commandWithInvalidNumberOfParameters) {

        this.invalidSeparator = invalidSeparator;
        this.notNumericParameter = notNumericParameter;
        this.sizeParameterOutOfValidBounds = sizeParameterOutOfValidBounds;
        this.commandWithInvalidNumberOfParameters = commandWithInvalidNumberOfParameters;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getParameters(){
        List<Object[]> parameters = new ArrayList<>();
        parameters.add(new Object[]{"-", "a", "-1", "2,890,789"});
        parameters.add(new Object[]{";", "??=", "20", "2,"});
        parameters.add(new Object[]{"*", "#", "0", "2,89,9,20,0"});
        return parameters;
    }

    /**
     * Test Assumptions:
     * For this test the only valid separator is the default
     * separator defined in  Command class ","
     */
    @Test(expected = IllegalArgumentException.class)
    public void createCommand_WithAInvalidSeparator_ExceptionThrown(){
        Command c = new Command("2" + invalidSeparator + "8978");
    }

    //Test 2
    @Test(expected = NumberFormatException.class)
    public void createCommand_WithANotNumericSizeParameter_ExceptionThrown(){
        Command c = new Command(notNumericParameter + ",8978");
    }

    /**
     * Test Assumptions:
     * Valid bounds are the default valid bounds defined in Command.java (1, 10)
     */
    @Test(expected = IllegalArgumentException.class)
    public void createCommand_WithASizeParameterOutOfValidBounds_ExceptionThrown(){
        Command c = new Command(sizeParameterOutOfValidBounds + ",8978");
    }

    //Test 4
    @Test(expected = NumberFormatException.class)
    public void createCommand_WithANotNumericDigitParameter_ExceptionThrown() {
        Command c = new Command("2," + notNumericParameter);
    }


    //Test 5
    @Test(expected = IllegalArgumentException.class)
    public void createCommand_WithANotValidNumberOfParameters_ExceptionThrown(){
        Command c = new Command(commandWithInvalidNumberOfParameters);
    }

}