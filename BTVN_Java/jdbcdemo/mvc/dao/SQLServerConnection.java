package BTVN_Java.jdbcdemo.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection {

    public static Connection getSQLServerConnection() throws ClassNotFoundException, SQLException {
        String hostName ="localhost";
        String databaseName ="DBTest";
        String instanceName ="DESKTOP-LNLLKG4\\SQLEXPRESS02";
        String userName ="sa";
        String password ="sa";

        return getSQLServerConnection(hostName,instanceName,databaseName,userName,password);
    }
    public static Connection getSQLServerConnection(String hostName,
                                                    String instanceName,
                                                    String databaseName,
                                                    String userName,
                                                    String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString = "jdbc:sqlserver://"+hostName+":1433;instance =" +
                ""+instanceName+";databaseName ="+databaseName;

        Connection connection = DriverManager.getConnection(connectionString,userName,password);
        return connection;
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = getSQLServerConnection();
        if(connection!=null)
        {
            System.out.println("Ket noi thanh cong");
        }
    }
}
