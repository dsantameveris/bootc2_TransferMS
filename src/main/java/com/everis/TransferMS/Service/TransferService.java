package com.everis.TransferMS.Service;

import com.everis.TransferMS.DTO.Movement.MoneyOperationDTO;
import com.everis.TransferMS.Model.Movement;

import reactor.core.publisher.Mono;

public interface TransferService
{
    //Save Account Deposit
    public Mono<Movement> SaveAccountDeposit(MoneyOperationDTO deposit);

    //Check Account Deposit
    public Mono<Movement> CheckAccountDeposit(MoneyOperationDTO deposit);

    //Account Transfer
    public Mono<Movement> AccountSaveSaveTransfer(MoneyOperationDTO deposit);

    //Payment
    public Mono<Movement> Payment(MoneyOperationDTO deposit);
}