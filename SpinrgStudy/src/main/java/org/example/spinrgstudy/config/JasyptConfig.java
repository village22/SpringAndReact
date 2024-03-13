package org.example.spinrgstudy.config;

import lombok.RequiredArgsConstructor;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class JasyptConfig {

//    @Value("${jasypt.encryptor.password}")
//    private String password;
//
//    @Value("${jasypt.encryptor.algorithm}")
//    private String algorithm;
//
//    @Bean("jasyptStringEncryptor2")
//    public StringEncryptor stringEncryptor() {
//
//        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
//        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
//
//        config.setPassword(password); // encrypt key
//        config.setAlgorithm(algorithm);
//        config.setPoolSize("1");
////        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
////        config.setStringOutputType("base64");
//        encryptor.setConfig(config);
//
//        return encryptor;
//    }
}
