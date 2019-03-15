/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuyen
 */
public class DBConnect {
    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=HeThongThiTracNghiem";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "310198";
    static Connection conn = null;
    public static Connection openConnection() throws ClassNotFoundException, SQLException{
        
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        if (conn != null) {
            return conn;
        }else{
            return null;
        }
    }
    
    public static void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
            conn = null;
        }
    }
    
//    public static void closeConnection(Connection conn, Statement stmt, PreparedStatement pstmt, ResultSet rs) {
//        try {
//            if (conn != null) {
//                conn.close();
//            }
//            if (stmt != null) {
//                stmt.close();
//            }
//            if (pstmt != null) {
//                pstmt.close();
//            }
//            if (rs != null) {
//                rs.close();
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        try {
//            Connection conn = DBConnect.openConnection();
//            if (conn != null) {
//                System.out.println("Ket noi thanh cong");
//            } else {
//                System.out.println("Ket noi that bai");
//            }
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("select* from SinhVien");
//            System.out.println("Danh sach sinh vien");
//            System.out.println("maSV      tenSV  lop  matkhau");
//            while (rs.next()) {                
//                System.out.println(rs.getString(1)+ "  "+ rs.getString(2)+ "  "+ rs.getString(3)+ "  "+ rs.getString(4));
//            }
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
