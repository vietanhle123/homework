package BTVN_Java.jdbcdemo.mvc;

import BTVN_Java.jdbcdemo.mvc.view.LoginConsole;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Start application
        LoginConsole loginConsole = new LoginConsole();
        loginConsole.start();
    }
}
