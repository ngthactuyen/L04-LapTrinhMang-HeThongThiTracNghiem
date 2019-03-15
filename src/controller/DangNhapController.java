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
import model.Person;

/**
 *
 * @author Tuyen
 */
public class DangNhapController {
    private Connection conn;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    public int kiemtraDangNhap(String tendangnhap, String matkhau) throws ClassNotFoundException, SQLException{
        int i = 0;
        conn = DBConnect.openConnection();
        //i = 1: GiaoVien
        //i = 2: SinhVien
        pstmt = conn.prepareStatement("select* from GiaoVien where maGV= ? and matkhau= ?");
        pstmt.setString(1, tendangnhap);
        pstmt.setString(2, matkhau);
        rs = pstmt.executeQuery();
        while (rs.next()) {            
            i = 1;
            SaveGiaoVien.maGV = rs.getString(1);
            SaveGiaoVien.tenGV = rs.getString(2);
            SaveGiaoVien.matkhau = rs.getString(3);
        }
        
        pstmt = conn.prepareStatement("select* from SinhVien where maSV= ? and matkhau= ?");
        pstmt.setString(1, tendangnhap);
        pstmt.setString(2, matkhau);
        rs = pstmt.executeQuery();
        while (rs.next()) {            
            i = 2;
        }
        
        return i;
    }
}
