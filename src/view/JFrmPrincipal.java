package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFpricipal
     */
    public JFrmPrincipal() {
        initComponents();
        setTitle("Principal");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jProduto = new javax.swing.JMenuItem();
        jUsuarios = new javax.swing.JMenuItem();
        jVendedor = new javax.swing.JMenuItem();
        jCliente = new javax.swing.JMenuItem();
        jSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jVenda = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jMenu1.setMnemonic('p');
        jMenu1.setText("Cadastros");

        jProduto.setText("Produto");
        jProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jProduto);

        jUsuarios.setText("Usuarios");
        jUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jUsuarios);

        jVendedor.setText("Vendedor");
        jVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVendedorActionPerformed(evt);
            }
        });
        jMenu1.add(jVendedor);

        jCliente.setText("Cliente");
        jCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jCliente);

        jSair.setText("sair");
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        jMenu1.add(jSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimentos");

        jVenda.setText("venda");
        jVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jVenda);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProdutoActionPerformed
        // TODO add your handling code here:
         JDlgProduto jDlgProduto = new JDlgProduto(this, true);
          jDlgProduto.setVisible(true);
    }//GEN-LAST:event_jProdutoActionPerformed

    private void jUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuariosActionPerformed
        JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(this, true);
        jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jUsuariosActionPerformed

    private void jVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVendedorActionPerformed
       JDlgVendedor jDlgVendedor = new JDlgVendedor(this, true);
        jDlgVendedor.setVisible(true);
    }//GEN-LAST:event_jVendedorActionPerformed

    private void jClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClienteActionPerformed
               JDlgcliente jDlgcliente = new JDlgcliente(this, true);
        jDlgcliente.setVisible(true);
    }//GEN-LAST:event_jClienteActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jSairActionPerformed

    private void jVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVendaActionPerformed
        JDlgVenda jDlgVendass = new JDlgVenda(this, true);
        jDlgVendass.setVisible(true);
    }//GEN-LAST:event_jVendaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jCliente;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jProduto;
    private javax.swing.JMenuItem jSair;
    private javax.swing.JMenuItem jUsuarios;
    private javax.swing.JMenuItem jVenda;
    private javax.swing.JMenuItem jVendedor;
    // End of variables declaration//GEN-END:variables
}
