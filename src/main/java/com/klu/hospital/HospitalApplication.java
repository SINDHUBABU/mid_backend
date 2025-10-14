package com.klu.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HospitalApplication extends SpringBootServletInitializer {

    // This method allows the application to be deployed as a WAR in Tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HospitalApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }
}
