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
    private String stockId;
    private String item_Code;
    private Date date;
    private double purchase_unit_price;
}
