package BTVN_Java.jdbcdemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataStatement {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        //Query in database
        String query = "insert into employee values(9,'F0009','Trong')";

        Statement statement = connection.createStatement();
        int row = statement.executeUpdate(query);
        System.out.println(row);


    }
}
