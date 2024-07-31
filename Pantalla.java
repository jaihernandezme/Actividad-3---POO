package com.mycompany.figuras;

public class Pantalla extends javax.swing.JFrame {

    public Pantalla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCirculo = new javax.swing.JButton();
        btnTriangulo = new javax.swing.JButton();
        btnRectangulo = new javax.swing.JButton();
        btnCuadrado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCIONE UNA FIGURA");

        btnCirculo.setBackground(new java.awt.Color(255, 255, 255));
        btnCirculo.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        btnCirculo.setForeground(new java.awt.Color(0, 0, 0));
        btnCirculo.setText("○");
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculoActionPerformed(evt);
            }
        });

        btnTriangulo.setBackground(new java.awt.Color(255, 255, 255));
        btnTriangulo.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        btnTriangulo.setForeground(new java.awt.Color(0, 0, 0));
        btnTriangulo.setText("◿");
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        btnRectangulo.setBackground(new java.awt.Color(255, 255, 255));
        btnRectangulo.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        btnRectangulo.setForeground(new java.awt.Color(0, 0, 0));
        btnRectangulo.setText("▭");
        btnRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectanguloActionPerformed(evt);
            }
        });

        btnCuadrado.setBackground(new java.awt.Color(255, 255, 255));
        btnCuadrado.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        btnCuadrado.setForeground(new java.awt.Color(0, 0, 0));
        btnCuadrado.setText("□");
        btnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCirculo)
                        .addGap(18, 18, 18)
                        .addComponent(btnTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCuadrado)
                        .addGap(18, 18, 18)
                        .addComponent(btnRectangulo)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCirculo)
                    .addComponent(btnTriangulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuadrado)
                    .addComponent(btnRectangulo))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
        // TODO add your handling code here:
        PantallaCirculo panCirculo1 = new PantallaCirculo();
        panCirculo1.setVisible(true);
        panCirculo1.setLocationRelativeTo(null);
        this.hide();
        //Se crea una nueva pantalla para ingresar la info del circulo y además se esconde la pantalla actual
        
    }//GEN-LAST:event_btnCirculoActionPerformed

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        // TODO add your handling code here:
        PantallaTriangulo panTriangulo1 = new PantallaTriangulo();
        panTriangulo1.setVisible(true);
        panTriangulo1.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectanguloActionPerformed
        // TODO add your handling code here:
        PantallaRectangulo panRectangulo1 = new PantallaRectangulo();
        panRectangulo1.setVisible(true);
        panRectangulo1.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnRectanguloActionPerformed

    private void btnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadradoActionPerformed
        // TODO add your handling code here:
        PantallaCuadrado panCuadrado1 = new PantallaCuadrado();
        panCuadrado1.setVisible(true);
        panCuadrado1.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnCuadradoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnRectangulo;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
