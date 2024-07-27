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
    private String CustomerId ;
    private String Name ;
    private String Contact ;
    private String Email ;
    private String Address ;
    private String Type ;
    private double CreditLimit ;
    private String CreditPeriod ;
}
