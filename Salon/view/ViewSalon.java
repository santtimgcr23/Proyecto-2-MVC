package Salon.view;

import javax.swing.*;

import Objetos.Mesa;
import Salon.controller.ControllerClientes;
import Salon.model.Model;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewSalon extends JFrame implements ActionListener {
    private BotonM[] mesas;
    ControllerClientes c;

    public ViewSalon() {
        setTitle("Seleccionar Mesa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 5));
        mesas = new BotonM[20];

        for (int i = 0; i < 20; i++) {
            mesas[i] = new BotonM(new Mesa(i, false));
            mesas[i].addActionListener(this);
            mesas[i].setPreferredSize(new Dimension(100, 100));// Add ActionListener
            mesas[i].setBackground(new Color(202, 127, 104));
            add(mesas[i]);
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        Model m = new Model();
        c = new ControllerClientes(m, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BotonM clickeado = (BotonM) e.getSource();
        if (clickeado.getMesa().isOcupada() == true) {

        } else {
            clickeado.getMesa().setOcupada(true);
            c.addActionListener();
            c.getViewCliente().setMesa(clickeado.getMesa());
        }
    }

    public BotonM[] getMesas() {
        return mesas;
    }

}
