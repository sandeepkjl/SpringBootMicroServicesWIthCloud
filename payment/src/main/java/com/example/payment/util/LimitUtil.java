package com.example.payment.util;

import com.example.payment.model.LimitModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class LimitUtil {
    @Autowired
    LoadBalancerClient client;
    @Autowired
    @Qualifier("Bean2")
    private RestTemplate restTemplate;

    /*
    Here we are calling limit service by normal Rest Client
     * We have Defined Bean Config in Configuration package plese see that class for more details
     *
     * */
    public  LimitModel checkLimit1(int id){

        /*
        basic way to get server instance and call downstream api with eureka, ribbon nd rest template
         * We are choosing the server based on availability bu choose method and create url with host and port nad calling
         * the downstream api with restTemplate
         *
         * */

        ServiceInstance instance = client.choose("limit-service");
        System.out.println(instance.getPort());
        URI uri = URI.create(String.format("http://%s:%s",instance.getHost(),instance.getPort()));
        String url= uri.toString()+"getLimit"+"/101";

        HttpHeaders headers = new HttpHeaders();
        headers.add("accept","application/json");
        ResponseEntity<LimitModel> reponse =
                restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers),LimitModel.class);



        return reponse.getBody();
    }

    public LimitModel checkLimit2(int id){

        /*
        basic way to get server instance and call downstream api with eureka, ribbon nd rest template
         * We are choosing the server based on availability bu choose method and create url with host and port nad calling
         * the downstream api with restTemplate
         *
         * */

        ServiceInstance instance = client.choose("limit-service");
        System.out.println(instance.getPort());
        URI uri = URI.create(String.format("http://%s:%s",instance.getHost(),instance.getPort()));
        String url= uri.toString()+"getLimit"+"/101";

        HttpHeaders headers = new HttpHeaders();
        headers.add("accept","application/json");
        ResponseEntity<LimitModel> reponse =
                restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers),LimitModel.class);



        return reponse.getBody();
    }
}
