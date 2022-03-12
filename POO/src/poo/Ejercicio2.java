package poo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio2 {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    Random rd = new Random();
    Scanner teclado = new Scanner(System.in);

    public void clientes(Scanner teclado) {
        int opcion = 0;
        int bandera = 0;
        do {
            try {
                menu();
                System.out.println("¿Qué quieres hacer?");
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch (opcion) {
                    case 1:
                        //   clientes.forEach(c -> System.out.println("Cliente: " + c.getNombre() + "\nNúmero de cliente: " + c.getNumeroDeCliente() + "\n"));
                        //  ESTO NO FUNCIONA
                        clientes.forEach(c -> c.mostrar());
                        break;
                    case 2:
                        System.out.println("¿Cuál es el nombre del cliente?");
                        String nombre = teclado.nextLine();

                        int numeroDeCliente = rd.nextInt(100000001);
                        bandera++;
                        Cliente cliente = new Cliente(nombre, numeroDeCliente);
                        clientes.add(cliente);

                        System.out.println("Cliente n.°" + bandera + " [" + nombre + "] añadido");
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un caracter numérico");
                teclado.nextLine();
            }

        } while (opcion != 3);

    }

    private void menu() {
        System.out.println("--Menu--");
        System.out.println("1 - Mostrar clientes");
        System.out.println("2 - Añadir cliente");
        System.out.println("3 - Salir");
    }
}
