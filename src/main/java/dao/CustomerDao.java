package dao;

import dto.CustomerDto;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {

    boolean SaveCustomer(Customer customer) throws SQLException, ClassNotFoundException;
    boolean UpdateCustomer(Customer customer);
    boolean DeleteCustomer(Customer customer);
    List<CustomerDto> allCustomers(Customer customer);

}
