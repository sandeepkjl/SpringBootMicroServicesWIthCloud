package com.example.limit.controller;

import com.example.limit.model.LimitModel;
import com.example.limit.service.LimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private LimitService service;


    @GetMapping("/getLimit/{accountId}")
    public ResponseEntity<LimitModel> getLimitByAccountId(@PathVariable("accountId") int accountId){
        return new ResponseEntity<>(service.getLimitDetails(accountId), HttpStatus.OK);
    }
}
