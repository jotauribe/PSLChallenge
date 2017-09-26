package co.com.psl.challenges.lcdr.printable.representation;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created on 17/9/2017
 * By Jota Uribe
 **/
public class SevenSegmentMatrix implements Iterable<String>{

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

    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String[][] getMatrix(){
        return sevenSegmentMatrix.clone();
    }

    @Override
    public String toString() {
        return String.join("\n", this);
    }

    @Override
    public Iterator iterator() {
        return new SevenSegmentMatrixIterator(sevenSegmentMatrix);
    }


    /**
     * This iterator is used to hide the internal structure
     * (implementation) of SevenSegmentMatrix.class
     */
    class SevenSegmentMatrixIterator implements Iterator<String>{

        private String[][] matrix;
        private int currentPosition;

        public SevenSegmentMatrixIterator(String[][] matrix) {
            this.matrix = matrix;
            currentPosition = 0;
        }

        @Override
        public boolean hasNext() {
            if(matrix.length >= currentPosition + 1)
                return  true;
            return false;
        }

        @Override
        public String next() {
            String line = getLine(currentPosition);
            currentPosition++;
            return line;
        }

        private String getLine(int index){
            StringBuilder line = new StringBuilder();
            for(int i = 0; i < matrix[index].length; i++){
                line.append(matrix[index][i]);
            }
            return  line.toString();
        }
    }
}
