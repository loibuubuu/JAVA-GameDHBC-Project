/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBModels.PlayerDAO;
import DBEntities.Player;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class Profile extends javax.swing.JFrame {

    ArrayList<Player> ds;
   public String username = "a";
  public String password = "0123456";
    String pt;

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
        Showprofile();
        viewAvata();
    }
public void getprofile(String us, String pw){
  //  username = us;
    password = pw;
}
    public void viewAvata() {

        ds =  PlayerDAO.picture();
        for (Player item : ds) {
            if (item.getName().equals(username)) {
                pt=item.getPicture();
                setPicture(lbAvata, pt);
                break;
            }
        }
       

    }

    public void setPicture(JLabel lable, String filename) {
        try {
            BufferedImage image = ImageIO.read(new File(filename));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(120, 120, image.SCALE_SMOOTH));
            lable.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Picture_List.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bntcancel = new javax.swing.JLabel();
        lbAvata = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jlbBirthday = new javax.swing.JLabel();
        jlbPhone = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        bntChengePicture = new javax.swing.JButton();
        bntChengeprofile = new javax.swing.JButton();
        bntChengepass = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("jLabel3");
        jLabel3.setOpaque(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 94, 49));

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 165, 74));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bntcancel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bntcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_undo_80px_2.png"))); // NOI18N
        bntcancel.setToolTipText("");
        bntcancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntcancelMouseClicked(evt);
            }
        });
        jPanel1.add(bntcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 70));

        lbAvata.setBackground(new java.awt.Color(255, 255, 204));
        lbAvata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_female_profile_120px_2.png"))); // NOI18N
        jPanel1.add(lbAvata, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 120, 120));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_contact_120px_2.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 120, 50));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Ảnh đại diện");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 120, -1));

        jlbBirthday.setBackground(new java.awt.Color(204, 255, 204));
        jlbBirthday.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbBirthday.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbBirthday.setText("03-03-1993");
        jPanel1.add(jlbBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 200, 40));

        jlbPhone.setBackground(new java.awt.Color(204, 255, 204));
        jlbPhone.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbPhone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbPhone.setText("0354-072-542");
        jPanel1.add(jlbPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 200, 40));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Asset 4.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 160, 160));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone_48px.png"))); // NOI18N
        jLabel22.setText(":");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("THÔNG TIN CÁ NHÂN");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 430, 50));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/birthday_48px.png"))); // NOI18N
        jLabel21.setText(":");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 70, 40));

        lbname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbname.setForeground(new java.awt.Color(102, 102, 255));
        lbname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbname.setText("PlayerName");
        jPanel1.add(lbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 220, 40));

        bntChengePicture.setBackground(new java.awt.Color(51, 51, 51));
        bntChengePicture.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntChengePicture.setForeground(new java.awt.Color(255, 255, 255));
        bntChengePicture.setText("Đổi ảnh đại diện");
        bntChengePicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntChengePictureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntChengePictureMouseExited(evt);
            }
        });
        bntChengePicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntChengePictureActionPerformed(evt);
            }
        });
        jPanel1.add(bntChengePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 150, -1));

        bntChengeprofile.setBackground(new java.awt.Color(0, 102, 51));
        bntChengeprofile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntChengeprofile.setForeground(new java.awt.Color(255, 255, 255));
        bntChengeprofile.setText("Đổi thông tin");
        bntChengeprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntChengeprofileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntChengeprofileMouseExited(evt);
            }
        });
        bntChengeprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntChengeprofileActionPerformed(evt);
            }
        });
        jPanel1.add(bntChengeprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 190, 50));

        bntChengepass.setBackground(new java.awt.Color(0, 102, 51));
        bntChengepass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntChengepass.setForeground(new java.awt.Color(255, 255, 255));
        bntChengepass.setText("Đổi mật khẩu");
        bntChengepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntChengepassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntChengepassMouseExited(evt);
            }
        });
        bntChengepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntChengepassActionPerformed(evt);
            }
        });
        jPanel1.add(bntChengepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 190, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email_48px.png"))); // NOI18N
        jLabel9.setText(":");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 60, 40));

        jlbEmail.setBackground(new java.awt.Color(204, 255, 204));
        jlbEmail.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jlbEmail.setForeground(new java.awt.Color(51, 0, 51));
        jlbEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbEmail.setText("sona@gmail.com");
        jPanel1.add(jlbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 220, 40));

        jLabel7.setBackground(new java.awt.Color(204, 255, 255));
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 3, true));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 410, 300));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("ID:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 50, 40));

        jLabel10.setBackground(new java.awt.Color(102, 102, 255));
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 3, true));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 410, 300));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntChengePictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntChengePictureActionPerformed
        // TODO add your handling code here:
               Picture_List picture = new Picture_List(this, rootPaneCheckingEnabled);
        picture.setVisible(true);
    }//GEN-LAST:event_bntChengePictureActionPerformed

    private void bntChengeprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntChengeprofileActionPerformed
        // TODO add your handling code here:
          ChangeProfile Change = new ChangeProfile(this, rootPaneCheckingEnabled);
          ds=PlayerDAO.CheckRegister();
          for(Player item:ds){
              if(item.getName().equals(username)){
                  String y = ""+item.getDOB().charAt(0);
                  String y1 = ""+item.getDOB().charAt(1);
                  String y2 = ""+item.getDOB().charAt(2);
                  String y3 = ""+item.getDOB().charAt(3);
                  String D = ""+item.getDOB().charAt(8);
                  String D1 = ""+item.getDOB().charAt(9);
                  String M = ""+item.getDOB().charAt(5);
                  String M1 = ""+item.getDOB().charAt(6);
                  Change.txtEmail.setText(item.getEmail());
                  Change.txtPhone.setText(item.getPhone());
                  Change.cmbYear.setSelectedItem(y+y1+y2+y3);
                  Change.cmbDay.setSelectedItem(D+D1);
                  Change.cmbMo.setSelectedItem(M+M1);
                  
                  break;
              }
          }
        Change.setVisible(true);
    }//GEN-LAST:event_bntChengeprofileActionPerformed

    private void bntChengepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntChengepassActionPerformed
        // TODO add your handling code here:
            Player_changePass Change = new Player_changePass(this, rootPaneCheckingEnabled);
           Change.setVisible(true);
    }//GEN-LAST:event_bntChengepassActionPerformed

    private void bntcancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntcancelMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bntcancelMouseClicked

    private void bntChengePictureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntChengePictureMouseEntered
        // TODO add your handling code here:
            bntChengePicture.setBackground(Color.black);
        
    }//GEN-LAST:event_bntChengePictureMouseEntered
    private void bntChengePictureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntChengePictureMouseExited
        // TODO add your handling code here:
          bntChengePicture.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntChengePictureMouseExited

    private void bntChengepassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntChengepassMouseEntered
        // TODO add your handling code here:
          bntChengepass.setBackground(new Color(204, 0, 0));
    }//GEN-LAST:event_bntChengepassMouseEntered
    private void bntChengepassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntChengepassMouseExited
        // TODO add your handling code here:
        bntChengepass.setBackground(new Color(251, 51, 51));
    }//GEN-LAST:event_bntChengepassMouseExited

    private void bntChengeprofileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntChengeprofileMouseEntered
        // TODO add your handling code here:
            bntChengeprofile.setBackground(new Color(51, 102, 0));
    }//GEN-LAST:event_bntChengeprofileMouseEntered

    private void bntChengeprofileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntChengeprofileMouseExited
        // TODO add your handling code here:
            bntChengeprofile.setBackground(new Color(0, 102, 51));
    }//GEN-LAST:event_bntChengeprofileMouseExited
   public void Showprofile() {
        ds = new PlayerDAO().getList();
        for (Player item : ds) {
            if (item.getName().equals(username)){
                lbname.setText("Tk: "+username);
                jlbEmail.setText(item.getEmail());
                jlbBirthday.setText(item.getDOB());
                jlbPhone.setText(item.getPhone());
                break;
            }
        }
    }
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntChengePicture;
    private javax.swing.JButton bntChengepass;
    private javax.swing.JButton bntChengeprofile;
    private javax.swing.JLabel bntcancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbBirthday;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbPhone;
    private javax.swing.JLabel lbAvata;
    private javax.swing.JLabel lbname;
    // End of variables declaration//GEN-END:variables
}
