package bo.custom.impl;

import bo.custom.ItemBo;
import dao.DaoFactory;
import dao.custom.ItemDao;
import dao.util.DaoType;
import dto.ItemDto;
import entity.Item;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemBoImpl implements ItemBo {
    ItemDao itemDao = DaoFactory.getInstance().getDao(DaoType.ITEM);
    @Override
    public boolean saveItem(ItemDto dto) throws SQLException, ClassNotFoundException {
        return itemDao.saveItem(new Item(
                dto.getItem_code(),
                dto.getName(),
                dto.getCategory(),
                dto.getCompany(),
                dto.getQty(),
                dto.getExp_date(),
                dto.getSelling_unit_price()
        ));
    }

    @Override
    public boolean updateItem(ItemDto dto) throws SQLException, ClassNotFoundException {
        return itemDao.updateItem(new Item(
                dto.getItem_code(),
                dto.getName(),
                dto.getCategory(),
                dto.getCompany(),
                dto.getQty(),
                dto.getExp_date(),
                dto.getSelling_unit_price()
        ));
    }

    @Override
    public boolean deleteItem(String id) throws SQLException, ClassNotFoundException {
        return itemDao.deleteItem(id);
    }

    @Override
    public List<ItemDto> allItems() throws SQLException, ClassNotFoundException {
        List<Item> entityList = itemDao.allItem();
        List<ItemDto> dtoList = new ArrayList<>();

        for (Item item:entityList) {
           dtoList.add(new ItemDto(
                   item.getItem_code(),
                   item.getName(),
                   item.getCategory(),
                   item.getCompany(),
                   item.getQty(),
                   item.getExp_date(),
                   item.getSelling_unit_price()
           ));
        }
        return dtoList;
    }

    @Override
    public String itemID() {
        return null;
    }
}
