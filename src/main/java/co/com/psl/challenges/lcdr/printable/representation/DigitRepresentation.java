package co.com.psl.challenges.lcdr.printable.representation;

import co.com.psl.challenges.lcdr.printable.Printable;

import java.util.Iterator;

/**
 * Created on 17/9/2017
 * By Jota Uribe
 **/
public class DigitRepresentation implements Printable{

    //The matrix used to represent the
    //"printable" version of the digit
    private SevenSegmentMatrix representationMatrix;

    private char representedDigit;

    /**
     * This method create a instance of DigitRepresentation
     * for a given digit with the provided size
     *
     * @param digit the digit to represent
     * @param size defines the size for the printable representation of the digit
     * @return a DigitRepresentation instance
     */
    public static DigitRepresentation create(char digit, int size){

        if (!Character.isDigit(digit))
            throw  new IllegalArgumentException("A digit must be provided");

        SevenSegmentMatrix digitRepresentationMatrix = SevenSegmentDigitRepresentationFactory
                                                        .getRepresentationOf(digit, size);
        return new DigitRepresentation(digit, digitRepresentationMatrix);
    }

    /**
     * The private constructor used by the create method to provide
     * instances of this class
     *
     * @param representedDigit
     * @param representationMatrix
     */
    private DigitRepresentation(char representedDigit,
                               SevenSegmentMatrix representationMatrix){

        this.representationMatrix = representationMatrix;
        this.representedDigit = representedDigit;
    }

    /**
     * (This method is only used in testing)
     * This method provide access to the raw representation
     * of the represented digit.
     *
     * @return the 2D string matrix used to represent the printable digit
     */
    public String[][] getMatrix(){
        return representationMatrix.getMatrix();
    }

    /**
     * This method return the number of rows in the matrix used to
     * represent the given digit
     *
     * @return the number of rows in the matrix
     */
    public int height(){
        return representationMatrix.getHeight();
    }

    /**
     * This method return the number of columns in the matrix used to
     * represent the digit
     *
     * @return the number of columns in the matrix
     */
    public int width(){
        return representationMatrix.getWidth();
    }


    @Override
    public Iterator getRowIterator() {
        return representationMatrix.iterator();
    }

    @Override
    public String toString() {
        return representationMatrix.toString();
    }

}
