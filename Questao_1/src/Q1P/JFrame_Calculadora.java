package Q1P;

public class JFrame_Calculadora extends javax.swing.JFrame {
    
    double primeiro_Valor, segundo_Valor;
    String calculo;
    
    public JFrame_Calculadora() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoDeExibição = new javax.swing.JTextField();
        botao_0 = new javax.swing.JButton();
        botao_1 = new javax.swing.JButton();
        botao_2 = new javax.swing.JButton();
        botao_3 = new javax.swing.JButton();
        botao_4 = new javax.swing.JButton();
        botao_5 = new javax.swing.JButton();
        botao_6 = new javax.swing.JButton();
        botao_7 = new javax.swing.JButton();
        botao_8 = new javax.swing.JButton();
        botao_9 = new javax.swing.JButton();
        botao_Ponto = new javax.swing.JButton();
        botao_Igual = new javax.swing.JButton();
        botao_Mais = new javax.swing.JButton();
        botao_Menos = new javax.swing.JButton();
        botao_Vezes = new javax.swing.JButton();
        botao_Divide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CampoDeExibição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDeExibiçãoActionPerformed(evt);
            }
        });

        botao_0.setText("0");
        botao_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_0ActionPerformed(evt);
            }
        });

        botao_1.setText("1");
        botao_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_1ActionPerformed(evt);
            }
        });

        botao_2.setText("2");
        botao_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_2ActionPerformed(evt);
            }
        });

        botao_3.setText("3");
        botao_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_3ActionPerformed(evt);
            }
        });

        botao_4.setText("4");
        botao_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_4ActionPerformed(evt);
            }
        });

        botao_5.setText("5");
        botao_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_5ActionPerformed(evt);
            }
        });

        botao_6.setText("6");
        botao_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_6ActionPerformed(evt);
            }
        });

        botao_7.setText("7");
        botao_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_7ActionPerformed(evt);
            }
        });

        botao_8.setText("8");
        botao_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_8ActionPerformed(evt);
            }
        });

        botao_9.setText("9");
        botao_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_9ActionPerformed(evt);
            }
        });

        botao_Ponto.setText(".");
        botao_Ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_PontoActionPerformed(evt);
            }
        });

        botao_Igual.setText("=");
        botao_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_IgualActionPerformed(evt);
            }
        });

        botao_Mais.setText("+");
        botao_Mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_MaisActionPerformed(evt);
            }
        });

        botao_Menos.setText("-");
        botao_Menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_MenosActionPerformed(evt);
            }
        });

        botao_Vezes.setText("*");
        botao_Vezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_VezesActionPerformed(evt);
            }
        });

        botao_Divide.setText("/");
        botao_Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_DivideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoDeExibição)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_Menos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_Mais, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_Vezes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CampoDeExibição, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao_Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(botao_Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao_Vezes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao_Menos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao_Mais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDeExibiçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDeExibiçãoActionPerformed

    }//GEN-LAST:event_CampoDeExibiçãoActionPerformed

    private void botao_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_7ActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + "7");
    }//GEN-LAST:event_botao_7ActionPerformed

    private void botao_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_8ActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + "8");
    }//GEN-LAST:event_botao_8ActionPerformed

    private void botao_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_9ActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + "9");
    }//GEN-LAST:event_botao_9ActionPerformed

    private void botao_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_4ActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + "4");
    }//GEN-LAST:event_botao_4ActionPerformed

    private void botao_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_5ActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + "5");
    }//GEN-LAST:event_botao_5ActionPerformed

    private void botao_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_6ActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + "6");
    }//GEN-LAST:event_botao_6ActionPerformed

    private void botao_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_1ActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + "1");
    }//GEN-LAST:event_botao_1ActionPerformed

    private void botao_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_2ActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + "2");
    }//GEN-LAST:event_botao_2ActionPerformed

    private void botao_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_3ActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + "3");
    }//GEN-LAST:event_botao_3ActionPerformed

    private void botao_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_0ActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + "0");
    }//GEN-LAST:event_botao_0ActionPerformed

    private void botao_PontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_PontoActionPerformed
        CampoDeExibição.setText(CampoDeExibição.getText() + ".");
    }//GEN-LAST:event_botao_PontoActionPerformed

    private void botao_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_IgualActionPerformed
        segundo_Valor = Double.parseDouble(CampoDeExibição.getText());

        if (null != calculo) switch (calculo) {
            case "+":
                CampoDeExibição.setText(String.valueOf(primeiro_Valor + segundo_Valor));
                break;
            case "-":
                CampoDeExibição.setText(String.valueOf(primeiro_Valor - segundo_Valor));
                break;
            case "*":
                CampoDeExibição.setText(String.valueOf(primeiro_Valor * segundo_Valor));
                break;
            case "/":
                CampoDeExibição.setText(String.valueOf(primeiro_Valor / segundo_Valor));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_botao_IgualActionPerformed

    private void botao_MaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_MaisActionPerformed
        primeiro_Valor = Double.parseDouble(CampoDeExibição.getText());
        calculo = "+";
        CampoDeExibição.setText("");
    }//GEN-LAST:event_botao_MaisActionPerformed

    private void botao_MenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_MenosActionPerformed
        primeiro_Valor = Double.parseDouble(CampoDeExibição.getText());
        calculo = "-";
        CampoDeExibição.setText("");
    }//GEN-LAST:event_botao_MenosActionPerformed

    private void botao_VezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_VezesActionPerformed
        primeiro_Valor = Double.parseDouble(CampoDeExibição.getText());
        calculo = "*";
        CampoDeExibição.setText("");
    }//GEN-LAST:event_botao_VezesActionPerformed

    private void botao_DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_DivideActionPerformed
        primeiro_Valor = Double.parseDouble(CampoDeExibição.getText());
        calculo = "/";
        CampoDeExibição.setText("");
    }//GEN-LAST:event_botao_DivideActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoDeExibição;
    private javax.swing.JButton botao_0;
    private javax.swing.JButton botao_1;
    private javax.swing.JButton botao_2;
    private javax.swing.JButton botao_3;
    private javax.swing.JButton botao_4;
    private javax.swing.JButton botao_5;
    private javax.swing.JButton botao_6;
    private javax.swing.JButton botao_7;
    private javax.swing.JButton botao_8;
    private javax.swing.JButton botao_9;
    private javax.swing.JButton botao_Divide;
    private javax.swing.JButton botao_Igual;
    private javax.swing.JButton botao_Mais;
    private javax.swing.JButton botao_Menos;
    private javax.swing.JButton botao_Ponto;
    private javax.swing.JButton botao_Vezes;
    // End of variables declaration//GEN-END:variables
}
