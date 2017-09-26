package co.com.psl.challenges.lcdr.printer;

import co.com.psl.challenges.lcdr.printable.Printable;

import java.util.Iterator;

/**
 * Created on 16/9/2017
 * By Jota Uribe
 **/

public class PrintMatrix {

    private String[] rowArray;

    private int spaceBetweenDigits;

    public PrintMatrix(int spaceBetweenDigits){

        this.spaceBetweenDigits = spaceBetweenDigits;
        rowArray = new String[0];
    }

    /**
     * This method add to the right side of the print matrix
     * the printable object passed as argument
     *
     * @param printable The object to be printed
     */
    public void write(Printable printable){

        String[] extension = buildMatrixExtension(printable);

        append(extension);

    }

    /**
     * This method build the matrix that will be added
     * to the original print matrix
     *
     * @param extension The source for the print matrix extension
     * @return
     */
    private String[] buildMatrixExtension(Printable extension){

        Iterator<String> rowIterator = extension.getRowIterator();

        String[] matrixExtension = new String[extension.height()];

        int position = 0;
        while(rowIterator.hasNext()){
            String row = rowIterator.next();
            matrixExtension[position] = row;
            position++;
        }

        return matrixExtension;
    }

    private void append(String[] extension){

        int height = extension.length > matrixHeight()? extension.length : matrixHeight();

        String[] currentRowArray;
        String[] newRowArray = new String [height];

        if(this.isEmpty())
            currentRowArray = buildEmptyRowArray(height);
        else
            currentRowArray = buildRowArrayWithAppendedSpace();

        for(int i = 0; i < height; i++){
            newRowArray[i] = currentRowArray[i] + extension[i];
        }

        this.rowArray = newRowArray;

    }

    private String[] buildEmptyRowArray(int height){

        String[] emptyRowArray = new String[height];

        for(int i = 0; i < emptyRowArray.length; i++){
            emptyRowArray[i] = "";
        }
        return emptyRowArray;
    }

    private String[] buildRowArrayWithAppendedSpace(){

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
            if(i != matrixHeight() -1)
                printableString.append("\n");
        }

        return printableString.toString();
    }

}
