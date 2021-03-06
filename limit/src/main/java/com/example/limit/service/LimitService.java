package com.example.limit.service;

import com.example.limit.model.LimitModel;
import com.example.limit.repository.LimitRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LimitService {

    @Autowired
    private LimitRepository repository;

    public LimitModel getLimitDetails(int accountId){
        return repository.getLimitDetails(accountId);

    }
}
