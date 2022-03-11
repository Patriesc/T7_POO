package poo;

public class Cuadricula {

    // Cree una clase Cuadricula que tenga:
    // un atributo de instancia de tipo tabla de 10 × 10 casillas;
    // las constantes que estime necesarias
    protected final int SIZE = 10;
    private char[][] tablero = new char[SIZE][SIZE];
    private final char barco = 'X';
    private final char agua = '~';


    // Un constructor sin argumentos, que permite inicializar el tablero del juego con agua por todas partes;
    public Cuadricula() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tablero[i][j] = agua;
            }
        }

    }

    // Un método de instancia depositarBarco(), que toma como argumentos las coordenadas de la caja donde colocar el barco
    public void depositarBarco(int filaBarco, int columnaBarco) {
        tablero[filaBarco][columnaBarco] = barco;
    }

    // Un método de instancia disparar(), que recibe como argumentos las coordenadas de disparo y devuelve verdadero si se ha hundido el barco;
    public boolean disparar(int filaDisparar, int columnaDisparar) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (tablero[filaDisparar][columnaDisparar] == barco) {
                    return true;
                }
            }

        }
        return false;
    }

    // Un método de instancia visualizacion(), que muestra el tablero de juego de la guerra de barcos.
    public void visualizacion() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
