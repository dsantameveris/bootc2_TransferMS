package com.everis.TransferMS.Model;

import java.sql.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "movements")
public class MoveDeposit
{
    @Id
    private String id;

    @NotBlank
    private String destinationAccount;

    @NotBlank
    private String currency;

    @NotBlank
    private double quantity;

    @NotBlank
    private Date doneAt;
}