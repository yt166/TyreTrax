package dao;

import dto.CustomerDto;
import entity.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {

    boolean SaveCustomer(Customer customer) throws SQLException, ClassNotFoundException;
    boolean UpdateCustomer(Customer customer) throws SQLException, ClassNotFoundException;
    boolean DeleteCustomer(String id) throws SQLException, ClassNotFoundException;
    List<CustomerDto> allCustomers(Customer customer);

}
