package dao.custom.impl;

import dao.custom.SystemUserDao;
import db.DBConnection;
import dto.CustomerDto;
import entity.SystemUsers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SystemUserDaoImpl implements SystemUserDao {
    @Override
    public boolean saveSystemUser(SystemUsers systemUsers) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO SystemUsers VALUES (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);

        preparedStatement.setString(1, systemUsers.getUser_id());
        preparedStatement.setString(2, systemUsers.getUser_name());
        preparedStatement.setString(3,systemUsers.getPassword());
        preparedStatement.setString(4,systemUsers.getEmail());
        preparedStatement.setString(5, systemUsers.getJob_role());
        preparedStatement.setDate(6, (Date) systemUsers.getLast_login_date());

        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean updateSystemUser(SystemUsers systemUsers) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE SystemUsers SET user_name = ?, password = ?, email=?, job_role=?, last_login_date=? WHERE user_id=?";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);

        preparedStatement.setString(1, systemUsers.getUser_name());
        preparedStatement.setString(2,systemUsers.getPassword());
        preparedStatement.setString(3,systemUsers.getEmail());
        preparedStatement.setString(4, systemUsers.getJob_role());
        preparedStatement.setDate(5, (Date) systemUsers.getLast_login_date());
        preparedStatement.setString(6, systemUsers.getUser_id());

        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean deleteSystemUser(String id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM SystemUsers WHERE user_id = ?";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1,id);
        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public List<CustomerDto> allSystemUser() {
        return null;
    }
}
