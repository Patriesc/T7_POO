package poo;

public class Ejercicio1 {
        
        //Creación de dados
        Dado dado6 = new Dado();
        Dado dado10 = new Dado(10);
        Dado dado12 = new Dado(12);
        
        //Creación de variables resultados
        int res1;
        int res2;
        int res3;
        
        //Realizar tiradas y guardar los resultados
        do{
            res1 = dado6.tirar();
            res2 = dado10.tirar();
            res3 = dado12.tirar();
        }
        while(res1 + res2 + res3 < 20); //Repetir hasta que estos resultados sumen 20 o más
        
        //Mostrar el resultado
        System.out.println("Al tirar los dados ha salido: \n Primer dado "+res1+"\n Segundo dado "+res2+"\n Tercer dado "+res3);

         */

}
