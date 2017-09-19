package co.com.psl.challenges.lcdr.representation;

import java.util.Arrays;

/**
 * Created on 17/9/2017
 * By Jota Uribe
 **/
public class DigitRepresentation {

    private RepresentationMatrix representationMatrix;

    private String[][] sevenSegmentMatrix;

    private DigitRepresentation(RepresentationMatrix representationMatrix){
        this.representationMatrix = representationMatrix;
    }

    public static DigitRepresentation create(int size){
        SevenSegmentMatrix representationMatrix = new SevenSegmentMatrix(size);
        return new DigitRepresentation(representationMatrix);
    }

    public void getRepresentationOf(int digit, int size){

    }

    public String[][] getMatrix(){
        return null;
    }

    public String[][] representOneWithSize(int size){
        return null;
    }

    public int height(){
        return 0;
    }

    public int width(){
        return 0;
    }

    @Override
    public String toString() {
        return representationMatrix.toString();
    }
}
