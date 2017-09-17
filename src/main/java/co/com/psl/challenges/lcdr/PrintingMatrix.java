package co.com.psl.challenges.lcdr;

/**
 * Created on 16/9/2017
 * By Jota Uribe
 **/

public class PrintingMatrix {

    private String[][] matrix;

    private int charactersHeight;

    private int charactersWidth;

    private int spaceBetweenCharacters;

    public PrintingMatrix(int charactersHeight,
                          int charactersWidth,
                          int spaceBetweenCharacters){

        this.charactersHeight = charactersHeight;
        this.charactersWidth = charactersWidth;
        this.spaceBetweenCharacters = spaceBetweenCharacters;
    }

    public void write(String string){

        int numberOfCharacters = string.length();
        int matrixHeight = charactersHeight;
        int matrixWidth = (numberOfCharacters * charactersWidth)
                + (spaceBetweenCharacters * (numberOfCharacters - 1));

        initMatrix(matrixHeight, matrixWidth);
        addToMatrix(string);
    }

    private void initMatrix(int height, int width){

        matrix = new String[height][width];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.matrix[i][j] = " ";
            }
        }
    }

    private void addToMatrix(String string){
        char[] characters = string.toCharArray();

        for (char character : characters) {

        }
    }

}
