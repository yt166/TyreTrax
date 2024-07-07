package bo.custom;

import bo.SuperBo;
import dto.ItemDto;
import dto.SystemUsersDto;

import java.sql.SQLException;
import java.util.List;

public interface SystemUserBo extends SuperBo {
    boolean saveSystemUser(SystemUsersDto dto) throws SQLException, ClassNotFoundException;
    boolean updateSystemUser(SystemUsersDto dto) throws SQLException, ClassNotFoundException;
    boolean deleteSystemUser(String id) throws SQLException, ClassNotFoundException;
    List<SystemUsersDto> allSystemUsers() throws SQLException, ClassNotFoundException;
    String systemUserId();
}
