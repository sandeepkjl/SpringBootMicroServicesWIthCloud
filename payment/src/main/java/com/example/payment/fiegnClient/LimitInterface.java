package com.example.payment.fiegnClient;


import com.example.payment.model.LimitModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
we put service name in feign client annotation, and the corresponding service url will be given by eureka
and that service getting called.
 */

/*
we have define read and connect timeout for feign in properties file, lease check for more details.
 */
@FeignClient("limit-service")

/*
if we are using or not RibbonClient there are not effect, @FeignClient will take care of load balancing thing.
 */
//@RibbonClient("limit-service")
public interface LimitInterface {
    //we write the same mapping here also as we writes in controller class.
    @GetMapping("/getLimit/{accountId}")
    public ResponseEntity<LimitModel> getLimitByAccountId(@PathVariable("accountId") int accountId);
}
