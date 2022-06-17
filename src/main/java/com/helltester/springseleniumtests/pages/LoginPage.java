package com.helltester.springseleniumtests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LoginPage {

    @Autowired private WebDriver driver;
    @Autowired private ApplicationContext applicationContext;

    public InventoryListPage login (String login, String pass) {
        usernameInput.sendKeys(login);
        passwordInput.sendKeys(pass);
        loginButton.click();
        return applicationContext.getBean(InventoryListPage.class);
    }

    public LoginPage open() {
        driver.get("https://www.saucedemo.com/");
        return this;
    }

    @FindBy(how = How.ID, using = "user-name")
    private WebElement usernameInput;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordInput;

    @FindBy(how = How.ID, using = "login-button")
    private WebElement loginButton;

    @PostConstruct
    public void initElements() {
        PageFactory.initElements(driver, this);
    }
}

