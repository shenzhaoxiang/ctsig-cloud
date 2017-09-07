package com.ctsig.cloud.example.consumer.service;

import org.springframework.stereotype.Component;

/**
 * @copyright: CTSIG
 * @author: stephen
 * @email: shenzhaoxiang@gmail.com
 * @create: 2017-09-05 09:59
 * @since: 1.0.0
 * @des:
 * @history: <version>      <time>       <author>        <desc>
 * -----------------------------------------------------------------------
 */
@Component
public class ConsumerService2Fallback implements ConsumerService2 {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
