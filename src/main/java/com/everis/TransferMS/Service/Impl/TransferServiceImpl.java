package com.everis.TransferMS.Service.Impl;

import com.everis.TransferMS.Model.MoveDeposit;
import com.everis.TransferMS.Service.TransferService;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class TransferServiceImpl implements TransferService {

    @Override
    public Mono<MoveDeposit> SaveAccountDeposit(String number, double qty) 
    {
        return WebClient.create("http://localhost:8013/savingacc/")
                        .get()
                        .retrieve()
                        .bodyToMono(SavingAccount.class)
                        .map;
    }
    
}