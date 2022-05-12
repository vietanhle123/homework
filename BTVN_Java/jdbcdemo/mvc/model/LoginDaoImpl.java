package BTVN_Java.jdbcdemo.mvc.model;

import BTVN_Java.jdbcdemo.SQLServerConnection;
import BTVN_Java.jdbcdemo.mvc.entity.Users;

import java.sql.*;



public class LoginDaoImpl implements LoginDao {
    @Override
    public String checkLoginStatement(Users users) throws SQLException, ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select username from users where username ='"+users.getUserName()+"' " +
                "and password='"+users.getPassword()+"' ";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()){
            System.out.println("Login thanh cong: "+resultSet.getString("username"));
            return users.getUserName();
        }
        return "fail";
    }

    @Override
    public  String checkLoginPreparedStatement(Users users) throws SQLException, ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query ="select username from users where username = ? and password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,users.getUserName());
        preparedStatement.setString(2,users.getPassword());

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("Login thanh cong: "+resultSet.getString("username"));
            return users.getUserName();
        }
        return "fail";
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Users users = new Users();
        users.setUserName("admin");
        users.setPassword("admin");

        LoginDaoImpl loginDao = new LoginDaoImpl();
        String message =  loginDao.checkLoginPreparedStatement(users);
        System.out.println(message);


    }
}
