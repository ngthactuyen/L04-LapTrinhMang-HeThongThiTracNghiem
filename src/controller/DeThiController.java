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
import model.DeThi;

/**
 *
 * @author Tuyen
 */
public class DeThiController {
    private Connection conn;
    Statement stmt = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    
    public ArrayList<DeThi> danhsachDeThi(int maMH) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select* from DeThi where maMH="+ maMH);
        ArrayList<DeThi> result = new ArrayList<DeThi>();
        while (rs.next()) {            
            DeThi dt = new DeThi();
            dt.setMaDT(rs.getString(1));
            dt.setMaMH(maMH);
            dt.setThoigianlammoicau(rs.getInt(3));
            result.add(dt);
        }
        DBConnect.closeConnection();
        return result;
    }
    
    public int them(DeThi dt) throws ClassNotFoundException, SQLException{
        int i = 0;
        int dem = 0;
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "Select* from DeThi where maMH= "+ dt.getMaMH() +" and maDT like '"+ dt.getMaDT()+ "'";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {            
            i = 0;
            dem++;
        }
        if (dem ==0) {
            pstmt = conn.prepareStatement("insert DeThi(maDT, maMH, thoigianlammoicau) values(?,?,?)");
            pstmt.setString(1, dt.getMaDT());
            pstmt.setInt(2, dt.getMaMH());
            pstmt.setInt(3, dt.getThoigianlammoicau());
            pstmt.executeUpdate();
            i = 1;
        }
        DBConnect.closeConnection();
        return i;
    }
    
    public void sua(String maDT, int thoigianlam) throws ClassNotFoundException, SQLException{
        int i = 0;
        int dem = 0;
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "update DeThi set thoigianlammoicau= "+ thoigianlam+ "where maDT= '"+ maDT+"'";
        stmt.executeUpdate(sql);
        DBConnect.closeConnection();
    }
    
    public void xoa(String maDT) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "delete from Chitietdethi where maDT like'"+ maDT+"'";
        stmt.executeUpdate(sql);

        sql = "delete from DeThi where maDT like'"+ maDT+"'";
        stmt.executeUpdate(sql);
        DBConnect.closeConnection();
        
    }
    
}
