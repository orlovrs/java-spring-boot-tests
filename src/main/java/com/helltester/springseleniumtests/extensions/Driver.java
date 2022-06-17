package com.helltester.springseleniumtests.extensions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope()
public class Driver {

    // This bean makes the tests green
    @Bean
    @ConditionalOnProperty(value = "framework.browser", havingValue = "chrome-test")
    @Scope("driverscope")
    WebDriver chromeTest() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(value = "framework.browser", havingValue = "chrome")
    @Scope("driverscope")
    WebDriver chrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(value = "framework.browser", havingValue = "firefox")
    @Scope("driverscope")
    WebDriver firefox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
