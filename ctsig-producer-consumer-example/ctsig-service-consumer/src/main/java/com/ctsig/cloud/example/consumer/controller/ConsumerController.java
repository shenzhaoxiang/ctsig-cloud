package com.ctsig.cloud.example.consumer.controller;

import com.ctsig.cloud.example.consumer.service.ConsumerService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @version: V1.0
 * @des:
 * @author: CTSIG
 * @email: shenzhaoxiang@gmail.com
 * @date: 2017-08-09 22:03
 */
@RestController
public class ConsumerController {

//    @Autowired
//    ConsumerService consumerService ;

    @Autowired
    ConsumerService2 consumerService2 ;

//    @GetMapping("/consumer")
//    public String consumer() {
//        return consumerService.getConsumer();
//    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return consumerService2.sayHiFromClientOne(name);
    }
}
