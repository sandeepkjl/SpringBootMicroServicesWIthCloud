package com.example.payment.service;

import com.example.payment.exception.LimitException;
import com.example.payment.fiegnClient.LimitInterface;
import com.example.payment.model.LimitModel;
import com.example.payment.model.PaymentRequest;
import com.example.payment.model.PaymentResponse;
import com.example.payment.repository.PaymentRepository;
import com.example.payment.util.LimitUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {


    @Autowired
    private PaymentRepository repository;
    @Autowired
    private LimitUtil limitUtil;

    @Autowired
    LoadBalancerClient client; // Used to get the server instance according to availability

    @Autowired
    LimitInterface limitInterface;

    public PaymentResponse initiatePayment(PaymentRequest request) {
        /*Here we are calling limit service by normal Rest Client
         * We have Defined REst Template Bean  in Configuration package please see that class for more details
         * */

        //LimitModel limit =limtUtil.checkLimit1(request.getPaymentId());


        /*Here we are calling limit service by  Rest Client and that Rest Client we have been created by RestTemplateBuilder
         * We have Defined Bean Config in Configuration package please see that class for more details
         * */

        //LimitModel limit = limitUtil.checkLimit2(request.getPaymentId());

        /* Here we are calling limit service by feign client,
        for more information please see limit interface implementation for feign implementation.
         */

        ResponseEntity<LimitModel> limitResponse = limitInterface.getLimitByAccountId(request.getPaymentId());
        LimitModel limit=limitResponse.getBody();


        System.out.println(limit.getMaxValue());
        System.out.println(limit.getMinValue());


        if (limit.getMinValue() > request.getAmount() || limit.getMaxValue() < request.getAmount()) {
            /*we are throwing limit Exception here, we created Limit Exception and
             * Controller Advice class to throw limit Exception, please check ExceptionController Class to see how
             * @Controller advice has been implemented*/
            throw new LimitException("Either Min Or Max Limit Issue");
        }
        return repository.startPayment(request);
    }


}
