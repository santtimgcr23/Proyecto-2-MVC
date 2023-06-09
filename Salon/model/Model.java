package Salon.model;

import Objetos.*;

import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.io.IOException;

import java.net.*;
import java.io.*;

public class Model {

    int precioAc;

    Orden ordenServidor;
    Socket clientServidor;
    ServerSocket server;
    ObjectInputStream input;

    ArrayList<Orden> ordenes = new ArrayList<Orden>();
    public ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    public ArrayList<Mesa> mesasLibres = new ArrayList<Mesa>();
    public ArrayList<Mesa> mesasOcupadas = new ArrayList<Mesa>();

    // instancias servidor
    Socket client;
    ObjectOutputStream output;

    public Model() {
        crearMesas();
        listarLibresYOcupadas();
    }

    public Orden AbrirServidor() {
        try {
            server = new ServerSocket(7777);
            clientServidor = server.accept();
            input = new ObjectInputStream(clientServidor.getInputStream());
            ordenServidor = (Orden) input.readObject();
            input.close();
            clientServidor.close();
            server.close();
            String respuesta = ordenServidor.toString();
            System.out.println(respuesta);
            return ordenServidor;
        } catch (Exception e) {
            System.out.println(e);
            return ordenServidor;
        }
    }

    public void crearMesas() {
        for (int i = 0; i < 15; i++) {
            mesas.add(new Mesa(i + 1, false));
        }
    }

    public void listarLibresYOcupadas() {
        for (int i = 0; i < mesas.size(); i++) {
            if (!(mesas.get(i).isOcupada())) {
                mesasLibres.add(mesas.get(i));
            } else {
                mesasOcupadas.add(mesas.get(i));
            }
        }
    }

    public void moverMesas() {
        for (int i = 0; i < mesasLibres.size(); i++) {
            if (mesasLibres.get(i).isOcupada()) {
                mesasOcupadas.add(mesasLibres.get(i));
                mesasLibres.remove(mesasLibres.get(i));
            }
        }
        for (int i = 0; i < mesasOcupadas.size(); i++) {
            if (!(mesasLibres.get(i).isOcupada())) {
                mesasLibres.add(mesasOcupadas.get(i));
                mesasOcupadas.remove(mesasOcupadas.get(i));
            }
        }
    }

    public void addOrden(Orden orden) {
        ordenes.add(orden);
    }

    public void enviarOrdenCliente(Orden orden) {
        try {
            client = new Socket("127.0.0.1", 5555);
            output = new ObjectOutputStream(client.getOutputStream());
            output.writeObject(orden);
            output.flush();
            System.out.println("Enviado correctamente!");

            output.close();
            client.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void printOrdenes() {
        System.out.println("ORDENES PENDIENTES: ");
        for (Orden orden : ordenes) {
            System.out.println("------------------\n");
            System.out.println(orden.toString());
        }
    }

    public int getPrecioAc() {
        return precioAc;
    }

    public void setPrecioAc(int precioAc) {
        this.precioAc = precioAc;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public ArrayList<Mesa> getMesasLibres() {
        return mesasLibres;
    }

    public void setMesasLibres(ArrayList<Mesa> mesasLibres) {
        this.mesasLibres = mesasLibres;
    }

    public ArrayList<Mesa> getMesasOcupadas() {
        return mesasOcupadas;
    }

    public void setMesasOcupadas(ArrayList<Mesa> mesasOcupadas) {
        this.mesasOcupadas = mesasOcupadas;
    }

}
