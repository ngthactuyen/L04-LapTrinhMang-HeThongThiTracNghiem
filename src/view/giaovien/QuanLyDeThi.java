/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.giaovien;

import controller.DeThiController;
import entity.SaveDeThi;
import entity.SaveMonHoc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import model.DeThi;
import model.MonHoc;

/**
 *
 * @author Tuyen
 */
public class QuanLyDeThi extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyDeThi
     */
    public QuanLyDeThi() throws ClassNotFoundException, SQLException {
        initComponents();
        lb_tenMH.setText(mh.getTenMH());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_tenMH = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_made = new javax.swing.JTextField();
        btn_lammoi = new javax.swing.JButton();
        btn_themmoi = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        btn_chitiet = new javax.swing.JButton();
        lb_thongbao = new javax.swing.JLabel();
        sp_thoigianlam = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quản lý Đề thi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên môn học:");

        lb_tenMH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mã đề:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Thời gian làm mỗi câu(giây):");

        txt_made.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_lammoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_lammoi.setText("Làm mới ");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });

        btn_themmoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_themmoi.setText("Thêm mới");
        btn_themmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themmoiActionPerformed(evt);
            }
        });

        btn_sua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

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

        btn_chitiet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_chitiet.setText("Chi tiết");
        btn_chitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chitietActionPerformed(evt);
            }
        });

        lb_thongbao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_thongbao.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_themmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btn_chitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_tenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_made, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_thoigianlam, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lb_thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_made, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_thoigianlam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_themmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_chitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        try {
            loadData();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuanLyDeThi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void btn_themmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themmoiActionPerformed
        // TODO add your handling code here:

        String maDT = txt_made.getText();
        int thoigianlam = (int) sp_thoigianlam.getValue();
        DeThi dt = new DeThi(maDT, mh.getMaMH(), thoigianlam);
        if (maDT.equals("") || thoigianlam == 0) {
            lb_thongbao.setText("Tất cả các trường bắt buộc phải nhập");
        }else{
            try {
                int i = dethiCtr.them(dt);
                if (i == 0) {
                    lb_thongbao.setText("Đề thi đã có trong hệ thống, hãy nhập lại");
                }
                if (i == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Thêm mới thành công");
                    loadData();
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(QuanLyMonHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_themmoiActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:

        int thoigianlam = (int) sp_thoigianlam.getValue();
        if (SaveDeThi.maDT.equals("")) {
            lb_thongbao.setText("Bạn cần chọn 1 đề thi");
        }else if (thoigianlam <= 0) {
            lb_thongbao.setText("Thời gian làm bài phải lớn hơn 0");
        }else{
            try {
                dethiCtr.sua(SaveDeThi.maDT, thoigianlam);
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
                loadData();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(QuanLyDeThi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        if (SaveDeThi.maDT.equals("")) {
            lb_thongbao.setText("Bạn cần chọn đề thi");
        }else{
            try {
                dethiCtr.xoa(SaveDeThi.maDT);
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                loadData();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QuanLyDeThi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyDeThi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tbl_dataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseReleased
        // TODO add your handling code here:
        int row = tbl_data.getSelectedRow();
        txt_made.setText(tbl_data.getValueAt(row, 0).toString());
        sp_thoigianlam.setValue(tbl_data.getValueAt(row, 1));
        SaveDeThi.maDT = tbl_data.getValueAt(row, 0).toString();
        SaveDeThi.maMH = mh.getMaMH();
        SaveDeThi.tenMH = mh.getTenMH();
        SaveDeThi.thoigianlammoicau = (int) tbl_data.getValueAt(row, 1);
    }//GEN-LAST:event_tbl_dataMouseReleased

    private void btn_chitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chitietActionPerformed
        // TODO add your handling code here:
        if (SaveDeThi.maDT.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn 1 đề thi");
        } else {
            try {
                ChiTietDeThi ctdt = new ChiTietDeThi();
                ctdt.setVisible(true);
                ctdt.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QuanLyDeThi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyDeThi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_chitietActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLyDeThi().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(QuanLyDeThi.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyDeThi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chitiet;
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_themmoi;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_tenMH;
    private javax.swing.JLabel lb_thongbao;
    private javax.swing.JSpinner sp_thoigianlam;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_made;
    // End of variables declaration//GEN-END:variables
    
    private final MonHoc mh = new MonHoc(SaveMonHoc.maMH, SaveMonHoc.tenMH);
    private DeThiController dethiCtr = new DeThiController();
    private ArrayList<DeThi> dsDeThi = new ArrayList<>();
    private DefaultTableModel modelDeThi;
    
    public void loadData() throws ClassNotFoundException, SQLException{
        lb_thongbao.setText("");
        SaveDeThi.maDT = "";
        SaveDeThi.thoigianlammoicau = 0;
        txt_made.setText("");
        sp_thoigianlam.setValue(0);
        
        modelDeThi = new DefaultTableModel();
        modelDeThi.addColumn("Mã đề thi");
        modelDeThi.addColumn("Thời gian làm mỗi câu");
        
        
        //Load data vào bảng
        dsDeThi = dethiCtr.danhsachDeThi(mh.getMaMH());
        for (int i = 0; i < dsDeThi.size(); i++) {
            DeThi dt = dsDeThi.get(i);
            Object[] rowData = {
                dt.getMaDT(), dt.getThoigianlammoicau()
            };
            modelDeThi.addRow(rowData);
        }
        tbl_data.setModel(modelDeThi);
    }


}
