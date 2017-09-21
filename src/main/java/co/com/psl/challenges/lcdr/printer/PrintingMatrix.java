package co.com.psl.challenges.lcdr.printer;

import co.com.psl.challenges.lcdr.printable.Printable;

import java.util.Iterator;

/**
 * Created on 16/9/2017
 * By Jota Uribe
 **/

public class PrintingMatrix {

    private String[] rowArray;

    private int spaceBetweenDigits;

    public PrintingMatrix(int spaceBetweenDigits){

        this.spaceBetweenDigits = spaceBetweenDigits;
        rowArray = new String[0];
    }

    public void write(Printable printable){

        Iterator<String> rowIterator = printable.getRowIterator();

        String[] extension = new String[printable.height()];

        int position = 0;
        while(rowIterator.hasNext()){
            String row = rowIterator.next();
            extension[position] = row;
            position++;
        }

        append(extension);

    }

    private void append(String[] extension){

        int height = extension.length > matrixHeight()? extension.length : matrixHeight();

        String[] currentRowArray;
        String[] newRowArray = new String [height];

        if(this.isEmpty())
            currentRowArray = emptyRowArray(height);
        else
            currentRowArray = rowArrayWithAppendedSpace();

        for(int i = 0; i < height; i++){
            newRowArray[i] = currentRowArray[i] + extension[i];
            //System.out.print("\n" + newRowArray[i]);
        }

        this.rowArray = newRowArray;

    }

    private String[] emptyRowArray(int height){

        String[] emptyRowArray = new String[height];

        for(int i = 0; i < emptyRowArray.length; i++){
            emptyRowArray[i] = "";
        }
        return emptyRowArray;
    }

    private String[] rowArrayWithAppendedSpace(){

        String[] rowArrayWithAppendedSpace = rowArray.clone();

        String space = "";
        for(int i = 0; i < spaceBetweenDigits; i++){
            space += " ";
        }

        for(int i = 0; i < rowArrayWithAppendedSpace.length; i++){
            rowArrayWithAppendedSpace[i] = rowArrayWithAppendedSpace[i] + space;
        }
        return rowArrayWithAppendedSpace;
    }

    private boolean isEmpty(){
        return rowArray.length == 0;
    }

    private int matrixHeight(){
        return rowArray.length;
    }

    private int matrixWidth(){
        return rowArray[0].length();
    }

    @Override
    public String toString() {

        StringBuilder printableString = new StringBuilder();

        for(int i = 0; i < matrixHeight(); i++){
            printableString.append(rowArray[i]);
            printableString.append("\n");
        }

        return printableString.toString();
    }

}
