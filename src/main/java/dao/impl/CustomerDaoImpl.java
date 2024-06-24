package dao.impl;

import dao.CustomerDao;
import db.DBConnection;
import dto.CustomerDto;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public boolean SaveCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String sql ="INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.GetInstance().GetConnection().prepareStatement(sql);

        preparedStatement.setString(1, customer.getCustomer_id());
        return false;
    }

    @Override
    public boolean UpdateCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean DeleteCustomer(Customer customer) {
        return false;
    }

    @Override
    public List<CustomerDto> allCustomers(Customer customer) {
        return null;
    }
}
