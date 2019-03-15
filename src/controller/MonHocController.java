/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connect.DBConnect;
import entity.SaveMonHoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.MonHoc;

/**
 *
 * @author Tuyen
 */
public class MonHocController {
    private Connection conn;
    Statement stmt = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    
    public ArrayList<MonHoc> danhsachMonHoc() throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select* from MonHoc");
        ArrayList<MonHoc> result = new ArrayList<MonHoc>();
        while (rs.next()) {            
            MonHoc mh = new MonHoc();
            mh.setMaMH(rs.getInt(1));
            mh.setTenMH(rs.getString(2));
            result.add(mh);
        }
        DBConnect.closeConnection();
        return result;
    }
    
    public int them(String tenMH) throws ClassNotFoundException, SQLException{
        int i = 0;
        int dem = 0;
        conn = DBConnect.openConnection();
        String sql = "Select* from MonHoc where tenMH like N'"+ tenMH+ "'";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            dem++;
        }
        if (dem ==0) {
            pstmt = conn.prepareStatement("insert Monhoc(tenMH) values(?)");
            pstmt.setString(1, tenMH);
            pstmt.executeUpdate();
            i = 1;
        }
        DBConnect.closeConnection();
        return i;
    }
    
    public int sua(String tenMH) throws ClassNotFoundException, SQLException{
        int i = 0;
        int dem = 0;
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        if (tenMH.equals(SaveMonHoc.tenMH)) {
            i = 1;
        }else{
            String sql = "Select* from MonHoc where tenMH like N'"+ tenMH+ "'";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                dem++;
            }
            if (dem == 0) {
                sql = "update MonHoc set tenMH= N'"+ tenMH+ "'where maMH= "+ SaveMonHoc.maMH;
                stmt.executeUpdate(sql);
                i = 1;
            }else{
                i = 0;
            }
        }   
        DBConnect.closeConnection();
        return i;
    }
    
    public void xoa(int maMH) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        pstmt = conn.prepareStatement("delete from MonHoc where maMH = ?");
        pstmt.setInt(1, maMH);
        pstmt.executeUpdate();
        DBConnect.closeConnection();
    }
    
    public ArrayList<MonHoc> timkiem(String tenMH) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        String sql = "select* from MonHoc where tenMH like N'%"+ tenMH+ "%'";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        ArrayList<MonHoc> dsMonHoc = new ArrayList<>();
        while (rs.next()) {     
            MonHoc mh = new MonHoc(rs.getInt(1), rs.getString(2));
            dsMonHoc.add(mh);
        }
        DBConnect.closeConnection();
        return dsMonHoc;
    }
}
