/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialventanas;

/**
 *
 * @author alumno
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jButtonVentSecundaria1 = new javax.swing.JButton();
        jButtonVentSecundaria2 = new javax.swing.JButton();
        jButtonVentSecundaria3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");

        jButtonVentSecundaria1.setText("Generar Ventana 1");
        jButtonVentSecundaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentSecundaria1ActionPerformed(evt);
            }
        });

        jButtonVentSecundaria2.setText("Generar Ventana 2");
        jButtonVentSecundaria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentSecundaria2ActionPerformed(evt);
            }
        });

        jButtonVentSecundaria3.setText("Generar Ventana 3");
        jButtonVentSecundaria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentSecundaria3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVentSecundaria3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVentSecundaria2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVentSecundaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButtonVentSecundaria1)
                .addGap(44, 44, 44)
                .addComponent(jButtonVentSecundaria2)
                .addGap(55, 55, 55)
                .addComponent(jButtonVentSecundaria3)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVentSecundaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentSecundaria1ActionPerformed

        VentanaSecundaria1 v=new VentanaSecundaria1(this);
            setEnabled(false);
            v.setVisible(true);
            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jButtonVentSecundaria1ActionPerformed

    private void jButtonVentSecundaria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentSecundaria2ActionPerformed
        // TODO add your handling code here:
        VentanaSecundaria2 v = new VentanaSecundaria2(this);
        setEnabled(false);
        v.setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jButtonVentSecundaria2ActionPerformed

    private void jButtonVentSecundaria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentSecundaria3ActionPerformed
        // TODO add your handling code here:
        VentanaSecundaria3 v = new VentanaSecundaria3(this,true);
        v.setVisible(true);
    }//GEN-LAST:event_jButtonVentSecundaria3ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVentSecundaria1;
    private javax.swing.JButton jButtonVentSecundaria2;
    private javax.swing.JButton jButtonVentSecundaria3;
    // End of variables declaration//GEN-END:variables
}
