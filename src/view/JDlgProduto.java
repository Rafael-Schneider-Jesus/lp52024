/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import viewPesquisa.JDlgProdutoPesquisa;
import viewPesquisa.JDlgUsuariosPesquisa;

/**
 *
 * @author User
 */
public class JDlgProduto extends javax.swing.JDialog {

    /**
     * Creates new form JDlgProduto
     */
    public JDlgProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Produto");
        setLocationRelativeTo(null);
         tools.Util.habilitar(false,jCbocopo, jCbotamanho, jtxtCodigo, jtxtsabor, jbtnExcluir,jBtnComfirmar,jBtnCancelar,jBtnAlterar,jCboEntrega);
    }

    JDlgProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtCodigo = new javax.swing.JTextField();
        jtxtsabor = new javax.swing.JTextField();
        jbtnExcluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnpesquisar = new javax.swing.JButton();
        jBtnComfirmar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jCbocopo = new javax.swing.JComboBox<>();
        jCbotamanho = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCboEntrega = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoActionPerformed(evt);
            }
        });

        jtxtsabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsaborActionPerformed(evt);
            }
        });

        jbtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jLabel1.setText("codigo");

        jBtnpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnpesquisar.setText("pesquisar");
        jBtnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnpesquisarActionPerformed(evt);
            }
        });

        jBtnComfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnComfirmar.setText("comfimar");
        jBtnComfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnComfirmarActionPerformed(evt);
            }
        });

        jLabel3.setText("copo ou casquinha");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("tamanho");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jCbocopo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Copo", "casquinha" }));
        jCbocopo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbocopoActionPerformed(evt);
            }
        });

        jCbotamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "G", "P" }));

        jLabel5.setText("sabor");

        jLabel2.setText("entrega");

        jCboEntrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnComfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnpesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtCodigo)
                            .addComponent(jCbocopo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtsabor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jCbotamanho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jCboEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbocopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbotamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCboEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnExcluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnpesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnComfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnIncluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed

    private void jtxtsaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsaborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsaborActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
      tools.Util.limp(jCbocopo, jCbotamanho, jtxtCodigo, jtxtsabor, jCboEntrega);
        tools.Util.habilitar(false,jCbocopo, jCbotamanho, jtxtCodigo, jtxtsabor, jBtnComfirmar,jBtnCancelar,jbtnExcluir, jBtnAlterar, jCboEntrega);
      tools.Util.habilitar(true, jBtnpesquisar,jBtnIncluir);
       
      tools.Util.perguntar(null);
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
   tools.Util.habilitar(true,jCbocopo, jCbotamanho, jtxtCodigo, jtxtsabor, jBtnComfirmar,jCboEntrega);
   tools.Util.habilitar(false,jBtnpesquisar, jBtnIncluir, jBtnAlterar, jbtnExcluir);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnpesquisarActionPerformed
        JDlgProdutoPesquisa jDlgProdutoPesquisa = new JDlgProdutoPesquisa(null, true);
        jDlgProdutoPesquisa.setTelaAnterior(this);        
        jDlgProdutoPesquisa.setVisible(true);
        
        
  tools.Util.habilitar(true,jCbocopo, jCbotamanho, jtxtCodigo, jtxtsabor, jbtnExcluir,jBtnComfirmar,jBtnCancelar,jBtnAlterar,jCboEntrega);
  tools.Util.habilitar(false,jBtnpesquisar, jBtnComfirmar, jBtnIncluir);
    }//GEN-LAST:event_jBtnpesquisarActionPerformed

    private void jBtnComfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComfirmarActionPerformed
      tools.Util.limp(jCbocopo, jCbotamanho, jtxtCodigo, jtxtsabor, jCboEntrega);
      tools.Util.habilitar(false,jCbocopo, jCbotamanho, jtxtCodigo, jtxtsabor, jBtnComfirmar,jBtnCancelar,jbtnExcluir,jCboEntrega);
      tools.Util.habilitar(true, jBtnpesquisar,jBtnIncluir);
    }//GEN-LAST:event_jBtnComfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
      tools.Util.limp(jCbocopo, jCbotamanho, jtxtCodigo, jtxtsabor,jCboEntrega);
      tools.Util.habilitar(false,jCbocopo, jCbotamanho, jtxtCodigo, jtxtsabor, jBtnComfirmar,jBtnCancelar,jbtnExcluir,jCboEntrega);
      tools.Util.habilitar(true, jBtnpesquisar,jBtnIncluir);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
    tools.Util.habilitar(true,jCbocopo, jCbotamanho, jtxtCodigo, jtxtsabor, jBtnComfirmar, jBtnCancelar,jCboEntrega);
    tools.Util.habilitar(false, jBtnpesquisar, jBtnIncluir);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jCbocopoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbocopoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbocopoActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgProduto dialog = new JDlgProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnComfirmar;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnpesquisar;
    private javax.swing.JComboBox<String> jCboEntrega;
    private javax.swing.JComboBox<String> jCbocopo;
    private javax.swing.JComboBox<String> jCbotamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtsabor;
    // End of variables declaration//GEN-END:variables
}
