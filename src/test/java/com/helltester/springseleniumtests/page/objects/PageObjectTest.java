package com.helltester.springseleniumtests.page.objects;

import com.helltester.springseleniumtests.pages.InventoryListPage;
import com.helltester.springseleniumtests.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class PageObjectTest {

    @Autowired private WebDriver driver;

    @Autowired private LoginPage loginPage;
    @Autowired private InventoryListPage inventoryListPage;

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void test() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test
    void test2() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(inventoryListPage.isOnPage());
    }
}

