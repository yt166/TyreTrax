package bo.custom;

import bo.SuperBo;
import dto.ItemDto;
import dto.StockDto;

import java.sql.SQLException;
import java.util.List;

public interface StockBo extends SuperBo {
    boolean saveStock(StockDto dto) throws SQLException, ClassNotFoundException;
    boolean updateStock(StockDto dto) throws SQLException, ClassNotFoundException;
    boolean deleteStock(String id) throws SQLException, ClassNotFoundException;
    List<StockDto> allStocks() throws SQLException, ClassNotFoundException;
    String stocID();
}
