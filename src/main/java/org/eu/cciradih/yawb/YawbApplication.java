package org.eu.cciradih.yawb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YawbApplication {
    public static void main(String[] args) {
        System.out.println("你好");
        SpringApplication.run(YawbApplication.class, args);
    }
}
