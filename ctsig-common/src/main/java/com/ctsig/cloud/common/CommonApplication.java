package com.ctsig.cloud.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @copyright: CTSIG
 * @author: stephen
 * @email: shenzhaoxiang@gmail.com
 * @create: 2017-08-31 17:38
 * @since: 1.0.0
 * @des:
 * @history:
 * <version>      <time>       <author>        <desc>
 * -----------------------------------------------------------------------
 */
@Slf4j
public class CommonApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(CommonApplication.class, args);
        String[] activeProfiles = context.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles){
            log.info("String active profile:{}" ,profile);
        }
        log.info("应用程序启动完毕");
    }
}
