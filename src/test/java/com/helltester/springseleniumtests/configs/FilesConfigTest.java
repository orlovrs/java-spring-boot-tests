package com.helltester.springseleniumtests.configs;

import com.helltester.springseleniumtests.config.AppFileConfig;
import com.helltester.springseleniumtests.config.AppPrefixConfig;
import com.helltester.springseleniumtests.config.DataFileConfig;
import com.helltester.springseleniumtests.config.DataPrefixConfig;
import com.helltester.springseleniumtests.config.FrameworkFileConfig;
import com.helltester.springseleniumtests.config.FrameworkPrefixConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FilesConfigTest {

    @Autowired AppFileConfig appFileConfig;
    @Autowired DataFileConfig dataFileConfig;
    @Autowired FrameworkFileConfig frameworkFileConfig;

    @Test
    void multipleFiles() {
        assertEquals("https://www.saucedemo-dev.com", appFileConfig.getBaseUrl());
        assertEquals("standard_user_dev", dataFileConfig.getStandardUsername());
        assertEquals("secret_sauce_dev", dataFileConfig.getPassword());
        assertEquals("chrome-dev", frameworkFileConfig.getBrowser());
    }
}

