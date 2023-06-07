package Cocina.viewCocina;

import javax.swing.JFrame;

import java.awt.Font;

import model.*;

public class ViewCocina extends JFrame {
    public ViewCocina() {
        setTitle("Cocina");
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordenList = new javax.swing.JList<>();
        txtOrden = new javax.swing.JTextArea();
        btnCompletar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("La Cocina de Icebox");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Órdenes:");

        jScrollPane1.setViewportView(ordenList);

        txtOrden.setEditable(false);
        txtOrden.setFont(new java.awt.Font("Arial", Font.PLAIN, 14)); // NOI18N
        txtOrden.setLineWrap(true);
        btnCompletar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnCompletar.setText("Completar Orden");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Detalle de la orden:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160,
                                                Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtOrden)
                                        .addComponent(btnCompletar, javax.swing.GroupLayout.DEFAULT_SIZE, 321,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41,
                                                Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 288,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCompletar, javax.swing.GroupLayout.DEFAULT_SIZE, 56,
                                                        Short.MAX_VALUE)))
                                .addContainerGap()));

        pack();
    }// </editor-fold>

    public javax.swing.JButton getBtnCompletar() {
        return btnCompletar;
    }

    public void setBtnCompletar(javax.swing.JButton btnCompletar) {
        this.btnCompletar = btnCompletar;
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

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JList<Orden> getOrdenList() {
        return ordenList;
    }

    public void setOrdenList(javax.swing.JList<Orden> ordenList) {
        this.ordenList = ordenList;
    }

    public javax.swing.JTextArea getTxtOrden() {
        return txtOrden;
    }

    public void setTxtOrden(javax.swing.JTextArea txtOrden) {
        this.txtOrden = txtOrden;
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCompletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Orden> ordenList;
    private javax.swing.JTextArea txtOrden;
    // End of variables declaration
}
