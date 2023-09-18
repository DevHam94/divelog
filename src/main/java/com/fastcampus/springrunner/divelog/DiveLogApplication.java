package com.fastcampus.springrunner.divelog;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class DiveLogApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DiveLogApplication.class, args);
        SpringApplication application = new SpringApplication(DiveLogApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
    }

}
