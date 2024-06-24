package dao;

import dto.CustomerDto;

import java.util.List;

public interface StockDao {
    boolean SaveStock();
    boolean UpdateStock();
    boolean DeleteStock();
    List<CustomerDto> allStock();
}
