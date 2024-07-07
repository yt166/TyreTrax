package dao.custom;

import dto.CustomerDto;

import java.util.List;

public interface StockDao {
    boolean saveStock();
    boolean updateStock();
    boolean deleteStock();
    List<CustomerDto> allStock();
}
