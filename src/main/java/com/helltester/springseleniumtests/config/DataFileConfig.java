package com.helltester.springseleniumtests.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("data.properties")
public class DataFileConfig {

    @Value("${file.standardUsername}")
    private String standardUsername;

    @Value("${file.password}")
    private String password;

    public String getStandardUsername() {
        return standardUsername;
    }

    public void setStandardUsername(String standardUsername) {
        this.standardUsername = standardUsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}