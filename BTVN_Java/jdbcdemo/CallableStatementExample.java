package BTVN_Java.jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        //Cuc ky an toan
        String query = "{call getEmployee(?,?,?)}";//Kho co code cua SQL o day

        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.registerOutParameter(1,1);
        callableStatement.registerOutParameter(2, Types.VARCHAR);
        callableStatement.registerOutParameter(3, Types.VARCHAR);

        callableStatement.executeUpdate();

        int empId = callableStatement.getInt(1);
        String empNo = callableStatement.getString(2);
        String name = callableStatement.getString(3);

        System.out.println("Emp id: "+empId);
        System.out.println("Emp no: "+empNo);
        System.out.println("Emp name: "+name);


    }
}
