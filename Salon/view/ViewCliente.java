package Salon.view;

import java.awt.Font;

import Salon.model.*;

public class ViewCliente extends javax.swing.JFrame {
    int mesa;

    String hamburguesa;

    public ViewCliente() {
        setTitle("Cliente - Ordenar");
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClassic = new javax.swing.JButton();
        btnSpectre = new javax.swing.JButton();
        btnVandal = new javax.swing.JButton();
        btnOperator = new javax.swing.JButton();
        btnOdin = new javax.swing.JButton();
        lblIngredientes = new javax.swing.JTextArea();
        btnOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("La Cocina de Icebox");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENÚ");
        lblIngredientes.setLineWrap(true);
        lblIngredientes.setFont(new Font("Arial", Font.PLAIN, 18));
        btnClassic.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnClassic.setText("CLASSIC");
        btnClassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassicActionPerformed(evt);
            }
        });

        btnSpectre.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSpectre.setText("SPECTRE");
        btnSpectre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpectreActionPerformed(evt);
            }
        });

        btnVandal.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnVandal.setText("VANDAL");
        btnVandal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVandalActionPerformed(evt);
            }
        });

        btnOperator.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnOperator.setText("OPERATOR");
        btnOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperatorActionPerformed(evt);
            }
        });

        btnOdin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnOdin.setText("ODIN (Custom)");
        btnOdin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdinActionPerformed(evt);
            }
        });

        btnOrdenar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(jLabel1,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(btnOperator,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(btnClassic,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(btnSpectre,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(btnVandal,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(btnOdin,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                162, Short.MAX_VALUE)
                                                                        .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblIngredientes,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 153,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnClassic, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSpectre, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnVandal, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnOdin, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblIngredientes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getHamburguesa() {
        return hamburguesa;
    }

    public void setHamburguesa(String hamburguesa) {
        this.hamburguesa = hamburguesa;
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

    // Variables declaration - do not modify
    private javax.swing.JButton btnClassic;
    private javax.swing.JButton btnOdin;
    private javax.swing.JButton btnOperator;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSpectre;
    private javax.swing.JButton btnVandal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea lblIngredientes;
    // End of variables declaration
}
