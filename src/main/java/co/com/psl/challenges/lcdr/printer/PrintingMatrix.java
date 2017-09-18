package co.com.psl.challenges.lcdr.printer;

import co.com.psl.challenges.lcdr.representation.DigitRepresentation;

/**
 * Created on 16/9/2017
 * By Jota Uribe
 **/

public class PrintingMatrix {

    private String[][] matrix;

    private int digitsHeight;

    private int digitsWidth;

    private int spaceBetweenDigits;

    public PrintingMatrix(int digitsHeight,
                          int digitsWidth,
                          int spaceBetweenDigits){

        this.digitsHeight = digitsHeight;
        this.digitsWidth = digitsWidth;
        this.spaceBetweenDigits = spaceBetweenDigits;
        matrix = new String[0][0];
    }

    public void write(DigitRepresentation digitRepresentation){

        if(matrix.length == 0)
            matrix = digitRepresentation.getMatrix();
        else
            appendToRight(digitRepresentation);

    }

    private void appendToRight(DigitRepresentation digitRepresentation){

        int newMatrixHeight = digitRepresentation.height() + matrixHeight();
        int newMatrixWidth = + digitRepresentation.width() + matrixWidth() + spaceBetweenDigits;

        String[][] newMatrix = new String[newMatrixHeight][newMatrixWidth];
        String[][] currentMatrixCopy = matrix.clone();

        for(int i = 0; i < matrixHeight(); i++){
            for(int j = 0; j < matrixWidth(); j++){
                newMatrix[i][j] = currentMatrixCopy[i][j];
            }
        }

        int space = spaceBetweenDigits -1;

        for(int i = matrixHeight() + space; i < newMatrixHeight; i++){
            for(int j = matrixWidth() + space; j < newMatrixWidth; j++){
                newMatrix[i][j] = currentMatrixCopy[i][j];
            }
        }
    }

    private void initMatrix(int height, int width){

        matrix = new String[height][width];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.matrix[i][j] = " ";
            }
        }
    }

    private int matrixHeight(){
        return matrix.length;
    }

    private int matrixWidth(){
        return matrix[0].length;
    }

}
