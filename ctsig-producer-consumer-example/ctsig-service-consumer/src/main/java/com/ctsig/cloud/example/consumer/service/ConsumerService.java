package com.ctsig.cloud.example.consumer.service;

import com.ctsig.cloud.example.consumer.client.ProducerClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @version: V1.0
 * @des:
 * @author: CTSIG
 * @email: shenzhaoxiang@gmail.com
 * @date: 2017-08-09 23:11
 */
@Component
public class ConsumerService {
    @Autowired
    ProducerClient provideClient;

    @HystrixCommand(fallbackMethod = "fallback")
    public String getConsumer(){
        return provideClient.consumer() ;
    }

    public String fallback() {
        return "fallback";
    }
}
