package co.com.psl.challenges.lcdr;

/**
 * Created on 16/9/2017
 * By Jota Uribe
 **/

import co.com.psl.challenges.lcdr.printer.Command;
import co.com.psl.challenges.lcdr.printer.Printer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LCDTester {

    static final String CADENA_FINAL = "0,0";

    public static void main(String[] args) {

        // Establece los segmentos de cada numero
        List<String> commandList = new ArrayList<>();
        String command;
        int spaceBetweenDigits;

        try {

            try (Scanner input = new Scanner(System.in)) {

                System.out.print("Espacio entre Digitos (0 a 5): ");

                // Valida si es un numero
                if (!input.hasNextInt()) {
                    input.next();
                    throw new IllegalArgumentException("La entrada no es un entero");
                }

                spaceBetweenDigits = input.nextInt();

                // se valida que el espaciado este entre 0 y 5
                if(spaceBetweenDigits <0 || spaceBetweenDigits >5) {
                    throw new IllegalArgumentException("El espacio entre "
                            + "digitos debe estar entre 0 y 5");
                }

                do {
                    System.out.print("Comando: ");
                    command = input.next();
                    if(!command.equalsIgnoreCase(CADENA_FINAL)) {
                        commandList.add(command);
                    }
                }while (!command.equalsIgnoreCase(CADENA_FINAL));
            }

            Printer impresorLCD = new Printer();

            Iterator<String> iterator = commandList.iterator();
            while (iterator.hasNext()) {
                try {
                    impresorLCD.process(new Command(iterator.next()), spaceBetweenDigits);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

}