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
    private String item_code;
    private String name;
    private  String category;
    private String company;
    private int qty;
    private Date exp_date;
    private double selling_unit_price;
}
