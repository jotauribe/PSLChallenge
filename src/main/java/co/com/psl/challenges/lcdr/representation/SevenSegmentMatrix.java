package co.com.psl.challenges.lcdr.representation;

/**
 * Created on 17/9/2017
 * By Jota Uribe
 **/
public class SevenSegmentMatrix {

    private static final String DEFAULT_HORIZONTAL_CHARACTER = "-";
    private static final String DEFAULT_VERTICAL_CHARACTER = "|";

    private String[][] sevenSegmentMatrix;

    private int size;

    private int height;

    private int width;

    private String horizontalCharacter;

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
        if(size < 1 || size > 10)
            throw  new IllegalArgumentException("Size must be between 1 and 10");
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
            sevenSegmentMatrix[0][i] = DEFAULT_HORIZONTAL_CHARACTER;
        }

    }

    public void drawSegmentB(){

        for(int i = 1; i < size + 1; i++){
            sevenSegmentMatrix[i][width - 1] = DEFAULT_VERTICAL_CHARACTER;
        }

    }

    public void drawSegmentC(){

        int startPoint = ((size * 2) + 3)/2 + 1;

        for(int i = startPoint; i < startPoint + 2 ; i++){
            sevenSegmentMatrix[i][width - 1] = DEFAULT_VERTICAL_CHARACTER;
        }

    }

    public void drawSegmentD(){

        int startPoint = 0;

        for(int i = 1; i < size + 1; i++){
            sevenSegmentMatrix[height - 1][i] = DEFAULT_HORIZONTAL_CHARACTER;
        }
    }

    public void drawSegmentE(){

        int startPoint = ((size * 2) + 3)/2 + 1;

        for(int i = startPoint; i < startPoint + 2; i++){
            sevenSegmentMatrix[i][0] = DEFAULT_VERTICAL_CHARACTER;
        }

    }

    public void drawSegmentF(){

        int startPoint = ((size * 2) + 3)/2 + 1;

        for(int i = 1; i < size + 1; i++){
            sevenSegmentMatrix[i][0] = DEFAULT_VERTICAL_CHARACTER;
        }

    }

    public void drawSegmentG(){

        int startPoint = ((size * 2) + 3)/2 ;

        for(int i = 1; i < size + 1; i++){
            sevenSegmentMatrix[startPoint][i] = DEFAULT_HORIZONTAL_CHARACTER;
        }

    }

    public String[][] getMatrix(){
        return sevenSegmentMatrix.clone();
    }

}
