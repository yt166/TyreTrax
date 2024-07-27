package bo.custom;

import bo.SuperBo;
import dto.ItemDto;
import dto.SystemUserDto;

import java.sql.SQLException;
import java.util.List;

public interface SystemUserBo extends SuperBo {
    boolean saveSystemUser(SystemUserDto dto) throws SQLException, ClassNotFoundException;
    boolean updateSystemUser(SystemUserDto dto) throws SQLException, ClassNotFoundException;
    boolean deleteSystemUser(String id) throws SQLException, ClassNotFoundException;
    List<SystemUserDto> allSystemUsers() throws SQLException, ClassNotFoundException;
    String systemUserId();
}
