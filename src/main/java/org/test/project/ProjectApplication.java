package org.test.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        System.out.println("Starting project application");
        SpringApplication.run(ProjectApplication.class, args);
    }

}
