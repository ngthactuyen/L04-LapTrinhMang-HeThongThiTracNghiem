/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author Tuyen
 */
public class SinhVienController {
    private Connection conn;
    Statement stmt = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    
    public ArrayList<SinhVien> danhsachSinhVien() throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select* from SinhVien");
        ArrayList<SinhVien> result = new ArrayList<SinhVien>();
        while (rs.next()) {            
            SinhVien sv = new SinhVien();
            sv.setId(rs.getString(1));
            sv.setHoten(rs.getString(2));
            sv.setLop(rs.getString(3));
            sv.setMatkhau(rs.getString(4));
            result.add(sv);
        }
        DBConnect.closeConnection();
        return result;
    }
    
    public int dangky(SinhVien sv) throws ClassNotFoundException, SQLException{
        int i = 0;
        int dem = 0;
        conn = DBConnect.openConnection();
        pstmt = conn.prepareStatement("Select* from SinhVien where maSV= ?");
        pstmt.setString(1, sv.getId());
        rs = pstmt.executeQuery();
        while (rs.next()) {            
            i = 0;
            dem++;
        }
        if (dem ==0) {
            pstmt = conn.prepareStatement("insert SinhVien(maSV, tenSV, lop, matkhau) values(?,?,?,?)");
            pstmt.setString(1, sv.getId());
            pstmt.setString(2, sv.getHoten());
            pstmt.setString(3, sv.getLop());
            pstmt.setString(4, sv.getMatkhau());
            pstmt.executeUpdate();
            i = 1;
        }
        DBConnect.closeConnection();
        return i;
    }
    
    public int sua(SinhVien sv) throws ClassNotFoundException, SQLException{
        int i = 0;
        conn = DBConnect.openConnection();
        pstmt = conn.prepareStatement("Select* from SinhVien where maSV= ?");
        pstmt.setString(1, sv.getId());
        rs = pstmt.executeQuery();
        while (rs.next()) {  
            i = 1;
        }
        if (i == 1) {
            pstmt = conn.prepareStatement("update SinhVien set tenSV= ?, lop= ?, matkhau= ? where maSV= ?");
            pstmt.setString(1, sv.getHoten());
            pstmt.setString(2, sv.getLop());
            pstmt.setString(3, sv.getMatkhau());
            pstmt.setString(4, sv.getId());
            pstmt.executeUpdate();
        }
        DBConnect.closeConnection();
        return i;
    }
    
    public int xoa(String maSV) throws ClassNotFoundException, SQLException{
        int i = 0;
        conn = DBConnect.openConnection();
        pstmt = conn.prepareStatement("Select* from SinhVien where maSV= ?");
        pstmt.setString(1, maSV);
        rs = pstmt.executeQuery();
        while (rs.next()) {  
            i = 1;
        }
        if (i == 1) {
            pstmt = conn.prepareStatement("delete from SinhVien where maSV = ?");
            pstmt.setString(1, maSV);
            pstmt.executeUpdate();
        }
        DBConnect.closeConnection();
        return i;
    }
    
    public ArrayList<SinhVien> timkiem(String maSV, String hoten) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        String sql = "";
        if (!maSV.equals("") && hoten.equals("")) {
            sql = "select* from SinhVien where maSV like '%"+ maSV+ "%'";
        }else if (maSV.equals("") && !hoten.equals("")) {
            sql = "select* from SinhVien where tenSV like N'%"+ hoten+ "%'";
        }else{
            sql = "select* from SinhVien where maSV like '%"+ maSV+ 
                "%' and tenSV like N'%"+ hoten+ "%'";
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
        while (rs.next()) {            
            SinhVien s = new SinhVien();
            s.setId(rs.getString(1));
            s.setHoten(rs.getString(2));
            s.setLop(rs.getString(3));
            s.setMatkhau(rs.getString(4));
            dsSinhVien.add(s);
        }
        DBConnect.closeConnection();
        return dsSinhVien;
    }
}
