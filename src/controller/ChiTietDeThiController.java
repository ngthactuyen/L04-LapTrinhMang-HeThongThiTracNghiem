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
import model.DeThi;
import view.giaovien.ChiTietDeThi;

/**
 *
 * @author Tuyen
 */
public class ChiTietDeThiController {
    private Connection conn;
    private Statement stmt = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    
    public ArrayList<CauHoi> danhsachChiTietDeThi(String maDT) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select* from ChiTietDeThi join CauHoi on ChiTietDeThi.maCH = CauHoi.maCH where maDT like N'"+ maDT+ "'");
        ArrayList<CauHoi> result = new ArrayList<>();
        while (rs.next()) {            
            CauHoi ch = new CauHoi();
            ch.setMaCH(rs.getInt(1));
            ch.setMaMH(rs.getInt(4));
            ch.setNoidung(rs.getString(5));
            ch.setDapanA(rs.getString(6));
            ch.setDapanB(rs.getString(7));
            ch.setDapanC(rs.getString(8));
            ch.setDapanD(rs.getString(9));
            ch.setDapandung(rs.getString(10));
            result.add(ch);
        }
        DBConnect.closeConnection();
        return result;
    }
    
    public int them(String maDT, int maCH) throws ClassNotFoundException, SQLException{
        int i = 0;
        int dem = 0;
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "Select* from ChiTietDeThi where maDT like '"+ maDT +"' and maCH= "+ maCH;
        rs = stmt.executeQuery(sql);
        while (rs.next()) {            
            i = 0;
            dem++;
        }
        if (dem ==0) {
            pstmt = conn.prepareStatement("insert ChiTietDeThi(maCH, maDT) values(?,?)");
            pstmt.setInt(1, maCH);
            pstmt.setString(2, maDT);
            pstmt.executeUpdate();
            i = 1;
        }
        DBConnect.closeConnection();
        return i;
    }
    
    public void xoa(String maDT, int maCH) throws ClassNotFoundException, SQLException{
        System.out.println(maDT+ "\t"+ maCH);
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "delete from ChiTietDeThi where maDT like '"+ maDT+  "'and maCH="+ maCH;
        stmt.executeUpdate(sql);
        DBConnect.closeConnection();
    }
}
