package com.helltester.springseleniumtests.configs;

import com.helltester.springseleniumtests.config.SimpleConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SimpleConfigTest {

    @Autowired SimpleConfig simpleConfig;

    @Test
    void values() {
        assertEquals("https://www.saucedemo.com",
                simpleConfig.getBaseUrl());
        assertEquals("standard_user",
                simpleConfig.getUsername());
        assertEquals("secret_sauce",
                simpleConfig.getPassword());
    }
}

