package com.ctsig.cloud.example.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @version: V1.0
 * @des:
 * @author: CTSIG
 * @email: shenzhaoxiang@gmail.com
 * @date: 2017-08-09 22:01
 */
@FeignClient("service-producer")
public interface ProducerClient {

    @GetMapping("/dc")
    String consumer();

}
