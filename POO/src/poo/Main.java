package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option = 0;
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Ejercicio4 ejercicio4 = new Ejercicio4();


        do {
            try {
                System.out.println("\n***************************");
                System.out.println("Elija una de las opciones: ");
                menu();
                option = teclado.nextInt();
                switch (option) {
                    case 1:
                        break;
                    case 2:
                        ejercicio2.clientes(Scanner teclado);
                        break;
                    case 3:
                        ejercicio3.guerraBarcosv3(teclado);
                        break;
                    case 4:
                        ejercicio4.guerraBarcosv4(teclado);
                        break;
                    case 5:
                        System.out.println("¡Muchas gracias!");
                        break;

                    default:
                        System.out.println("La opción elegida no existe. ");


                }
            } catch (InputMismatchException e) {
                System.out.println();
                teclado.nextLine();
            }
        } while (option != 5);
    }




    private static void menu() {

        System.out.println("1. Los dados");
        System.out.println("2. Los clientes");
        System.out.println("3. Micro guerra de barcos v3");
        System.out.println("4. Micro guerra de barcos v4");

        System.out.println("5. Salir");

    }

}