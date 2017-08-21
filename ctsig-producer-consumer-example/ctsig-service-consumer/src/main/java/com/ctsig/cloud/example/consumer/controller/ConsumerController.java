package com.ctsig.cloud.example.consumer.controller;

import com.ctsig.cloud.example.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: V1.0
 * @des:
 * @author: CTSIG
 * @email: shenzhaoxiang@gmail.com
 * @date: 2017-08-09 22:03
 */
@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService ;

    @GetMapping("/consumer")
    public String consumer() {
        return consumerService.getConsumer();
    }
}
