/*
   --------------------------------------
      Developed by
      Dileepa Bandara
      https://dileepabandara.github.io
      contact.dileepabandara@gmail.com
      ©dileepabandara.dev
      2020
   --------------------------------------
*/

package main;

import java.awt.Color;

/**
 *
 * @author DileepaBandara
 */
public class welcome extends javax.swing.JPanel {

    /**
     * Creates new form welcome
     */
    public welcome() {
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

        jLabel99 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(101, 101, 101));
        jLabel99.setText("Welcome to Class Manager");
        add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 189, 643, 50));

        jLabel260.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel260.setForeground(new java.awt.Color(101, 101, 101));
        jLabel260.setText("Your user ID ");
        add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 160, 50));

        txtUserID.setBackground(new java.awt.Color(255, 255, 255));
        txtUserID.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtUserID.setForeground(new java.awt.Color(101, 101, 101));
        txtUserID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 101, 101), 5, true));
        txtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIDActionPerformed(evt);
            }
        });
        add(txtUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 234, 68));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(101, 101, 101));
        jButton2.setText("Continue");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 147, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIDActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(0, 125, 250));
        jButton2.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(255, 255, 255));
        jButton2.setForeground(new Color(101,101,101));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
