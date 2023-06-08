package Cocina.modelCocina;

import java.io.ObjectInputStream;
import java.net.ServerSocket;

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

    Orden ordenServidor;
    Socket client;
    ServerSocket server;
    ObjectInputStream input;

    public ModelCocina() {
        System.out.println("Viva peru");
    }

    public void AbrirServidor() {
        Thread hilo = new Thread(() -> {
            try {
                server = new ServerSocket(5555);
                client = server.accept();
                input = new ObjectInputStream(client.getInputStream());
                System.out.println("Orden recibida");
                ordenServidor = (Orden) input.readObject();
                input.close();
                client.close();
                server.close();
                System.out.println("Among us");
                String respuesta = ordenServidor.toString();
                System.out.println(respuesta);
            } catch (Exception e) {
                System.out.println(e);
            }
        });
        hilo.start();
    }

}
