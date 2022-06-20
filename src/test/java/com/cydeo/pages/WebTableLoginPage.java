package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='username']")

    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    public void login(){
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.loginButton.click();
    }
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();

    }
    public void loginWithConfig(){
        username.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        password.sendKeys(ConfigurationReader.getProperty("web.table.password"));
        loginButton.click();
    }
}
