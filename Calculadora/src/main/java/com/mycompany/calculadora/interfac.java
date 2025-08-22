/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.mycompany.calculadora;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class interfac extends javax.swing.JFrame {
   String entrada = ""; 
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(interfac.class.getName());


    public interfac() {
        initComponents();
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonFechaparentes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaomais = new javax.swing.JButton();
        jButtonremover = new javax.swing.JButton();
        jButtonmenos = new javax.swing.JButton();
        jButtonMULTIPLICACAO = new javax.swing.JButton();
        jButtonDIVISAO = new javax.swing.JButton();
        jButtonVIRGULA = new javax.swing.JButton();
        jButtonigual = new javax.swing.JButton();
        saida = new javax.swing.JLabel();
        jButtonRESET = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonABREparentes = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButton1.setText("1");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButton2.setText("2");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButton3.setText("3");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButton4.setText("4");
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButton5.setText("5");
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButton6.setText("6");
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButton7.setText("7");
        jButton7.setBorderPainted(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButton8.setText("8");
        jButton8.setBorderPainted(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButton9.setText("9");
        jButton9.setBorderPainted(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButtonFechaparentes.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButtonFechaparentes.setText(")");
        jButtonFechaparentes.setBorderPainted(false);
        jButtonFechaparentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFechaparentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFechaparentesMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        botaomais.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        botaomais.setText("+");
        botaomais.setBorderPainted(false);
        botaomais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaomais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaomaisMouseClicked(evt);
            }
        });

        jButtonremover.setText("⌫");
        jButtonremover.setBorderPainted(false);
        jButtonremover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonremover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonremoverMouseClicked(evt);
            }
        });
        jButtonremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonremoverActionPerformed(evt);
            }
        });

        jButtonmenos.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButtonmenos.setText("-");
        jButtonmenos.setBorderPainted(false);
        jButtonmenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonmenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonmenosMouseClicked(evt);
            }
        });

        jButtonMULTIPLICACAO.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButtonMULTIPLICACAO.setText("×");
        jButtonMULTIPLICACAO.setBorder(null);
        jButtonMULTIPLICACAO.setBorderPainted(false);
        jButtonMULTIPLICACAO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMULTIPLICACAO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMULTIPLICACAOMouseClicked(evt);
            }
        });
        jButtonMULTIPLICACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMULTIPLICACAOActionPerformed(evt);
            }
        });

        jButtonDIVISAO.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButtonDIVISAO.setText("÷");
        jButtonDIVISAO.setBorderPainted(false);
        jButtonDIVISAO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDIVISAO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDIVISAOMouseClicked(evt);
            }
        });

        jButtonVIRGULA.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButtonVIRGULA.setText(",");
        jButtonVIRGULA.setBorderPainted(false);
        jButtonVIRGULA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVIRGULA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVIRGULAMouseClicked(evt);
            }
        });

        jButtonigual.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButtonigual.setText("=");
        jButtonigual.setBorderPainted(false);
        jButtonigual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonigual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonigualMouseClicked(evt);
            }
        });
        jButtonigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonigualActionPerformed(evt);
            }
        });

        saida.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        saida.setText("0");

        jButtonRESET.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonRESET.setText("RESET");
        jButtonRESET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRESETMouseClicked(evt);
            }
        });

        jLabel2.setText("Calculadora");

        jButtonABREparentes.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButtonABREparentes.setText("(");
        jButtonABREparentes.setBorderPainted(false);
        jButtonABREparentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonABREparentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonABREparentesMouseClicked(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jButton0.setText("0");
        jButton0.setBorderPainted(false);
        jButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton0MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(saida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonMULTIPLICACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonDIVISAO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonVIRGULA, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButtonFechaparentes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jButtonABREparentes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaomais, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRESET, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonremover, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saida))
                    .addComponent(jButtonRESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonremover, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonDIVISAO, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonVIRGULA, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMULTIPLICACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaomais, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonABREparentes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFechaparentes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
    if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "1";
     jLabel1.setText(entrada);
}
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "2";
     jLabel1.setText(entrada);
}
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "3";
     jLabel1.setText(entrada);
}
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "4";
     jLabel1.setText(entrada);
}
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "5";
     jLabel1.setText(entrada);
}
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
            if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "6";
     jLabel1.setText(entrada);
    }//GEN-LAST:event_jButton6MouseClicked
}
    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
    if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "7";
     jLabel1.setText(entrada);
    }//GEN-LAST:event_jButton7MouseClicked
}
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
    if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "8";
     jLabel1.setText(entrada);
    }//GEN-LAST:event_jButton8MouseClicked
}
    private void jButtonFechaparentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFechaparentesMouseClicked
    if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += ")";
     jLabel1.setText(entrada);                    
    }//GEN-LAST:event_jButtonFechaparentesMouseClicked
 } 
    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
    if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "9";
     jLabel1.setText(entrada); 
    }//GEN-LAST:event_jButton9MouseClicked
 }
    private void botaomaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaomaisMouseClicked
     if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "+";
     jLabel1.setText(entrada); 
    }//GEN-LAST:event_botaomaisMouseClicked
}  
    private void jButtonremoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonremoverMouseClicked
     if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    if (!entrada.isEmpty()) {               // verifica se a string não está vazia
            entrada = entrada.substring(0, entrada.length() - 1);
     jLabel1.setText(entrada); 
    }//GEN-LAST:event_jButtonremoverMouseClicked
    }  
    }                                           
                                         
    private void jButtonmenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonmenosMouseClicked
     if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
        entrada += "-";
            jLabel1.setText(entrada); 
    }//GEN-LAST:event_jButtonmenosMouseClicked
}
    private void jButtonMULTIPLICACAOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMULTIPLICACAOMouseClicked
     if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
        entrada += "*";
            jLabel1.setText(entrada); 
    }   
    }//GEN-LAST:event_jButtonMULTIPLICACAOMouseClicked

    private void jButtonDIVISAOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDIVISAOMouseClicked
     if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
        entrada += "/";
            jLabel1.setText(entrada); 
    }   
    }//GEN-LAST:event_jButtonDIVISAOMouseClicked

    private void jButtonVIRGULAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVIRGULAMouseClicked
     if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
        entrada += ".";
            jLabel1.setText(entrada); 
    }   
    }//GEN-LAST:event_jButtonVIRGULAMouseClicked

    private void jButtonigualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonigualMouseClicked
    if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            calcularResultado();
        }
    }//GEN-LAST:event_jButtonigualMouseClicked

    private void jButtonigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonigualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonigualActionPerformed

    private void jButtonRESETMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRESETMouseClicked
     if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
        entrada = "";
        entrada = "";
            jLabel1.setText(entrada); 
            saida.setText(entrada); 
    }  
    }//GEN-LAST:event_jButtonRESETMouseClicked

    private void jButtonABREparentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonABREparentesMouseClicked
     if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
        entrada += "(";
            jLabel1.setText(entrada); 
    } 
    }//GEN-LAST:event_jButtonABREparentesMouseClicked

    private void jButton0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton0MouseClicked
    if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
    entrada += "0";
     jLabel1.setText(entrada);                    
    }          
    }//GEN-LAST:event_jButton0MouseClicked

    private void jButtonMULTIPLICACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMULTIPLICACAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMULTIPLICACAOActionPerformed

    private void jButtonremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonremoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonremoverActionPerformed
     

    public static void main(String args[]) {
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> new interfac().setVisible(true));
    }


private void calcularResultado() {
    try {
        Expression e = new ExpressionBuilder(entrada).build();
        double resultado = e.evaluate();
        entrada = Double.toString(resultado);
        saida.setText(entrada);
    } catch (Exception ex) {
        saida.setText("Sintaxe Erro");
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaomais;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonABREparentes;
    private javax.swing.JButton jButtonDIVISAO;
    private javax.swing.JButton jButtonFechaparentes;
    private javax.swing.JButton jButtonMULTIPLICACAO;
    private javax.swing.JButton jButtonRESET;
    private javax.swing.JButton jButtonVIRGULA;
    private javax.swing.JButton jButtonigual;
    private javax.swing.JButton jButtonmenos;
    private javax.swing.JButton jButtonremover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel saida;
    // End of variables declaration//GEN-END:variables
}
