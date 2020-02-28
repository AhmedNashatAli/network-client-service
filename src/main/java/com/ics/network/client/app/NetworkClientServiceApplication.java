package com.ics.network.client.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class NetworkClientServiceApplication {

    public static void main(final String[] args) {
        SpringApplication.run(NetworkClientServiceApplication.class, args);
    }

}
