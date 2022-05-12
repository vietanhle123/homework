package BTVN_Java.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException{
        String hostName ="localhost";
        String databaseName ="productmanagement";
        String userName = "root";
        String password ="";
        return getMySQLConnection(hostName,databaseName,userName,password);
    }
    public static Connection getMySQLConnection(String hostName, String databaseName,
                                                String userName, String password) throws SQLException, ClassNotFoundException
    {
        //Load driver cho chuong trinh
        Class.forName("com.mysql.cj.jdbc.Driver");

        String connectionString = "jdbc:mysql://" +hostName +":3306/" +databaseName;
        Connection connection = DriverManager.getConnection(connectionString,userName,password);
        return connection;
    }


}
