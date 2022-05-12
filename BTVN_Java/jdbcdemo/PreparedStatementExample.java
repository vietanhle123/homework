package BTVN_Java.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //int var1 = 1;//user input from UI.
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select * from employee where empid = ? or name like ?";

        //Tao PreparedStatement
        //Tang bao mat cho CSDL
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,3);
        preparedStatement.setString(2,"Trong");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println("-------------------");
            System.out.println("Emp id: "+resultSet.getInt(1));
            System.out.println("Emp no: "+resultSet.getString("empno"));
            System.out.println("Emp name: "+resultSet.getString("name"));
        }
        connection.close();

    }
}
