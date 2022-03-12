package poo;

public class Cliente {
    private String nombre;
    private int numeroDeCliente;

    public Cliente(String nombre, int numeroDeCliente) {
        this.nombre = nombre;
        this.numeroDeCliente = numeroDeCliente;
    }


    public void mostrar() {
        System.out.println("Cliente: " + nombre + "\nNúmero de cliente: " + numeroDeCliente + "\n");
    }


}

    
    
    


    

