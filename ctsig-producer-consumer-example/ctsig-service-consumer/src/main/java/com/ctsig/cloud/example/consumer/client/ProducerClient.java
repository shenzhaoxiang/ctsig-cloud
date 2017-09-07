//package com.ctsig.cloud.example.consumer.client;
//
//import com.ctsig.cloud.example.consumer.fallback.ProducerClientFallback;
//import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//
///**
// * @version: V1.0
// * @des:
// * @author: CTSIG
// * @email: shenzhaoxiang@gmail.com
// * @date: 2017-08-09 22:01
// */
//@Component
//@FeignClient(name = "service-producer", fallback = ProducerClientFallback.class)
//public interface ProducerClient {
//
//    @GetMapping("/dc")
//    String consumer();
//
//}
