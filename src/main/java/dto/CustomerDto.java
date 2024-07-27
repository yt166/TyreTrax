package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private String customer_id;
    private String name;
    private String contact;
    private String email;
    private String address;
    private String type;
    private double credit_limit;
    private String credit_period;
}
