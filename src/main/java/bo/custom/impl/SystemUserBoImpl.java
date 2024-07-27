package bo.custom.impl;

import bo.custom.SystemUserBo;
import dto.SystemUserDto;

import java.sql.SQLException;
import java.util.List;

public class SystemUserBoImpl implements SystemUserBo {

    @Override
    public boolean saveSystemUser(SystemUserDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean updateSystemUser(SystemUserDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean deleteSystemUser(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public List<SystemUserDto> allSystemUsers() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String systemUserId() {
        return null;
    }
}
