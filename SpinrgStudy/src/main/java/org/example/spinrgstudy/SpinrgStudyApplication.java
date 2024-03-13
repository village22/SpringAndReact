package org.example.spinrgstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan("org.example.spinrgstudy.properties")
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpinrgStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpinrgStudyApplication.class, args);
    }

}
