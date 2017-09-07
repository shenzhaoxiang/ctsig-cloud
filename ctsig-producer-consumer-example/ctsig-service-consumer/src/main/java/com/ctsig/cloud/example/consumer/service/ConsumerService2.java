package com.ctsig.cloud.example.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @copyright: CTSIG
 * @author: stephen
 * @email: shenzhaoxiang@gmail.com
 * @create: 2017-09-05 09:58
 * @since: 1.0.0
 * @des:
 * @history: <version>      <time>       <author>        <desc>
 * -----------------------------------------------------------------------
 */
@FeignClient(value = "service-producer",fallback = ConsumerService2Fallback.class)
public interface ConsumerService2 {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
