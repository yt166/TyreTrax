package bo.custom.impl;

import bo.custom.SystemUserBo;
import dto.SystemUsersDto;

import java.sql.SQLException;
import java.util.List;

public class SystemUserBoImpl implements SystemUserBo {

    @Override
    public boolean saveSystemUser(SystemUsersDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean updateSystemUser(SystemUsersDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean deleteSystemUser(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public List<SystemUsersDto> allSystemUsers() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String systemUserId() {
        return null;
    }
}
