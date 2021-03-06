package com.example.payment.repository;

import com.example.payment.model.PaymentRequest;
import com.example.payment.model.PaymentResponse;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    public PaymentResponse startPayment( PaymentRequest request){
        PaymentResponse response =
                new PaymentResponse(request.getPaymentId(),request.getFromAccountNo(),request.getToAccountNo(),
                        request.getAmount(),"Success");

        return response;

    }
}
