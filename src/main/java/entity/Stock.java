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
public class Stock {
    private String StockId ;
    private String ItemCode ;
    private Date Date ;
    private double PurchasePrice ;
}
