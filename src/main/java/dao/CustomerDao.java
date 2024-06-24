package dao;

import dto.CustomerDto;
import entity.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {

    boolean saveCustomer(Customer customer) throws SQLException, ClassNotFoundException;
    boolean updateCustomer(Customer customer) throws SQLException, ClassNotFoundException;
    boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
    List<CustomerDto> allCustomers(Customer customer);

}
