package com.ctsig.cloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @copyright: CTSIG
 * @author: stephen
 * @email: shenzhaoxiang@gmail.com
 * @create: 2017-09-06 16:39
 * @since: 1.0.0
 * @des:
 * @history:
 * <version>      <time>       <author>        <desc>
 * -----------------------------------------------------------------------
 */
@SpringBootApplication
public class StreamRabbitmqApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmqApplication.class,args) ;
    }
}
