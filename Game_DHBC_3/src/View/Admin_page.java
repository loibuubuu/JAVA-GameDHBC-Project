/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBModels.AdminDAO;
import DBModels.PlayerDAO;
import Sound.Sound;
import DBEntities.Admin;
import DBEntities.Player;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class Admin_page extends javax.swing.JFrame {

    ArrayList<Admin> ds;
    String user;
    String pass;
    Sound sound = new Sound();
 static boolean Active=false;

    public Admin_page() {
        initComponents();
    }
//public void active(){
//    Active=false;
//}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLb_Questions = new javax.swing.JLabel();
        jLbAdmin = new javax.swing.JLabel();
        jLb_HelpSuprot = new javax.swing.JLabel();
        jLb_GamePlay_info = new javax.swing.JLabel();
        jLb_Players = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bntLogout = new javax.swing.JButton();
        bntChangePass = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JLabel();
        jLb_Close = new javax.swing.JLabel();
        bntEdit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(102, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Administration");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 40));

        jLb_Questions.setBackground(new java.awt.Color(0, 153, 153));
        jLb_Questions.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLb_Questions.setForeground(new java.awt.Color(255, 255, 255));
        jLb_Questions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLb_Questions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG_QA.png"))); // NOI18N
        jLb_Questions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLb_Questions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLb_Questions.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLb_Questions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLb_QuestionsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLb_QuestionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLb_QuestionsMouseExited(evt);
            }
        });
        jPanel2.add(jLb_Questions, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 230, 160));

        jLbAdmin.setBackground(new java.awt.Color(0, 153, 153));
        jLbAdmin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLbAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jLbAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG_Ad.png"))); // NOI18N
        jLbAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLbAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLbAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbAdminMouseExited(evt);
            }
        });
        jPanel2.add(jLbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 230, 160));

        jLb_HelpSuprot.setBackground(new java.awt.Color(0, 153, 153));
        jLb_HelpSuprot.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLb_HelpSuprot.setForeground(new java.awt.Color(255, 255, 255));
        jLb_HelpSuprot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLb_HelpSuprot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG_hp.png"))); // NOI18N
        jLb_HelpSuprot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLb_HelpSuprot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLb_HelpSuprot.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLb_HelpSuprot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLb_HelpSuprotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLb_HelpSuprotMouseExited(evt);
            }
        });
        jPanel2.add(jLb_HelpSuprot, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 230, 160));

        jLb_GamePlay_info.setBackground(new java.awt.Color(0, 153, 153));
        jLb_GamePlay_info.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLb_GamePlay_info.setForeground(new java.awt.Color(255, 255, 255));
        jLb_GamePlay_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLb_GamePlay_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG_GPI.png"))); // NOI18N
        jLb_GamePlay_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLb_GamePlay_info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLb_GamePlay_info.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLb_GamePlay_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLb_GamePlay_infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLb_GamePlay_infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLb_GamePlay_infoMouseExited(evt);
            }
        });
        jPanel2.add(jLb_GamePlay_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 230, 160));

        jLb_Players.setBackground(new java.awt.Color(0, 153, 153));
        jLb_Players.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLb_Players.setForeground(new java.awt.Color(255, 255, 255));
        jLb_Players.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLb_Players.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG_Pl1.png"))); // NOI18N
        jLb_Players.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLb_Players.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLb_Players.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLb_Players.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLb_PlayersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLb_PlayersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLb_PlayersMouseExited(evt);
            }
        });
        jPanel2.add(jLb_Players, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 240, 160));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 810, 440));

        bntLogout.setBackground(new java.awt.Color(51, 51, 51));
        bntLogout.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bntLogout.setForeground(new java.awt.Color(255, 255, 255));
        bntLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shutdown_48px.png"))); // NOI18N
        bntLogout.setText("Đăng xuất");
        bntLogout.setBorder(null);
        bntLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntLogout.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bntLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntLogoutMouseExited(evt);
            }
        });
        bntLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(bntLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 210, 60));

        bntChangePass.setBackground(new java.awt.Color(51, 51, 51));
        bntChangePass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bntChangePass.setForeground(new java.awt.Color(255, 255, 255));
        bntChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change_48px.png"))); // NOI18N
        bntChangePass.setText("Đổi mật khẩu");
        bntChangePass.setBorder(null);
        bntChangePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntChangePass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bntChangePass.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bntChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntChangePassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntChangePassMouseExited(evt);
            }
        });
        bntChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntChangePassActionPerformed(evt);
            }
        });
        jPanel2.add(bntChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 210, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 900, 650));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/male_user_96px.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 90, 80));

        txtAdmin.setBackground(new java.awt.Color(204, 204, 255));
        txtAdmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtAdmin.setOpaque(true);
        jPanel3.add(txtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, 60));

        jLb_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLb_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close1_window_48px.png"))); // NOI18N
        jLb_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLb_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLb_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLb_CloseMouseExited(evt);
            }
        });
        jPanel3.add(jLb_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 40));

        bntEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bntEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_property_48px.png"))); // NOI18N
        bntEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntEditMouseClicked(evt);
            }
        });
        jPanel3.add(bntEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 50, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void getAdmin(String us, String pw) {
        txtAdmin.setText(us);
        user = us;
        pass = pw;
    }
    private void jLb_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_CloseMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/close_window_48px.png");
        jLb_Close.setIcon(close);
    }//GEN-LAST:event_jLb_CloseMouseEntered

    private void jLb_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_CloseMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/close1_window_48px.png");
        jLb_Close.setIcon(close);
    }//GEN-LAST:event_jLb_CloseMouseExited

    private void jLb_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_CloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLb_CloseMouseClicked

    private void bntChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntChangePassActionPerformed
        // TODO add your handling code here:
        sound.playMusic("./src/Sound/click2.wav");
        ChangePass ChangePass = new ChangePass(this, rootPaneCheckingEnabled);
        ChangePass.setVisible(true);
    }//GEN-LAST:event_bntChangePassActionPerformed

    private void bntChangePassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntChangePassMouseExited
        // TODO add your handling code here:
        bntChangePass.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntChangePassMouseExited

    private void bntChangePassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntChangePassMouseEntered
        // TODO add your handling code here:

        bntChangePass.setBackground(Color.black);

    }//GEN-LAST:event_bntChangePassMouseEntered

    private void bntLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLogoutActionPerformed
        // TODO add your handling code here:
        sound.playMusic("./src/Sound/click2.wav");
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Logout?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            Login rgf = new Login();
            rgf.setVisible(true);
            rgf.pack();
            rgf.setLocationRelativeTo(null);
            rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } else {

        }
    }//GEN-LAST:event_bntLogoutActionPerformed

    private void bntLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntLogoutMouseExited
        // TODO add your handling code here:
        bntLogout.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntLogoutMouseExited

    private void bntLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntLogoutMouseEntered
        // TODO add your handling code here:
        bntLogout.setBackground(Color.black);
    }//GEN-LAST:event_bntLogoutMouseEntered

    private void jLb_GamePlay_infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_GamePlay_infoMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/BG_GPI.png");
        jLb_GamePlay_info.setIcon(close);
    }//GEN-LAST:event_jLb_GamePlay_infoMouseExited

    private void jLb_GamePlay_infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_GamePlay_infoMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/BG_gpla2.png");
        jLb_GamePlay_info.setIcon(close);
    }//GEN-LAST:event_jLb_GamePlay_infoMouseEntered

    private void jLb_GamePlay_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_GamePlay_infoMouseClicked
        // TODO add your handling code here:
//        sound.playMusic("./src/Sound/click2.wav");
//        GamePlay_Info rgf = new GamePlay_Info();
//        rgf.setVisible(true);
//        rgf.pack();
//        rgf.setLocationRelativeTo(null);
//        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.dispose();
    }//GEN-LAST:event_jLb_GamePlay_infoMouseClicked

    private void jLb_QuestionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_QuestionsMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/BG_QA.png");
        jLb_Questions.setIcon(close);
    }//GEN-LAST:event_jLb_QuestionsMouseExited

    private void jLb_QuestionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_QuestionsMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/Bg_QAC2.png");
        jLb_Questions.setIcon(close);
    }//GEN-LAST:event_jLb_QuestionsMouseEntered

    private void jLb_QuestionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_QuestionsMouseClicked
        // TODO add your handling code here:
        sound.playMusic("./src/Sound/click2.wav");
        QA_Controls rgf = new QA_Controls();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLb_QuestionsMouseClicked

    private void jLbAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbAdminMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/BG_Ad.png");
        jLbAdmin.setIcon(close);
    }//GEN-LAST:event_jLbAdminMouseExited

    private void jLbAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbAdminMouseEntered
        ImageIcon close = new ImageIcon("./src/images/Bg_Ad2.png");
        jLbAdmin.setIcon(close);
    }//GEN-LAST:event_jLbAdminMouseEntered

    private void jLbAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbAdminMouseClicked
        // TODO add your handling code here:
        sound.playMusic("./src/Sound/click2.wav");
        Admin_List rgf = new Admin_List();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        rgf.getAdmin(user, pass);
    }//GEN-LAST:event_jLbAdminMouseClicked

    private void jLb_HelpSuprotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_HelpSuprotMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/BG_hp.png");
        jLb_HelpSuprot.setIcon(close);
    }//GEN-LAST:event_jLb_HelpSuprotMouseExited

    private void jLb_HelpSuprotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_HelpSuprotMouseEntered
        ImageIcon close = new ImageIcon("./src/images/Bg_HSP2.png");
        jLb_HelpSuprot.setIcon(close);
    }//GEN-LAST:event_jLb_HelpSuprotMouseEntered

    private void jLb_PlayersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_PlayersMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/BG_Pl1.png");
        jLb_Players.setIcon(close);
    }//GEN-LAST:event_jLb_PlayersMouseExited

    private void jLb_PlayersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_PlayersMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/Bg_Pl2.png");
        jLb_Players.setIcon(close);
    }//GEN-LAST:event_jLb_PlayersMouseEntered

    private void jLb_PlayersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_PlayersMouseClicked
        sound.playMusic("./src/Sound/click2.wav");
        Players_Details rgf = new Players_Details();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        rgf.getPlayer(user, pass);
    }//GEN-LAST:event_jLb_PlayersMouseClicked

    private void bntEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEditMouseClicked
        // TODO add your handling code here:
        Edit_Admin EditAdmin = new Edit_Admin(this, rootPaneCheckingEnabled);
        ds = new AdminDAO().getList();
             for(Admin item:ds){
              if(item.getName().equals(user)){
                  String y = ""+item.getDOB().charAt(0);
                  String y1 = ""+item.getDOB().charAt(1);
                  String y2 = ""+item.getDOB().charAt(2);
                  String y3 = ""+item.getDOB().charAt(3);
                  String D = ""+item.getDOB().charAt(8);
                  String D1 = ""+item.getDOB().charAt(9);
                  String M = ""+item.getDOB().charAt(5);
                  String M1 = ""+item.getDOB().charAt(6);
                  EditAdmin.txtEmail.setText(item.getEmail());
                  EditAdmin.txtPhone.setText(item.getPhone());
                  EditAdmin.cmbYear.setSelectedItem(y+y1+y2+y3);
                  EditAdmin.cmbDay.setSelectedItem(D+D1);
                  EditAdmin.cmbMo.setSelectedItem(M+M1);
                  
                  break;
              }
          }
        EditAdmin.setVisible(true);
    }//GEN-LAST:event_bntEditMouseClicked
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                      if(Active){
                   new Admin_page().setVisible(true); 
                }
                else{
                    JOptionPane.showMessageDialog(null,"Bạn cần phải đăng nhập trước khi mở trang này!!!");
                    new Login().setVisible(true);
                }
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntChangePass;
    private javax.swing.JLabel bntEdit;
    private javax.swing.JButton bntLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbAdmin;
    private javax.swing.JLabel jLb_Close;
    private javax.swing.JLabel jLb_GamePlay_info;
    private javax.swing.JLabel jLb_HelpSuprot;
    private javax.swing.JLabel jLb_Players;
    private javax.swing.JLabel jLb_Questions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel txtAdmin;
    // End of variables declaration//GEN-END:variables
}
