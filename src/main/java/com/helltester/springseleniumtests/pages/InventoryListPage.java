package com.helltester.springseleniumtests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class InventoryListPage {

    @Autowired private WebDriver driver;

    @FindBy(how = How.CSS, using = "div.inventory_list")
    private WebElement inventoryList;

    @PostConstruct
    public void initElements() {
        PageFactory.initElements(driver, this);
    }

    public boolean isOnPage() {
        return this.inventoryList.isDisplayed();
    }
}

