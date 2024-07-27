package bo.custom.impl;

import bo.custom.StockBo;
import dao.DaoFactory;
import dao.SuperDao;
import dao.custom.StockDao;
import dao.util.DaoType;
import dto.StockDto;

import java.sql.SQLException;
import java.util.List;

public class StockBoImpl implements StockBo {

    StockDao stockDao = DaoFactory.getInstance().getDao(DaoType.STOCK);

    @Override
    public boolean saveStock(StockDto dto) throws SQLException, ClassNotFoundException {
        return stockDao.saveStock();
    }

    @Override
    public boolean updateStock(StockDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean deleteStock(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public List<StockDto> allStocks() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String stocID() {
        return null;
    }
}
