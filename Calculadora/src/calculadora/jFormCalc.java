/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.SwingConstants;

/**
 *
 * @author alumno
 */
public class jFormCalc extends javax.swing.JFrame {

    /**
     * Creates new form jFormCalc
     
    public jFormCalc() {
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

        jFormattedTextNumDisplay = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonMin = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButtonMult = new javax.swing.JButton();
        jButtonExp = new javax.swing.JButton();
        jButtonPow = new javax.swing.JButton();
        jButtonNRoot = new javax.swing.JButton();
        jButtonNonNLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jFormattedTextNumDisplay.setEditable(false);
        jFormattedTextNumDisplay.setText("0");
        jFormattedTextNumDisplay.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jFormattedTextNumDisplay.setName(""); // NOI18N

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonEquals.setText("=");
        jButtonEquals.setEnabled(false);
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });

        jButtonPlus.setText("+");
        jButtonPlus.setEnabled(false);
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jButtonMin.setText("-");
        jButtonMin.setEnabled(false);
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinActionPerformed(evt);
            }
        });

        jButtonDiv.setText("/");
        jButtonDiv.setEnabled(false);
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        jButtonMult.setText("*");
        jButtonMult.setEnabled(false);
        jButtonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultActionPerformed(evt);
            }
        });

        jButtonExp.setText("x!");
        jButtonExp.setEnabled(false);
        jButtonExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExpActionPerformed(evt);
            }
        });

        jButtonPow.setText("xⁿ");
        jButtonPow.setEnabled(false);
        jButtonPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPowActionPerformed(evt);
            }
        });

        jButtonNRoot.setText("ⁿ√x");
        jButtonNRoot.setEnabled(false);
        jButtonNRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNRootActionPerformed(evt);
            }
        });

        jButtonNonNLog.setText("logₐx");
        jButtonNonNLog.setEnabled(false);
        jButtonNonNLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNonNLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextNumDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNonNLog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPow, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFormattedTextNumDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNonNLog, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (!jFormattedTextNumDisplay.getText().equals("0")) {//If it's not in base state
            jFormattedTextNumDisplay.setText(jFormattedTextNumDisplay.getText() + "0");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!jFormattedTextNumDisplay.getText().equals("0") ) {//If it's not in base state
            jFormattedTextNumDisplay.setText(jFormattedTextNumDisplay.getText() + "7");
        } else {
            //If it's in base state NO OPERATION
                jFormattedTextNumDisplay.setText("7");
                if (jCalcController.getOperationStatus() == jCalcController.NO_OPERATION) {
                    enableOps();
                } else {//If there is an operation pending
                    jButtonEquals.setEnabled(true);
                }
            
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (!jFormattedTextNumDisplay.getText().equals("0")) {//If it's not in base state
            jFormattedTextNumDisplay.setText(jFormattedTextNumDisplay.getText() + "8");
        } else {
            //If it's in base state NO OPERATION
                jFormattedTextNumDisplay.setText("8");
                if (jCalcController.getOperationStatus() == jCalcController.NO_OPERATION) {
                    enableOps();
                } else {//If there is an operation pending
                    jButtonEquals.setEnabled(true);
                }
            
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jFormattedTextNumDisplay.setText("0");
        jCalcController.clearOperation();
        disableOps();
        jButtonEquals.setEnabled(false);
        enableNumbers();
        //Restores base state NO OPERATION
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!jFormattedTextNumDisplay.getText().equals("0")) {//If it's not in base state
            jFormattedTextNumDisplay.setText(jFormattedTextNumDisplay.getText() + "9");
        } else {
            //If it's in base state NO OPERATION
                jFormattedTextNumDisplay.setText("9");
                if (jCalcController.getOperationStatus() == jCalcController.NO_OPERATION) {
                    enableOps();
                } else {//If there is an operation pending
                    jButtonEquals.setEnabled(true);
                }
            
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!jFormattedTextNumDisplay.getText().equals("0") ) {//If it's not in base state
            jFormattedTextNumDisplay.setText(jFormattedTextNumDisplay.getText() + "4");
        } else {
            //If it's in base state NO OPERATION
                jFormattedTextNumDisplay.setText("4");
                if (jCalcController.getOperationStatus() == jCalcController.NO_OPERATION) {
                    enableOps();
                } else {//If there is an operation pending
                    jButtonEquals.setEnabled(true);
                }
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!jFormattedTextNumDisplay.getText().equals("0")) {//If it's not in base state
            jFormattedTextNumDisplay.setText(jFormattedTextNumDisplay.getText() + "5");
        } else {
            //If it's in base state NO OPERATION
                jFormattedTextNumDisplay.setText("5");
                if (jCalcController.getOperationStatus() == jCalcController.NO_OPERATION) {
                    enableOps();
                } else {//If there is an operation pending
                    jButtonEquals.setEnabled(true);
                }
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!jFormattedTextNumDisplay.getText().equals("0")) {//If it's not in base state
            jFormattedTextNumDisplay.setText(jFormattedTextNumDisplay.getText() + "6");
        } else {
           //If it's in base state NO OPERATION
                jFormattedTextNumDisplay.setText("6");
                if (jCalcController.getOperationStatus() == jCalcController.NO_OPERATION) {
                    enableOps();
                } else {//If there is an operation pending
                    jButtonEquals.setEnabled(true);
                }
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jFormattedTextNumDisplay.getText().equals("0")) {//If it's not in base state
            jFormattedTextNumDisplay.setText(jFormattedTextNumDisplay.getText() + "1");
        } else {
            //If it's in base state NO OPERATION
                jFormattedTextNumDisplay.setText("1");
                if (jCalcController.getOperationStatus() == jCalcController.NO_OPERATION) {
                    enableOps();
                } else {//If there is an operation pending
                    jButtonEquals.setEnabled(true);
                }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!jFormattedTextNumDisplay.getText().equals("0") && jCalcController.getOperationStatus() != jCalcController.CLOSED_OPERATION) {
            jFormattedTextNumDisplay.setText(jFormattedTextNumDisplay.getText() + "2");
        } else {
           //If it's in base state NO OPERATION
                jFormattedTextNumDisplay.setText("2");
                if (jCalcController.getOperationStatus() == jCalcController.NO_OPERATION) {
                    enableOps();
                } else {//If there is an operation pending
                    jButtonEquals.setEnabled(true);
                }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!jFormattedTextNumDisplay.getText().equals("0")) { //If it's not in base state
            jFormattedTextNumDisplay.setText(jFormattedTextNumDisplay.getText() + "3");
        } else {
           //If it's in base state NO OPERATION
                jFormattedTextNumDisplay.setText("3");
                if (jCalcController.getOperationStatus() == jCalcController.NO_OPERATION) {
                    enableOps();
                } else { //If there is an operation pending
                    jButtonEquals.setEnabled(true);
                }
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        jCalcController.setfEntry(jFormattedTextNumDisplay.getText());//stores the current value
        jCalcController.openOperation(jCalcController.SUM_OPERATION);//sets the current state to SUMATION MODE
        jFormattedTextNumDisplay.setText("0");//Resets the TextBox
        disableOps();//Restores the initial state
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        jCalcController.setfEntry(jFormattedTextNumDisplay.getText());//stores the current value
        jCalcController.openOperation(jCalcController.SUB_OPERATION);//sets the current state to SUBSTRACTION MODE
        jFormattedTextNumDisplay.setText("0");//Resets the TextBox
        disableOps();//Restores the initial state
    }//GEN-LAST:event_jButtonMinActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        jCalcController.setfEntry(jFormattedTextNumDisplay.getText());//stores the current value
        jCalcController.openOperation(jCalcController.DIV_OPERATION);//sets the current state to DIVISION MODE
        jFormattedTextNumDisplay.setText("0");//Resets the TextBox
        disableOps();//Restores the initial state
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultActionPerformed
        jCalcController.setfEntry(jFormattedTextNumDisplay.getText());//stores the current value
        jCalcController.openOperation(jCalcController.MULT_OPERATION);//sets the current state to MULTIPLICATION MODE
        jFormattedTextNumDisplay.setText("0");//Resets the TextBox
        disableOps();//Restores the initial state
    }//GEN-LAST:event_jButtonMultActionPerformed

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualsActionPerformed
        //launches the method operate(String) to obtain the result depending on the current state
        //also, disables all buttons except C
        jFormattedTextNumDisplay.setText(jCalcController.operate(jFormattedTextNumDisplay.getText()));
        disableAll();
    }//GEN-LAST:event_jButtonEqualsActionPerformed

    private void jButtonExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExpActionPerformed
        jCalcController.setfEntry(jFormattedTextNumDisplay.getText());//stores the current value
        jCalcController.openOperation(jCalcController.EXP_OPERATION);
        jFormattedTextNumDisplay.setText(jCalcController.operate(jFormattedTextNumDisplay.getText()));
        disableAll();
    }//GEN-LAST:event_jButtonExpActionPerformed

    private void jButtonPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPowActionPerformed
        jCalcController.setfEntry(jFormattedTextNumDisplay.getText());//stores the current value
        jCalcController.openOperation(jCalcController.POW_OPERATION);//sets the current state to MULTIPLICATION MODE
        jFormattedTextNumDisplay.setText("0");//Resets the TextBox
        disableOps();//Restores the initial state
    }//GEN-LAST:event_jButtonPowActionPerformed

    private void jButtonNRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNRootActionPerformed
        jCalcController.setfEntry(jFormattedTextNumDisplay.getText());//stores the current value
        jCalcController.openOperation(jCalcController.NROOT_OPERATION);//sets the current state to MULTIPLICATION MODE
        jFormattedTextNumDisplay.setText("0");//Resets the TextBox
        disableOps();//Restores the initial state
    }//GEN-LAST:event_jButtonNRootActionPerformed

    private void jButtonNonNLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNonNLogActionPerformed
        jCalcController.setfEntry(jFormattedTextNumDisplay.getText());//stores the current value
        jCalcController.openOperation(jCalcController.NONNLOG_OPERATION);//sets the current state to MULTIPLICATION MODE
        jFormattedTextNumDisplay.setText("0");//Resets the TextBox
        disableOps();//Restores the initial state
    }//GEN-LAST:event_jButtonNonNLogActionPerformed

    private void disableOps() { //disables all operation buttons
        jButtonDiv.setEnabled(false);
        jButtonMin.setEnabled(false);
        jButtonMult.setEnabled(false);
        jButtonPlus.setEnabled(false);
        jButtonExp.setEnabled(false);
        jButtonPow.setEnabled(false);
        jButtonNRoot.setEnabled(false);
        jButtonNonNLog.setEnabled(false);
    }
    
    private void disableAll(){
        disableOps();
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButtonEquals.setEnabled(false);
    }
    
    private void enableNumbers(){
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
    }

    private void enableOps() {
        jButtonDiv.setEnabled(true);
        jButtonMin.setEnabled(true);
        jButtonMult.setEnabled(true);
        jButtonPlus.setEnabled(true);
        jButtonExp.setEnabled(true);
        jButtonPow.setEnabled(true);
        jButtonNRoot.setEnabled(true);
        jButtonNonNLog.setEnabled(true);
    }

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
            java.util.logging.Logger.getLogger(jFormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFormCalc().setVisible(true);
                jFormattedTextNumDisplay.setHorizontalAlignment(SwingConstants.RIGHT);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonExp;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JButton jButtonMult;
    private javax.swing.JButton jButtonNRoot;
    private javax.swing.JButton jButtonNonNLog;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonPow;
    private static javax.swing.JFormattedTextField jFormattedTextNumDisplay;
    // End of variables declaration//GEN-END:variables
}
