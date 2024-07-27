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
    private String InvoNumber;
    private  String CustomerName;
    private Date InvoDate;
    private String InvoComment;
    private double GrossAmount;
    private int Vat;
    private double NETAmount;
}
