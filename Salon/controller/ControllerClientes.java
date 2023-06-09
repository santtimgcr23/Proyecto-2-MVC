package Salon.controller;

import Objetos.*;
import Salon.model.*;
import Salon.view.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class ControllerClientes implements ActionListener {
    public Model model;
    ArrayList<Hamburguesa> lista;
    ViewSalon vs;
    ViewCliente vcActual;

    public ControllerClientes(Model model, ViewSalon vs) {
        this.model = model;
        this.vs = vs;
        this.lista = new ArrayList<Hamburguesa>();
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
                        valoresPredeterminadosClassic();
                    }
                });
        vcActual.getBtnSpectre().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.setHamburguesa("La Spectre");
                        vcActual.getLblIngredientes().setText(new HambSpectre().toString());
                        valoresPredeterminadosSpectre();
                    }
                });
        vcActual.getBtnVandal().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.setHamburguesa("La Vandal");
                        vcActual.getLblIngredientes().setText(new HambVandal().toString());
                        valoresPredeterminadosVandal();
                    }
                });
        vcActual.getBtnOperator().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.setHamburguesa("La Operator");
                        vcActual.getLblIngredientes().setText(new HambOperator().toString());
                        valoresPredeterminadosOperator();
                    }
                });
        vcActual.getBtnOdin().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.setHamburguesa("La Odin");
                        vcActual.getLblIngredientes().setText(new HambOdin().toString());
                        valoresPredeterminadosOdin();
                    }
                });

        vcActual.getBtnPan().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.getListaIngredientesActual().add("Pan");
                        int cantidad = Integer.parseInt(vcActual.getLblPan().getText()) + 1;
                        vcActual.getLblPan().setText(cantidad + "");
                        vcActual.getLblIngredientes().setText((vcActual.getLblIngredientes().getText() + "Pan" + "\n"));
                        model.setPrecioAc(model.getPrecioAc() + 400);
                        vcActual.getLblPrecio().setText(model.getPrecioAc() + "");
                    }
                });

        vcActual.getBtnTorta().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.getListaIngredientesActual().add("Torta");
                        int cantidad = Integer.parseInt(vcActual.getLblTorta().getText()) + 1;
                        vcActual.getLblTorta().setText(cantidad + "");
                        vcActual.getLblIngredientes()
                                .setText((vcActual.getLblIngredientes().getText() + "Torta" + "\n"));
                        model.setPrecioAc(model.getPrecioAc() + 500);
                        vcActual.getLblPrecio().setText(model.getPrecioAc() + "");
                    }
                });

        vcActual.getBtnQueso().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.getListaIngredientesActual().add("Queso");
                        int cantidad = Integer.parseInt(vcActual.getLblQueso().getText()) + 1;
                        vcActual.getLblQueso().setText(cantidad + "");
                        vcActual.getLblIngredientes()
                                .setText((vcActual.getLblIngredientes().getText() + "Queso" + "\n"));
                        model.setPrecioAc(model.getPrecioAc() + 400);
                        vcActual.getLblPrecio().setText(model.getPrecioAc() + "");
                    }
                });

        vcActual.getBtnLechuga().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.getListaIngredientesActual().add("Lechuga");
                        int cantidad = Integer.parseInt(vcActual.getLblLechuga().getText()) + 1;
                        vcActual.getLblLechuga().setText(cantidad + "");
                        vcActual.getLblIngredientes()
                                .setText((vcActual.getLblIngredientes().getText() + "Lechuga" + "\n"));
                        model.setPrecioAc(model.getPrecioAc() + 200);
                        vcActual.getLblPrecio().setText(model.getPrecioAc() + "");
                    }
                });

        vcActual.getBtnTomate().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.getListaIngredientesActual().add("Tomate");
                        int cantidad = Integer.parseInt(vcActual.getLblTomate().getText()) + 1;
                        vcActual.getLblTomate().setText(cantidad + "");
                        vcActual.getLblIngredientes()
                                .setText((vcActual.getLblIngredientes().getText() + "Tomate" + "\n"));
                        model.setPrecioAc(model.getPrecioAc() + 200);
                        vcActual.getLblPrecio().setText(model.getPrecioAc() + "");
                    }
                });

        vcActual.getBtnCebolla().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.getListaIngredientesActual().add("Cebolla");
                        int cantidad = Integer.parseInt(vcActual.getLblCebolla().getText()) + 1;
                        vcActual.getLblCebolla().setText(cantidad + "");
                        vcActual.getLblIngredientes()
                                .setText((vcActual.getLblIngredientes().getText() + "Cebolla" + "\n"));
                        model.setPrecioAc(model.getPrecioAc() + 100);
                        vcActual.getLblPrecio().setText(model.getPrecioAc() + "");
                    }
                });

        vcActual.getBtnPepinillos().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        vcActual.getListaIngredientesActual().add("Pepinillos");
                        int cantidad = Integer.parseInt(vcActual.getLblPepinillos().getText()) + 1;
                        vcActual.getLblPepinillos().setText(cantidad + "");
                        vcActual.getLblIngredientes()
                                .setText((vcActual.getLblIngredientes().getText() + "Pepinillos" + "\n"));
                        model.setPrecioAc(model.getPrecioAc() + 100);
                        vcActual.getLblPrecio().setText(model.getPrecioAc() + "");
                    }
                });

        vcActual.getBtnTerminar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        vcActual.getBtnTerminar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.enviarOrdenCliente(new Orden(vcActual.getMesa(), lista));
                vcActual.dispose();
                int mesaNumero = vcActual.getMesa().getNumero();
                vs.getMesas()[mesaNumero].setBackground(Color.RED);
            }
        });

        vcActual.getBtnOrdenar().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        HambFactory hf = new HambFactory();
                        Hamburguesa h = hf.cocinarHamburguesa(vcActual.getHamburguesa());
                        if (vcActual.getHamburguesa() == "La Odin") {
                            h.setIngredientes(vcActual.getListaIngredientesActual());
                            h.setPrecio(model.getPrecioAc());
                        }
                        lista.add(h);
                        vcActual.getLblOrden().setText(vcActual.getLblOrden().getText() + h.getNombre() + " $" + h.getPrecio() + "\n");
                    }
                });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BotonM clickeado = (BotonM) e.getSource();
        clickeado.getMesa().setOcupada(true);
        ViewCliente vc = new ViewCliente();

        vc.setVisible(true);
    }

    public ViewCliente getViewCliente() {
        return this.vcActual;
    }

    // coloca el menu en la forma predeterminada para realizar una hamburguesa
    // personalizada
    public void valoresPredeterminadosOdin() {
        vcActual.getListaIngredientesActual().clear();
        vcActual.getListaIngredientesActual().add("Pan");
        vcActual.getListaIngredientesActual().add("Torta");
        vcActual.getLblPan().setText("1");
        vcActual.getLblTorta().setText("1");
        vcActual.getLblQueso().setText("0");
        vcActual.getLblLechuga().setText("0");
        vcActual.getLblTomate().setText("0");
        vcActual.getLblCebolla().setText("0");
        vcActual.getLblPepinillos().setText("0");
        model.setPrecioAc(700);
        vcActual.getLblPrecio().setText(model.getPrecioAc() + "");
        activarIngredientes();
    }

    public void valoresPredeterminadosOperator() {
        vcActual.getListaIngredientesActual().clear();
        vcActual.getListaIngredientesActual().add("Pan");
        vcActual.getListaIngredientesActual().add("Torta");
        vcActual.getListaIngredientesActual().add("Torta");
        vcActual.getListaIngredientesActual().add("Torta");
        vcActual.getListaIngredientesActual().add("Queso");
        vcActual.getListaIngredientesActual().add("Queso");
        vcActual.getListaIngredientesActual().add("Queso");
        vcActual.getListaIngredientesActual().add("Pepinillos");
        vcActual.getLblPan().setText("1");
        vcActual.getLblTorta().setText("3");
        vcActual.getLblQueso().setText("3");
        vcActual.getLblLechuga().setText("0");
        vcActual.getLblTomate().setText("0");
        vcActual.getLblCebolla().setText("0");
        vcActual.getLblPepinillos().setText("0");
        desactivarIngredientes();
    }

    public void valoresPredeterminadosVandal() {
        vcActual.getListaIngredientesActual().clear();
        vcActual.getListaIngredientesActual().add("Lechuga");
        vcActual.getListaIngredientesActual().add("Lechuga");
        vcActual.getListaIngredientesActual().add("Torta");
        vcActual.getListaIngredientesActual().add("Queso");
        vcActual.getListaIngredientesActual().add("Tomate");
        vcActual.getListaIngredientesActual().add("Cebolla");
        vcActual.getListaIngredientesActual().add("Pepinillos");
        vcActual.getLblPan().setText("0");
        vcActual.getLblTorta().setText("1");
        vcActual.getLblQueso().setText("1");
        vcActual.getLblLechuga().setText("2");
        vcActual.getLblTomate().setText("1");
        vcActual.getLblCebolla().setText("1");
        vcActual.getLblPepinillos().setText("1");
        desactivarIngredientes();
    }

    public void valoresPredeterminadosSpectre() {
        vcActual.getListaIngredientesActual().clear();
        vcActual.getListaIngredientesActual().add("Pan");
        vcActual.getListaIngredientesActual().add("Torta");
        vcActual.getListaIngredientesActual().add("Queso");
        vcActual.getListaIngredientesActual().add("Cebolla");
        vcActual.getListaIngredientesActual().add("Pepinillos");
        vcActual.getLblPan().setText("1");
        vcActual.getLblTorta().setText("1");
        vcActual.getLblQueso().setText("1");
        vcActual.getLblLechuga().setText("0");
        vcActual.getLblTomate().setText("0");
        vcActual.getLblCebolla().setText("1");
        vcActual.getLblPepinillos().setText("1");
        desactivarIngredientes();
    }

    public void valoresPredeterminadosClassic() {
        vcActual.getListaIngredientesActual().clear();
        vcActual.getListaIngredientesActual().add("Pan");
        vcActual.getListaIngredientesActual().add("Torta");
        vcActual.getListaIngredientesActual().add("Queso");
        vcActual.getLblPan().setText("1");
        vcActual.getLblTorta().setText("1");
        vcActual.getLblQueso().setText("1");
        vcActual.getLblLechuga().setText("0");
        vcActual.getLblTomate().setText("0");
        vcActual.getLblCebolla().setText("0");
        vcActual.getLblPepinillos().setText("0");
        desactivarIngredientes();
    }

    public void activarIngredientes() {
        vcActual.getBtnPan().setEnabled(true);
        vcActual.getBtnTorta().setEnabled(true);
        vcActual.getBtnQueso().setEnabled(true);
        vcActual.getBtnLechuga().setEnabled(true);
        vcActual.getBtnTomate().setEnabled(true);
        vcActual.getBtnCebolla().setEnabled(true);
        vcActual.getBtnPepinillos().setEnabled(true);
    }

    public void desactivarIngredientes() {
        vcActual.getBtnPan().setEnabled(false);
        vcActual.getBtnTorta().setEnabled(false);
        vcActual.getBtnQueso().setEnabled(false);
        vcActual.getBtnLechuga().setEnabled(false);
        vcActual.getBtnTomate().setEnabled(false);
        vcActual.getBtnCebolla().setEnabled(false);
        vcActual.getBtnPepinillos().setEnabled(false);

    }

}
