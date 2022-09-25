package org.edu.tmf.tmf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TmfApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmfApplication.class, args);
    }

}
