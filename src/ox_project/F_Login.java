/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox_project;

import com.mongodb.client.MongoCollection;

import static com.mongodb.client.model.Filters.eq;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.bson.Document;

public class F_Login extends javax.swing.JFrame {

    Database db;
    MongoCollection<Document> user;

    /**
     * Creates new form F_Login
     */
    public F_Login() {
        initComponents();
    }

    public void gotoRegister() {
        new F_register().show();
        dispose();

    }

    public void clearText() {
        txtUsername.setText("");
        txtPassword.setText("");
    }

    public boolean isFill(String username, String password) {
        if (username.equals("") && password.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public void gotoLobby() {
        new F_Lobby().show();
        dispose();
    }

    public String PlayName(String id) {
        Document count = user.find(eq("ID", id)).first();
        return count.getString("Name");
    }

    public void Login() {

        user = db.getCollection("user");

        if (isFill(txtUsername.getText(), txtPassword.getText())) {
            if (txtUsername.getText().equals("") && txtPassword.getText() != "") {

                ImageIcon icon = new ImageIcon(F_Login.class.getResource("/image/Warning_sign.png"));
                JLabel text = new JLabel("กรุณากรอก Username");
                text.setFont(new Font("TH Sarabun New", Font.BOLD, 25));
                JOptionPane.showMessageDialog(
                        null,
                        text, "เข้าสู่ระบบ", JOptionPane.INFORMATION_MESSAGE,
                        icon);
                clearText();

            } else if (txtPassword.getText().equals("") && txtUsername.getText() != "") {
                ImageIcon icon = new ImageIcon(F_Login.class.getResource("/image/Warning_sign.png"));
                JLabel text = new JLabel("กรุณากรอก Password");
                text.setFont(new Font("TH Sarabun New", Font.BOLD, 25));
                JOptionPane.showMessageDialog(
                        null,
                        text, "เข้าสู่ระบบ", JOptionPane.INFORMATION_MESSAGE,
                        icon);
                clearText();

            } else {
                try {
                    Document username = user.find(eq("ID", txtUsername.getText())).first();
                    Document pass = user.find(eq("Pass", txtPassword.getText())).first();
                    System.out.println(username.toJson());
                    System.out.println(pass.toJson());
                    String Playneme = PlayName(txtUsername.getText());
                    ImageIcon icon = new ImageIcon(F_Login.class.getResource("/image/correct.png"));
                    JLabel text = new JLabel("Welcome " + Playneme);
                    text.setFont(new Font("TH Sarabun New", Font.BOLD, 25));
                    JOptionPane.showMessageDialog(
                            null,
                            text, "เข้าสู่ระบบ", JOptionPane.INFORMATION_MESSAGE,
                            icon);

                    gotoLobby();

                } catch (Exception e) {

                    JLabel text = new JLabel("รหัสผ่านผิด");
                    text.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, text);
                    clearText();
                }
            }

        } else {
            JLabel text = new JLabel("กรุณากรอกชื่อผู้ใช้หรือรหัสผ่าน");
            text.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, text);
            clearText();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 51, 0));
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(400, 300));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 219, 34));
        kGradientPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 221, 36));

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 1, 30)); // NOI18N
        jLabel1.setText("Username :");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 1, 30)); // NOI18N
        jLabel2.setText("Password :");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        btnRegister.setFont(new java.awt.Font("TH Sarabun New", 3, 20)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 102, 255));
        btnRegister.setText("here");
        btnRegister.setActionCommand("Register");
        btnRegister.setBorder(null);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 263, 30, 20));

        jLabel6.setFont(new java.awt.Font("TH Sarabun New", 1, 48)); // NOI18N
        jLabel6.setText("LOGIN");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel3.setText("Don't have any account ? click");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        btnLogin.setText("Login");
        btnLogin.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        btnLogin.setkAllowGradient(false);
        btnLogin.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        btnLogin.setkHoverColor(new java.awt.Color(204, 204, 204));
        btnLogin.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnLogin.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btnLogin.setkIndicatorColor(new java.awt.Color(204, 204, 204));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 110, 40));

        kButton1.setText("Cancel");
        kButton1.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        kButton1.setkAllowGradient(false);
        kButton1.setkBackGroundColor(new java.awt.Color(204, 51, 0));
        kButton1.setkHoverColor(new java.awt.Color(204, 204, 204));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkIndicatorColor(new java.awt.Color(204, 204, 204));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        gotoRegister();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        Login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(F_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KButton kButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
