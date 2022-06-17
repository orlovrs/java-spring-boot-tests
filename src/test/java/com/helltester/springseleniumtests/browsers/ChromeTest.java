package com.helltester.springseleniumtests.browsers;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("chrome")
class ChromeTest {

    @Autowired private WebDriver driver;

    @Test
    void chromeTest() {}
}