package com.training.rentcloud.configlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// just add @EnableConfigServer annotation to create configuration server. now can run configurations
// Configuration server gives the configuration data though HTTP.

@SpringBootApplication
@EnableConfigServer
public class ConfigLocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigLocalApplication.class, args);
    }

}
