package BTVN_Java.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetScrollableExample {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection  connection = SQLServerConnection.getSQLServerConnection();

        //Tao dt Statement
        Statement statement = connection.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE
                , ResultSet.CONCUR_READ_ONLY);

        //Tao cau lenh truy van voi CSDL(SQL engine)
        // String query = " select * from employee where empid=1 or name like 'Tung'";
        String query ="select * from employee";

        ResultSet resultSet = statement.executeQuery(query);

        boolean first = resultSet.first();
        System.out.println(first);
        if(first){
            System.out.println("Emp id: "+resultSet.getInt(1));
            System.out.println("Emp No: "+resultSet.getString(2));
            System.out.println("Emp name: "+resultSet.getString(3));

        }

        boolean last =  resultSet.last();
        System.out.println(last);
        if(last){
            System.out.println("Emp id: "+resultSet.getInt(1));
            System.out.println("Emp No: "+resultSet.getString(2));
            System.out.println("Emp name: "+resultSet.getString(3));
        }

        boolean pre = resultSet.previous();
        System.out.println("Read previous: "+pre);
        if(pre){
            System.out.println("Emp id: "+resultSet.getInt(1));
            System.out.println("Emp No: "+resultSet.getString(2));
            System.out.println("Emp name: "+resultSet.getString(3));

        }

        connection.close();
    }


}
