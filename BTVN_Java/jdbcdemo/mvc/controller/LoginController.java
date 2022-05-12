package BTVN_Java.jdbcdemo.mvc.controller;

import BTVN_Java.jdbcdemo.mvc.entity.Users;
import BTVN_Java.jdbcdemo.mvc.model.LoginDaoImpl;



import java.sql.SQLException;

public class LoginController {

    //Step 2. Call instance of model
    LoginDaoImpl loginDao = new LoginDaoImpl();

    public String loginStatementController(Users users) throws SQLException, ClassNotFoundException {
        //Step 2
        return loginDao.checkLoginStatement(users);
    }

    public String loginPreparedStatementController(Users users) throws SQLException, ClassNotFoundException {
        return loginDao.checkLoginPreparedStatement(users);
    }


}
