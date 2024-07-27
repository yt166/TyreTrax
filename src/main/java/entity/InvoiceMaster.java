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
public class InvoiceMaster {
    private String invoNumber;
    private  String customerName;
    private Date invoDate;
    private String invoComment;
    private double grossAmount;
    private int vat;
    private double netAmount;
}
