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
        int espacioDig;

        try {

            try (Scanner lector = new Scanner(System.in)) {

                System.out.print("Espacio entre Digitos (0 a 5): ");
                comando = lector.next();

                // Valida si es un numero
                if (Printer.isNumeric(comando))
                {
                    espacioDig = Integer.parseInt(comando);

                    // se valida que el espaciado este entre 0 y 5
                    if(espacioDig <0 || espacioDig >5)
                    {
                        throw new IllegalArgumentException("El espacio entre "
                                + "digitos debe estar entre 0 y 5");
                    }

                }
                else
                {
                    throw new IllegalArgumentException("Cadena " + comando
                            + " no es un entero");
                }

                do
                {
                    System.out.print("Entrada: ");
                    comando = lector.next();
                    if(!comando.equalsIgnoreCase(CADENA_FINAL))
                    {
                        listaComando.add(comando);
                    }
                }while (!comando.equalsIgnoreCase(CADENA_FINAL));
            }

            Printer impresorLCD = new Printer();

            Iterator<String> iterator = listaComando.iterator();
            while (iterator.hasNext())
            {
                try
                {
                    impresorLCD.process(new Command(iterator.next(), espacioDig));
                } catch (Exception ex)
                {
                    System.out.println("Error: "+ex.getMessage());
                }
            }
        } catch (Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }

    }

}