package com.ctsig.cloud.example.producer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: V1.0.0
 * @des: 生产者示例
 * @author: CTSIG
 * @email: shenzhaoxiang@gmail.com
 * @date: 2017-08-09 21:34
 */
@RestController
public class ProducerController {
    Logger logger = LoggerFactory.getLogger(ProducerController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        logger.debug(services);
        return services;
    }

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i get service: "+discoveryClient.getServices() ;
    }
}
