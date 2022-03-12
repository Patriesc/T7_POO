package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 extends Cuadricula {
    private boolean aciertoJugador, aciertoMaquina;

    public void guerraBarcosv4(Scanner teclado) {
        //Generamos los dos tableros con todas las casillas como agua
        Cuadricula tableroMaquina = new Cuadricula();
        Cuadricula tableroJugador = new Cuadricula();

        // Situamos el barco de la máquina en una casilla aleatoria y la del jugador en la indicada por éste
        tableroMaquina.depositarBarco((int) (Math.random() * SIZE), (int) (Math.random() * SIZE));
        tableroMaquina.visualizacion();
        try {
            System.out.println("¿En qué fila deseas depositar el barco?");
            int filaBarco = teclado.nextInt() - 1;
            System.out.println("¿En qué columna deseas depositar el barco?");
            int colBarco = teclado.nextInt() - 1;
            tableroJugador.depositarBarco(filaBarco, colBarco);
            tableroJugador.visualizacion();


            //Realizamos el movimiento del jugador mientras no acierte

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {

                    try {
                        System.out.println("¿En qué fila desea disparar?");
                        int disparoFila = teclado.nextInt() - 1;
                        System.out.println("¿En qué columna desea disparar?");
                        int disparoCol = teclado.nextInt() - 1;
                        aciertoJugador = tableroMaquina.disparar(disparoFila, disparoCol);

                        //Realizamos la jugada de la máquina en el caso de que el jugador haya fallado
                        if (!aciertoJugador) {
                            System.out.println("Agua");
                            System.out.println("La máquina dispara en la casilla " + (i + 1) + "-" + (j + 1));
                            aciertoMaquina = tableroJugador.disparar(i, j);
                            if (aciertoMaquina) {
                                break;
                            }

                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Introduzca caracteres numéricos del 1 al 10.");
                    }
                }
                if (aciertoMaquina) {
                    break;
                }
            }

            //Mostramos un mensaje dependiendo del ganador
            if (aciertoJugador) {
                System.out.println("¡Has ganado!");
            } else {
                System.out.println("La máquina te ha ganado :(");
            }


        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("Los caracteres introducidos o la casilla no son válidos.");
            teclado.nextLine();
        }

    }
}
