
package com.mibolsa.mavenbolsa;

import java.awt.Color;

/**
  * @author MIGUELANGEL DE JESUS
 */
public class AccionInterface extends javax.swing.JFrame {
 
    Accion AccionConsultada = new Accion();
    
 
    public AccionInterface() {
        
         
        this.getContentPane().setBackground(Color.black);
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelEmpresa = new javax.swing.JLabel();
        LabelSimbolo = new javax.swing.JLabel();
        LabelNroAcciones = new javax.swing.JLabel();
        LabelUltPrecio = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel(AccionConsultada.getEmpresa());
        lblSimbolo = new javax.swing.JLabel();
        lblNroDeAcciones = new javax.swing.JLabel();
        lblUltimoPrecio = new javax.swing.JLabel(AccionConsultada.getUltimoPrecio());
        labelVariacion = new javax.swing.JLabel();
        lblVariacion = new javax.swing.JLabel(AccionConsultada.getVariacion());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(new java.awt.Point(500, 200));

        LabelEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmpresa.setText("Empresa:");

        LabelSimbolo.setForeground(new java.awt.Color(255, 255, 255));
        LabelSimbolo.setText("Simbolo:");

        LabelNroAcciones.setForeground(new java.awt.Color(255, 255, 255));
        LabelNroAcciones.setText("Nro de acciones:");

        LabelUltPrecio.setForeground(new java.awt.Color(255, 255, 255));
        LabelUltPrecio.setText("Ultimo precio:");

        lblEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setBorder(new javax.swing.border.MatteBorder(null));

        lblSimbolo.setForeground(new java.awt.Color(255, 255, 255));
        lblSimbolo.setBorder(new javax.swing.border.MatteBorder(null));

        lblNroDeAcciones.setForeground(new java.awt.Color(255, 255, 255));
        lblNroDeAcciones.setBorder(new javax.swing.border.MatteBorder(null));

        lblUltimoPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblUltimoPrecio.setBorder(new javax.swing.border.MatteBorder(null));

        labelVariacion.setForeground(new java.awt.Color(255, 255, 255));
        labelVariacion.setText("Variacion");

        lblVariacion.setForeground(new java.awt.Color(255, 255, 255));
        lblVariacion.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelVariacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelNroAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelSimbolo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelUltPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelEmpresa, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblUltimoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(lblNroDeAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSimbolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelSimbolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSimbolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNroAcciones)
                    .addComponent(lblNroDeAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUltPrecio)
                    .addComponent(lblUltimoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccionInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AccionInterface().setVisible(true);
            }
        });
    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEmpresa;
    private javax.swing.JLabel LabelNroAcciones;
    private javax.swing.JLabel LabelSimbolo;
    private javax.swing.JLabel LabelUltPrecio;
    private javax.swing.JLabel labelVariacion;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblNroDeAcciones;
    private javax.swing.JLabel lblSimbolo;
    private javax.swing.JLabel lblUltimoPrecio;
    private javax.swing.JLabel lblVariacion;
    // End of variables declaration//GEN-END:variables
}
