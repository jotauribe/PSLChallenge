package co.com.psl.challenges.lcdr.printable.representation;

import java.util.HashMap;

/**
 * Created on 19/9/2017
 * By Jota Uribe
 **/
public class SevenSegmentDigitRepresentationFactory {

    private static HashMap<String, SevenSegmentMatrix> sevenSegmentMatrixHashMap = new HashMap<>();

    public static SevenSegmentMatrix getRepresentationOf(char digit, int size){

        String key = digit + " " + size ;

        if(!sevenSegmentMatrixHashMap.containsKey(key))
            sevenSegmentMatrixHashMap.put(key, createRepresentationOf(digit, size));

        return sevenSegmentMatrixHashMap.get(key);

    }

    private static SevenSegmentMatrix createRepresentationOf(char digit, int size){

        SevenSegmentMatrix representation = new SevenSegmentMatrix(size);

        switch (digit){
            case '0':
                representation.drawSegmentA();
                representation.drawSegmentB();
                representation.drawSegmentC();
                representation.drawSegmentD();
                representation.drawSegmentE();
                representation.drawSegmentF();
                break;
            case '1':
                representation.drawSegmentB();
                representation.drawSegmentC();
                break;
            case '2':
                representation.drawSegmentA();
                representation.drawSegmentB();
                representation.drawSegmentG();
                representation.drawSegmentD();
                representation.drawSegmentE();
                break;
            case '3':
                representation.drawSegmentA();
                representation.drawSegmentB();
                representation.drawSegmentG();
                representation.drawSegmentC();
                representation.drawSegmentD();
                break;
            case '4':
                representation.drawSegmentB();
                representation.drawSegmentC();
                representation.drawSegmentF();
                representation.drawSegmentG();
                break;
            case '5':
                representation.drawSegmentA();
                representation.drawSegmentC();
                representation.drawSegmentD();
                representation.drawSegmentF();
                representation.drawSegmentG();
                break;
            case '6':
                representation.drawSegmentA();
                representation.drawSegmentC();
                representation.drawSegmentD();
                representation.drawSegmentE();
                representation.drawSegmentF();
                representation.drawSegmentG();
                break;
            case '7':
                representation.drawSegmentA();
                representation.drawSegmentB();
                representation.drawSegmentC();
                break;
            case '8':
                representation.drawSegmentA();
                representation.drawSegmentB();
                representation.drawSegmentC();
                representation.drawSegmentD();
                representation.drawSegmentE();
                representation.drawSegmentF();
                representation.drawSegmentG();
                break;
            case '9':
                representation.drawSegmentA();
                representation.drawSegmentB();
                representation.drawSegmentC();
                representation.drawSegmentF();
                representation.drawSegmentG();
                break;

        }
        return representation;
    }

}
