/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Projetoapp.GUI;

/**
 *
 * @author vfelinto54
 */
public class MDIApplication extends javax.swing.JFrame {

    /**
     * Creates new form MDIApplication
     */
    public MDIApplication() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        cadastroMenu = new javax.swing.JMenu();
        cadastrarProMI = new javax.swing.JMenuItem();
        editarMenu = new javax.swing.JMenu();
        editProMI = new javax.swing.JMenuItem();
        removerMenu = new javax.swing.JMenu();
        removerProMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        cadastroMenu.setMnemonic('f');
        cadastroMenu.setText("Cadastrar");

        cadastrarProMI.setMnemonic('s');
        cadastrarProMI.setText("Produto");
        cadastrarProMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProMIActionPerformed(evt);
            }
        });
        cadastroMenu.add(cadastrarProMI);

        menuBar.add(cadastroMenu);

        editarMenu.setMnemonic('e');
        editarMenu.setText("Editar");

        editProMI.setMnemonic('y');
        editProMI.setText("Produto");
        editProMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProMIActionPerformed(evt);
            }
        });
        editarMenu.add(editProMI);

        menuBar.add(editarMenu);

        removerMenu.setMnemonic('h');
        removerMenu.setText("Remover");

        removerProMI.setMnemonic('a');
        removerProMI.setText("Produto");
        removerProMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerProMIActionPerformed(evt);
            }
        });
        removerMenu.add(removerProMI);

        menuBar.add(removerMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarProMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProMIActionPerformed
        CadastrarProduto cadP = new CadastrarProduto();
        //this.desktopPane.add(cadP);
        cadP.setVisible(true);
    }//GEN-LAST:event_cadastrarProMIActionPerformed

    private void editProMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProMIActionPerformed
        EditarProduto editP = new EditarProduto();
        editP.setVisible(true);
    }//GEN-LAST:event_editProMIActionPerformed

    private void removerProMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerProMIActionPerformed
        RemoverProduto removP = new RemoverProduto();
        removP.setVisible(true);
    }//GEN-LAST:event_removerProMIActionPerformed

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
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarProMI;
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem editProMI;
    private javax.swing.JMenu editarMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu removerMenu;
    private javax.swing.JMenuItem removerProMI;
    // End of variables declaration//GEN-END:variables

}
