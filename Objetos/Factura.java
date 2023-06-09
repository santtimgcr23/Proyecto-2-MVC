package Objetos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Factura implements Serializable {
    String codigo;
    Mesa mesa;
    int precio = 0;
    ArrayList<Hamburguesa> hamb;
    Orden orden;

    public Factura(Orden orden) {
        this.codigo = orden.getCodigo();
        this.mesa = orden.getMesa();
        this.hamb = orden.getHamburguesas();
    }

    public void agregarFactura() {
        String fileName = "facturas.txt";
        String s = toString();

        File file = new File(fileName);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String toString() {
        String s = "---------------------------\nLA COCINA DE ICEBOX\n";
        s += "ORDEN NÚMERO " + codigo + "";
        s += "\nDETALLES DE LA COMPRA:\n";
        for (int i = 0; i < hamb.size(); i++){
            s += hamb.get(i).getNombre() + "\nPRECIO: $" + hamb.get(i).getPrecio()+"\n";
            precio += hamb.get(i).getPrecio();
        }
        s += "\nTOTAL: $" + precio;
        s += "\n¡GRACIAS POR SU VISITA!\n---------------------------";
        return s;
    }
}
