/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gereestoque;

import Sessao.Sessao;

/**
 *
 * @author tamara
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
      if (Sessao.user.role.equals("colaborador")){
        cadU.setEnabled(false);
      }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        con_prod = new javax.swing.JMenuItem();
        con_forn = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Cad = new javax.swing.JMenu();
        cad_prod = new javax.swing.JMenuItem();
        cad_forn = new javax.swing.JMenuItem();
        cadU = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenu();

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Consultas");

        con_prod.setText("Produto");
        con_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_prodActionPerformed(evt);
            }
        });
        jMenu1.add(con_prod);

        con_forn.setText("Fornecedor");
        con_forn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_fornActionPerformed(evt);
            }
        });
        jMenu1.add(con_forn);

        jMenuItem4.setText("Usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        Cad.setText("Cadastros");

        cad_prod.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        cad_prod.setText("Produto");
        cad_prod.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                cad_prodMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        cad_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cad_prodMouseClicked(evt);
            }
        });
        cad_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_prodActionPerformed(evt);
            }
        });
        Cad.add(cad_prod);

        cad_forn.setText("Fornecedor");
        cad_forn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_fornActionPerformed(evt);
            }
        });
        Cad.add(cad_forn);

        cadU.setText("Usuário");
        cadU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUActionPerformed(evt);
            }
        });
        Cad.add(cadU);

        jMenuBar1.add(Cad);

        jMenu3.setText("Vendas");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Registrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void con_fornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_fornActionPerformed
        // TODO add your handling code here:
        ConsultaFornecedor conF = new ConsultaFornecedor();
        this.setVisible(false);
        conF.setVisible(true);
    }//GEN-LAST:event_con_fornActionPerformed

    private void cad_fornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_fornActionPerformed
        // TODO add your handling code here:
        CadastrarFornecedor cadF = new CadastrarFornecedor();
        this.setVisible(false);
        cadF.setVisible(true);
    }//GEN-LAST:event_cad_fornActionPerformed

    private void con_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_prodActionPerformed
        // TODO add your handling code here:
        ConsultaProduto conP = new ConsultaProduto();
        this.setVisible(false);
        conP.setVisible(true);
    }//GEN-LAST:event_con_prodActionPerformed

    private void cad_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_prodActionPerformed
        // TODO add your handling code here:
        CadastroProduto cadP = new CadastroProduto();
        this.setVisible(false);
        cadP.setVisible(true);
        
    }//GEN-LAST:event_cad_prodActionPerformed

    private void cad_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cad_prodMouseClicked
        
    }//GEN-LAST:event_cad_prodMouseClicked

    private void cad_prodMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_cad_prodMenuKeyPressed
        // TODO add your handling code here:
        CadastroProduto cadP = new CadastroProduto();
        this.setVisible(false);
        cadP.setVisible(true);
    }//GEN-LAST:event_cad_prodMenuKeyPressed

    private void cadUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUActionPerformed
        // TODO add your handling code here:
        CadastroUsuario cadU = new CadastroUsuario();
        this.setVisible(false);
        cadU.setVisible(true);
    }//GEN-LAST:event_cadUActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        ConsultaUsuario conU = new ConsultaUsuario();
        this.setVisible(false);
        conU.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
    }//GEN-LAST:event_sairActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ItensVenda itens = new ItensVenda();
        this.setVisible(false);
        itens.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cad;
    private javax.swing.JMenuItem cadU;
    private javax.swing.JMenuItem cad_forn;
    private javax.swing.JMenuItem cad_prod;
    private javax.swing.JMenuItem con_forn;
    private javax.swing.JMenuItem con_prod;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}
