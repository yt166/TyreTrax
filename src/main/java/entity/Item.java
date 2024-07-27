package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Item {
    private String ItemCode ;
    private String Name ;
    private  String Category ;
    private String Company ;
    private int Qty ;
    private Date ExpiredDate ;
    private double SellingUnitPrice ;
}
