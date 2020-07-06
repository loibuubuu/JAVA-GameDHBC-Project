/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import DBModels.PlayerDAO;
import DBEntities.Player;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Register_Players extends javax.swing.JFrame {

    ArrayList<Player> ds;
    Player player = new Player();
    int M, D, Y;

    /**
     * Creates new form Register
     */
    public Register_Players() {
        initComponents();
        D = Y = M = 0;
        //  this.getRootPane().setDefaultButton(bntRegister);
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
        jLb_Close = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bntRegister = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox<>();
        cmbDay = new javax.swing.JComboBox<>();
        cmbMo = new javax.swing.JComboBox<>();
        txtconfirmPass = new javax.swing.JPasswordField();
        txtpassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jLb_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 40, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Register Form");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Ngày sinh:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 100, 30));

        bntRegister.setBackground(new java.awt.Color(51, 51, 255));
        bntRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntRegister.setForeground(new java.awt.Color(255, 255, 255));
        bntRegister.setText("Đăng ký");
        bntRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(bntRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 320, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Đăng nhập");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 310, 30));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1995", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        cmbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYearActionPerformed(evt);
            }
        });
        jPanel1.add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 70, 30));

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmbDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 70, 30));

        cmbMo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cmbMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbMo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 60, 30));
        jPanel1.add(txtconfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 220, 30));
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 232, 220, 30));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 220, 30));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 220, 30));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 220, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("XN Mật khẩu:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Số điện thoại:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Email:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Mật khẩu:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tài khoản:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Đăng ký");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registration_96px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 90, 100));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 380, 460));

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 830, 560));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("UserName:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        Matcher mn = Pn.matcher(txtusername.getText().trim());
        if (!mn.matches()) {
            JOptionPane.showMessageDialog(this,  "Tài khoản không được để trống và 5-12 ký tự, không chứa dấu tiếng việt, không có khoảng trống ... ");
            txtusername.requestFocus();
            return false;
        }
        Pattern Pp = Pattern.compile("^[a-zA-Z0-9]{8,12}$");
        Matcher mp = Pp.matcher(new String(txtpassword.getPassword()).trim());
        if (!mp.matches()) {
            JOptionPane.showMessageDialog(this,  "Mật khẩu không được để trống và 8-12 ký tự, không chứa dấu tiếng việt, không có khoảng trống ... ");
            txtpassword.requestFocus();
return false;
        }
        if (!new String(txtconfirmPass.getPassword()).equals(new String(txtpassword.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không chính xác!");
            txtconfirmPass.requestFocus();
            return false;
        }

        Pattern Pm = Pattern.compile("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
        Matcher mm = Pm.matcher(txtEmail.getText().trim());
        if (!mm.matches()) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ... ");
            txtEmail.requestFocus();
            return false;
        }
          Pattern p = Pattern.compile("[0-9]{10,12}");
        Matcher m = p.matcher(txtPhone.getText().trim());
        if (!m.matches()) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống và từ 10-12 ký số ... ");
            txtPhone.requestFocus();
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
      
        
        return true;
    }

    private void cmbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbYearActionPerformed

    private void cmbMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMoActionPerformed

    private void jLb_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_CloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
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
    private void bntRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegisterActionPerformed
        // TODO add your handling code here:
        boolean isOK = true;
        String Name = txtusername.getText().trim();
        String Password = new String(txtpassword.getPassword()).trim();
        String Email = txtEmail.getText().trim();
        String DOB = cmbDay.getSelectedItem().toString() + "-" + cmbMo.getSelectedItem().toString() + "-" + cmbYear.getSelectedItem().toString();
        String Phone = txtPhone.getText().trim();
        player.Name = Name;
        player.Password = Password;
        player.Email = Email;
        player.DOB = DOB;
        player.Phone = Phone;
        ds = PlayerDAO.CheckRegister();
        for (Player item : ds) {
            if (item.getName().equals(Name)) {
                JOptionPane.showMessageDialog(this, "Tài khoản này đã tồn tại. Vui lòng nhập lại!!! ");
                txtusername.requestFocus();
                isOK = false;
                break;
            }
            if (item.getEmail().equals(Email)) {
                JOptionPane.showMessageDialog(this, "Email này đã tồn tại. Vui lòng nhập lại!!! ");
                txtEmail.requestFocus();
                isOK = false;
                break;
            }
            if (item.getPhone().equals(Phone)) {
                JOptionPane.showMessageDialog(this, "Số điện thoại này đã tồn tại. Vui lòng nhập lại!!! ");
                txtPhone.requestFocus();
                isOK = false;
                break;
            }
        }

        if (checkValid() && isOK == true) {
            PlayerDAO.insertRegister(player);
            JOptionPane.showMessageDialog(this, "Thành công");
            Login rgf = new Login();
            rgf.setVisible(true);
            rgf.pack();
            rgf.setLocationRelativeTo(null);
            rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_bntRegisterActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        Login rgf = new Login();
            rgf.setVisible(true);
            rgf.pack();
            rgf.setLocationRelativeTo(null);
            rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(Register_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Players().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRegister;
    private javax.swing.JComboBox<String> cmbDay;
    private javax.swing.JComboBox<String> cmbMo;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLb_Close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JPasswordField txtconfirmPass;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

}
