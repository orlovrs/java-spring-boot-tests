package com.helltester.springseleniumtests.configs;

import com.helltester.springseleniumtests.config.AppPrefixConfig;
import com.helltester.springseleniumtests.config.DataPrefixConfig;
import com.helltester.springseleniumtests.config.FrameworkPrefixConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PrefixConfigTest {

    @Autowired AppPrefixConfig appPrefixConfig;
    @Autowired DataPrefixConfig dataPrefixConfig;
    @Autowired FrameworkPrefixConfig frameworkPrefixConfig;

    @Test
    void prefix() {
        assertEquals("https://www.saucedemo.com", appPrefixConfig.getBaseUrl());
        assertEquals("standard_user", dataPrefixConfig.getStandardUsername());
        assertEquals("secret_sauce", dataPrefixConfig.getPassword());
        assertEquals("chrome", frameworkPrefixConfig.getBrowser());
    }
}
