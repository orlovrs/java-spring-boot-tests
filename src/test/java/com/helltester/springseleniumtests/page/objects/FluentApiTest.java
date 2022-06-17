package com.helltester.springseleniumtests.page.objects;

import com.helltester.springseleniumtests.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FluentApiTest {

    @Autowired private WebDriver driver;
    @Autowired private LoginPage loginPage;

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void test() {
        loginPage.open()
                .login("standard_user", "secret_sauce")
                .isOnPage();
    }
}

