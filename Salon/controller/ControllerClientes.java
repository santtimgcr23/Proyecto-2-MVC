package Salon.controller;

import Objetos.*;
import Salon.model.*;
import Salon.view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerClientes implements ActionListener {
    public Model model;
    ViewCliente vc;

    public ControllerClientes(Model model, ViewCliente vc) {
        this.model = model;
        this.vc = vc;
        addActionListeners();
    }

    public void addActionListeners() {
        vc.getBtnClassic().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vc.setHamburguesa("La Classic");
                        vc.getLblIngredientes().setText(new HambClassic().toString());
                    }
                });
        vc.getBtnSpectre().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vc.setHamburguesa("La Spectre");
                        vc.getLblIngredientes().setText(new HambSpectre().toString());
                    }
                });
        vc.getBtnVandal().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vc.setHamburguesa("La Vandal");
                        vc.getLblIngredientes().setText(new HambVandal().toString());
                    }
                });
        vc.getBtnOperator().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vc.setHamburguesa("La Operator");
                        vc.getLblIngredientes().setText(new HambOperator().toString());
                    }
                });
        vc.getBtnOdin().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vc.setHamburguesa("La Spectre");
                        vc.getLblIngredientes().setText(new HambOdin().toString());
                    }
                });
        vc.getBtnOrdenar().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        HambFactory hf = new HambFactory();
                        Hamburguesa h = hf.cocinarHamburguesa(vc.getHamburguesa());
                        Orden orden = new Orden(vc.getMesa(), h, h.getPrecio());
                        model.addOrden(orden);
                        ViewCocina vco = new ViewCocina();
                        ControllerCocina cc = new ControllerCocina(model, vco);
                        vco.setVisible(true);
                    }
                });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
