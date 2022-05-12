package BTVN_Java.jdbcdemo;

import  java.sql.*;

public class PreparedStatementAndStatementExample {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        loginStatement("''or 1=1--''","'admin'");
        loginPreparedStatement("' or 1=1--'","admin");
    }
    public static void loginStatement(String username, String password) throws SQLException,
            ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        Statement statement = connection.createStatement();
        String query = "select username from users where username ="+username+"and password="+password+"";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            System.out.println("Login Statement thanh cong");
        }
    }
    public static void loginPreparedStatement(String username, String password) throws SQLException, ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();

        String query = "select username from users where username =? and password =?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("Login PreparedStatement thanh cong");
        }


    }
}
