package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class InvoiceDetails {
    private int seq;
    private int invoId;
    private String itemId;
    private int qty;
    private double itemPrice;
    private String invoiceMaster;
    private String itemCode;
}
