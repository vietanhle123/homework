package BTVN_Java.jdbcdemo;

import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class SQLServerConnection {

    public static Connection getSQLServerConnection() throws SQLException, ClassNotFoundException{
        String hostName ="localhost";
        String serverName ="LAPTOP-29LK1C06\\SQLEXPRESS";
        String database ="DbTest";
        String userName ="sa";
        String password="sa";
        Connection conn = getSQLServerConnection(hostName,serverName,database,userName,password);
        return conn;
    }
    public static Connection getSQLServerConnection(String hostName,String serverName,
                                                    String database,String userName,
                                                    String password )
            throws SQLException, ClassNotFoundException{

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString = "jdbc:sqlserver://" +hostName + ":1433" +
                ";instance=" +serverName +";databaseName = "+database;
        Connection connection = DriverManager.getConnection(connectionString,userName,password);
        return  connection;

    }


}
