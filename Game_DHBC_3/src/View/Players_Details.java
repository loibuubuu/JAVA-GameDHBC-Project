/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBModels.PlayerDAO;
import DBEntities.Player;
import static View.Admin_List.Active;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
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
public final class Players_Details extends javax.swing.JFrame {
    String userName, Password;
    DefaultTableModel model1;
    List<Player> ds = new ArrayList<>();
    TableRowSorter<TableModel> sorter;
static boolean Active= false;
    public Players_Details() {
        initComponents();
        model1 = (DefaultTableModel) tbPlayer.getModel();
        ShowtbPlayer();
    }
public void active(){
    Active=true;
}
    public void ShowtbPlayer() {
        ds = new PlayerDAO().getList();
        ds.forEach((tem) -> {
            model1.addRow(tem.toVector());
        });
    }

    public void getPlayer(String user, String pass) {
        userName = user;
        Password = pass;
        jlbAdmin.setText(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLb_Close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPlayer = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        bntCancel = new javax.swing.JButton();
        bntPrint = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bntsearch = new javax.swing.JButton();
        jlbAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(jLb_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Players Details page");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 40));

        tbPlayer.setAutoCreateRowSorter(true);
        tbPlayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài khoản", "Email", "Ngày sinh", "Số điện thoại", "Ngày Tham gia"
            }
        ));
        tbPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbPlayer.setMinimumSize(new java.awt.Dimension(50, 0));
        jScrollPane1.setViewportView(tbPlayer);
        if (tbPlayer.getColumnModel().getColumnCount() > 0) {
            tbPlayer.getColumnModel().getColumn(1).setPreferredWidth(130);
            tbPlayer.getColumnModel().getColumn(2).setPreferredWidth(80);
            tbPlayer.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbPlayer.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 890, 210));
        jPanel4.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 510, 40));

        bntCancel.setBackground(new java.awt.Color(51, 51, 51));
        bntCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntCancel.setForeground(new java.awt.Color(255, 255, 255));
        bntCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_48px.png"))); // NOI18N
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
        jPanel4.add(bntCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 180, 60));

        bntPrint.setBackground(new java.awt.Color(51, 51, 51));
        bntPrint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntPrint.setForeground(new java.awt.Color(255, 255, 255));
        bntPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print_48px.png"))); // NOI18N
        bntPrint.setText("Print");
        bntPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntPrintMouseExited(evt);
            }
        });
        bntPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPrintActionPerformed(evt);
            }
        });
        jPanel4.add(bntPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 180, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông Tin Người Chơi");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 410, 40));

        bntsearch.setBackground(new java.awt.Color(51, 51, 51));
        bntsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntsearch.setForeground(new java.awt.Color(255, 255, 255));
        bntsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_48px.png"))); // NOI18N
        bntsearch.setText("Tìm kiếm");
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
        jPanel4.add(bntsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, 40));

        jlbAdmin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbAdmin.setForeground(new java.awt.Color(255, 255, 51));
        jPanel4.add(jlbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 180, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 580));

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

    private void bntsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntsearchActionPerformed
        // TODO add your handling code here:
        if (txtSearch.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui long nhập từ khóa muốn tìm kiếm....");
            txtSearch.requestFocus();
        } else {
            sorter = (TableRowSorter<TableModel>) tbPlayer.getRowSorter();
            //  sorter.setRowFilter(RowFilter.regexFilter(txtSearch.getText(), 0));
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtSearch.getText()));
        }
    }//GEN-LAST:event_bntsearchActionPerformed

    private void bntPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPrintActionPerformed
        // TODO add your handling code here:
        Print_Player_Details rgf = new Print_Player_Details();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        rgf.getPrintPlayer(userName, Password);

    }//GEN-LAST:event_bntPrintActionPerformed

    private void bntCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelActionPerformed
        // TODO add your handling code here:
        Admin_page rgf = new Admin_page();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        rgf.getAdmin(userName, Password);
    }//GEN-LAST:event_bntCancelActionPerformed

    private void bntsearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntsearchMouseEntered
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

    private void bntPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntPrintMouseEntered
        ImageIcon close = new ImageIcon("./src/images/send_to_printer_48px.png");
        bntPrint.setIcon(close);
        bntPrint.setBackground(Color.black);
    }//GEN-LAST:event_bntPrintMouseEntered

    private void bntPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntPrintMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/print_48px.png");
        bntPrint.setIcon(close);
        bntPrint.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntPrintMouseExited

    private void bntCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/cancel2.png");
        bntCancel.setIcon(close);
        bntCancel.setBackground(Color.black);
    }//GEN-LAST:event_bntCancelMouseEntered

    private void bntCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/cancel_48px.png");
        bntCancel.setIcon(close);
        bntCancel.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntCancelMouseExited

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
            java.util.logging.Logger.getLogger(Players_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Players_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Players_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Players_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                                    if(Active){
                   new Players_Details().setVisible(true);
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
    private javax.swing.JButton bntPrint;
    private javax.swing.JButton bntsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLb_Close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbAdmin;
    private javax.swing.JTable tbPlayer;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
