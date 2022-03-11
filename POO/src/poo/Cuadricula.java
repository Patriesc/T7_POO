package poo;

public class Cuadricula {
    private final int SIZE = 10;
    private char[][] tablero = new char[SIZE][SIZE];
    private final char barco = 'X';
    private final char agua = '~';

    public Cuadricula() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tablero[i][j] = agua;
            }
        }

    }

    public void depositarBarco(int filaBarco, int columnaBarco) {
        tablero[filaBarco][columnaBarco] = barco;
    }

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

    public void visualizacion(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
