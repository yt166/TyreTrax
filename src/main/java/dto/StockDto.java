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
public class StockDto {
    private String StockId ;
    private String ItemCode ;
    private Date Date ;
    private double PurchasePrice ;
}
