package poo;


public class Cliente {
    private String nombre;
    private  int numeroDeCliente;

    public Cliente(String nombre, int numeroDeCliente) {
        this.nombre = nombre;
        this.numeroDeCliente = numeroDeCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeCliente() {
        return this.numeroDeCliente;
    }

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    /** ESTO NO FUNCIONA !!!!!!!
    
    package poo;


public class Cliente {
    private String nombre;
    private  int numeroDeCliente;

    public Cliente(String nombre, int numeroDeCliente) {
        this.nombre = nombre;
        this.numeroDeCliente = numeroDeCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeCliente() {
        return this.numeroDeCliente;
    }

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }
    
    public String mostrar() {
        return "Cliente: " + getNombre() + "\nNúmero de cliente: " + getNumeroDeCliente() + "\n";
    }
}

    
    
    
     */

    
}
