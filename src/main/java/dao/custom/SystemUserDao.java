package dao.custom;

import dto.CustomerDto;
import entity.SystemUsers;

import java.sql.SQLException;
import java.util.List;

public interface SystemUserDao {
    boolean saveSystemUser(SystemUsers systemUsers) throws SQLException, ClassNotFoundException;
    boolean updateSystemUser(SystemUsers systemUsers) throws SQLException, ClassNotFoundException;
    boolean deleteSystemUser(String id) throws SQLException, ClassNotFoundException;
    List<CustomerDto> allSystemUser();
}
