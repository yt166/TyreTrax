package dao.impl;

import dao.ItemDao;
import db.DBConnection;
import dto.CustomerDto;
import entity.Item;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ItemDaoImpl implements ItemDao {

    @Override
    public boolean saveItem(Item item) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO Item VALUES (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement= DBConnection.getInstance().getConnection().prepareStatement(sql);

        preparedStatement.setString(1, item.getItem_code());
        preparedStatement.setString(2, item.getName());
        preparedStatement.setString(3, item.getCategory());
        preparedStatement.setString(4, item.getCompany());
        preparedStatement.setInt(5,item.getQty());
        preparedStatement.setDate(6, (Date) item.getExp_date());
        preparedStatement.setDouble(7,item.getSelling_unit_price());

        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean updateItem(Item item) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE Customer SET name=?, category=?, company=?, qty=?, exp_date=?, selling_unit_price=? WHERE item_code=?";
        PreparedStatement preparedStatement= DBConnection.getInstance().getConnection().prepareStatement(sql);

        preparedStatement.setString(1, item.getName());
        preparedStatement.setString(2, item.getCategory());
        preparedStatement.setString(3, item.getCompany());
        preparedStatement.setInt(4,item.getQty());
        preparedStatement.setDate(5, (Date) item.getExp_date());
        preparedStatement.setDouble(6,item.getSelling_unit_price());
        preparedStatement.setString(7, item.getItem_code());

        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean deleteItem(String id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM Customer WHERE item_code=?";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);

        preparedStatement.setString(1,id);
        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public List<CustomerDto> allItem() {
        return null;
    }
}
