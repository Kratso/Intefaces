/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialventanas;

/**
 *
 * @author Samuel
 */
public class VentanaSecundaria2 extends javax.swing.JFrame {

    /**
     * Creates new form VentanaSecundaria2
     */
    public VentanaSecundaria2(javax.swing.JFrame padre) {
        VentanaSecundaria2.padre = padre;
        enableEvents(java.awt.AWTEvent.WINDOW_EVENT_MASK);
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaSecundaria2(padre).setVisible(true);
            }
        });
    }
    @Override
    protected void processWindowEvent(java.awt.event.WindowEvent e) {
  super.processWindowEvent(e);
  if (e.getID() == java.awt.event.WindowEvent.WINDOW_CLOSING) {
    padre.setEnabled(true);
    padre.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  }
}
    // Variables declaration - do not modify                     
    // End of variables declaration                   
    static javax.swing.JFrame padre;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

