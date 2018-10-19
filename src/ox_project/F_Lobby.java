package ox_project;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author firstx
 */
public class F_Lobby extends javax.swing.JFrame {

    Database db;
    MongoCollection<Document> col;

//    MongoClientURI uri  = new MongoClientURI("mongodb://admin:abc123456@ds237922.mlab.com:37922/ox_59160117");
//    MongoClient client = new MongoClient(uri);
//    MongoDatabase db = client.getDatabase(uri.getDatabase());
//    MongoCollection<Document> lobby = db.getCollection("Lobby"); 
    /**
     * Creates new form F_Lobby
     */
    public F_Lobby() {
        initComponents();
        initDatabase();
        setAllRoom();
        //setAllButton();
    }

    public void initDatabase() {
        col = db.getCollection("Lobby");
    }

    public boolean isFull(int countRoom) {
        if (countRoom >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public void setAllButton() {
        setButton(joinButton1, getCountRoom(1));
        setButton(joinButton2, getCountRoom(2));
        setButton(joinButton3, getCountRoom(3));
        setButton(joinButton4, getCountRoom(4));
        setButton(joinButton5, getCountRoom(5));
    }

    public void setButton(javax.swing.JButton btn, int countRoom) {
        if (isFull(countRoom)) {
            //btn.setVisible(false);
            System.out.println("เต็ม");
            JLabel text = new JLabel("ห้องเต็ม");
            text.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, text);
        } else {
            //btn.setVisible(true);
            System.out.println("ว่าง");
            JLabel text = new JLabel("เข้าสู่ห้องเล่นเกมส์");
            text.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, text);
        }
    }

    public void setAllRoom() {
        setRoom(countRoom1, 1);
        setRoom(countRoom2, 2);
        setRoom(countRoom3, 3);
        setRoom(countRoom4, 4);
        setRoom(countRoom5, 5);
    }

    public void setRoom(javax.swing.JLabel label, int roomId) {
        label.setText(String.valueOf(getCountRoom(roomId)));
    }

    public int getCountRoom(int id) {
        Document count = col.find(eq("ID", id)).first();
        return count.getInteger("Count_player");
    }

    public boolean Signout(String value) {
        if (value.equals("yes")) {
            new F_Login().show();
            dispose();
            return true;
        } else {
            System.out.println("no");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        countRoom2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        countRoom3 = new javax.swing.JLabel();
        countRoom4 = new javax.swing.JLabel();
        countRoom5 = new javax.swing.JLabel();
        countRoom1 = new javax.swing.JLabel();
        joinButton5 = new javax.swing.JButton();
        joinButton4 = new javax.swing.JButton();
        joinButton3 = new javax.swing.JButton();
        joinButton2 = new javax.swing.JButton();
        joinButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 0, 36)); // NOI18N
        jLabel2.setText("Room 1");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 110, -1));

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 0, 36)); // NOI18N
        jLabel3.setText("Room 2");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 100, -1));

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 0, 36)); // NOI18N
        jLabel4.setText("Room 3");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 100, -1));

        jLabel6.setFont(new java.awt.Font("TH Sarabun New", 0, 36)); // NOI18N
        jLabel6.setText("Room 4");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 100, -1));

        countRoom2.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        countRoom2.setText("N");
        jPanel2.add(countRoom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("TH Sarabun New", 0, 36)); // NOI18N
        jLabel8.setText("Room 5");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 100, -1));

        countRoom3.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        countRoom3.setText("N");
        jPanel2.add(countRoom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        countRoom4.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        countRoom4.setText("N");
        jPanel2.add(countRoom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));

        countRoom5.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        countRoom5.setText("N");
        jPanel2.add(countRoom5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        countRoom1.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        countRoom1.setText("N");
        jPanel2.add(countRoom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        joinButton5.setText("Join");
        joinButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        joinButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(joinButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 60, 30));

        joinButton4.setText("Join");
        joinButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        joinButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(joinButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 60, 30));

        joinButton3.setText("Join");
        joinButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        joinButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(joinButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 60, 30));

        joinButton2.setText("Join");
        joinButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        joinButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(joinButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 60, 30));

        joinButton1.setText("Join");
        joinButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        joinButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(joinButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 60, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 1, 48)); // NOI18N
        jLabel1.setText("LOBBY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ranking_icon.png"))); // NOI18N
        jButton2.setText("Rank");
        jButton2.setBorder(null);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 110, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Profile.png"))); // NOI18N
        jButton3.setText("Profile");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 120, 60));

        jButton1.setText("Sign Out");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 590, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 590, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 590, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 590, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 590, 30));

        jLabel5.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel5.setText("/2");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel7.setText("Seat");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel9.setText("/2");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel10.setText("/2");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel11.setText("/2");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel12.setText("/2");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel13.setText("Seat");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel14.setText("Seat");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel15.setText("Seat");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        jLabel16.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel16.setText("Seat");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void joinButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButton2ActionPerformed
        // TODO add your handling code here:
        setButton(joinButton2, getCountRoom(2));
    }//GEN-LAST:event_joinButton2ActionPerformed

    private void joinButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButton1ActionPerformed
        // TODO add your handling code here:
        setButton(joinButton1, getCountRoom(1));

    }//GEN-LAST:event_joinButton1ActionPerformed

    private void joinButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButton4ActionPerformed
        // TODO add your handling code here:
        setButton(joinButton4, getCountRoom(4));
    }//GEN-LAST:event_joinButton4ActionPerformed

    private void joinButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButton5ActionPerformed
        // TODO add your handling code here:
        setButton(joinButton5, getCountRoom(5));
    }//GEN-LAST:event_joinButton5ActionPerformed

    private void joinButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButton3ActionPerformed
        // TODO add your handling code here:
        setButton(joinButton3, getCountRoom(3));
    }//GEN-LAST:event_joinButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.showConfirmDialog(null, "DO you want to sign out?", "Sign Out", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Signout("yes");
        } else {
            Signout("no");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(F_Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Lobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel countRoom1;
    private javax.swing.JLabel countRoom2;
    private javax.swing.JLabel countRoom3;
    private javax.swing.JLabel countRoom4;
    private javax.swing.JLabel countRoom5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton joinButton1;
    private javax.swing.JButton joinButton2;
    private javax.swing.JButton joinButton3;
    private javax.swing.JButton joinButton4;
    private javax.swing.JButton joinButton5;
    // End of variables declaration//GEN-END:variables

}
