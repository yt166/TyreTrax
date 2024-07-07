package bo.custom.impl;

import bo.custom.CustomerBo;
import dao.DaoFactory;
import dao.custom.CustomerDao;
import dao.util.DaoType;
import dto.CustomerDto;
import entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerBoImpl implements CustomerBo {

    CustomerDao customerDao = DaoFactory.getInstance().getDao(DaoType.CUSTOMER);
    @Override
    public boolean saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException {
        return customerDao.saveCustomer(new Customer(
                dto.getCustomer_id(),
                dto.getName(),
                dto.getContact(),
                dto.getEmail(),
                dto.getAddress(),
                dto.getType(),
                dto.getCredit_limit(),
                dto.getCredit_period()
        ));
    }

    @Override
    public boolean updateCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException {
        return customerDao.saveCustomer(new Customer(
                dto.getCustomer_id(),
                dto.getName(),
                dto.getContact(),
                dto.getEmail(),
                dto.getAddress(),
                dto.getType(),
                dto.getCredit_limit(),
                dto.getCredit_period()
        ));
    }

    @Override
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDao.deleteCustomer(id);
    }

    @Override
    public List<CustomerDto> allCustomer() throws SQLException, ClassNotFoundException {
       List<Customer> entityList = customerDao.allCustomers();
        List<CustomerDto> dtoList =new ArrayList<>();
        for (Customer customer: entityList
             ) {
            dtoList.add(new CustomerDto(
                    customer.getCustomer_id(),
                    customer.getName(),
                    customer.getContact(),
                    customer.getEmail(),
                    customer.getAddress(),
                    customer.getType(),
                    customer.getCredit_limit(),
                    customer.getCredit_period()
            ));
        }
        return dtoList;
    }

    @Override
    public String customerID() {
        return null;
    }
}
