package Salon.view;

import javax.swing.JButton;

import Objetos.Mesa;

public class BotonM extends JButton {
    Mesa mesa;

    public BotonM(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    

}
