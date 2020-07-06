/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBModels.AdminDAO;
import DBModels.HelpSupportDAO;
import DBEntities.Admin;
import DBEntities.HelpSupport;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class HelpSupport_Admin extends javax.swing.JFrame {

    DefaultTableModel model1;
    ArrayList<HelpSupport> ds;
    public int id;

    public HelpSupport_Admin() {
        initComponents();
        model1 = (DefaultTableModel) tbQA.getModel();
        showHp();
    }

    public void showHp() {
        ds = new HelpSupportDAO().getList();
        model1.setRowCount(0);
        ds.forEach((tem) -> {
            model1.addRow(tem.toVector());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLb_Close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bntDelete = new javax.swing.JButton();
        bntview = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQA = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
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
        jPanel1.add(jLb_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Help Support page");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 40));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ PHẢN HỒI");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1450, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hello, admin adminName!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1450, -1));

        bntDelete.setBackground(new java.awt.Color(255, 255, 51));
        bntDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntDelete.setText("Xóa");
        bntDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(bntDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 200, 50));

        bntview.setBackground(new java.awt.Color(255, 51, 0));
        bntview.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntview.setText("Xem Chi Tiết");
        bntview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntviewActionPerformed(evt);
            }
        });
        jPanel2.add(bntview, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 200, 50));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1450, 190));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbQA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tài Khoản", "Tiêu Đề", "Nôi Dung", "Ngày Nhận"
            }
        ));
        jScrollPane1.setViewportView(tbQA);
        if (tbQA.getColumnModel().getColumnCount() > 0) {
            tbQA.getColumnModel().getColumn(0).setMinWidth(50);
            tbQA.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbQA.getColumnModel().getColumn(0).setMaxWidth(50);
            tbQA.getColumnModel().getColumn(1).setMinWidth(150);
            tbQA.getColumnModel().getColumn(1).setMaxWidth(200);
            tbQA.getColumnModel().getColumn(2).setMinWidth(200);
            tbQA.getColumnModel().getColumn(2).setMaxWidth(250);
            tbQA.getColumnModel().getColumn(4).setMinWidth(150);
            tbQA.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1330, 420));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1450, 480));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
    private void bntDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeleteActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tbQA.getSelectedRow();
        if (selectedIndex >= 0) {
            HelpSupport hp = ds.get(selectedIndex);
            // ad.getCaseid();
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa nội dung này?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                HelpSupportDAO.delete(hp.getCaseid());
                showHp();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nôi dung bạn muốn xóa...");
        }
    }//GEN-LAST:event_bntDeleteActionPerformed
    private void bntviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntviewActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tbQA.getSelectedRow();
        if (selectedIndex >= 0) {
            HelpSupport Hp = ds.get(selectedIndex);
            id = Hp.getCaseid();

            HelpSupport_Admin_Detail vhp = new HelpSupport_Admin_Detail(this, rootPaneCheckingEnabled);

            vhp.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nôi dung bạn muốn xem...");
        }
    }//GEN-LAST:event_bntviewActionPerformed
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
            java.util.logging.Logger.getLogger(HelpSupport_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpSupport_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpSupport_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpSupport_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpSupport_Admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntDelete;
    public javax.swing.JButton bntview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLb_Close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbQA;
    // End of variables declaration//GEN-END:variables
}
