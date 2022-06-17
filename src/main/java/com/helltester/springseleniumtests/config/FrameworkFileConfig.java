package com.helltester.springseleniumtests.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("browser.properties")
public class FrameworkFileConfig {

    @Value("${file.browser}")
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
}