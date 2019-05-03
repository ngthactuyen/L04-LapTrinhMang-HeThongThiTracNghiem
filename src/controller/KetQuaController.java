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
import model.KetQua;
import model.MonHoc;

/**
 *
 * @author Tuyen
 */
public class KetQuaController {
    private Connection conn;
    Statement stmt = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    
    public ArrayList<KetQua> ketquaSV(String maSV) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select* from Ketqua where maSV like '"+ maSV+ "'");
        ArrayList<KetQua> result = new ArrayList<>();
        while (rs.next()) {            
            KetQua kq = new KetQua();
            kq.setMaSV(rs.getString(1));
            kq.setMaMH(rs.getInt(2));
            kq.setDiem(rs.getFloat(3));
            result.add(kq);
        }
        DBConnect.closeConnection();
        return result;
    }
    
    public ArrayList<KetQua> ketquaMH(int maMH) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select* from KetQua where maMH= "+maMH);
        ArrayList<KetQua> result = new ArrayList<>();
        while (rs.next()) {            
            KetQua kq = new KetQua();
            kq.setMaSV(rs.getString(1));
            kq.setMaMH(rs.getInt(2));
            kq.setDiem(rs.getFloat(3));
            result.add(kq);
        }
        DBConnect.closeConnection();
        return result;
    }
    
    public void them(KetQua kq) throws ClassNotFoundException, SQLException{
        int dem = 0;
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "Select* from Ketqua where maSV like '"+ kq.getMaSV()+ "' and maMH= "+kq.getMaMH();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            dem++;
        }
        if (dem != 0) {
            this.sua(kq);
        }else{
            pstmt = conn.prepareStatement("insert Ketqua(maSV, maMH, diem) values(?,?,?)");
            pstmt.setString(1, kq.getMaSV());
            pstmt.setInt(2, kq.getMaMH());
            pstmt.setFloat(3, kq.getDiem());
            pstmt.executeUpdate();
        }
        
        DBConnect.closeConnection();
    }
    
    public void sua(KetQua kq) throws ClassNotFoundException, SQLException{
        
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "update KetQua set diem= "+ kq.getDiem()+ "where maMH= "+ kq.getMaMH()+ "and maSV like'"+ kq.getMaSV()+"'";
        stmt.executeUpdate(sql);
        
        DBConnect.closeConnection();

    }
    
    public void xoa(String maSV, int maMH) throws ClassNotFoundException, SQLException{
        conn = DBConnect.openConnection();
        stmt = conn.createStatement();
        String sql = "delete from Ketqua where maMH = " + maMH+ " and maSV like'"+ maSV+"'";
        
        stmt.executeUpdate(sql);
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
