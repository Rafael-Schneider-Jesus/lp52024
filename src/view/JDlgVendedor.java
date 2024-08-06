 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;
import dao.VendedorDAO;
import bean.VendedorRsj;
import viewPesquisa.JDlgVendedorPesquisa;

/**
 *
 * @author User
 */
public class JDlgVendedor extends javax.swing.JDialog {
   VendedorRsj vendedorRsj;
   VendedorDAO vendedorDAO;
    /**
     * Creates new form JDlgVendedor
     */
    public JDlgVendedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
         vendedorDAO = new VendedorDAO();
        initComponents();
        setTitle("Venderdor");
        setLocationRelativeTo(null);
        tools.Util.habilitar(false,jTelefone, jTxtCodigo, jTxtNome, jTxtSobre, jCpf, jDataNa, jSenha, jcboFuncao, jbtnExcluir,jBtnComfirmar,jBtnCancelar,jBtnAlterar);
    }
    
    
    
    public void beanView(VendedorRsj vendedorRsj) {
        jTxtCodigo.setText(tools.Util.intStr(vendedorRsj.getIdvendedorRsj()));
        jTxtSobre.setText(vendedorRsj.getSobrenomeRsj());
        jTxtNome.setText(vendedorRsj.getNomeRsj());
        jCpf.setText(vendedorRsj.getCpfRsj());
        jSenha.setText(vendedorRsj.getSenhaRsj());
        jcboFuncao.setSelectedIndex(vendedorRsj.getFuncaoRsj());
        jTelefone.setText(vendedorRsj.getTelefoneRsj());

    }
    
    public VendedorRsj viewBean() {
        VendedorRsj vendedorRsj = new VendedorRsj();  
        vendedorRsj.setIdvendedorRsj(tools.Util.strInt(jTxtCodigo.getText()));
        vendedorRsj.setSobrenomeRsj(jTxtSobre.getText());
        vendedorRsj.setCpfRsj(jCpf.getText());
       vendedorRsj.setTelefoneRsj(jTelefone.getText());
        vendedorRsj.setFuncaoRsj(jcboFuncao.getSelectedIndex());
        vendedorRsj.setNomeRsj(jTxtNome.getText());
        vendedorRsj.setSenhaRsj(jSenha.getText());
        return vendedorRsj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtSobre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jCpf = new javax.swing.JFormattedTextField();
        jBtnAlterar = new javax.swing.JButton();
        jTelefone = new javax.swing.JFormattedTextField();
        jBtnpesquisar = new javax.swing.JButton();
        jDataNa = new javax.swing.JFormattedTextField();
        jBtnComfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcboFuncao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone");

        jLabel5.setText("CPF");

        jLabel6.setText("Data de nasimento");

        jLabel7.setText("Senha");

        jSenha.setText("jPasswordField1");

        jLabel8.setText("funcão");

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

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

        jLabel1.setText("codigo");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLabel3.setText("Sobrenome");

        jcboFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel1))
                                        .addGap(92, 92, 92))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDataNa)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTelefone)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jSenha)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTxtSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jcboFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnComfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnpesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcboFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDataNa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnExcluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnpesquisar)
                    .addComponent(jBtnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnComfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnIncluir)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
  tools.Util.limp(jTelefone, jTxtCodigo, jTxtNome, jTxtSobre, jCpf, jDataNa, jSenha, jcboFuncao);         
  tools.Util.habilitar(false,jTelefone, jTxtCodigo, jTxtNome, jTxtSobre, jCpf, jDataNa, jSenha, jcboFuncao, jBtnComfirmar,jBtnCancelar,jbtnExcluir, jBtnAlterar);
  tools.Util.perguntar(null);
  tools.Util.habilitar(true, jBtnpesquisar,jBtnIncluir);
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
     tools.Util.habilitar(true,jTelefone, jTxtCodigo, jTxtNome, jTxtSobre, jCpf, jDataNa, jSenha, jcboFuncao, jBtnComfirmar);
   tools.Util.habilitar(false,jBtnpesquisar, jBtnIncluir, jBtnAlterar, jbtnExcluir);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnpesquisarActionPerformed
        JDlgVendedorPesquisa jDlgVendedorPesquisa = new JDlgVendedorPesquisa(null, true);
        jDlgVendedorPesquisa.setTelaAnterior(this);        
        jDlgVendedorPesquisa.setVisible(true);
        
        
  tools.Util.habilitar(true,jTelefone, jTxtCodigo, jTxtNome, jTxtSobre, jCpf, jDataNa, jSenha, jcboFuncao, jbtnExcluir,jBtnComfirmar,jBtnCancelar,jBtnAlterar);
  tools.Util.habilitar(false,jBtnpesquisar, jBtnComfirmar, jBtnIncluir);
    }//GEN-LAST:event_jBtnpesquisarActionPerformed

    private void jBtnComfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComfirmarActionPerformed
  vendedorDAO.insert(viewBean());
        tools.Util.limp(jTelefone, jTxtCodigo, jTxtNome, jTxtSobre, jCpf, jDataNa, jSenha, jcboFuncao); 
      tools.Util.habilitar(false,jTelefone, jTxtCodigo, jTxtNome, jTxtSobre, jCpf, jDataNa, jSenha, jcboFuncao, jBtnComfirmar,jBtnCancelar,jbtnExcluir);
      tools.Util.habilitar(true, jBtnpesquisar,jBtnIncluir);
    }//GEN-LAST:event_jBtnComfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
    tools.Util.limp(jTelefone, jTxtCodigo, jTxtNome, jTxtSobre, jCpf, jDataNa, jSenha, jcboFuncao); 
      tools.Util.habilitar(false,jTxtCodigo,jTelefone, jTxtNome, jTxtSobre, jCpf, jDataNa, jSenha, jcboFuncao, jBtnComfirmar,jBtnCancelar,jbtnExcluir);
      tools.Util.habilitar(true, jBtnpesquisar,jBtnIncluir);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        tools.Util.habilitar(true,jTelefone, jTxtCodigo, jTxtNome, jTxtSobre, jCpf, jDataNa, jSenha, jcboFuncao, jBtnComfirmar, jBtnCancelar);
    tools.Util.habilitar(false, jBtnpesquisar, jBtnIncluir);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendedor dialog = new JDlgVendedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField jCpf;
    private javax.swing.JFormattedTextField jDataNa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JFormattedTextField jTelefone;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtSobre;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JComboBox<String> jcboFuncao;
    // End of variables declaration//GEN-END:variables
}
