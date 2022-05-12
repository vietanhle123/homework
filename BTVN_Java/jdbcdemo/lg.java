package BTVN_Java.jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class lg {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        checkLoginStatement("'' or 1=1--'","'admin'");
        checkLoginPreparedStatement("'or 1=1--","admin");

    }
    public static void checkLoginStatement(String username, String password) throws SQLException, ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select * from users where username ="+username+" and password ="+password+"";

        Statement statement = connection.createStatement();
        ResultSet resultSet =  statement.executeQuery(query);
        while (resultSet.next()){
            System.out.println("Login thanh cong");
        }

    }
    public static void checkLoginPreparedStatement(String username, String password) throws SQLException, ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select * from users where username =? and password =?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet!=null) {
            System.out.println("Login prepare thanh cong");
        }

    }
}
