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
    private int seq ;
    private int InvoId ;
    private String ItemId ;
    private int QTY ;
    private double ItemPrice ;
}
