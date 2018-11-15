/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class MainWindow extends javax.swing.JFrame {

	/**
	 * Creates new form MainWindow
	 */
	public MainWindow() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuMantenimiento = new javax.swing.JMenu();
        Clientes = new javax.swing.JMenuItem();
        itemProveedores = new javax.swing.JMenuItem();
        itemArticulos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemSalir = new javax.swing.JMenuItem();
        menuAlmacen = new javax.swing.JMenu();
        itemPedidos = new javax.swing.JMenuItem();
        itemExtractos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuMantenimiento.setMnemonic('M');
        menuMantenimiento.setText("Mantenimiento");

        Clientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Clientes.setMnemonic('C');
        Clientes.setText("Clientes");
        Clientes.setToolTipText("");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        menuMantenimiento.add(Clientes);

        itemProveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        itemProveedores.setMnemonic('P');
        itemProveedores.setText("Proveedores");
        itemProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProveedoresActionPerformed(evt);
            }
        });
        menuMantenimiento.add(itemProveedores);

        itemArticulos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemArticulos.setMnemonic('A');
        itemArticulos.setText("Artículos");
        itemArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemArticulosActionPerformed(evt);
            }
        });
        menuMantenimiento.add(itemArticulos);
        menuMantenimiento.add(jSeparator1);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemSalir.setMnemonic('S');
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuMantenimiento.add(itemSalir);

        jMenuBar1.add(menuMantenimiento);

        menuAlmacen.setMnemonic('A');
        menuAlmacen.setText("Almacen");

        itemPedidos.setMnemonic('P');
        itemPedidos.setText("Pedidos");
        menuAlmacen.add(itemPedidos);

        itemExtractos.setMnemonic('E');
        itemExtractos.setText("Extractos");
        menuAlmacen.add(itemExtractos);

        jMenuBar1.add(menuAlmacen);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProveedoresActionPerformed
		JOptionPane.showMessageDialog(this,
				"La acción que has seleccionado está en desarrollo. Disculpe las molestias",
				"Proveedores", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_itemProveedoresActionPerformed

    private void itemArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemArticulosActionPerformed
		JOptionPane.showMessageDialog(this,
				"La acción que has seleccionado está en desarrollo. Disculpe las molestias",
				"Artículos", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_itemArticulosActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
		System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        jFormularioDatos v = new jFormularioDatos(this);
		setEnabled(false);
		setVisible(false);
		v.setVisible(true);
    }//GEN-LAST:event_ClientesActionPerformed

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
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainWindow().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Clientes;
    private javax.swing.JMenuItem itemArticulos;
    private javax.swing.JMenuItem itemExtractos;
    private javax.swing.JMenuItem itemPedidos;
    private javax.swing.JMenuItem itemProveedores;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAlmacen;
    private javax.swing.JMenu menuMantenimiento;
    // End of variables declaration//GEN-END:variables
}
