package com.everis.TransferMS.Controller;

import com.everis.TransferMS.DTO.Movement.MoneyOperationDTO;
import com.everis.TransferMS.Model.Movement;
import com.everis.TransferMS.Service.Impl.TransferServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transfer")
public class TransferController
{

    @Autowired
    private TransferServiceImpl service;

    //Save Account Deposit
    @PostMapping("/savedeposit/")
    public Mono<Movement> SaveAccountDeposit(@RequestBody MoneyOperationDTO deposit)
    {
        return service.SaveAccountDeposit(deposit);
    }

    //Deposit
    @PostMapping("/checkdeposit/")
    public Mono<Movement> CheckAccountDeposit(@RequestBody MoneyOperationDTO deposit)
    {
        return service.CheckAccountDeposit(deposit);
    }

    //Account Transfer
    @PostMapping("/atransfer/")
    public Mono<Movement> AccountTransfer(@RequestBody MoneyOperationDTO transfer)
    {
        return null;
    }

    //Payment
    @PostMapping("/payment/")
    public Mono<Movement> CreditPayment(@RequestBody MoneyOperationDTO payment)
    {
        return null;
    }
}