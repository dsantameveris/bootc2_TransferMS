package com.everis.TransferMS.Service;

import com.everis.TransferMS.Model.MoveDeposit;

import reactor.core.publisher.Mono;

public interface TransferService
{
    //
    public Mono<MoveDeposit> AccountDeposit();
}