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
import model.CauHoi;
import model.SinhVien;

/**
 *
 * @author Tuyen
 */
public class CauHoiController {
    private Connection conn;
    Statement stmt = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    
    public ArrayList<CauHoi> danhsachCauHoi(int maMH) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select* from CauHoi where maMH="+ maMH);
        ArrayList<CauHoi> result = new ArrayList<CauHoi>();
        while (rs.next()) {            
            CauHoi ch = new CauHoi();
            ch.setMaCH(rs.getInt(1));
            ch.setMaMH(maMH);
            ch.setNoidung(rs.getString(3));
            ch.setDapanA(rs.getString(4));
            ch.setDapanB(rs.getString(5));
            ch.setDapanC(rs.getString(6));
            ch.setDapanD(rs.getString(7));
            ch.setDapandung(rs.getString(8));
            result.add(ch);
        }
        DBConnect.closeConnection();
        return result;
    }
    
    public int them(CauHoi ch) throws ClassNotFoundException, SQLException{
        int i = 0;
        int dem = 0;
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "Select* from CauHoi where maMH= "+ ch.getMaMH()
                + " and noidung like N'"+ ch.getNoidung()
                + "'and dapanA like N'"+ ch.getDapanA()
                + "'and dapanB like N'"+ ch.getDapanB()
                + "'and dapanC like N'"+ ch.getDapanC()
                + "'and dapanD like N'"+ ch.getDapanD()
                + "'and dapandung like N'"+ ch.getDapandung()
                + "'";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {            
            i = 0;
            dem++;
        }
        if (dem ==0) {
            pstmt = conn.prepareStatement("insert CauHoi(maMH, noidung, dapanA, dapanB, dapanC, dapanD, dapandung) values(?,?,?,?,?,?,?)");
            pstmt.setInt(1, ch.getMaMH());
            pstmt.setString(2, ch.getNoidung());
            pstmt.setString(3, ch.getDapanA());
            pstmt.setString(4, ch.getDapanB());
            pstmt.setString(5, ch.getDapanC());
            pstmt.setString(6, ch.getDapanD());
            pstmt.setString(7, ch.getDapandung());
            pstmt.executeUpdate();
            i = 1;
        }
        DBConnect.closeConnection();
        return i;
    }
    
    public int sua(CauHoi ch) throws ClassNotFoundException, SQLException{
        
        int i = 0;
        int dem = 0;
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "Select* from CauHoi where noidung like N'"+ ch.getNoidung()
                + "'and dapanA like N'"+ ch.getDapanA()
                + "'and dapanB like N'"+ ch.getDapanB()
                + "'and dapanC like N'"+ ch.getDapanC()
                + "'and dapanD like N'"+ ch.getDapanD()
                + "'and dapandung like N'"+ ch.getDapandung()
                + "'";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {  
            dem++;
        }
        if (dem == 0) {
            pstmt = conn.prepareStatement("update CauHoi set noidung= ?, dapanA= ?, dapanB= ?, dapanC= ?, dapanD= ?, dapandung= ? where maCH= ?");
            pstmt.setString(1, ch.getNoidung());
            pstmt.setString(2, ch.getDapanA());
            pstmt.setString(3, ch.getDapanB());
            pstmt.setString(4, ch.getDapanC());
            pstmt.setString(5, ch.getDapanD());
            pstmt.setString(6, ch.getDapandung());
            pstmt.setInt(7, ch.getMaCH());
            
            pstmt.executeUpdate();
            i = 1;
        }else{
            i = 0;
        }
        DBConnect.closeConnection();
        return i;
    }
    
    public void xoa(int maCH) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "delete from Chitietdethi where maCH ="+ maCH;
        stmt.executeUpdate(sql);

        sql = "delete from CauHoi where maCH="+ maCH;
        stmt.executeUpdate(sql);
        DBConnect.closeConnection();
    }
    
    
}
