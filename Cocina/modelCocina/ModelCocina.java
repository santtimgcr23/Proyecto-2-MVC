package Cocina.modelCocina;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.*;

import java.io.*;

import Objetos.*;

public class ModelCocina {

    // servidor instancias
    Orden ordenServidor;
    Socket client;
    ServerSocket server;
    ObjectInputStream input;

    // cliente instancias
    Socket cliente;
    ObjectOutputStream output;

    ArrayList<Orden> ordenes = new ArrayList<Orden>();
    public ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    public ArrayList<Mesa> mesasLibres = new ArrayList<Mesa>();
    public ArrayList<Mesa> mesasOcupadas = new ArrayList<Mesa>();

    public ModelCocina() {
        System.out.println("Viva peru");
        crearMesas();
        listarLibresYOcupadas();
    }

    public Orden AbrirServidor() {
        try {
            server = new ServerSocket(5555);
            client = server.accept();
            input = new ObjectInputStream(client.getInputStream());
            ordenServidor = (Orden) input.readObject();
            input.close();
            client.close();
            server.close();
            String respuesta = ordenServidor.toString();
            System.out.println(respuesta);
            return ordenServidor;
        } catch (Exception e) {
            System.out.println(e);
            return ordenServidor;
        }
    }

    public void enviarOrdenPorEliminar(Orden orden) {
        try {
            cliente = new Socket("127.0.0.1", 7777);
            output = new ObjectOutputStream(cliente.getOutputStream());
            output.writeObject(orden);
            output.flush();
            System.out.println("Enviado correctamente!");

            output.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println(e);
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

    public void printOrdenes() {
        System.out.println("ORDENES PENDIENTES: ");
        for (Orden orden : ordenes) {
            System.out.println("------------------\n");
            System.out.println(orden.toString());
        }
    }

    public void eliminarOrden(Orden orden) {
        int pivote = 0;
        while (ordenes.get(pivote) != orden) {
            pivote++;
        }
        if (ordenes.get(pivote) == orden) {
            ordenes.remove(pivote);
        }
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
