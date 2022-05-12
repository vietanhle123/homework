package BTVN_Java.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataExample {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = AppConnectionExample.getConnection();

        //Tao doi tuong statement
        Statement statement = connection.createStatement();

        //Tao ResultSet chua ket qua tra ve tu Table trong CSDL
        ResultSet resultSet = statement.executeQuery("select * from employee");

        while (resultSet.next()){
            int eId = resultSet.getInt(1);
            String empNo = resultSet.getString(2);
            String empName = resultSet.getString("name");

            System.out.println("=======================");
            System.out.println("Employee id: "+eId);
            System.out.println("Employee No: "+empNo);
            System.out.println("Employee name: "+empName);
        }
        connection.close();//Dong ket noi voi database
    }


}
