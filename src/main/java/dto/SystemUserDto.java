package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SystemUserDto {
    private String UserId ;
    private String UserName ;
    private String Password ;
    private String Email ;
    private String JobRole ;
    private Date LastLoginDate ;
}
