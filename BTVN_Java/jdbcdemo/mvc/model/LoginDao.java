package BTVN_Java.jdbcdemo.mvc.model;

import BTVN_Java.jdbcdemo.mvc.entity.Users;

import java.sql.SQLException;

public interface LoginDao {
    public String checkLoginStatement(Users users) throws SQLException, ClassNotFoundException;
    public String checkLoginPreparedStatement(Users users) throws SQLException, ClassNotFoundException;

}
