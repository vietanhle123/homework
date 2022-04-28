package BTVN_Java.jdbcpracticaltest;

import BTVN_Java.jdbcpracticaltest.model.CustomerDao;
import BTVN_Java.jdbcpracticaltest.view.CustomerConsole;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {;
        CustomerConsole customerConsole = new CustomerConsole();
        customerConsole.start();
    }

}
