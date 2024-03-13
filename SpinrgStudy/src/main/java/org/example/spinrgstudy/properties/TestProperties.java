package org.example.spinrgstudy.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "properties.test")
@Getter
@Setter
public class TestProperties {
    private String name;

}




