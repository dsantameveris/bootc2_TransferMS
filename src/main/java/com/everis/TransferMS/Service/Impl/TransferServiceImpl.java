package com.everis.TransferMS.Service.Impl;

import com.everis.TransferMS.DTO.Movement.MoneyOperationDTO;
import com.everis.TransferMS.Model.Movement;
import com.everis.TransferMS.Repository.MovementRepo;
import com.everis.TransferMS.Service.TransferService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class TransferServiceImpl implements TransferService {

    @Autowired
    private MovementRepo repo;

    @Override
    public Mono<Movement> SaveAccountDeposit(MoneyOperationDTO deposit) 
    {
        return WebClient.create("http://localhost:8013/savingacc")
                        .put()
                        .uri("/deposit")
                        .bodyValue(deposit)
                        .retrieve()
                        .bodyToMono(MoneyOperationDTO.class)
                        .flatMap(op -> 
                        {
                            return repo.save(new Movement(op.getOperation(), op.getMoneyOrigin(), op.getMoneyDestination(), op.getCurrency(), op.getAmount()));
                        });               
    }

    @Override
    public Mono<Movement> CheckAccountDeposit(MoneyOperationDTO deposit) 
    {
        return WebClient.create("http://localhost:8014/checkgacc")
                        .put()
                        .uri("/deposit")
                        .bodyValue(deposit)
                        .retrieve()
                        .bodyToMono(MoneyOperationDTO.class)
                        .flatMap(op -> 
                        {
                            return repo.save(new Movement(op.getOperation(), op.getMoneyOrigin(), op.getMoneyDestination(), op.getCurrency(), op.getAmount()));
                        });               
    }

    @Override
    public Mono<Movement> AccountSaveSaveTransfer(MoneyOperationDTO deposit) 
    {
        return null;
    }

    @Override
    public Mono<Movement> Payment(MoneyOperationDTO deposit) {
        return null;
    }

}