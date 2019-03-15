/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.giaovien;

import controller.CauHoiController;
import controller.ChiTietDeThiController;
import entity.SaveDeThi;
import static entity.SaveDeThi.maDT;
import entity.SaveMonHoc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CauHoi;
import model.MonHoc;

/**
 *
 * @author Tuyen
 */
public class ChonCauHoiChoDeThi extends javax.swing.JFrame {

    /**
     * Creates new form ChonCauHoiChoDeThi
     */
    public ChonCauHoiChoDeThi() throws ClassNotFoundException, SQLException {
        initComponents();
        lb_tenMH.setText(mh.getTenMH());
        lb_maDT.setText(maDT);
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
        jLabel4 = new javax.swing.JLabel();
        lb_tenMH = new javax.swing.JLabel();
        lb_maDT = new javax.swing.JLabel();
        btn_themmoi = new javax.swing.JButton();
        lb_thongbao = new javax.swing.JLabel();
        btn_lammoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Chọn câu hỏi");

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

        lb_thongbao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_thongbao.setForeground(new java.awt.Color(255, 0, 0));

        btn_lammoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_lammoi.setText("Làm mới ");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(lb_maDT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_themmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(144, 144, 144))
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
                    .addComponent(btn_lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themmoiActionPerformed
        // TODO add your handling code here:
        
        if (maCH == 0) {
            lb_thongbao.setText("Bạn cần chọn 1 câu hỏi");
        }else{
            try {
                int i = chitietdethiCtr.them(maDT, maCH);
                if (i == 0) {
                    lb_thongbao.setText("Câu hỏi đã có trong đề, hãy chọn lại");
                }
                if (i == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Thêm mới thành công");
                    loadData();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QuanLyMonHoc.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyMonHoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_themmoiActionPerformed

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        try {
            loadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChonCauHoiChoDeThi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ChonCauHoiChoDeThi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void tbl_dataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseReleased
        // TODO add your handling code here:
        int row = tbl_data.getSelectedRow();
        maCH = (int) tbl_data.getValueAt(row, 0);
    }//GEN-LAST:event_tbl_dataMouseReleased

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
            java.util.logging.Logger.getLogger(ChonCauHoiChoDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChonCauHoiChoDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChonCauHoiChoDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChonCauHoiChoDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChonCauHoiChoDeThi().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChonCauHoiChoDeThi.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ChonCauHoiChoDeThi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_themmoi;
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
    private final String maDT = SaveDeThi.maDT;
    private final MonHoc mh = new MonHoc(SaveMonHoc.maMH, SaveMonHoc.tenMH);
    private CauHoiController cauhoiCtr = new CauHoiController();
    private ChiTietDeThiController chitietdethiCtr = new ChiTietDeThiController();
    private ArrayList<CauHoi> dsCauHoi = new ArrayList<CauHoi>();
    private DefaultTableModel modelCauHoi;
    
    
    public void loadData() throws ClassNotFoundException, SQLException{
        maCH = 0;
        lb_thongbao.setText("");
        
        modelCauHoi = new DefaultTableModel();
        modelCauHoi.addColumn("Mã câu hỏi");
        modelCauHoi.addColumn("Nội dung");
        modelCauHoi.addColumn("Đáp án A");
        modelCauHoi.addColumn("Đáp án B");
        modelCauHoi.addColumn("Đáp án C");
        modelCauHoi.addColumn("Đáp án D");
        modelCauHoi.addColumn("Đáp án đúng");
        
        //Load data vào bảng
        dsCauHoi = cauhoiCtr.danhsachCauHoi(mh.getMaMH());
        for (int i = 0; i < dsCauHoi.size(); i++) {
            CauHoi ch = dsCauHoi.get(i);
            Object[] rowData = {
                ch.getMaCH(), ch.getNoidung(), ch.getDapanA(), ch.getDapanB(),
                ch.getDapanC(), ch.getDapanD(), ch.getDapandung()
            };
            modelCauHoi.addRow(rowData);
        }
        tbl_data.setModel(modelCauHoi);
    }


}