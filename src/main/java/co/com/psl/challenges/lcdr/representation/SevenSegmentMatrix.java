package co.com.psl.challenges.lcdr.representation;

import java.util.Arrays;

/**
 * Created on 17/9/2017
 * By Jota Uribe
 **/
public class SevenSegmentMatrix implements RepresentationMatrix{

    private static final String DEFAULT_HORIZONTAL_CHARACTER = "-";
    private static final String DEFAULT_VERTICAL_CHARACTER = "|";

    private String[][] sevenSegmentMatrix;

    private int size;

    private int height;

    private int width;

    //Character used to draw the horizontal
    //segments in the matrix
    private String horizontalCharacter;

    //Character used to draw the vertical
    //segments in the matrix
    private String verticalCharacter;

    public SevenSegmentMatrix(int size){

        horizontalCharacter = DEFAULT_HORIZONTAL_CHARACTER;
        verticalCharacter = DEFAULT_VERTICAL_CHARACTER;

        setSize(size);
        this.height = ( size * 2 ) + 3;
        this.width = size + 2;
        initMatrix(height, width);
    }

    private void setSize(int size){

        if(size < 1 )
            throw  new IllegalArgumentException("Size must be greater than 1 ");
        this.size = size;
    }

    private void initMatrix(int height, int width){

        sevenSegmentMatrix = new String[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sevenSegmentMatrix[i][j] = " ";
            }
        }
    }

    public void drawSegmentA(){

        for(int i = 1; i < size + 1; i++){
            sevenSegmentMatrix[0][i] = horizontalCharacter;
        }

    }

    public void drawSegmentB(){

        for(int i = 1; i < size + 1; i++){
            sevenSegmentMatrix[i][width - 1] = verticalCharacter;
        }

    }

    public void drawSegmentC(){

        int startPoint = ((size * 2) + 3)/2 + 1;

        for(int i = startPoint; i < startPoint + size ; i++){
            sevenSegmentMatrix[i][width - 1] = verticalCharacter;
        }

    }

    public void drawSegmentD(){

        int startPoint = 0;

        for(int i = 1; i < size + 1; i++){
            sevenSegmentMatrix[height - 1][i] = horizontalCharacter;
        }
    }

    public void drawSegmentE(){

        int startPoint = ((size * 2) + 3)/2 + 1;

        for(int i = startPoint; i < startPoint + size; i++){
            sevenSegmentMatrix[i][0] = verticalCharacter;
        }

    }

    public void drawSegmentF(){

        int startPoint = ((size * 2) + 3)/2 + 1;

        for(int i = 1; i < size + 1; i++){
            sevenSegmentMatrix[i][0] = verticalCharacter;
        }

    }

    public void drawSegmentG(){

        int startPoint = ((size * 2) + 3)/2 ;

        for(int i = 1; i < size + 1; i++){
            sevenSegmentMatrix[startPoint][i] = horizontalCharacter;
        }

    }

    public String[][] getMatrix(){
        return sevenSegmentMatrix.clone();
    }

    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {

        StringBuilder printableStringMatrix = new StringBuilder();

        for(int i = 0; i < height; i++){
            StringBuilder line = new StringBuilder();
            for(int j = 0; j < width; j++){
                line.append(sevenSegmentMatrix[i][j]);
            }
            line.append("\n");
            printableStringMatrix.append(line);
        }

        return printableStringMatrix.toString();
    }
}
