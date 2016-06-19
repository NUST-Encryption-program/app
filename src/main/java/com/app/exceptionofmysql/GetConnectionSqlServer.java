package com.app.exceptionofmysql;  
  
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
  
public class GetConnectionSqlServer {  
    public void getConnectionSqlServer() {  
  
        String driverName = "com.mysql.jdbc.Driver";  
        String dbURL = "jdbc:mysql://localhost:3306/easycmsdb?useUnicode=true&amp;characterEncoding=utf-8"; // 1433是端口，"USCSecondhandMarketDB"是数据库名称  
        String userName = "root"; // 用户名  
        String userPwd = "Huawei123"; // 密码  
  
        Connection dbConn = null;  
        try {  
  
            Class.forName(driverName).newInstance();  
        } catch (Exception ex) {  
            System.out.println("驱动加载失败");  
            System.out.println(ex.getStackTrace());
        	System.out.println(ex.getMessage());
        }  
        try {  
            dbConn = DriverManager.getConnection(dbURL, userName, userPwd);  
            System.out.println("成功连接数据库！");  
        } catch (Exception e) {
        	System.out.println("连接数据库失败！"); 
        	System.out.println(e.getStackTrace());
        	System.out.println(e.getMessage());
        } finally {  
  
            try {  
                if (dbConn != null)  
                    dbConn.close();  
            } catch (SQLException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
    }  
  
    public static void main(String[] args) {  
        GetConnectionSqlServer getConn = new GetConnectionSqlServer();  
        getConn.getConnectionSqlServer();  
  
    }  
}  