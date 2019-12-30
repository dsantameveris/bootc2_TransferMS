package com.everis.TransferMS.Model;

import java.sql.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "movements")
public class Movement
{
    @Id
    private String id;

    @NotBlank
    private String moneySource;

    @NotBlank
    private String moneyDestination;

    @NotBlank
    private String movetype;

    @NotBlank
    private String currency;

    @NotBlank
    private double quantity;

    @NotBlank
    private Date doneAt;

    public Movement(String movetype, String moneysource, String moneydestiny, String currency, double qty)
    {
        this.movetype = movetype;
        this.moneySource = moneysource;
        this.moneyDestination = moneydestiny;
        this.currency = currency;
        this.quantity = qty;
    }
}