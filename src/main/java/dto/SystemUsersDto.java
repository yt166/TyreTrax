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
public class SystemUsersDto {
    private String user_id;
    private String user_name;
    private String password;
    private String email;
    private String job_role;
    private Date last_login_date;
}
