package dao.impl;

import dao.CustomerDao;
import db.DBConnection;
import dto.CustomerDto;
import entity.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public boolean SaveCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String sql ="INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.GetInstance().GetConnection().prepareStatement(sql);

        preparedStatement.setString(1, customer.getCustomer_id());
        preparedStatement.setString(2, customer.getName());
        preparedStatement.setString(3, customer.getContact());
        preparedStatement.setString(4, customer.getEmail());
        preparedStatement.setString(5, customer.getAddress());
        preparedStatement.setString(6, customer.getType());
        preparedStatement.setDouble(7,customer.getCredit_limit());
        preparedStatement.setString(8, customer.getCredit_period());

        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean UpdateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String sql ="UPDATE Customer SET name=? , contact = ?, email = ?, address = ?, type = ?, credit_limit = ?, credit_period = ? WHERE customer_id=?";
        PreparedStatement preparedStatement = DBConnection.GetInstance().GetConnection().prepareStatement(sql);

        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getContact());
        preparedStatement.setString(3, customer.getEmail());
        preparedStatement.setString(4, customer.getAddress());
        preparedStatement.setString(5, customer.getType());
        preparedStatement.setDouble(6,customer.getCredit_limit());
        preparedStatement.setString(7, customer.getCredit_period());
        preparedStatement.setString(8, customer.getCustomer_id());

        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean DeleteCustomer(String id) throws SQLException, ClassNotFoundException {
        String sql ="DELETE FROM Customer WHERE id=?";
        PreparedStatement preparedStatement = DBConnection.GetInstance().GetConnection().prepareStatement(sql);

        preparedStatement.setString(1,id);

        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public List<CustomerDto> allCustomers(Customer customer) {
        return null;
    }

}
