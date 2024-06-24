package dao;

import dto.CustomerDto;
import entity.Item;

import java.sql.SQLException;
import java.util.List;

public interface ItemDao {

    boolean saveItem(Item item) throws SQLException, ClassNotFoundException;
    boolean updateItem(Item item) throws SQLException, ClassNotFoundException;
    boolean deleteItem(String id) throws SQLException, ClassNotFoundException;
    List<CustomerDto> allItem();
}
