package dao;

import dto.CustomerDto;

import java.util.List;

public interface CustomerDao {

    boolean SaveCustomer();
    boolean UpdateCustomer();
    boolean DeleteCustomer();
    List<CustomerDto> allCustomers();

}
