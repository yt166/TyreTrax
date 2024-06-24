package dao;

import dto.CustomerDto;

import java.util.List;

public interface ItemDao {

    boolean SaveItem();
    boolean UpdateItem();
    boolean DeleteItem();
    List<CustomerDto> allItem();
}
