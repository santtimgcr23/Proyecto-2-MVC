package Objetos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Orden implements Serializable {
    Mesa mesa;
    ArrayList<Hamburguesa> hamburguesas;
    int precio;
    String codigo;
    boolean completada = false;

    public Orden(Mesa mesa, ArrayList<Hamburguesa> hamburguesas) {
        this.mesa = mesa;
        this.codigo = generarCodigo();
        this.hamburguesas = hamburguesas;
        ponerPrecio();
    }

    public void addHamburguesa(Hamburguesa h){
        hamburguesas.add(h);
    }

    public void ponerPrecio(){
        int total = 0;
        for (int i = 0; i < hamburguesas.size(); i++) {
            total += hamburguesas.get(i).getPrecio();
        }
        setPrecio(total);
    }

    public String generarCodigo() {
        Random r = new Random();
        int num = r.nextInt(999999);
        return String.format("%06d", num);
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void facturarOrden() {
        Factura factura = new Factura(this);
        factura.agregarFactura();
    }

    public String toString() {
        return "ORDEN #" + codigo;
    }


    public String toString3() {
        String s = "ORDEN # " + codigo + "\n";
        for (int i = 0; i < hamburguesas.size(); i++){
            s += hamburguesas.get(i).getNombre() + " $" + hamburguesas.get(i).getPrecio()+"\n";
        }
        s += "TOTAL: " + precio;
        return s;   
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Hamburguesa> getHamburguesas() {
        return hamburguesas;
    }

    public void setHamburguesas(ArrayList<Hamburguesa> hamburguesas) {
        this.hamburguesas = hamburguesas;
    }

    
}
