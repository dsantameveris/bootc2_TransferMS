package com.everis.TransferMS.Repository;

import com.everis.TransferMS.Model.Movement;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovementRepo extends ReactiveMongoRepository<Movement, String>
{
    
}