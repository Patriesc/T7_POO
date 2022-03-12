package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 extends Cuadricula {
    private int filaSeleccionada, columnaSeleccionada;
    private boolean acierto;

    public void guerraBarcosv3(Scanner teclado) {
        // Creamos una cuadrícula y colocamos un barco de forma aleatoria
        Cuadricula tablero = new Cuadricula();
        tablero.visualizacion();
        int filaBarco = (int) (Math.random() * SIZE) + 1;
        int colBarco = (int) (Math.random() * SIZE) + 1;
        tablero.depositarBarco(filaBarco - 1, colBarco - 1);

        // El jugador realiza disparos hasta que acierte
        do {
            try {
                System.out.println("Escoja una fila: ");
                filaSeleccionada = teclado.nextInt() - 1;
                System.out.println("Escoja una columna: ");
                columnaSeleccionada = teclado.nextInt() - 1;

                try {
                    acierto = tablero.disparar(filaSeleccionada, columnaSeleccionada);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("No se puede seleccionar esa casilla.");
                }

                // Mostramos el resultado
                if (acierto) {
                    System.out.println("¡Has acertado!");
                    tablero.visualizacion();
                } else {
                    System.out.println("Inténtelo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca caracteres numéricos.");
                teclado.nextLine();
            }
        } while (!acierto);

    }
}
