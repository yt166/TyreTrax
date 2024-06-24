package dao;

import dto.CustomerDto;

import java.util.List;

public interface SystemUserDao {
    boolean SaveSystemUser();
    boolean UpdateSystemUser();
    boolean DeleteSystemUser();
    List<CustomerDto> allSystemUser();
}
