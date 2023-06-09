package Salon.controller;

import Objetos.*;
import Salon.model.*;
import Salon.view.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControllerClientes implements ActionListener {
    public Model model;
    ViewSalon vs;
    ViewCliente vcActual;

    public ControllerClientes(Model model, ViewSalon vs) {
        this.model = model;
        this.vs = vs;
        procesoAbrirServidor();
    }

    public void addActionListener() {
        this.vcActual = new ViewCliente();
        this.vcActual.setVisible(true);
        addActionListeners();
    }

    public void procesoAbrirServidor() {
        Thread hilo = new Thread(() -> {
            while (true) {
                System.out.println("Abre servidor salon");
                Orden ordenPorEliminar = model.AbrirServidor();
                // completa mesa en view
                vs.getMesas()[ordenPorEliminar.getMesa().getNumero()].setBackground(new Color(202, 127, 104));
                vs.getMesas()[ordenPorEliminar.getMesa().getNumero()].getMesa().setOcupada(false);
            }
        });
        hilo.start();
    }

    public void addActionListeners() {
        vcActual.getBtnClassic().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.setHamburguesa("La Classic");
                        vcActual.getLblIngredientes().setText(new HambClassic().toString());
                    }
                });
        vcActual.getBtnSpectre().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.setHamburguesa("La Spectre");
                        vcActual.getLblIngredientes().setText(new HambSpectre().toString());
                    }
                });
        vcActual.getBtnVandal().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.setHamburguesa("La Vandal");
                        vcActual.getLblIngredientes().setText(new HambVandal().toString());
                    }
                });
        vcActual.getBtnOperator().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.setHamburguesa("La Operator");
                        vcActual.getLblIngredientes().setText(new HambOperator().toString());
                    }
                });
        vcActual.getBtnOdin().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.setHamburguesa("La Spectre");
                        vcActual.getLblIngredientes().setText(new HambOdin().toString());
                    }
                });
        vcActual.getBtnOrdenar().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        HambFactory hf = new HambFactory();
                        Hamburguesa h = hf.cocinarHamburguesa(vcActual.getHamburguesa());
                        Orden orden = new Orden(vcActual.getMesa(), h, h.getPrecio());
                        System.out.println("Información enviada");
                        System.out.println(vcActual.getMesa());
                        model.enviarOrdenCliente(orden);
                        vcActual.dispose();

                        int mesaNumero = vcActual.getMesa().getNumero();
                        vs.getMesas()[mesaNumero].setBackground(Color.RED);
                    }
                });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BotonM clickeado = (BotonM) e.getSource();
        clickeado.getMesa().setOcupada(true);
        ViewCliente vc = new ViewCliente();
        System.out.println("WAZIN");

        vc.setVisible(true);
    }

    public ViewCliente getViewCliente() {
        return this.vcActual;
    }

}
