/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;



/**
 *
 * @author rafae
 */
public class frmPrincipalAdm extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipalDiretoria
     */
    public frmPrincipalAdm() {
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

        dpnDesk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuPessoal = new javax.swing.JMenu();
        mnuPessoalUsuarios = new javax.swing.JMenuItem();
        mnuPessoalNovoUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuPessoalSair = new javax.swing.JMenuItem();
        mnuArquivos = new javax.swing.JMenu();
        mnuArquivosRelatorios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de produtividade");

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jMenuBar1.add(jMenu1);

        mnuPessoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pessoal.png"))); // NOI18N
        mnuPessoal.setText("Pessoal");

        mnuPessoalUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuPessoalUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Usuarios.png"))); // NOI18N
        mnuPessoalUsuarios.setText("Usuarios");
        mnuPessoalUsuarios.setToolTipText("");
        mnuPessoalUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPessoalUsuariosActionPerformed(evt);
            }
        });
        mnuPessoal.add(mnuPessoalUsuarios);

        mnuPessoalNovoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuPessoalNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Novo usuario.png"))); // NOI18N
        mnuPessoalNovoUsuario.setText("Novo Usuario");
        mnuPessoalNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPessoalNovoUsuarioActionPerformed(evt);
            }
        });
        mnuPessoal.add(mnuPessoalNovoUsuario);
        mnuPessoal.add(jSeparator1);

        mnuPessoalSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuPessoalSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sair.png"))); // NOI18N
        mnuPessoalSair.setText("Sair");
        mnuPessoalSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPessoalSairActionPerformed(evt);
            }
        });
        mnuPessoal.add(mnuPessoalSair);

        jMenuBar1.add(mnuPessoal);

        mnuArquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arquivo.png"))); // NOI18N
        mnuArquivos.setText("Arquivos");

        mnuArquivosRelatorios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivosRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Relatorio.png"))); // NOI18N
        mnuArquivosRelatorios.setText("Relatórios");
        mnuArquivos.add(mnuArquivosRelatorios);

        jMenuBar1.add(mnuArquivos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPessoalUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPessoalUsuariosActionPerformed
frmUsuarios mUsuarios = new frmUsuarios();
dpnDesk.add(mUsuarios);
mUsuarios.show();
    }//GEN-LAST:event_mnuPessoalUsuariosActionPerformed

    private void mnuPessoalSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPessoalSairActionPerformed
        frmLogin mLogin = new frmLogin();
        this.setVisible(false);
        mLogin.setLocationRelativeTo(null);
        mLogin.setVisible(true);
    }//GEN-LAST:event_mnuPessoalSairActionPerformed

    private void mnuPessoalNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPessoalNovoUsuarioActionPerformed
frmNovoUsuario mNovoUsuario = new frmNovoUsuario();
dpnDesk.add(mNovoUsuario);
mNovoUsuario.show();        
    }//GEN-LAST:event_mnuPessoalNovoUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuArquivos;
    private javax.swing.JMenuItem mnuArquivosRelatorios;
    private javax.swing.JMenu mnuPessoal;
    private javax.swing.JMenuItem mnuPessoalNovoUsuario;
    private javax.swing.JMenuItem mnuPessoalSair;
    private javax.swing.JMenuItem mnuPessoalUsuarios;
    // End of variables declaration//GEN-END:variables
}
