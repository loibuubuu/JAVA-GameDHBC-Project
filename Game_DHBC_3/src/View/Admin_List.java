/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBModels.AdminDAO;
import Sound.Sound;
import DBEntities.Admin;
import static View.Admin_page.Active;
import java.awt.Color;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LENOVO
 */
public final class Admin_List extends javax.swing.JFrame {

    TableRowSorter<TableModel> sorter;
    DefaultTableModel model1;
    ArrayList<Admin> ds;
    String username = "", password = "";
    Sound sound = new Sound();
static boolean Active= false;
    public Admin_List() {
        initComponents();
        model1 = (DefaultTableModel) tbAdmins.getModel();
        ShowtbAdmin();
    }
public void active(){
    Active=true;
}

    public void ShowtbAdmin() {
        ds = new AdminDAO().getList();
        model1.setRowCount(0);
        for (Admin tem : ds) {
            model1.addRow(tem.toVector());
        }
    }

    public void getAdmin(String user, String pass) {
        username = user;
        password = pass;
        jlbTK.setText("Tài khoản: " + username);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLb_Close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAdmins = new javax.swing.JTable();
        bntDelate = new javax.swing.JButton();
        bntCancel = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        bntsearch = new javax.swing.JButton();
        bntInsert = new javax.swing.JButton();
        jlbTK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
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
        jPanel2.add(jLb_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Admin List page");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách Admin");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 330, 40));

        tbAdmins.setAutoCreateRowSorter(true);
        tbAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài khoản", "Email", "Ngày sinh", "Số điện thoại", "Ngày tham gia"
            }
        ));
        tbAdmins.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbAdmins.setMinimumSize(new java.awt.Dimension(50, 0));
        jScrollPane1.setViewportView(tbAdmins);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 890, 210));

        bntDelate.setBackground(new java.awt.Color(51, 51, 51));
        bntDelate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntDelate.setForeground(new java.awt.Color(255, 255, 255));
        bntDelate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detele1.png"))); // NOI18N
        bntDelate.setText("   Xóa");
        bntDelate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntDelate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntDelateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntDelateMouseExited(evt);
            }
        });
        bntDelate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDelateActionPerformed(evt);
            }
        });
        jPanel1.add(bntDelate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 170, 60));

        bntCancel.setBackground(new java.awt.Color(51, 51, 51));
        bntCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntCancel.setForeground(new java.awt.Color(255, 255, 255));
        bntCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel2.png"))); // NOI18N
        bntCancel.setText("Thoát");
        bntCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(bntCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 160, 60));
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 510, 40));

        bntsearch.setBackground(new java.awt.Color(51, 51, 51));
        bntsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntsearch.setForeground(new java.awt.Color(255, 255, 255));
        bntsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_48px.png"))); // NOI18N
        bntsearch.setText("Tìm Kiếm");
        bntsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntsearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntsearchMouseExited(evt);
            }
        });
        bntsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntsearchActionPerformed(evt);
            }
        });
        jPanel1.add(bntsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 140, 40));

        bntInsert.setBackground(new java.awt.Color(51, 51, 51));
        bntInsert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntInsert.setForeground(new java.awt.Color(255, 255, 255));
        bntInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        bntInsert.setText("   Thêm");
        bntInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntInsertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntInsertMouseExited(evt);
            }
        });
        bntInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntInsertActionPerformed(evt);
            }
        });
        jPanel1.add(bntInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 160, 60));

        jlbTK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTK.setForeground(new java.awt.Color(255, 255, 0));
        jlbTK.setText("Tài khoản:");
        jPanel1.add(jlbTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
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

    private void bntInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntInsertActionPerformed
        sound.playMusic("./src/Sound/click2.wav");
        if (username.equals("Admin")) {
            Add_Admin Add_Admin = new Add_Admin(this, rootPaneCheckingEnabled);
            Add_Admin.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không đủ quyền để thực hiện chức năng này...");
        }

    }//GEN-LAST:event_bntInsertActionPerformed
    private void bntsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntsearchActionPerformed
        // TODO add your handling code here:
        sound.playMusic("./src/Sound/click2.wav");
        if (txtSearch.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa muốn tìm kiếm...");
            txtSearch.requestFocus();
        } else {
            sorter = (TableRowSorter<TableModel>) tbAdmins.getRowSorter();
            //  sorter.setRowFilter(RowFilter.regexFilter(txtSearch.getText(), 0));
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtSearch.getText()));
        }
    }//GEN-LAST:event_bntsearchActionPerformed
    private void bntDelateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDelateActionPerformed
        // TODO add your handling code here:
        sound.playMusic("./src/Sound/click2.wav");
        if (username.equals("Admin")) {
            int selectedIndex = tbAdmins.getSelectedRow();
            if (selectedIndex >= 0) {
                Admin ad = ds.get(selectedIndex);
                if (!ad.getName().equals(username)) {
                    int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa tài khoản Admin này?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (option == JOptionPane.YES_OPTION) {
                        AdminDAO.delete(ad.getName());
                        ShowtbAdmin();
                    }
                }
                if (ad.getName().equals(username)) {
                    JOptionPane.showMessageDialog(this, "Tài khoản này đang hoạt động bạn không thể xóa...");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn Admin bạn muốn xóa...");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không đủ quyền để thực hiện chức năng này...");
        }
    }//GEN-LAST:event_bntDelateActionPerformed
    private void bntInsertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntInsertMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/add2.png");
        bntInsert.setIcon(close);
        bntInsert.setBackground(Color.black);
    }//GEN-LAST:event_bntInsertMouseEntered

    private void bntInsertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntInsertMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/add1.png");
        bntInsert.setIcon(close);
        bntInsert.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntInsertMouseExited

    private void bntsearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntsearchMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/search-icon.png");
        bntsearch.setIcon(close);
        bntsearch.setBackground(Color.black);
    }//GEN-LAST:event_bntsearchMouseEntered

    private void bntsearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntsearchMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/search_48px.png");
        bntsearch.setIcon(close);
        bntsearch.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntsearchMouseExited

    private void bntDelateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntDelateMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/detele2.png");
        bntDelate.setIcon(close);
        bntDelate.setBackground(Color.black);
    }//GEN-LAST:event_bntDelateMouseEntered

    private void bntDelateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntDelateMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/detele1.png");
        bntDelate.setIcon(close);
        bntDelate.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntDelateMouseExited

    private void bntCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/cancel_48px.png");
        bntCancel.setBackground(Color.black);
        bntCancel.setIcon(close);

    }//GEN-LAST:event_bntCancelMouseEntered

    private void bntCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/cancel2.png");
        bntCancel.setBackground(new Color(51, 51, 51));
        bntCancel.setIcon(close);
    }//GEN-LAST:event_bntCancelMouseExited

    private void bntCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelActionPerformed
        // TODO add your handling code here:
        sound.playMusic("./src/Sound/click2.wav");
        Admin_page rgf = new Admin_page();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        rgf.getAdmin(username, password);
    }//GEN-LAST:event_bntCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                               if(Active){
                  new Admin_List().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Bạn cần phải đăng nhập trước khi mở trang này!!!");
                    new Login().setVisible(true);
                }
         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancel;
    private javax.swing.JButton bntDelate;
    private javax.swing.JButton bntInsert;
    private javax.swing.JButton bntsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLb_Close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbTK;
    private javax.swing.JTable tbAdmins;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
