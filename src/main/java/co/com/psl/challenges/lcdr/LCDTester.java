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
        List<String> listaComando = new ArrayList<>();
        String comando;
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

                do {
                    System.out.print("Comando: ");
                    comando = input.next();
                    if(!comando.equalsIgnoreCase(CADENA_FINAL)) {
                        listaComando.add(comando);
                    }
                }while (!comando.equalsIgnoreCase(CADENA_FINAL));
            }

            Printer impresorLCD = new Printer();

            Iterator<String> iterator = listaComando.iterator();
            while (iterator.hasNext()) {
                try {
                    impresorLCD.process(new Command(iterator.next()), spaceBetweenDigits);
                } catch (Exception e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

}