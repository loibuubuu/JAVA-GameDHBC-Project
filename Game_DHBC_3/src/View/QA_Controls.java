/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBEntities.QA;
import DBModels.QADAO;

import java.io.File;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LENOVO
 */
public final class QA_Controls extends javax.swing.JFrame {
TableRowSorter<TableModel> sorter;
    DefaultTableModel model;
    ArrayList<QA> ds;

//    private void initData() {
//        //khoi tao model chua du lieu trong jTable vwQA
//        model = (DefaultTableModel) vwQA.getModel();
//
//        //xoa het cac dong du lieu trong model
//        model.setRowCount(0);
//        
//    }
    public void showQA() {
        ds = new QADAO().getList();
          model.setRowCount(0);
        for (QA item : ds) {
            model.addRow(item.toVector());
        }
    }

    /**
     * Creates new form QA_Controls
     */
    public QA_Controls() {
        initComponents();
        model = (DefaultTableModel) vwQA.getModel();
        //  initData();
        showQA();
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
        jLb_Close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbSearch = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtQuesCont = new javax.swing.JTextField();
        txtScen = new javax.swing.JTextField();
        lableAvaiable1 = new javax.swing.JLabel();
        lableName = new javax.swing.JLabel();
        lableAvaiable2 = new javax.swing.JLabel();
        txtGem = new javax.swing.JTextField();
        lablePrice = new javax.swing.JLabel();
        jbtnAddQ = new javax.swing.JButton();
        txtAns = new javax.swing.JTextField();
        lableAvaiable = new javax.swing.JLabel();
        txtScore = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vwQA = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
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
        jPanel2.add(jLb_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Q&A Control page");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        lbSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_48px.png"))); // NOI18N
        lbSearch.setText("Search");
        lbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbSearchActionPerformed(evt);
            }
        });
        jPanel1.add(lbSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 140, 40));
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 510, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Q&A Control");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 270, 40));

        txtQuesCont.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuesCont.setText("Click vào nút bên dưới");
        jPanel1.add(txtQuesCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 200, 30));

        txtScen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtScen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 123, -1));

        lableAvaiable1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lableAvaiable1.setText("Scen");
        jPanel1.add(lableAvaiable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, 30));

        lableName.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lableName.setText("Question Content");
        jPanel1.add(lableName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        lableAvaiable2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lableAvaiable2.setText("Q. Gem");
        jPanel1.add(lableAvaiable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        txtGem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtGem, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 123, -1));

        lablePrice.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lablePrice.setText("Answer Content");
        jPanel1.add(lablePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jbtnAddQ.setText("Add Image");
        jbtnAddQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddQActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAddQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        txtAns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 273, 200, 30));

        lableAvaiable.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lableAvaiable.setText("Q. Score");
        jPanel1.add(lableAvaiable, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        txtScore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 123, -1));

        vwQA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vwQA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question ID", "Q.Content", "Answer", "Scen", "Gem", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vwQA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vwQAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vwQA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 850, 230));

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_48px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detele1.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_window_48px.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addContainerGap())
        );

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

    private void jbtnAddQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddQActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("*.Image", "jpg", "png", "gif");
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setMultiSelectionEnabled(false); // chi dc chon 1 file
        int op = fileChooser.showDialog(this, "Chọn File");
        if (op == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            String s="";
            String check="\\";
            String add="";
            
            for(int i = filename.length()-1;i>=0;i--){
                if(!check.equals(""+filename.charAt(i))){
                    s=""+filename.charAt(i);
                    add=s+add;
                }else{
                    break;
                }
            }
String link="./src/QAImages/";
            txtQuesCont.setText(link+add);

        } else {
            txtQuesCont.setText("Ban Chưa Chọn Hình Ảnh Câu Hỏi");
        }

    }//GEN-LAST:event_jbtnAddQActionPerformed

    private void vwQAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vwQAMouseClicked
        int row = vwQA.getSelectedRow();
        //lay noi dung cua dong duoc chon gan cho o nhap lieu

        txtQuesCont.setText(model.getValueAt(row, 1).toString());
        txtAns.setText(model.getValueAt(row, 2).toString());
        txtScen.setText(model.getValueAt(row, 3).toString());
        txtGem.setText(model.getValueAt(row, 4).toString());
        txtScore.setText(model.getValueAt(row, 5).toString());

    }//GEN-LAST:event_vwQAMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        //gia su viec nhap lieu la hop le
        //tao ra 1 doi tuong product tu du lieu tren form
        QA q = new QA();

        q.quesContent = txtQuesCont.getText().trim();
        q.ansContent = txtAns.getText().trim();
        q.ScenNo = Integer.parseInt(txtScen.getText().trim());
        q.quesGem = Integer.parseInt(txtGem.getText().trim());
        q.quesScore = Integer.parseInt(txtScore.getText().trim());
        QADAO.insert(q);

        //dua bo du lieu nay vo model cua jTable vwQA
        //  model.addRow(q.toVector());
        showQA();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //cap nhat du lieu nhat vo dong hien hanh trong model
        int row = vwQA.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "vui long chon dong cap nhat du lieu");
            return;
        }

        QA qa = ds.get(row);
        QA q = new QA();
        q.quesId = qa.getquesId();
        q.quesContent = txtQuesCont.getText().trim();
        q.ansContent = txtAns.getText().trim();
        q.ScenNo = Integer.parseInt(txtScen.getText().trim());
        q.quesGem = Integer.parseInt(txtGem.getText().trim());
        q.quesScore = Integer.parseInt(txtScore.getText().trim());
//        model.setValueAt(txtQuesCont.getText(), row, 1);
//        model.setValueAt(txtAns.getText(), row, 2);
//        model.setValueAt(txtScen.getText(), row, 3);
//        model.setValueAt(txtGem.getText(), row, 4);
//        model.setValueAt(txtScore.getText(), row, 5);
        QADAO.updateQA(q);
          showQA();


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = vwQA.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "vui long chon dong muon xoa");
            return;
        }
        model.removeRow(row);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        Admin_page rgf = new Admin_page();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void lbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbSearchActionPerformed
        // TODO add your handling code here:
       
       if (txtsearch.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa muốn tìm kiếm...");
            txtsearch.requestFocus();
        } else {
            sorter = new TableRowSorter<TableModel>(model);
//            System.out.println();
            //  sorter.setRowFilter(RowFilter.regexFilter(txtSearch.getText(), 0));
        
           
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtsearch.getText()));
            vwQA.setRowSorter(sorter);
        }
    }//GEN-LAST:event_lbSearchActionPerformed

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
            java.util.logging.Logger.getLogger(QA_Controls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QA_Controls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QA_Controls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QA_Controls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QA_Controls().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLb_Close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAddQ;
    private javax.swing.JLabel lableAvaiable;
    private javax.swing.JLabel lableAvaiable1;
    private javax.swing.JLabel lableAvaiable2;
    private javax.swing.JLabel lableName;
    private javax.swing.JLabel lablePrice;
    private javax.swing.JButton lbSearch;
    private javax.swing.JTextField txtAns;
    private javax.swing.JTextField txtGem;
    private javax.swing.JTextField txtQuesCont;
    private javax.swing.JTextField txtScen;
    private javax.swing.JTextField txtScore;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTable vwQA;
    // End of variables declaration//GEN-END:variables
}
