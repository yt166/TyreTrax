package dao.custom;

import dto.CustomerDto;
import entity.SystemUser;

import java.sql.SQLException;
import java.util.List;

public interface SystemUserDao {
    boolean saveSystemUser(SystemUser systemUsers) throws SQLException, ClassNotFoundException;
    boolean updateSystemUser(SystemUser systemUsers) throws SQLException, ClassNotFoundException;
    boolean deleteSystemUser(String id) throws SQLException, ClassNotFoundException;
    List<CustomerDto> allSystemUser();
}
