package Objetos;

public class Mesa {
    int numero;
    boolean ocupada;

    public Mesa(int numero, boolean ocupada) {
        this.numero = numero;
        this.ocupada = ocupada;
    }

    public String toString() {
        return "Mesa " + numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}