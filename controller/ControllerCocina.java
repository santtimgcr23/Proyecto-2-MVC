package controller;

import java.awt.Component;
import java.util.ArrayList;

import model.*;import view.*;

import javax.swing.BoxLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ControllerCocina {
    Model model;
    ViewCocina vista;

    public ControllerCocina(Model model, ViewCocina vista){
        this.model = model;
        this.vista = vista;
        agregarOrdenesAlJList();
        detalleEnVista();
    }

    public void detalleEnVista(){
        JList<Orden> lista = vista.getOrdenList();
        lista.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e) {
                Orden ordenSeleccionada = lista.getSelectedValue();
                if (ordenSeleccionada != null) {
                    vista.getTxtOrden().setText(ordenSeleccionada.toString2());
                }
        }});
    }

    public void agregarOrdenesAlJList() {
        DefaultListModel<Orden> modelo = new DefaultListModel<>();
        for (Orden orden : model.getOrdenes()) {
            modelo.addElement(orden);
        }
        vista.getOrdenList().setModel(modelo);
    }

}
