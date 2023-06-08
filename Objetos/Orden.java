package Objetos;

import java.io.Serializable;
import java.util.Random;

public class Orden implements Serializable {
    int mesa;
    Hamburguesa hamburguesa;
    int precio;
    String codigo;
    Factura factura;
    boolean completada = false;

    public Orden(int mesa, Hamburguesa hamburguesa, int precio) {
        this.mesa = mesa;
        this.codigo = generarCodigo();
        this.hamburguesa = hamburguesa;
        this.precio = precio;
    }

    public Factura getFactura() {
        return factura;
    }

    public String generarCodigo() {
        Random r = new Random();
        int num = r.nextInt(999999);
        return String.format("%06d", num);
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    public void setHamburguesa(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void facturarOrden() {
        this.factura = new Factura(this);
    }

    public String toString() {
        return "ORDEN #" + codigo;
    }

    public String toString2() {
        facturarOrden();
        return factura.toString();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
