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
    private String stockId;
    private String item_Code;
    private Date date;
    private double purchase_unit_price;
}
