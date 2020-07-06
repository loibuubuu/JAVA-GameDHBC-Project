/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBEntities.HelpSupport;
import DBConnection.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author BuuBuu
 */
public class HelpSupport_Player extends javax.swing.JFrame {

    public String IMG = null;
    public String user = "AAA";
    public byte[] picture;

    /**
     * Creates new form MainFrame
     */
    public HelpSupport_Player() {
        initComponents();
        lbTaiKhoan.setText(user);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jColorChooser1 = new javax.swing.JColorChooser();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        bntsent = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbTaiKhoan = new javax.swing.JLabel();
        lablePrice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmessages = new javax.swing.JTextArea();
        bntpost = new javax.swing.JButton();
        txttitle = new javax.swing.JTextField();
        labelID1 = new javax.swing.JLabel();
        lablePrice1 = new javax.swing.JLabel();
        lbpicture = new javax.swing.JLabel();
        lbCount = new javax.swing.JLabel();
        bntcancel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(138, 207, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bntsent.setBackground(new java.awt.Color(255, 204, 153));
        bntsent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bntsent.setForeground(new java.awt.Color(255, 153, 0));
        bntsent.setText("Gửi");
        bntsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntsentActionPerformed(evt);
            }
        });
        jPanel1.add(bntsent, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 450, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Trợ giúp & Đóng góp");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 780, -1));

        lbTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTaiKhoan.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.add(lbTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 230, 40));

        lablePrice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lablePrice.setForeground(new java.awt.Color(255, 153, 0));
        lablePrice.setText("Tiêu Đề:");
        jPanel1.add(lablePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        txtmessages.setColumns(20);
        txtmessages.setLineWrap(true);
        txtmessages.setRows(5);
        txtmessages.setWrapStyleWord(true);
        txtmessages.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmessagesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtmessages);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 450, 200));

        bntpost.setBackground(new java.awt.Color(255, 204, 153));
        bntpost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/camera_26px.png"))); // NOI18N
        bntpost.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bntpost.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntpost.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntpostActionPerformed(evt);
            }
        });
        jPanel1.add(bntpost, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 200, 50));
        jPanel1.add(txttitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 340, 40));

        labelID1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelID1.setForeground(new java.awt.Color(255, 153, 0));
        labelID1.setText("Tài Khoản:");
        jPanel1.add(labelID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 110, -1));

        lablePrice1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lablePrice1.setForeground(new java.awt.Color(255, 153, 0));
        lablePrice1.setText("Nội Dung:");
        jPanel1.add(lablePrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        lbpicture.setBackground(new java.awt.Color(255, 255, 255));
        lbpicture.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbpicture.setForeground(new java.awt.Color(255, 153, 0));
        lbpicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbpicture.setText(" Thêm Ảnh (Tùy Chọn)");
        lbpicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbpicture.setOpaque(true);
        jPanel1.add(lbpicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 200, 200));

        lbCount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCount.setForeground(new java.awt.Color(255, 153, 0));
        lbCount.setText("0/500");
        jPanel1.add(lbCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        bntcancel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bntcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_undo_80px_2.png"))); // NOI18N
        bntcancel.setToolTipText("");
        bntcancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntcancelMouseClicked(evt);
            }
        });
        jPanel1.add(bntcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 70));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NenXanhLa2.jpg"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setPicture(JLabel lable, String filename) {
        try {
            BufferedImage image = ImageIO.read(new File(filename));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(170, 170, image.SCALE_SMOOTH));
            // Border border = BorderFactory.createLineBorder(Color.black, 1);
            lable.setIcon(icon);
            // lable.setBorder(border);
        } catch (IOException ex) {
            Logger.getLogger(HelpSupport_Player.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void bntpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntpostActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
//        file.setCurrentDirectory(new File(System.getProperty("user.home")));
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
//        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selecFile = file.getSelectedFile();
            String path = selecFile.getAbsolutePath();
            setPicture(lbpicture, path);
            lbpicture.setText("");
            IMG = path;

            try {
                FileInputStream is = new FileInputStream(new File(IMG));
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                for (int readNum; (readNum = is.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                }
                picture = bos.toByteArray();
                //System.out.println(picture);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Không try cập file");

        }
    }//GEN-LAST:event_bntpostActionPerformed

    private void bntsentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntsentActionPerformed
        Connection cn = LoginDatabase.getConnect();
        boolean check= true;
        if( txttitle.getText().trim().equals("")){
              JOptionPane.showMessageDialog(null, "Tiêu đề không được để trống!!!"); 
              check =false;
              return;
        }
      if( txtmessages.getText().trim().equals("")){
              JOptionPane.showMessageDialog(null, "Nội dung không được để trống!!!"); 
              check =false;
              return;
        }
      if(check){
                  try {
            String sql = "insert into HelpSupport (PlayerID,CaseTitle,Messages,Images) values(?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            //set gia tri cho cac tham so
            pst.setString(1, user);
            pst.setString(2, txttitle.getText());
            pst.setString(3, txtmessages.getText());
            pst.setBytes(4, picture);
            pst.executeUpdate();
            pst.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                   JOptionPane.showMessageDialog(null, "Gửi thành công!!!"); 
      }

    }//GEN-LAST:event_bntsentActionPerformed

    private void txtmessagesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmessagesKeyPressed
        int count = this.txtmessages.getText().length();
        this.lbCount.setText((count + 1) + "/500");
        if (count == 0 && count <= 500) {
            this.lbCount.setText(0 + "/500");
        }
    }//GEN-LAST:event_txtmessagesKeyPressed

    private void bntcancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntcancelMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bntcancelMouseClicked

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
            java.util.logging.Logger.getLogger(HelpSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpSupport_Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bntcancel;
    private javax.swing.JButton bntpost;
    private javax.swing.JButton bntsent;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID1;
    private javax.swing.JLabel lablePrice;
    private javax.swing.JLabel lablePrice1;
    private javax.swing.JLabel lbCount;
    private javax.swing.JLabel lbTaiKhoan;
    public javax.swing.JLabel lbpicture;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextArea txtmessages;
    private javax.swing.JTextField txttitle;
    // End of variables declaration//GEN-END:variables

}
