package dao;

import dto.CustomerDto;
import entity.Item;

import java.sql.SQLException;
import java.util.List;

public interface ItemDao {

    boolean SaveItem(Item item) throws SQLException, ClassNotFoundException;
    boolean UpdateItem(Item item) throws SQLException, ClassNotFoundException;
    boolean DeleteItem(String id) throws SQLException, ClassNotFoundException;
    List<CustomerDto> allItem();
}
