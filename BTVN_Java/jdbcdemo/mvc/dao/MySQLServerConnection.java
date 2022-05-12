package BTVN_Java.jdbcdemo.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLServerConnection {
    public static Connection getMySQLServerConnection() throws ClassNotFoundException, SQLException {
        String hostName ="localhost";
        String databaseName="demodb";
        String userName ="root";
        String password ="";
        return getMySQLServerConnection(hostName,databaseName,userName,password);
    }
    public static Connection getMySQLServerConnection(String hostName,
                                                      String databaseName,
                                                      String userName,
                                                      String password) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://"+hostName+":3306/"+databaseName;
        Connection connection = DriverManager.getConnection(connectionString,userName,password);
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = getMySQLServerConnection();
        if(connection!=null){
            System.out.println("Ket noi thanh cong");
        }
    }
}
