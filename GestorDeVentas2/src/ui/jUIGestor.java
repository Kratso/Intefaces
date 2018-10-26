/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.Venta;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

public class jUIGestor extends javax.swing.JFrame {

	private final File archivo = new File("ventas.dat");
	private final Venta ventaBase = new Venta(0, 2, 1, 0, 1, true, true, false, false);
	private final Vector<String> clientes = new Vector<>();
	private final Vector<Venta> ventas = new Vector<>();
	private final ArrayList<Venta> busqueda = new ArrayList<>();
	private final ArrayList<String> busquedaNombres = new ArrayList<>();
	private int index;
	private String BUSQUEDA_CAMPO = "campo";
	private String BUSQUEDA_ARCHIVO = "archivo";

	public jUIGestor() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processorGroup = new javax.swing.ButtonGroup();
        ramGroup = new javax.swing.ButtonGroup();
        monitorGroup = new javax.swing.ButtonGroup();
        storageGroup = new javax.swing.ButtonGroup();
        nombreLabel = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        listaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList();
        localidadLabel = new javax.swing.JLabel();
        localidad = new javax.swing.JComboBox();
        procLabel = new javax.swing.JLabel();
        proc1 = new javax.swing.JRadioButton();
        proc2 = new javax.swing.JRadioButton();
        proc3 = new javax.swing.JRadioButton();
        proc4 = new javax.swing.JRadioButton();
        ramLabel = new javax.swing.JLabel();
        ram1 = new javax.swing.JRadioButton();
        ram2 = new javax.swing.JRadioButton();
        ram3 = new javax.swing.JRadioButton();
        ram4 = new javax.swing.JRadioButton();
        monitorLabel = new javax.swing.JLabel();
        monitor1 = new javax.swing.JRadioButton();
        monitor2 = new javax.swing.JRadioButton();
        monitor3 = new javax.swing.JRadioButton();
        monitor4 = new javax.swing.JRadioButton();
        storageLabel = new javax.swing.JLabel();
        storage1 = new javax.swing.JRadioButton();
        storage2 = new javax.swing.JRadioButton();
        storage3 = new javax.swing.JRadioButton();
        storage4 = new javax.swing.JRadioButton();
        otrosLabel = new javax.swing.JLabel();
        otros1 = new javax.swing.JCheckBox();
        otros2 = new javax.swing.JCheckBox();
        otros3 = new javax.swing.JCheckBox();
        otros4 = new javax.swing.JCheckBox();
        botonAniadir = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonPrimero = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        botonUltimo = new javax.swing.JButton();
        navegacionLabel = new javax.swing.JLabel();
        botonMostrar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        nombreLabel.setText("Nombre");

        nombreField.setNextFocusableComponent(listaClientes);
        nombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreFieldKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreFieldKeyPressed(evt);
            }
        });

        listaLabel.setText("Lista de Clientes");

        listaClientes.setNextFocusableComponent(botonCancelar);
        listaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClientesMouseClicked(evt);
            }
        });
        listaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listaClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listaClientes);

        localidadLabel.setText("Localidad");

        localidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Villalba", "Alpedrete", "Guadarrama", "Galapagar", "Moralzarzal" }));
        localidad.setEnabled(false);
        localidad.setNextFocusableComponent(proc1);

        procLabel.setText("Procesador");

        processorGroup.add(proc1);
        proc1.setText("i3 7300H");
        proc1.setActionCommand("0");
        proc1.setEnabled(false);
        proc1.setNextFocusableComponent(proc2);

        processorGroup.add(proc2);
        proc2.setText("i5 7550H");
        proc2.setActionCommand("1");
        proc2.setEnabled(false);
        proc2.setNextFocusableComponent(proc3);

        processorGroup.add(proc3);
        proc3.setSelected(true);
        proc3.setText("i5 7550K");
        proc3.setActionCommand("2");
        proc3.setEnabled(false);
        proc3.setNextFocusableComponent(proc4);

        processorGroup.add(proc4);
        proc4.setText("i7 7700K");
        proc4.setActionCommand("3");
        proc4.setEnabled(false);
        proc4.setNextFocusableComponent(ram1);

        ramLabel.setText("Memoria");

        ramGroup.add(ram1);
        ram1.setText("4GB");
        ram1.setActionCommand("0");
        ram1.setEnabled(false);
        ram1.setNextFocusableComponent(ram2);

        ramGroup.add(ram2);
        ram2.setSelected(true);
        ram2.setText("8GB");
        ram2.setActionCommand("1");
        ram2.setEnabled(false);
        ram2.setNextFocusableComponent(ram3);

        ramGroup.add(ram3);
        ram3.setText("16GB");
        ram3.setActionCommand("2");
        ram3.setEnabled(false);
        ram3.setNextFocusableComponent(ram4);

        ramGroup.add(ram4);
        ram4.setText("32GB");
        ram4.setActionCommand("3");
        ram4.setEnabled(false);
        ram4.setNextFocusableComponent(monitor1);

        monitorLabel.setText("Monitor");

        monitorGroup.add(monitor1);
        monitor1.setSelected(true);
        monitor1.setText("27\" FHD");
        monitor1.setActionCommand("0");
        monitor1.setEnabled(false);
        monitor1.setNextFocusableComponent(monitor2);

        monitorGroup.add(monitor2);
        monitor2.setText("27\" 2k");
        monitor2.setActionCommand("1");
        monitor2.setEnabled(false);
        monitor2.setNextFocusableComponent(monitor3);

        monitorGroup.add(monitor3);
        monitor3.setText("38\" UW 2k");
        monitor3.setActionCommand("2");
        monitor3.setEnabled(false);
        monitor3.setNextFocusableComponent(monitor4);

        monitorGroup.add(monitor4);
        monitor4.setText("24\" 4k Gsync");
        monitor4.setActionCommand("3");
        monitor4.setEnabled(false);
        monitor4.setNextFocusableComponent(storage1);

        storageLabel.setText("Almacenamiento");

        storageGroup.add(storage1);
        storage1.setText("256GB SSD S3");
        storage1.setActionCommand("0");
        storage1.setEnabled(false);
        storage1.setNextFocusableComponent(storage2);

        storageGroup.add(storage2);
        storage2.setSelected(true);
        storage2.setText("512GB SSD S3");
        storage2.setActionCommand("1");
        storage2.setEnabled(false);
        storage2.setNextFocusableComponent(storage3);

        storageGroup.add(storage3);
        storage3.setText("256GB SSD NVMe");
        storage3.setActionCommand("2");
        storage3.setEnabled(false);
        storage3.setNextFocusableComponent(storage4);

        storageGroup.add(storage4);
        storage4.setText("1TB SSD S3");
        storage4.setActionCommand("3");
        storage4.setEnabled(false);
        storage4.setNextFocusableComponent(otros1);

        otrosLabel.setText("Extras");

        otros1.setSelected(true);
        otros1.setText("Adaptador Wi-Fi");
        otros1.setEnabled(false);
        otros1.setNextFocusableComponent(otros2);

        otros2.setSelected(true);
        otros2.setText("Grabador DVD");
        otros2.setEnabled(false);
        otros2.setNextFocusableComponent(otros3);

        otros3.setText("Soporte Thunderbolt");
        otros3.setEnabled(false);
        otros3.setNextFocusableComponent(otros4);

        otros4.setText("Tarjeta BU/Restore");
        otros4.setEnabled(false);
        otros4.setNextFocusableComponent(botonAniadir);

        botonAniadir.setMnemonic('A');
        botonAniadir.setText("Añadir");
        botonAniadir.setEnabled(false);
        botonAniadir.setNextFocusableComponent(botonCancelar);
        botonAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAniadirActionPerformed(evt);
            }
        });

        botonBuscar.setMnemonic('B');
        botonBuscar.setText("Buscar");
        botonBuscar.setEnabled(false);
        botonBuscar.setNextFocusableComponent(botonCancelar);
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonEliminar.setMnemonic('E');
        botonEliminar.setText("Eliminar");
        botonEliminar.setEnabled(false);
        botonEliminar.setNextFocusableComponent(botonCancelar);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonCancelar.setMnemonic('C');
        botonCancelar.setText("Cancelar");
        botonCancelar.setNextFocusableComponent(botonSalir);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonSalir.setMnemonic('S');
        botonSalir.setText("Salir");
        botonSalir.setNextFocusableComponent(nombreField);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonPrimero.setText("<<");
        botonPrimero.setEnabled(false);
        botonPrimero.setNextFocusableComponent(botonAnterior);
        botonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrimeroActionPerformed(evt);
            }
        });

        botonAnterior.setText("<");
        botonAnterior.setEnabled(false);
        botonAnterior.setNextFocusableComponent(botonSiguiente);
        botonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnteriorActionPerformed(evt);
            }
        });

        botonSiguiente.setText(">");
        botonSiguiente.setEnabled(false);
        botonSiguiente.setNextFocusableComponent(botonUltimo);
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonUltimo.setText(">>");
        botonUltimo.setEnabled(false);
        botonUltimo.setNextFocusableComponent(botonCancelar);
        botonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUltimoActionPerformed(evt);
            }
        });

        navegacionLabel.setText("jLabel1");

        botonMostrar.setMnemonic('M');
        botonMostrar.setText("Mostrar Ventas");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        botonGuardar.setMnemonic('G');
        botonGuardar.setText("Guardar Ventas");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(listaLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(localidadLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(nombreLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(proc2)
                                                .addGap(35, 35, 35)
                                                .addComponent(ram2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(proc3)
                                                    .addComponent(proc4))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ram4)
                                                    .addComponent(ram3))))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(monitor3)
                                            .addComponent(monitor2)
                                            .addComponent(monitor4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(storageLabel)
                                            .addComponent(storage1)
                                            .addComponent(storage2)
                                            .addComponent(storage3)
                                            .addComponent(storage4))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(otros3)
                                    .addComponent(otros1)
                                    .addComponent(otros2)
                                    .addComponent(otros4))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(otrosLabel)))
                                .addGap(63, 63, 63))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(proc1)
                                .addGap(36, 36, 36)
                                .addComponent(ram1)
                                .addGap(58, 58, 58)
                                .addComponent(monitor1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(procLabel)
                                .addGap(45, 45, 45)
                                .addComponent(ramLabel)
                                .addGap(56, 56, 56)
                                .addComponent(monitorLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAniadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonEliminar)
                                .addGap(39, 39, 39)
                                .addComponent(botonMostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonGuardar)))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(botonPrimero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonUltimo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(navegacionLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(localidadLabel)
                            .addComponent(localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listaLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(storageLabel)
                            .addComponent(otrosLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(storage1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(storage2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(storage3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(storage4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(otros1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otros2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(otros3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otros4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ramLabel)
                            .addComponent(procLabel)
                            .addComponent(monitorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proc1)
                            .addComponent(ram1)
                            .addComponent(monitor1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ram2)
                                .addComponent(monitor2))
                            .addComponent(proc2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proc3)
                            .addComponent(ram3)
                            .addComponent(monitor3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proc4)
                            .addComponent(ram4)
                            .addComponent(monitor4))))
                .addGap(14, 14, 14)
                .addComponent(botonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAniadir)
                            .addComponent(botonBuscar)
                            .addComponent(botonEliminar)
                            .addComponent(botonMostrar)
                            .addComponent(botonGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonPrimero)
                            .addComponent(botonAnterior)
                            .addComponent(botonSiguiente)
                            .addComponent(botonUltimo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(navegacionLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonSalir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreFieldKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER && valido(nombreField.getText())) { //Si se pulsa ENTER con un nombre valido
			setVenta(ventaBase, true);
			localidad.grabFocus();
			toggleControls(true);
			botonEliminar.setEnabled(false);
		} else if (evt.getKeyCode() == KeyEvent.VK_ENTER && !valido(nombreField.getText())) {
			JOptionPane.showMessageDialog(this, "Ha introducido un Nombre Inválido", "Ha ocurrido un Error", index);
		}
    }//GEN-LAST:event_nombreFieldKeyPressed

    private void botonAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAniadirActionPerformed
		clientes.add(nombreField.getText());	//Añade al cliente a la lista de clientes
		ventas.add(new Venta(localidad.getSelectedIndex(), //Genera Nueva Venta a partir de la UI
				Integer.parseInt(processorGroup.getSelection().getActionCommand()),
				Integer.parseInt(ramGroup.getSelection().getActionCommand()),
				Integer.parseInt(monitorGroup.getSelection().getActionCommand()),
				Integer.parseInt(storageGroup.getSelection().getActionCommand()),
				otros1.isSelected(), otros2.isSelected(), otros3.isSelected(),
				otros4.isSelected()));
		listaClientes.setListData(clientes);//Actualiza la lista de clientes
		restoreUI(); //Devuelve la UI a su estado base
    }//GEN-LAST:event_botonAniadirActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
		restoreUI();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
		System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void listaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClientesMouseClicked
		try {
			nombreField.setText(clientes.get(listaClientes.getSelectedIndex()));
			setVenta(ventas.get(listaClientes.getSelectedIndex()), true);
			botonEliminar.setEnabled(true);
			toggleControls(false);
		} catch (ArrayIndexOutOfBoundsException aioobe) {

		}
    }//GEN-LAST:event_listaClientesMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
		int opcion;

		opcion = JOptionPane.showConfirmDialog(this,
				"Esta operación es destructiva y no podrá recuperar los datos. ¿Desea continuar?",
				"Eliminar Seleción",
				JOptionPane.INFORMATION_MESSAGE);

		if (opcion == JOptionPane.OK_OPTION) {
			clientes.remove(listaClientes.getSelectedIndex());
			ventas.remove(listaClientes.getSelectedIndex());
		}

		listaClientes.setListData(clientes);
		nombreField.grabFocus();
		nombreField.setText(null);
		restoreUI();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
		busqueda(BUSQUEDA_CAMPO);
    }//GEN-LAST:event_botonBuscarActionPerformed

	private void busqueda(String opcion) throws HeadlessException {
		toggleControls(false);
		busqueda.clear();
		busquedaNombres.clear();
		index = 0;
		botonEliminar.setEnabled(false);
		if (opcion == BUSQUEDA_CAMPO) {
			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).equals(nombreField.getText())) {
					busqueda.add(ventas.get(i));
					busquedaNombres.add(nombreField.getText());
				}
			}
		} else if(opcion == BUSQUEDA_ARCHIVO){
			ObjectInputStream ois;
			try {
				ois = new ObjectInputStream(new FileInputStream(archivo));
				busqueda.addAll((Vector<Venta>) ois.readObject());
				busquedaNombres.addAll((Vector<String>) ois.readObject());
				
			} catch (FileNotFoundException ex) {
				Logger.getLogger(jUIGestor.class.getName()).log(Level.SEVERE, null, ex);
			} catch (IOException ex) {
				Logger.getLogger(jUIGestor.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(jUIGestor.class.getName()).log(Level.SEVERE, null, ex);
			}
					
		}

		switch (busqueda.size()) {
			case 0:
				JOptionPane.showConfirmDialog(this,
						"No se ha encontrado ninguna coincidencia",
						"Error en Búsqueda",
						JOptionPane.INFORMATION_MESSAGE);
				restoreUI();
				break;
			case 1:
				toggleNavegacion(true, false);
				setVenta(busqueda.get(0), true);
				nombreField.setText(busquedaNombres.get(0));
				
				break;
			case 2:
				toggleNavegacion(true, true);
				botonPrimero.setEnabled(false);
				botonAnterior.setEnabled(false);
				botonUltimo.setEnabled(false);
				setVenta(busqueda.get(0), true);
				nombreField.setText(busquedaNombres.get(0));
				break;
			default:
				toggleNavegacion(true, true);
				botonAnterior.setEnabled(false);
				botonPrimero.setEnabled(false);
				setVenta(busqueda.get(0), true);
				nombreField.setText(busquedaNombres.get(0));
		}
		navegacionLabel.setText((index + 1) + "/" + busqueda.size());
		botonSiguiente.grabFocus();
	}

    private void botonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrimeroActionPerformed
		index = 0;
		setVenta(busqueda.get(index), true);
		nombreField.setText(busquedaNombres.get(index));
		toggleNavegacion(true, true);
		botonAnterior.setEnabled(false);
		botonPrimero.setEnabled(false);
		navegacionLabel.setText((index + 1) + "/" + busqueda.size());
    }//GEN-LAST:event_botonPrimeroActionPerformed

    private void botonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUltimoActionPerformed
		index = busqueda.size() - 1;
		setVenta(busqueda.get(index), true);
		nombreField.setText(busquedaNombres.get(index));
		toggleNavegacion(true, true);
		botonSiguiente.setEnabled(false);
		botonUltimo.setEnabled(false);
		navegacionLabel.setText((index + 1) + "/" + busqueda.size());
    }//GEN-LAST:event_botonUltimoActionPerformed

    private void botonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnteriorActionPerformed
		index--;
		setVenta(busqueda.get(index), true);
		nombreField.setText(busquedaNombres.get(index));
		if (index == 0) {
			botonAnterior.setEnabled(false);
			botonPrimero.setEnabled(false);
		}
		botonSiguiente.setEnabled(true);
		if (busqueda.size() > 2) {
			botonUltimo.setEnabled(true);
		}
		navegacionLabel.setText((index + 1) + "/" + busqueda.size());
    }//GEN-LAST:event_botonAnteriorActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
		index++;
		setVenta(busqueda.get(index), true);
		nombreField.setText(busquedaNombres.get(index));
		if (index == busqueda.size() - 1) {
			botonSiguiente.setEnabled(false);
			botonUltimo.setEnabled(false);
		}
		botonAnterior.setEnabled(true);
		if (busqueda.size() > 2) {
			botonPrimero.setEnabled(true);
		}
		navegacionLabel.setText((index + 1) + "/" + busqueda.size());
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void listaClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaClientesKeyReleased
		try {
			nombreField.setText(clientes.get(listaClientes.getSelectedIndex()));
			setVenta(ventas.get(listaClientes.getSelectedIndex()), true);
			botonEliminar.setEnabled(true);
			toggleControls(false);
		} catch (ArrayIndexOutOfBoundsException aioobe) {

		}
    }//GEN-LAST:event_listaClientesKeyReleased

    private void nombreFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreFieldKeyTyped
		if (nombreField.getText().length() >= 15) // limit textfield to 15 characters
		{
			evt.consume();
		}
    }//GEN-LAST:event_nombreFieldKeyTyped

	@SuppressWarnings("empty-statement")
    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
		busqueda(BUSQUEDA_ARCHIVO);
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		if (!clientes.isEmpty()) {
			try {
				if (archivo.exists()) {
					ois = new ObjectInputStream(new FileInputStream(archivo));
					ventas.addAll((Vector<Venta>) ois.readObject());
					clientes.addAll((Vector<String>) ois.readObject());
				}
				oos = new ObjectOutputStream(new FileOutputStream(archivo));
				oos.writeObject(ventas);
				oos.writeObject(clientes);
				clientes.clear();
				ventas.clear();
			} catch (IOException ex) {
				Logger.getLogger(jUIGestor.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(jUIGestor.class.getName()).log(Level.SEVERE, null, ex);
			} finally {
				try {
					oos.close();
				} catch (IOException ex) {
					Logger.getLogger(jUIGestor.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		} else {
			JOptionPane.showMessageDialog(this, "No hay información que guardar", "Error al guardar", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_botonGuardarActionPerformed

	private void restoreUI() {
		toggleControls(false);
		toggleNavegacion(false, false);
		nombreField.setText("");
		nombreField.grabFocus();
		setVenta(ventaBase, true);
		botonEliminar.setEnabled(false);
		listaClientes.clearSelection();
	}

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
			java.util.logging.Logger.getLogger(jUIGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(jUIGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(jUIGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(jUIGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new jUIGestor().setVisible(true);
				botonPrimero.setVisible(false);
				botonAnterior.setVisible(false);
				botonSiguiente.setVisible(false);
				botonUltimo.setVisible(false);
				navegacionLabel.setVisible(false);
				nombreField.grabFocus();
			}
		});
	}

	private void toggleControls(boolean toggle) {
		localidad.setEnabled(toggle);

		proc1.setEnabled(toggle);
		proc2.setEnabled(toggle);
		proc3.setEnabled(toggle);
		proc4.setEnabled(toggle);

		monitor1.setEnabled(toggle);
		monitor2.setEnabled(toggle);
		monitor3.setEnabled(toggle);
		monitor4.setEnabled(toggle);

		ram1.setEnabled(toggle);
		ram2.setEnabled(toggle);
		ram3.setEnabled(toggle);
		ram4.setEnabled(toggle);

		storage1.setEnabled(toggle);
		storage2.setEnabled(toggle);
		storage3.setEnabled(toggle);
		storage4.setEnabled(toggle);

		otros1.setEnabled(toggle);
		otros2.setEnabled(toggle);
		otros3.setEnabled(toggle);
		otros4.setEnabled(toggle);

		botonAniadir.setEnabled(toggle);
		botonBuscar.setEnabled(toggle);
	}

	private void toggleNavegacion(boolean toggleV, boolean toggleE) {
		botonPrimero.setVisible(toggleV);
		botonPrimero.setEnabled(toggleE);

		botonAnterior.setVisible(toggleV);
		botonAnterior.setEnabled(toggleE);

		botonSiguiente.setVisible(toggleV);
		botonSiguiente.setEnabled(toggleE);

		botonUltimo.setVisible(toggleV);
		botonUltimo.setEnabled(toggleE);

		navegacionLabel.setVisible(toggleV);
	}

	private void setVenta(Venta venta, boolean localizacion) {
		ButtonModel[] procBMA
				= {proc1.getModel(), proc2.getModel(), proc3.getModel(), proc4.getModel()};
		ButtonModel[] ramBMA
				= {ram1.getModel(), ram2.getModel(), ram3.getModel(), ram4.getModel()};
		ButtonModel[] monBMA
				= {monitor1.getModel(), monitor2.getModel(), monitor3.getModel(), monitor4.getModel()};
		ButtonModel[] stoBMA
				= {storage1.getModel(), storage2.getModel(), storage3.getModel(), storage4.getModel()};

		if (localizacion) {
			localidad.setSelectedIndex(venta.getLocalizacion());
		}

		processorGroup.setSelected(procBMA[venta.getProcesador()], true);
		ramGroup.setSelected(ramBMA[venta.getRam()], true);
		monitorGroup.setSelected(monBMA[venta.getMonitor()], true);
		storageGroup.setSelected(stoBMA[venta.getAlmacenamiento()], true);
		otros1.setSelected(venta.isOtro1());
		otros2.setSelected(venta.isOtro2());
		otros3.setSelected(venta.isOtro3());
		otros4.setSelected(venta.isOtro4());
	}

	private boolean valido(String text) {
		return text.matches("([a-zA-Z.\\-]+[ ]?)+");
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAniadir;
    private static javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMostrar;
    private static javax.swing.JButton botonPrimero;
    private javax.swing.JButton botonSalir;
    private static javax.swing.JButton botonSiguiente;
    private static javax.swing.JButton botonUltimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaClientes;
    private javax.swing.JLabel listaLabel;
    private javax.swing.JComboBox localidad;
    private javax.swing.JLabel localidadLabel;
    private javax.swing.JRadioButton monitor1;
    private javax.swing.JRadioButton monitor2;
    private javax.swing.JRadioButton monitor3;
    private javax.swing.JRadioButton monitor4;
    private javax.swing.ButtonGroup monitorGroup;
    private javax.swing.JLabel monitorLabel;
    private static javax.swing.JLabel navegacionLabel;
    private static javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JCheckBox otros1;
    private javax.swing.JCheckBox otros2;
    private javax.swing.JCheckBox otros3;
    private javax.swing.JCheckBox otros4;
    private javax.swing.JLabel otrosLabel;
    private javax.swing.JRadioButton proc1;
    private javax.swing.JRadioButton proc2;
    private javax.swing.JRadioButton proc3;
    private javax.swing.JRadioButton proc4;
    private javax.swing.JLabel procLabel;
    private javax.swing.ButtonGroup processorGroup;
    private javax.swing.JRadioButton ram1;
    private javax.swing.JRadioButton ram2;
    private javax.swing.JRadioButton ram3;
    private javax.swing.JRadioButton ram4;
    private javax.swing.ButtonGroup ramGroup;
    private javax.swing.JLabel ramLabel;
    private javax.swing.JRadioButton storage1;
    private javax.swing.JRadioButton storage2;
    private javax.swing.JRadioButton storage3;
    private javax.swing.JRadioButton storage4;
    private javax.swing.ButtonGroup storageGroup;
    private javax.swing.JLabel storageLabel;
    // End of variables declaration//GEN-END:variables
}
