package com.example.payment.configuration;

import com.example.payment.util.LimitUtil;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class BeanConfiguration {

    @Bean
    public LimitUtil getLimitUtil(){
        return new LimitUtil();
    }

    @Bean("Bean1")
    /* we are creating simple bean with below method*/
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean("Bean2")
    /*
    * we are creating Rest Template Bean using Rest Template Builder
    * We are having following advantage to create rest template by rest template builder
    * 1. we can customize Rest Template
    * 2. we can add timeout to Rest Template
    * 3. we can add interceptor
    * 4. we can add message converter(String, XML, JSON)
    * the details that we are not providing below we can google or watch any video and do that like interceptor and message converter
    * */
    public RestTemplate getRestTemplateByBuilder(RestTemplateBuilder builder){
        return builder
                .setReadTimeout(Duration.ofMillis(1000))
                .setConnectTimeout(Duration.ofMillis(1000)).
                        build();
    }
}
