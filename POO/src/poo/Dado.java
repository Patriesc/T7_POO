package poo;

public class Dado {
    private int n_caras;
    private int ultima_cara;

    public Dado(int n_caras) {
        this.n_caras = n_caras;
        this.ultima_cara = 0;
    }

    public Dado() {
        this.n_caras = 6;
        this.ultima_cara = 0;
    }

    public int getN_caras() {
        return n_caras;
    }

    public int getUltima_cara() {
        return ultima_cara;
    }

    public int tirar() {
        this.ultima_cara = (int) (Math.random() * this.getN_caras() + 1);
        return this.getUltima_cara();
    }
}
