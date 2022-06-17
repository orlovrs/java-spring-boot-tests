package com.helltester.springseleniumtests.configs;

import com.helltester.springseleniumtests.config.FrameworkPrefixConfig;
import com.helltester.springseleniumtests.config.SimpleConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class ProfilesConfigTest {

    @Autowired SimpleConfig simpleConfigTest;
    @Autowired FrameworkPrefixConfig frameworkFileConfig;

    @Test
    void profile() {
        assertEquals("https://www.saucedemo-test.com", simpleConfigTest.getBaseUrl());
        assertEquals("chrome-test", frameworkFileConfig.getBrowser());
    }
}
