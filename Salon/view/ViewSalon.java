package Salon.view;

import javax.swing.*;

import Objetos.Mesa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewSalon extends JFrame implements ActionListener {
    private BotonM[] mesas;

    public ViewSalon() {
        setTitle("Seleccionar Mesa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 5));
        mesas = new BotonM[20];

        for (int i = 0; i < 20; i++) {
            mesas[i] = new BotonM(new Mesa(i, false));
            mesas[i].addActionListener(this); 
            mesas[i].setPreferredSize(new Dimension(100,100));// Add ActionListener
            add(mesas[i]);
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BotonM clickeado = (BotonM)e.getSource();
        clickeado.getMesa().setOcupada(true);
        ViewCliente vc = new ViewCliente();
        vc.setVisible(true);
        this.dispose();
    }
    
}
