package com.kanghouchao.kubenetes.configmapstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigmapStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigmapStudyApplication.class, args);
    }

}
