package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class InvoiceDetailsDto {
    private int seq;
    private int invoId;
    private String itemId;
    private int qty;
    private double itemPrice;
    private String invoiceMaster;
    private String itemCode;
}
