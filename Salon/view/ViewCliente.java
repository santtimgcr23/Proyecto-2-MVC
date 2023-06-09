package Salon.view;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

import Objetos.Mesa;
import Salon.controller.Observable;
import Salon.controller.Observador;
import Salon.model.*;

public class ViewCliente extends javax.swing.JFrame {
        Mesa mesa;

        String hamburguesa;

        ArrayList<String> listaIngredientesActual;
        int precioActual;

        public ViewCliente() {
                this.listaIngredientesActual = new ArrayList<>();
                this.precioActual = 0;
                setTitle("Cliente - Ordenar");
                setLocationRelativeTo(null);
                initComponents();
        }

        private void initComponents() {

                jScrollBar1 = new javax.swing.JScrollBar();
                jLabel9 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                btnSpectre = new javax.swing.JButton();
                simular = new javax.swing.JButton();
                btnClassic = new javax.swing.JButton();
                btnVandal = new javax.swing.JButton();
                btnOperator = new javax.swing.JButton();
                btnOdin = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                lblIngredientes = new javax.swing.JTextArea();
                btnPan = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                lblPan = new javax.swing.JLabel();
                lblTorta = new javax.swing.JLabel();
                btnTorta = new javax.swing.JButton();
                lblQueso = new javax.swing.JLabel();
                btnQueso = new javax.swing.JButton();
                lblLechuga = new javax.swing.JLabel();
                btnLechuga = new javax.swing.JButton();
                btnTomate = new javax.swing.JButton();
                lblTomate = new javax.swing.JLabel();
                lblCebolla = new javax.swing.JLabel();
                btnCebolla = new javax.swing.JButton();
                btnPepinillos = new javax.swing.JButton();
                lblPepinillos = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                listOrden = new javax.swing.JList<>();
                jScrollPane3 = new javax.swing.JScrollPane();
                lblOrden = new javax.swing.JTextArea();
                btnOrdenar = new javax.swing.JButton();
                btnTerminar = new javax.swing.JButton();
                jLabel11 = new javax.swing.JLabel();
                lblPrecio = new javax.swing.JLabel();

                jLabel9.setText("jLabel9");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(217, 246, 255));

                jLabel1.setBackground(new java.awt.Color(164, 209, 224));
                jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                jLabel1.setText("Pan");
                jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jLabel1.setOpaque(true);

                btnSpectre.setBackground(new java.awt.Color(177, 222, 224));
                btnSpectre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                btnSpectre.setText("Spectre");
                btnSpectre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                btnClassic.setBackground(new java.awt.Color(177, 222, 224));
                btnClassic.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                btnClassic.setText("Classic");
                btnClassic.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                btnVandal.setBackground(new java.awt.Color(177, 222, 224));
                btnVandal.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                btnVandal.setText("Vandal");
                btnVandal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                btnOperator.setBackground(new java.awt.Color(177, 222, 224));
                btnOperator.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                btnOperator.setText("Operator");
                btnOperator.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                btnOdin.setBackground(new java.awt.Color(177, 222, 224));
                btnOdin.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                btnOdin.setText("Odin (custom)");
                btnOdin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                lblIngredientes.setEditable(false);
                lblIngredientes.setBackground(new java.awt.Color(255, 255, 255));
                lblIngredientes.setColumns(20);
                lblIngredientes.setRows(5);
                jScrollPane1.setViewportView(lblIngredientes);

                btnPan.setText("+");

                jLabel2.setBackground(new java.awt.Color(164, 209, 224));
                jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
                jLabel2.setText("Restaurante de Pearl");
                jLabel2.setOpaque(true);

                jLabel3.setBackground(new java.awt.Color(164, 209, 224));
                jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                jLabel3.setText("Torta");
                jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jLabel3.setOpaque(true);

                jLabel4.setBackground(new java.awt.Color(164, 209, 224));
                jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                jLabel4.setText("Queso");
                jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jLabel4.setOpaque(true);

                jLabel5.setBackground(new java.awt.Color(164, 209, 224));
                jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                jLabel5.setText("Lechuga");
                jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jLabel5.setOpaque(true);

                jLabel6.setBackground(new java.awt.Color(164, 209, 224));
                jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                jLabel6.setText("Tomate");
                jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jLabel6.setOpaque(true);

                jLabel7.setBackground(new java.awt.Color(164, 209, 224));
                jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                jLabel7.setText("Cebolla");
                jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jLabel7.setOpaque(true);

                jLabel8.setBackground(new java.awt.Color(164, 209, 224));
                jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                jLabel8.setText("Pepinillos");
                jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jLabel8.setOpaque(true);

                lblPan.setBackground(new java.awt.Color(177, 222, 224));
                lblPan.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                lblPan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                lblPan.setOpaque(true);

                lblTorta.setBackground(new java.awt.Color(177, 222, 224));
                lblTorta.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                lblTorta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                lblTorta.setOpaque(true);

                btnTorta.setText("+");

                lblQueso.setBackground(new java.awt.Color(177, 222, 224));
                lblQueso.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                lblQueso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                lblQueso.setOpaque(true);

                btnQueso.setText("+");

                lblLechuga.setBackground(new java.awt.Color(177, 222, 224));
                lblLechuga.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                lblLechuga.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                lblLechuga.setOpaque(true);

                btnLechuga.setText("+");

                btnTomate.setText("+");

                lblTomate.setBackground(new java.awt.Color(177, 222, 224));
                lblTomate.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                lblTomate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                lblTomate.setOpaque(true);

                lblCebolla.setBackground(new java.awt.Color(177, 222, 224));
                lblCebolla.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                lblCebolla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                lblCebolla.setOpaque(true);

                btnCebolla.setText("+");

                btnPepinillos.setText("+");

                lblPepinillos.setBackground(new java.awt.Color(177, 222, 224));
                lblPepinillos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                lblPepinillos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                lblPepinillos.setOpaque(true);

                jLabel10.setBackground(new java.awt.Color(164, 209, 224));
                jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                jLabel10.setText("Resumen orden");
                jLabel10.setOpaque(true);

                jScrollPane2.setViewportView(listOrden);

                lblOrden.setEditable(false);
                lblOrden.setBackground(new java.awt.Color(255, 255, 255));
                lblOrden.setColumns(20);
                lblOrden.setRows(5);
                jScrollPane3.setViewportView(lblOrden);

                simular.setBackground(new java.awt.Color(177, 222, 224));
                simular.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                simular.setText("Simular Orden");
                simular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                btnOrdenar.setBackground(new java.awt.Color(177, 222, 224));
                btnOrdenar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                btnOrdenar.setText("Ordenar");
                btnOrdenar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                btnTerminar.setBackground(new java.awt.Color(177, 222, 224));
                btnTerminar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                btnTerminar.setText("Terminar Orden");
                btnTerminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabel11.setBackground(new java.awt.Color(177, 222, 224));
                jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                jLabel11.setText("Precio");
                jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jLabel11.setOpaque(true);

                lblPrecio.setBackground(new java.awt.Color(177, 222, 224));
                lblPrecio.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
                lblPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                lblPrecio.setOpaque(true);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                324,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(510, 510, 510))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(43, 43, 43)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addComponent(btnOperator,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(btnVandal,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(btnSpectre,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(btnClassic,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(btnOdin,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                172,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGap(30, 30, 30)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                278,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(307, 307, 307)
                                                                                                .addComponent(btnOrdenar,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                156,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addComponent(simular,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                156,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(34, 34, 34)
                                                                                                .addComponent(jLabel11,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                84,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(lblPrecio,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                164,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(lblPan,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                44,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                164,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(lblPepinillos,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                44,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(btnPepinillos,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                164,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(lblQueso,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                44,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(btnQueso,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                164,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(lblTomate,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                44,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(btnTomate,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(btnPan,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                50,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                164,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                                .addComponent(lblTorta,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                44,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                                .addComponent(btnTorta,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                50,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                164,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                .addComponent(lblLechuga,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                44,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addComponent(btnLechuga,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                50,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                164,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(lblCebolla,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                44,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(btnCebolla,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))))
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                                                                .addComponent(jScrollPane2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                180,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(jScrollPane3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(222, 222,
                                                                                                                                222))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(148, 148,
                                                                                                                                148)
                                                                                                                .addComponent(jLabel10)
                                                                                                                .addContainerGap(
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(136, 136,
                                                                                                                                136)
                                                                                                                .addComponent(btnTerminar,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                156,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(380, 380,
                                                                                                                                380)))));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGap(30, 30, 30)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                                                .addComponent(jLabel1)
                                                                                                                                                                                .addComponent(lblPan,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                29,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                .addComponent(btnPan,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                29,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                                                                                                                                lblTorta,
                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                29,
                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                                                                                                                                btnTorta,
                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                29,
                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                                                                                                                                jLabel3))
                                                                                                                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                                                                .addGap(18,
                                                                                                                                                                                                                                                                                                                                                                                                                                18,
                                                                                                                                                                                                                                                                                                                                                                                                                                18)
                                                                                                                                                                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                                                                                                                                                                jLabel4))
                                                                                                                                                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                                                                                .addGap(18,
                                                                                                                                                                                                                                                                                                                                                                                                                                18,
                                                                                                                                                                                                                                                                                                                                                                                                                                18)
                                                                                                                                                                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                                                                                                                                                                btnQueso,
                                                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                29,
                                                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                                                                lblQueso,
                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                29,
                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                .addGap(18,
                                                                                                                                                                                                                                                                                                                                                                18,
                                                                                                                                                                                                                                                                                                                                                                18)
                                                                                                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                                                                                                jLabel5))
                                                                                                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                                                                                                                .addGap(18,
                                                                                                                                                                                                                                                                                                                                                                18,
                                                                                                                                                                                                                                                                                                                                                                18)
                                                                                                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                                                                                                btnLechuga,
                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                29,
                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                lblLechuga,
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                29,
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                                .addGap(18, 18,
                                                                                                                                                                                                                                18)
                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                jLabel6)
                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                lblTomate,
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                29,
                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                                                                                                .addComponent(btnTomate,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                29,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                                .addComponent(jLabel7)
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                lblCebolla,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                29,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                                                                .addComponent(btnCebolla,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                29,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addComponent(jLabel8)
                                                                                                                                                                .addComponent(lblPepinillos,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                29,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addComponent(btnPepinillos,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                29,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGap(1, 1, 1)
                                                                                                                                                .addComponent(jLabel10)
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(jScrollPane2)
                                                                                                                                                                .addComponent(jScrollPane3)))
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING))
                                                                                                .addGap(28, 28, 28)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(btnOrdenar)
                                                                                                                                .addComponent(simular)
                                                                                                                                .addComponent(btnTerminar)
                                                                                                                                .addComponent(jLabel11))
                                                                                                                .addComponent(lblPrecio,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                29,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(149, 149, 149))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(btnClassic)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(btnSpectre)
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(btnVandal)
                                                                                                .addGap(34, 34, 34)
                                                                                                .addComponent(btnOperator)
                                                                                                .addGap(40, 40, 40)
                                                                                                .addComponent(btnOdin)
                                                                                                .addContainerGap()))));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1299,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                pack();
        }

        public javax.swing.JTextArea getLblOrden() {
                return lblOrden;
        }

        public void setLblOrden(javax.swing.JTextArea lblOrden) {
                this.lblOrden = lblOrden;
        }

        public ArrayList<String> getListaIngredientesActual() {
                return listaIngredientesActual;
        }

        public void setListaIngredientesActual(ArrayList<String> listaIngredientesActual) {
                this.listaIngredientesActual = listaIngredientesActual;
        }

        public Mesa getMesa() {
                return mesa;
        }

        public void setMesa(Mesa mesa) {
                this.mesa = mesa;
        }

        public String getHamburguesa() {
                return hamburguesa;
        }

        public void setHamburguesa(String hamburguesa) {
                this.hamburguesa = hamburguesa;
        }

        public JLabel getLblPrecio() {
                return lblPrecio;
        }

        public void setLblPrecio(JLabel precio) {
                this.lblPrecio = precio;
        }

        public JLabel getLblCebolla() {
                return lblCebolla;
        }

        public javax.swing.JButton getSimular() {
                return simular;
        }

        public void setSimular(javax.swing.JButton simular) {
                this.simular = simular;
        }

        public void setLblCebolla(JLabel lblCebolla) {
                this.lblCebolla = lblCebolla;
        }

        public JLabel getLblLechuga() {
                return lblLechuga;
        }

        public void setLblLechuga(JLabel lblLechuga) {
                this.lblLechuga = lblLechuga;
        }

        public JLabel getLblPan() {
                return lblPan;
        }

        public void setLblPan(JLabel lblPan) {
                this.lblPan = lblPan;
        }

        public JLabel getLblPepinillos() {
                return lblPepinillos;
        }

        public void setLblPepinillos(JLabel lblPepinillos) {
                this.lblPepinillos = lblPepinillos;
        }

        public JLabel getLblQueso() {
                return lblQueso;
        }

        public void setLblQueso(JLabel lblQueso) {
                this.lblQueso = lblQueso;
        }

        public JLabel getLblTomate() {
                return lblTomate;
        }

        public void setLblTomate(JLabel lblTomate) {
                this.lblTomate = lblTomate;
        }

        public JLabel getLblTorta() {
                return lblTorta;
        }

        public void setLblTorta(JLabel lblTorta) {
                this.lblTorta = lblTorta;
        }

        public JButton getBtnCebolla() {
                return btnCebolla;
        }

        public void setBtnCebolla(JButton btnCebolla) {
                this.btnCebolla = btnCebolla;
        }

        public JButton getBtnLechuga() {
                return btnLechuga;
        }

        public void setBtnLechuga(JButton btnLechuga) {
                this.btnLechuga = btnLechuga;
        }

        public JButton getBtnPan() {
                return btnPan;
        }

        public void setBtnPan(JButton btnPan) {
                this.btnPan = btnPan;
        }

        public JButton getBtnPepinillos() {
                return btnPepinillos;
        }

        public void setBtnPepinillos(JButton btnPepinillos) {
                this.btnPepinillos = btnPepinillos;
        }

        public JButton getBtnQueso() {
                return btnQueso;
        }

        public void setBtnQueso(JButton btnQueso) {
                this.btnQueso = btnQueso;
        }

        public JButton getBtnTomate() {
                return btnTomate;
        }

        public void setBtnTomate(JButton btnTomate) {
                this.btnTomate = btnTomate;
        }

        public JButton getBtnTorta() {
                return btnTorta;
        }

        public void setBtnTorta(JButton btnTorta) {
                this.btnTorta = btnTorta;
        }

        public javax.swing.JButton getBtnClassic() {
                return btnClassic;
        }

        public void setBtnClassic(javax.swing.JButton btnClassic) {
                this.btnClassic = btnClassic;
        }

        public javax.swing.JButton getBtnOdin() {
                return btnOdin;
        }

        public void setBtnOdin(javax.swing.JButton btnOdin) {
                this.btnOdin = btnOdin;
        }

        public javax.swing.JButton getBtnOperator() {
                return btnOperator;
        }

        public void setBtnOperator(javax.swing.JButton btnOperator) {
                this.btnOperator = btnOperator;
        }

        public javax.swing.JButton getBtnOrdenar() {
                return btnOrdenar;
        }

        public void setBtnOrdenar(javax.swing.JButton btnOrdenar) {
                this.btnOrdenar = btnOrdenar;
        }

        public javax.swing.JButton getBtnSpectre() {
                return btnSpectre;
        }

        public void setBtnSpectre(javax.swing.JButton btnSpectre) {
                this.btnSpectre = btnSpectre;
        }

        public javax.swing.JButton getBtnVandal() {
                return btnVandal;
        }

        public void setBtnVandal(javax.swing.JButton btnVandal) {
                this.btnVandal = btnVandal;
        }

        public javax.swing.JLabel getjLabel1() {
                return jLabel1;
        }

        public void setjLabel1(javax.swing.JLabel jLabel1) {
                this.jLabel1 = jLabel1;
        }

        public javax.swing.JLabel getjLabel2() {
                return jLabel2;
        }

        public void setjLabel2(javax.swing.JLabel jLabel2) {
                this.jLabel2 = jLabel2;
        }

        public javax.swing.JTextArea getLblIngredientes() {
                return lblIngredientes;
        }

        public void setLblIngredientes(javax.swing.JTextArea lblIngredientes) {
                this.lblIngredientes = lblIngredientes;
        }

        private void btnOperatorActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void btnSpectreActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void btnClassicActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void btnVandalActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void btnOdinActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private javax.swing.JButton btnCebolla;
        private javax.swing.JButton btnClassic;
        private javax.swing.JButton btnLechuga;

        public javax.swing.JButton getBtnTerminar() {
                return btnTerminar;
        }

        public void setBtnTerminar(javax.swing.JButton btnTerminar) {
                this.btnTerminar = btnTerminar;
        }

        private javax.swing.JButton btnOdin;
        private javax.swing.JButton btnOperator;
        private javax.swing.JButton btnOrdenar;
        private javax.swing.JButton btnPan;
        private javax.swing.JButton btnPepinillos;
        private javax.swing.JButton btnQueso;
        private javax.swing.JButton btnSpectre;
        private javax.swing.JButton btnTerminar;
        private javax.swing.JButton btnTomate;
        private javax.swing.JButton btnTorta;
        private javax.swing.JButton btnVandal;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollBar jScrollBar1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JLabel lblCebolla;
        private javax.swing.JTextArea lblIngredientes;
        private javax.swing.JLabel lblLechuga;
        private javax.swing.JTextArea lblOrden;
        private javax.swing.JLabel lblPan;
        private javax.swing.JLabel lblPepinillos;
        private javax.swing.JLabel lblPrecio;
        private javax.swing.JLabel lblQueso;
        private javax.swing.JLabel lblTomate;
        private javax.swing.JLabel lblTorta;
        private javax.swing.JList<String> listOrden;
        private javax.swing.JButton simular;

}
