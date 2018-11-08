package com.johnhunsley.oauth2.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

public class ClientApplication {

    @SpringBootApplication
    public class UiApplication extends SpringBootServletInitializer {

        @Bean
        public RequestContextListener requestContextListener() {
            return new RequestContextListener();
        }

        public static void main(String[] args) {
            SpringApplication.run(ClientApplication.class, args);
        }
    }
}
