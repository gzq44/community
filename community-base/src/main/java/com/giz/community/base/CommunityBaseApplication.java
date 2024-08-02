package com.giz.community.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class CommunityBaseApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(CommunityBaseApplication.class, args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
