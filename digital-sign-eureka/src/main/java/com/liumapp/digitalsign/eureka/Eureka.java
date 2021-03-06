package com.liumapp.digitalsign.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by liumapp on 2/26/18 2:11 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableEurekaServer
@SpringBootApplication(scanBasePackages = {"com.liumapp.digitalsign.eureka"})
public class Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Eureka.class , args);
    }

}
