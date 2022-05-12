package BTVN_Java.jdbcdemo;

import  java.sql.Connection;
import  java.sql.SQLException;

public class AppConnectionExample {
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        return SQLServerConnection.getSQLServerConnection();
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection conn = AppConnectionExample.getConnection();
        if(conn!=null)
        {
            System.out.println("Ket noi database thanh cong");
        }

    }
}
