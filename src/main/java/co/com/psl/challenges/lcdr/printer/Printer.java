package co.com.psl.challenges.lcdr.printer;

import co.com.psl.challenges.lcdr.printable.Printable;
import co.com.psl.challenges.lcdr.printable.representation.DigitRepresentation;

public class Printer {

    private int lineCounter;

    public Printer(){
        lineCounter = 0;
    }

    /**
     *
     * Metodo encargado de procesar la entrada que contiene el size del segmento
     * de los digitos y los digitos a imprimir
     *
     * @param command Entrada que contiene el size del segmento de los digito
     * y el numero a imprimir
     */
    public void process(Command command, int spaceBetweenDigits) {

        PrintMatrix printMatrix = new PrintMatrix(spaceBetweenDigits);

        int size = command.getSize();
        char[] digitArray = command.getDigitsAsCharArray();

        for (char digit : digitArray) {
            Printable printableDigit = DigitRepresentation.create(digit, size);
            printMatrix.write(printableDigit);
        }

        printLine(printMatrix);

    }

    private void printLine(PrintMatrix printMatrix){
        if(lineCounter > 0)
            printSpaceBetweenLines();
        System.out.print(printMatrix);
        lineCounter++;

    }

    private void printSpaceBetweenLines(){
        System.out.print("\n\n");
    }

    /**
     *
     * Metodo encargado de validar si una cadena es numerica
     *
     * @param cadena Cadena
     */
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
