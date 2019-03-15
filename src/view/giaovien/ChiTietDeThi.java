/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.giaovien;

import controller.ChiTietDeThiController;
import entity.SaveChiTietDeThi;
import entity.SaveDeThi;
import entity.SaveMonHoc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import model.CauHoi;
import model.DeThi;

/**
 *
 * @author Tuyen
 */
public class ChiTietDeThi extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietDeThi
     */
    public ChiTietDeThi() throws ClassNotFoundException, SQLException {
        initComponents();
        lb_tenMH.setText(SaveDeThi.tenMH);
        lb_maDT.setText(dt.getMaDT());
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_tenMH = new javax.swing.JLabel();
        lb_maDT = new javax.swing.JLabel();
        btn_themmoi = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        lb_thongbao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        btn_lammoi = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Chi tiết Đề thi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên môn học:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mã đề:");

        btn_themmoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_themmoi.setText("Thêm câu hỏi");
        btn_themmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themmoiActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        lb_thongbao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_thongbao.setForeground(new java.awt.Color(255, 0, 0));

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_dataMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_data);

        btn_lammoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_lammoi.setText("Làm mới ");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(72, 72, 72))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lb_tenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lb_maDT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btn_themmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_tenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_maDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lb_thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_themmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themmoiActionPerformed
        // TODO add your handling code here:
        SaveMonHoc.maMH = dt.getMaMH();
        SaveMonHoc.tenMH = lb_tenMH.getText();
        SaveDeThi.maDT = dt.getMaDT();
        ChonCauHoiChoDeThi chonCH = new ChonCauHoiChoDeThi();
        chonCH.setVisible(true);
        chonCH.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_themmoiActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:

        if (maCH == 0) {
            lb_thongbao.setText("Bạn cần chọn một câu hỏi để xóa");
        } else {
            int click = JOptionPane.showConfirmDialog(rootPane, "Bạn chắc chắn muốn xóa?");
            if (click == JOptionPane.YES_OPTION) {
                try {
                    chitietdethiCtr.xoa(dt.getMaDT(), maCH);
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                    loadData();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChiTietDeThi.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ChiTietDeThi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tbl_dataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseReleased
        // TODO add your handling code here:
        int row = tbl_data.getSelectedRow();
        maCH = (int) tbl_data.getValueAt(row, 0);
    }//GEN-LAST:event_tbl_dataMouseReleased

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        try {
            loadData();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuanLyDeThi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_lammoiActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChiTietDeThi().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChiTietDeThi.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ChiTietDeThi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_themmoi;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_maDT;
    private javax.swing.JLabel lb_tenMH;
    private javax.swing.JLabel lb_thongbao;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables
    
    private static int maCH;
    private DeThi dt = new DeThi(SaveDeThi.maDT, SaveDeThi.maMH, SaveDeThi.thoigianlammoicau);
    private ChiTietDeThiController chitietdethiCtr = new ChiTietDeThiController();
    private ArrayList<CauHoi> dsChiTietDeThi = new ArrayList<>();
    private DefaultTableModel modelChiTietDeThi;

    public void loadData() throws ClassNotFoundException, SQLException{
        lb_thongbao.setText("");
        SaveChiTietDeThi.maDT = "";
        SaveChiTietDeThi.maCH = 0;
        maCH = 0;
        
        modelChiTietDeThi = new DefaultTableModel();
        modelChiTietDeThi.addColumn("Mã câu hỏi");
        modelChiTietDeThi.addColumn("Nội dung");
        modelChiTietDeThi.addColumn("Đáp án A");
        modelChiTietDeThi.addColumn("Đáp án B");
        modelChiTietDeThi.addColumn("Đáp án C");
        modelChiTietDeThi.addColumn("Đáp án D");
        modelChiTietDeThi.addColumn("Đáp án đúng");


        //Load data vào bảng
        dsChiTietDeThi = chitietdethiCtr.danhsachChiTietDeThi(dt.getMaDT());
        for (int i = 0; i < dsChiTietDeThi.size(); i++) {
            CauHoi ch = dsChiTietDeThi.get(i);
            Object[] rowData = {
                ch.getMaCH(), ch.getNoidung(), ch.getDapanA(), ch.getDapanB(),
                ch.getDapanC(), ch.getDapanD(), ch.getDapandung()
            };
            modelChiTietDeThi.addRow(rowData);
        }
        tbl_data.setModel(modelChiTietDeThi);
    }


}