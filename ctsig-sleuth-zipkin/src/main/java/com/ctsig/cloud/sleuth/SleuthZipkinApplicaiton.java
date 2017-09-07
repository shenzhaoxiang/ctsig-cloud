package com.ctsig.cloud.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * @copyright: CTSIG
 * @author: stephen
 * @email: shenzhaoxiang@gmail.com
 * @create: 2017-09-06 17:44
 * @since: 1.0.0
 * @des:
 * @history: <version>      <time>       <author>        <desc>
 * -----------------------------------------------------------------------
 */
@SpringBootApplication
@EnableZipkinStreamServer
public class SleuthZipkinApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(SleuthZipkinApplicaiton.class, args);
    }
}
