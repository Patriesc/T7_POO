package poo;

import java.util.Scanner;

public class Ejercicio3 {
    private int filaSeleccionada, columnaSeleccionada;
    private boolean acierto;

    public void guerraBarcos(Scanner teclado) {
        Cuadricula tablero = new Cuadricula();
        tablero.visualizacion();
        System.out.println("¿En qué fila quieres depositar el barco");
        int filaBarco = teclado.nextInt() - 1;
        System.out.println("¿En qué columna quieres depositar el barco");
        int colBarco = teclado.nextInt() - 1;
        tablero.depositarBarco(filaBarco, colBarco);

        do {
            tablero.visualizacion();

            System.out.println("Escoja una fila: ");
            filaSeleccionada = teclado.nextInt() -1;
            System.out.println("Escoja una columna: ");
            columnaSeleccionada = teclado.nextInt() - 1;

            acierto = tablero.disparar(filaSeleccionada, columnaSeleccionada);
            if(acierto){
                System.out.println("¡Has acertado!");
            }else{
                System.out.println("Inténtelo de nuevo.");
            }
        } while (!acierto);

    }
}
