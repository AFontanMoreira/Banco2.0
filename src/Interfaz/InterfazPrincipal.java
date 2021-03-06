/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.event.AncestorEvent;

/**
 *
 * @author dam1a
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAreaClientes1 = new javax.swing.JButton();
        jButtonAreaTrabajadores1 = new javax.swing.JButton();
        jLabelIconoBanco = new javax.swing.JLabel();
        jLabelSeparador2 = new javax.swing.JLabel();
        jLabelSeparador3 = new javax.swing.JLabel();
        jLabelSeparador4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(115, 198, 182));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(851, 638));

        jButtonAreaClientes1.setBackground(new java.awt.Color(14, 102, 85));
        jButtonAreaClientes1.setFont(new java.awt.Font("Caviar Dreams", 1, 20)); // NOI18N
        jButtonAreaClientes1.setForeground(new java.awt.Color(11, 83, 69));
        jButtonAreaClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconAreaCliente.png"))); // NOI18N
        jButtonAreaClientes1.setText("Area de Clientes");
        jButtonAreaClientes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 83, 69), 2));
        jButtonAreaClientes1.setContentAreaFilled(false);
        jButtonAreaClientes1.setFocusPainted(false);
        jButtonAreaClientes1.setMaximumSize(new java.awt.Dimension(215, 48));
        jButtonAreaClientes1.setMinimumSize(new java.awt.Dimension(215, 48));
        jButtonAreaClientes1.setPreferredSize(new java.awt.Dimension(215, 48));
        jButtonAreaClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAreaClientes1ActionPerformed(evt);
            }
        });

        jButtonAreaTrabajadores1.setBackground(new java.awt.Color(14, 102, 85));
        jButtonAreaTrabajadores1.setFont(new java.awt.Font("Caviar Dreams", 1, 20)); // NOI18N
        jButtonAreaTrabajadores1.setForeground(new java.awt.Color(11, 83, 69));
        jButtonAreaTrabajadores1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconAreaTrabajadores.png"))); // NOI18N
        jButtonAreaTrabajadores1.setText("Area de Trabajadores");
        jButtonAreaTrabajadores1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 83, 69), 2));
        jButtonAreaTrabajadores1.setContentAreaFilled(false);
        jButtonAreaTrabajadores1.setFocusPainted(false);
        jButtonAreaTrabajadores1.setMaximumSize(new java.awt.Dimension(271, 48));
        jButtonAreaTrabajadores1.setMinimumSize(new java.awt.Dimension(271, 48));
        jButtonAreaTrabajadores1.setPreferredSize(new java.awt.Dimension(271, 48));
        jButtonAreaTrabajadores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAreaTrabajadores1ActionPerformed(evt);
            }
        });

        jLabelIconoBanco.setForeground(new java.awt.Color(187, 187, 187));
        jLabelIconoBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icon.png"))); // NOI18N

        jLabelSeparador2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelSeparador2.setForeground(new java.awt.Color(187, 187, 187));
        jLabelSeparador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Separador.png"))); // NOI18N

        jLabelSeparador3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelSeparador3.setForeground(new java.awt.Color(187, 187, 187));
        jLabelSeparador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Separador.png"))); // NOI18N
        jLabelSeparador3.setMaximumSize(new java.awt.Dimension(788, 5));
        jLabelSeparador3.setMinimumSize(new java.awt.Dimension(788, 5));
        jLabelSeparador3.setPreferredSize(new java.awt.Dimension(788, 5));

        jLabelSeparador4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelSeparador4.setForeground(new java.awt.Color(187, 187, 187));
        jLabelSeparador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Separador.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIconoBanco)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButtonAreaClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAreaTrabajadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelSeparador4)
                    .addComponent(jLabelSeparador2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSeparador3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconoBanco)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSeparador4)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAreaClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAreaTrabajadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabelSeparador3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(jLabelSeparador2)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAreaClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAreaClientes1ActionPerformed
        this.setVisible(false);
        InterfazClientes iClientes = new InterfazClientes();
        iClientes.setVisible(true);
    }//GEN-LAST:event_jButtonAreaClientes1ActionPerformed

    private void jButtonAreaTrabajadores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAreaTrabajadores1ActionPerformed
        this.setVisible(false);
        InterfazTrabajadores iTrabajadores = new InterfazTrabajadores();
        iTrabajadores.setVisible(true);
    }//GEN-LAST:event_jButtonAreaTrabajadores1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAreaClientes1;
    private javax.swing.JButton jButtonAreaTrabajadores1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIconoBanco;
    private javax.swing.JLabel jLabelSeparador2;
    private javax.swing.JLabel jLabelSeparador3;
    private javax.swing.JLabel jLabelSeparador4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
