package com.ctsig.cloud.gateway;

import com.ctsig.cloud.gateway.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @version: V1.0.0
 * @des: 网关
 * @author: CTSIG
 * @email: shenzhaoxiang@gmail.com
 * @date: 2017-08-10 16:49
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    /**
     * 安全测试，必须带 token 参数
     *
     * @return
     */
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
