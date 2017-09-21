package co.com.psl.challenges.lcdr.printer;

/**
 * Created on 16/9/2017
 * By Jota Uribe
 **/
public class Command {

    private static final String DEFAULT_SEPARATOR = ",";
    private static final int DEFAULT_MINIMUM_SIZE_VALUE = 1;
    private static final int DEFAULT_MAXIMUM_SIZE_VALUE = 10;

    // Defines the separator used for divide
    // the parameters in the command
    private String separator;

    private int minimumSizeValue;

    private int maximumSizeValue;

    private String command;

    private int size;

    private int digits;

    public Command(String command) {
        separator = DEFAULT_SEPARATOR;
        minimumSizeValue = DEFAULT_MINIMUM_SIZE_VALUE;
        maximumSizeValue = DEFAULT_MAXIMUM_SIZE_VALUE;
        setCommand(command);
        setParameters();
    }

    private void setCommand(String command){

        //Validates the existence of a valid separator in command
        if ( !command.contains(separator) ) {
            throw new IllegalArgumentException(
                    "Command string "
                            + command
                            + " does not contains a valid separator"
            );
        }
        this.command = command;
    }

    private void setParameters(){
        String[] parameters = command.split(separator);

        //Validates the number of parameters in command
        if(parameters.length != 2 )
            throw new IllegalArgumentException(
                    "Parameters in command must be 2, "
                    + parameters.length
                    + "was found"
            );

        setSize(parameters[0]);
        setDigits(parameters[1]);


    }

    private void setSize(String string) {
        int size = getNumberIn(string);

        //Validates that the size is  between miniMumSizeValue and MaximumSizeValue
        if(size < minimumSizeValue || size > maximumSizeValue)
            throw  new IllegalArgumentException(
                    "Size must be between "
                            + minimumSizeValue +
                            " and "
                            + maximumSizeValue
            );

        this.size = size;
    }

    private void setDigits(String string){
        int digit = getNumberIn(string);
        this.digits = digit;
    }

    private int getNumberIn(String string){
        int number;
        try {
            number = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(
                    "Parameters in command must be only numbers"
            );
        }
        return number;
    }

    public int getSize(){
        return size;
    }

    public int getDigits(){
        return digits;
    }
}
