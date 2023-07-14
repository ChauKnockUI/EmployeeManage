/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;


/**
 *
 * @author ADMIN
 */
public class clsConnectDB {
     
        String connectionUrl = "jdbc:sqlserver://LAPTOP-4J8B3FBI\\SQLEXPRESS:1433;database=QuanLyNhanVien;;encrypt=true;trustServerCertificate=true;";
        String username= "sa";
        String password= "sa";
               
        Connection conn;
     //cua cai tren:    Statement stmt= conn.createStatement();
  //  String connectionString = "jdbc:sqlserver://LAPTOP-4J8B3FBI\\SQLEXPRESS:1433;" 
   //         + "databaseName=QuanLyNhanVien;user=sa;password=sa;";
   // Connection conn;
    public clsConnectDB(){
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn= DriverManager.getConnection(connectionUrl, username, password);
            
            if(conn != null){
                System.out.println("Kết nối CSDL SQL Server thành công!");
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    //Thực thi câu lệnh SELECT
    public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL){
        try {
            Statement stmt = conn.createStatement();           
            ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
            
        return null;
    }
    //Thực thi INSERT, DELETE, UPDATE
    public void ExcuteQueryUpdateDB(String cauTruyVanSQL){
       
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
