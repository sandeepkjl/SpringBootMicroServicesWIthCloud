package com.example.limit.repository;

import com.example.limit.model.LimitModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class LimitRepository {
    @Value("${server.port}")
    private String port;

    @Value("${min.value}")
    private int minValue;
    @Value("${max.value}")
    private int maxValue;

    public LimitModel getLimitDetails(int id){
        // printing here port to see on which port number server is running to verify ribbon is working properly or not
        System.out.println("Server - Port "+port);

        return new LimitModel(minValue,maxValue);
    }
}
