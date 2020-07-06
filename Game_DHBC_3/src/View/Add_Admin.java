/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBModels.AdminDAO;
import Sound.Sound;
import DBEntities.Admin;
import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Add_Admin extends javax.swing.JDialog {

    Sound sound = new Sound();
    ArrayList<Admin> ds;
    int D, M, Y;
    private Admin_List Admins;

    public Add_Admin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Admins = (Admin_List) parent;
        D = M = Y = 0;
        // setVariable();
        this.setLocationRelativeTo(null);
    }

    private boolean checkValid() {

        if (cmbDay.getSelectedIndex() != 0) {
            D = Integer.parseInt(cmbDay.getSelectedItem().toString());
        }
        if (cmbMo.getSelectedIndex() != 0) {
            M = Integer.parseInt(cmbMo.getSelectedItem().toString());
        }
        if (cmbYear.getSelectedIndex() != 0) {
            Y = Integer.parseInt(cmbYear.getSelectedItem().toString());
        }
        Pattern Pn = Pattern.compile("^[a-zA-Z0-9_-]{5,12}$");
        Matcher mn = Pn.matcher(txtName.getText());
        if (!mn.matches()) {
            JOptionPane.showMessageDialog(this, "Tài khoản không được để trống và 5-12 ký tự, không chứa dấu tiếng việt, không có khoảng trống ... ");
            txtName.requestFocus();
            return false;
        }
        Pattern Pp = Pattern.compile("^[a-zA-Z0-9]{13,20}$");
        Matcher mp = Pp.matcher(new String(txtPass.getPassword()));
        if (!mp.matches()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống và 13-20 ký tự, không chứa dấu tiếng việt, không có khoảng trống ... ");
            txtPass.requestFocus();
            return false;
        }

        Pattern Pm = Pattern.compile("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
        Matcher mm = Pm.matcher(txtEmail.getText());
        if (!mm.matches()) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ. Vui lòng nhập lại... ");
            txtEmail.requestFocus();
            return false;
        }
        if (cmbDay.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày sinh ...");
            return false;
        }
        if (cmbMo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chon tháng sinh...");
            return false;
        }
        if (cmbYear.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "vui  lòng chon năm sinh...");
            return false;
        }

        if ((M == 4 || M == 6 || M == 9 || M == 11) && (D == 31)) {
            JOptionPane.showMessageDialog(this, "Tháng " + cmbMo.getSelectedItem() + " chỉ 30 Ngày");
            return false;
        }
        if (((Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0)) && (M == 2 && D >= 29)) {
            JOptionPane.showMessageDialog(this, "Tháng 2 năm nhuận chỉ 28 ngày");
            return false;
        }
        if (M == 2 && D >= 30) {
            JOptionPane.showMessageDialog(this, "Tháng 2 chỉ 29 Ngày");
            return false;
        }
        Pattern p = Pattern.compile("[0-9]{10,12}");
        Matcher m = p.matcher(txtPhone.getText().trim());
        if (!m.matches()) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống, phải là số và từ 10-12 ký số ... ");
            txtPhone.requestFocus();
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLb_Close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        bntCancel = new javax.swing.JButton();
        bntadd = new javax.swing.JButton();
        bntReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbDay = new javax.swing.JComboBox<>();
        cmbMo = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jLb_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 754, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Tài khoản:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Mật khẩu:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 120, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Ngày sinh:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 120, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Số điện thoại:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 120, 40));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 370, 40));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 370, 40));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 370, 40));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 370, 40));

        bntCancel.setBackground(new java.awt.Color(51, 51, 51));
        bntCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntCancel.setForeground(new java.awt.Color(255, 255, 255));
        bntCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_48px.png"))); // NOI18N
        bntCancel.setText("Bỏ qua");
        bntCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntCancelMouseExited(evt);
            }
        });
        bntCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelActionPerformed(evt);
            }
        });
        jPanel1.add(bntCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 160, 50));

        bntadd.setBackground(new java.awt.Color(51, 51, 51));
        bntadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntadd.setForeground(new java.awt.Color(255, 255, 255));
        bntadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submit_progress_48px.png"))); // NOI18N
        bntadd.setText("Thêm");
        bntadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntaddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntaddMouseExited(evt);
            }
        });
        bntadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntaddActionPerformed(evt);
            }
        });
        jPanel1.add(bntadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 160, 50));

        bntReset.setBackground(new java.awt.Color(51, 51, 51));
        bntReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntReset.setForeground(new java.awt.Color(255, 255, 255));
        bntReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset_48px.png"))); // NOI18N
        bntReset.setText("Đặt lại");
        bntReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntResetMouseExited(evt);
            }
        });
        bntReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntResetActionPerformed(evt);
            }
        });
        jPanel1.add(bntReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 160, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÊM TÀI KHOẢN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 390, 60));

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmbDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 100, 40));

        cmbMo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(cmbMo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 90, 40));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));
        jPanel1.add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLb_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_CloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLb_CloseMouseClicked
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
    private void bntaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntaddActionPerformed
          sound.playMusic("./src/Sound/click2.wav");
        boolean isOK = true;
        String Name = txtName.getText();
        String Password = new String(txtPass.getPassword());
        String Email = txtEmail.getText();
        String DOB = cmbDay.getSelectedItem().toString() + "-" + cmbMo.getSelectedItem().toString() + "-" + cmbYear.getSelectedItem().toString();
        String Phone = txtPhone.getText();
        ds = new AdminDAO().Checkinsert();
        for (Admin item : ds) {

            if (item.getName().equals(Name)) {
                JOptionPane.showMessageDialog(this, "Tài khoản này đã tồn tại. Vui lòng nhập lại!!! ");
                txtName.requestFocus();
                isOK = false;
               return;
            }
            if (item.getEmail().equals(Email)) {
                JOptionPane.showMessageDialog(this, "Email này đã tồn tại. Vui lòng nhập lại!!! ");
                txtEmail.requestFocus();
                isOK = false;
          return;
            }
            if (item.getPhone().equals(Phone)) {
                JOptionPane.showMessageDialog(this, "Số điện thoại này đã tồn tại. Vui lòng nhập lại!!! ");
                txtPhone.requestFocus();
                isOK = false;
                return;
            }
        }
        if (checkValid() && isOK == true) {
            AdminDAO.insert(Name, Password, Email, DOB, Phone);
            JOptionPane.showMessageDialog(this, "Thành công");
            this.dispose();
            Admins.ShowtbAdmin();
        }

    }//GEN-LAST:event_bntaddActionPerformed
    private void bntResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntResetActionPerformed
        // TODO add your handling code here:
    sound.playMusic("./src/Sound/click2.wav");
        txtPass.setText(null);
        txtEmail.setText(null);
        txtPhone.setText(null);
        cmbDay.setSelectedIndex(0);
        cmbMo.setSelectedIndex(0);
        cmbYear.setSelectedIndex(0);
    }//GEN-LAST:event_bntResetActionPerformed

    private void bntaddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntaddMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/submit2.png");
        bntadd.setBackground(Color.black);
        bntadd.setIcon(close);
    }//GEN-LAST:event_bntaddMouseEntered

    private void bntaddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntaddMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/submit_progress_48px.png");
        bntadd.setBackground(new Color(51, 51, 51));
        bntadd.setIcon(close);
    }//GEN-LAST:event_bntaddMouseExited

    private void bntResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntResetMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/reset2.png");
        bntReset.setBackground(Color.black);
        bntReset.setIcon(close);
    }//GEN-LAST:event_bntResetMouseEntered

    private void bntResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntResetMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/reset_48px.png");
        bntReset.setBackground(new Color(51, 51, 51));
        bntReset.setIcon(close);
    }//GEN-LAST:event_bntResetMouseExited

    private void bntCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/cancel2.png");
        bntCancel.setBackground(Color.black);
        bntCancel.setIcon(close);
    }//GEN-LAST:event_bntCancelMouseEntered

    private void bntCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/cancel_48px.png");
        bntCancel.setBackground(new Color(51, 51, 51));
        bntCancel.setIcon(close);
    }//GEN-LAST:event_bntCancelMouseExited

    private void bntCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelActionPerformed
    sound.playMusic("./src/Sound/click2.wav");
        this.dispose();
    }//GEN-LAST:event_bntCancelActionPerformed

//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Add_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Add_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Add_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Add_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Add_Admin dialog = new Add_Admin(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancel;
    private javax.swing.JButton bntReset;
    private javax.swing.JButton bntadd;
    private javax.swing.JComboBox<String> cmbDay;
    private javax.swing.JComboBox<String> cmbMo;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLb_Close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
