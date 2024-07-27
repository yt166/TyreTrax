package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class SystemUser {
    private String UserId ;
    private String UserName ;
    private String Password ;
    private String Email ;
    private String JobRole ;
    private Date LastLoginDate ;
}
