package co.com.psl.challenges.lcdr.representation;

import java.util.Arrays;

/**
 * Created on 17/9/2017
 * By Jota Uribe
 **/
public class DigitRepresentation {

    private SevenSegmentMatrix representationMatrix;

    private char representedDigit;

    public static DigitRepresentation create(char digit, int size){

        if (!Character.isDigit(digit))
            throw  new IllegalArgumentException("A digit must be provided");

        SevenSegmentMatrix digitRepresentationMatrix = SevenSegmentDigitRepresentationFactory
                                                        .getRepresentationOf(digit, size);
        return new DigitRepresentation(digit, digitRepresentationMatrix);
    }

    private DigitRepresentation(char representedDigit,
                               SevenSegmentMatrix representationMatrix){

        this.representationMatrix = representationMatrix;
        this.representedDigit = representedDigit;
    }

    public String[][] getMatrix(){
        return representationMatrix.getMatrix();
    }

    public int height(){
        return representationMatrix.getHeight();
    }

    public int width(){
        return representationMatrix.getWidth();
    }

    @Override
    public String toString() {
        return representationMatrix.toString();
    }
}
