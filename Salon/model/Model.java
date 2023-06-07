package Salon.model;

import Objetos.*;

import java.util.ArrayList;

public class Model {
    ArrayList<Orden> ordenes = new ArrayList<Orden>();
    public ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    public ArrayList<Mesa> mesasLibres = new ArrayList<Mesa>();
    public ArrayList<Mesa> mesasOcupadas = new ArrayList<Mesa>();

    public Model() {
        crearMesas();
        listarLibresYOcupadas();
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
