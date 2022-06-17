package com.helltester.springseleniumtests.page.objects;

import com.helltester.springseleniumtests.pages.InventoryListPage;
import com.helltester.springseleniumtests.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
class MockedPageObjectTest {

    @Autowired private LoginPage loginPage;
    @MockBean private InventoryListPage inventoryListPage;

    @Test
    void mockPage() {
        when(inventoryListPage.isOnPage()).thenReturn(false);

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertFalse(inventoryListPage.isOnPage());
    }

    @Autowired private WebDriver driver;

    @AfterEach
    void teardown() {
        driver.quit();
    }
}

