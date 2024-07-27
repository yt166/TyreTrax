package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    private String ItemCode ;
    private String Name ;
    private  String Category ;
    private String Company ;
    private int Qty ;
    private Date ExpiredDate ;
    private double SellingUnitPrice ;
}
