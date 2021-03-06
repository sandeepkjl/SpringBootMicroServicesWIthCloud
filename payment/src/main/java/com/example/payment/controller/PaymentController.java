package com.example.payment.controller;


import com.example.payment.model.PaymentRequest;
import com.example.payment.model.PaymentResponse;
import com.example.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService service;

    @RequestMapping(value = "getPaymentDetail", method = RequestMethod.POST)
    public ResponseEntity<PaymentResponse> doPayment(@RequestBody PaymentRequest request){
        return new ResponseEntity<>(service.initiatePayment(request), HttpStatus.OK);
    }
}
