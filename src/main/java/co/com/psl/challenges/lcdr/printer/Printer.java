package co.com.psl.challenges.lcdr.printer;

import co.com.psl.challenges.lcdr.printable.Printable;
import co.com.psl.challenges.lcdr.printable.representation.DigitRepresentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Printer {

    /**
     *
     * Metodo encargado de procesar la entrada que contiene el size del segmento
     * de los digitos y los digitos a imprimir
     *
     * @param command Entrada que contiene el size del segmento de los digito
     * y el numero a imprimir
     */
    public static void process(Command command) {

        PrintMatrix printMatrix = new PrintMatrix(2);

        int size = command.getSize();
        char[] digitArray = command.getDigitsAsCharArray();

        for (char digit : digitArray) {
            Printable printableDigit = DigitRepresentation.create(digit, size);
            printMatrix.write(printableDigit);
        }

        System.out.print(printMatrix);

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
