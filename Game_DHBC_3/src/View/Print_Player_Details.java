/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBModels.PlayerDAO;
import DBEntities.Player;
import static View.Players_Details.Active;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public final class Print_Player_Details extends javax.swing.JFrame {

    Calendar cal = Calendar.getInstance();
    java.util.Date date = cal.getTime();
    String userName, passWord;
    DefaultTableModel model1;
    ArrayList<Player> ds;

    public Print_Player_Details() {

        initComponents();
        ShowtbPlayerDetail();
        lbtime.setText(String.valueOf(date));
    }

    public void ShowtbPlayerDetail() {

        ds = new PlayerDAO().getList();
        model1 = (DefaultTableModel) tbPlayers.getModel();

        for (Player tem : ds) {
            model1.addRow(tem.toVector());
        }

    }

    public void getPrintPlayer(String user, String pass) {
        userName = user;
        passWord = pass;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLb_Close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbtime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPlayers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
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
        jPanel2.add(jLb_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 40, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Print Player Details page");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 40));

        lbtime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbtime.setForeground(new java.awt.Color(255, 255, 0));
        lbtime.setText("jLabel2");
        jPanel1.add(lbtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 300, 30));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN CHI TIẾT NGƯỜI CHƠI");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1240, 80));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1240, 50));

        tbPlayers.setAutoCreateRowSorter(true);
        tbPlayers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài khoản", "Email", "ngày sinh", "Số điện thoại", "ngày tham gia"
            }
        ));
        tbPlayers.setMinimumSize(new java.awt.Dimension(50, 0));
        jScrollPane1.setViewportView(tbPlayers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1220, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLb_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLb_CloseMouseClicked
        Players_Details rgf = new Players_Details();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        rgf.getPlayer(userName, passWord);
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
            java.util.logging.Logger.getLogger(Print_Player_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Print_Player_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Print_Player_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print_Player_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (Active) {
                    new Print_Player_Details().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Bạn cần phải đăng nhập trước khi mở trang này!!!");
                    new Login().setVisible(true);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLb_Close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbtime;
    private javax.swing.JTable tbPlayers;
    // End of variables declaration//GEN-END:variables
}
