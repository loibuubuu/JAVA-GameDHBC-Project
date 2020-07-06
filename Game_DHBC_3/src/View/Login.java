/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBEntities.Admin;
import DBModels.AdminDAO;
import DBModels.PlayerInfoDAO;
import DBEntities.PlayerInfo;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Login extends javax.swing.JFrame {

    public String username;
    public String password;
    public int Scen, Gem, Score;
    public Date PDate;
    ArrayList<PlayerInfo> ds;
    ArrayList<Admin> ds1;

    /**
     * Creates new form Login_Players
     */
    public Login() {
        initComponents();
        this.getRootPane().setDefaultButton(bntlogin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        bntlogin = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        Register = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtScen = new javax.swing.JTextField();
        txtScore = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Login Form");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 40));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close1_window_48px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        bntlogin.setBackground(new java.awt.Color(51, 51, 255));
        bntlogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bntlogin.setForeground(new java.awt.Color(255, 255, 255));
        bntlogin.setText("Đăng Nhập");
        bntlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntloginActionPerformed(evt);
            }
        });
        jPanel1.add(bntlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 410, 50));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 260, 40));
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 260, 40));

        Register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(0, 0, 204));
        Register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register.setText("Đăng ký tài khoản mới");
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 300, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/privacy_48px.png"))); // NOI18N
        jLabel8.setText("Mật khẩu:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 140, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_48px.png"))); // NOI18N
        jLabel7.setText("Tài khoản:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Đăng nhập");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 160, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_location_96px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 100, 80));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 470, 380));

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 730, 610));

        txtScen.setText("jTextField1");
        jPanel1.add(txtScen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        txtScore.setText("jTextField1");
        jPanel1.add(txtScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntloginActionPerformed
        // TODO add your handling code here:
        boolean isOK = false;
        username = txtusername.getText();
        password = new String(txtpassword.getPassword());
        ds1 = new AdminDAO().getlogin();
        for (Admin item : ds1) {
            if (username.equals(item.getName()) && password.equals(item.getPassword())) {
                Admin_page ad = new Admin_page();
                ad.setVisible(true);
//                 game.pack();
//                 game.setLocationRelativeTo(null);
//                 game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                 this.dispose();
                ad.getAdmin(username, password);
                isOK = true;
                break;
            }
        }
        ds = new PlayerInfoDAO().getlogin();
        for (PlayerInfo item : ds) {
            if (username.equals(item.getName()) && password.equals(item.getPassword())) {
                GameGame game = new GameGame();
                game.setVisible(true);
//                 game.pack();
//                 game.setLocationRelativeTo(null);
//                 game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                 this.dispose();
                Score = item.getPlayerScore();
                Gem = item.getPlayerGem();
                Scen = item.getquesId();
                PDate = item.getPlayedDate();
                game.getPlayer(username, password, Score, Gem, Scen, PDate);
                isOK = true;
                break;
            }
        }

        if (isOK == false) {
            JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không chính xác!!!");
        }
    }//GEN-LAST:event_bntloginActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        ImageIcon Close = new ImageIcon("./src/images/close_window_48px.png");
        close.setIcon(Close);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        ImageIcon Close = new ImageIcon("./src/images/close1_window_48px.png");
        close.setIcon(Close);
    }//GEN-LAST:event_closeMouseExited

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        // TODO add your handling code here:
//        Register_Players rgt = new Register_Players();
//        rgt.setVisible(true);
    }//GEN-LAST:event_RegisterMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Register;
    public javax.swing.JButton bntlogin;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtScen;
    private javax.swing.JTextField txtScore;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
