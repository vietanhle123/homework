package BTVN_Java.jdbcpracticaltest.model;


import java.sql.SQLException;
import java.util.ArrayList;

import BTVN_Java.jdbcpracticaltest.entity.Customer;

public interface CustomerDao {

    public void addNewCustomer(Customer customer) throws SQLException, ClassNotFoundException;

    public ArrayList<Customer> findCustomerByName(String name) throws ClassNotFoundException, SQLException;

    public ArrayList<Customer> showAllCustomers() throws ClassNotFoundException, SQLException;
}
