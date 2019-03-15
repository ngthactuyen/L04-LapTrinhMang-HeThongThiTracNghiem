/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connect.DBConnect;
import entity.SaveGiaoVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.GiaoVien;

/**
 *
 * @author Tuyen
 */
public class GiaoVienController {
    private Connection conn;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    public int dangky(GiaoVien gv) throws ClassNotFoundException, SQLException{
        int i = 0;
        int dem = 0;
        conn = DBConnect.openConnection();
        pstmt = conn.prepareStatement("Select* from GiaoVien where maGV= ?");
        pstmt.setString(1, gv.getId());
        rs = pstmt.executeQuery();
        while (rs.next()) {            
            i = 0;
            dem++;
        }
        if (dem ==0) {
            pstmt = conn.prepareStatement("insert GiaoVien(maGV, tenGV, matkhau, phanquyen) values(?,?,?,?)");
            pstmt.setString(1, gv.getId());
            pstmt.setString(2, gv.getHoten());
            pstmt.setString(3, gv.getMatkhau());
            pstmt.setInt(4, gv.getPhanquyen());
            pstmt.executeUpdate();
            i = 1;
        }
        DBConnect.closeConnection();
        return i;
    }
    
    public void doimatkhau(String matkhaumoi) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        pstmt = conn.prepareStatement("update GiaoVien set matkhau= ? where maGV= ?");
        pstmt.setString(1, matkhaumoi);
        pstmt.setString(2, SaveGiaoVien.maGV);
        pstmt.execute();
        SaveGiaoVien.matkhau = matkhaumoi;
        DBConnect.closeConnection();
    }
}
