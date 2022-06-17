package com.helltester.springseleniumtests.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("data")
public class DataPrefixConfig {

    private String standardUsername;
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