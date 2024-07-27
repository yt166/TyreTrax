package dao;

import bo.custom.impl.ItemBoImpl;
import dao.custom.CustomerDao;
import dao.custom.impl.*;
import dao.util.DaoType;

public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){}
    public static DaoFactory getInstance(){
        return daoFactory != null ? daoFactory : (daoFactory = new DaoFactory());
    }
    public <T extends SuperDao>T getDao(DaoType daoType){
        switch (daoType){
            case CUSTOMER: return (T) new CustomerDaoImpl();
            case ITEM: return (T) new ItemBoImpl();
            case STOCK: return (T) new StockDaoImpl();
            case SYSTEM_USER: return (T) new SystemUserDaoImpl();
            case INVOICEDETAILS: return (T) new INVOICEDETAILSDaoImpl();
            case INVOICEMASTER : return (T) new INVOICEMasterDaoImpl();
        }
        return null;
    }
}
