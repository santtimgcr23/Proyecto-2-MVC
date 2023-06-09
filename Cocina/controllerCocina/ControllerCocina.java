package Cocina.controllerCocina;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Objetos.*;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Cocina.modelCocina.ModelCocina;
import Cocina.viewCocina.ViewCocina;

public class ControllerCocina {
    public ModelCocina model;
    ViewCocina vc;

    public ControllerCocina(ModelCocina model, ViewCocina vc) {
        this.model = model;
        this.vc = vc;
        procesoAbrirServidor();
        addActionListeners();
    }

    public void detalleEnVista() {
        JList<Orden> lista = vc.getOrdenList();
        lista.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                Orden ordenSeleccionada = lista.getSelectedValue();
                if (ordenSeleccionada != null) {
                    vc.getTxtOrden()
                            .setText(ordenSeleccionada.toString3());
                }
            }
        });
    }

    public void agregarOrdenesAlJList() {
        DefaultListModel<Orden> modelo = new DefaultListModel<>();
        for (Orden orden : model.getOrdenes()) {
            modelo.addElement(orden);
        }
        vc.getOrdenList().setModel(modelo);
    }

    public void procesoAbrirServidor() {
        Thread hilo = new Thread(() -> {
            while (true) {
                Orden OrdenPorAnadir = model.AbrirServidor();
                model.addOrden(OrdenPorAnadir);
                agregarOrdenesAlJList();
                detalleEnVista();
            }
        });
        hilo.start();
    }

    public void addActionListeners() {
        vc.getBtnCompletar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Orden ordenPorEliminar = vc.getOrdenList().getSelectedValue();
                model.eliminarOrden(ordenPorEliminar);
                agregarOrdenesAlJList();
                detalleEnVista();
                model.enviarOrdenPorEliminar(ordenPorEliminar);
                Factura f = new Factura(ordenPorEliminar);
                f.agregarFactura();
                vc.getTxtOrden().setText("");
            }
        });
    }

    /*
     * public void addActionListeners() {
     * vc.getBtnClassic().addActionListener(
     * new ActionListener() {
     * public void actionPerformed(ActionEvent e) {
     * vc.setHamburguesa("La Classic");
     * vc.getLblIngredientes().setText(new HambClassic().toString());
     * }
     * });
     * vc.getBtnSpectre().addActionListener(
     * new ActionListener() {
     * public void actionPerformed(ActionEvent e) {
     * vc.setHamburguesa("La Spectre");
     * vc.getLblIngredientes().setText(new HambSpectre().toString());
     * }
     * });
     * vc.getBtnVandal().addActionListener(
     * new ActionListener() {
     * public void actionPerformed(ActionEvent e) {
     * vc.setHamburguesa("La Vandal");
     * vc.getLblIngredientes().setText(new HambVandal().toString());
     * }
     * });
     * vc.getBtnOperator().addActionListener(
     * new ActionListener() {
     * public void actionPerformed(ActionEvent e) {
     * vc.setHamburguesa("La Operator");
     * vc.getLblIngredientes().setText(new HambOperator().toString());
     * }
     * });
     * vc.getBtnOdin().addActionListener(
     * new ActionListener() {
     * public void actionPerformed(ActionEvent e) {
     * vc.setHamburguesa("La Spectre");
     * vc.getLblIngredientes().setText(new HambOdin().toString());
     * }
     * });
     * vc.getBtnOrdenar().addActionListener(
     * new ActionListener() {
     * public void actionPerformed(ActionEvent e) {
     * HambFactory hf = new HambFactory();
     * Hamburguesa h = hf.cocinarHamburguesa(vc.getHamburguesa());
     * Orden orden = new Orden(vc.getMesa(), h, h.getPrecio());
     * model.addOrden(orden);
     * ViewCocina vco = new ViewCocina();
     * ControllerCocina cc = new ControllerCocina(model, vco);
     * vco.setVisible(true);
     * }
     * });
     * }
     */
}
