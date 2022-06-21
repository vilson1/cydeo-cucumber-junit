package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage {
public OrderPage(){
    PageFactory.initElements(Driver.getDriver(),this);

}

@FindBy(xpath = "//select[@name='product']")
    public WebElement productDropdown;

@FindBy(xpath = "//input[@placeholder='Enter amount desired']")
    public WebElement inputQuantity;

@FindBy(name="name")
    public WebElement inputName;

    @FindBy(name="street")
    public WebElement inputStreet;

    @FindBy(name="city")
    public WebElement inputCity;

    @FindBy(name="state")
    public WebElement inputState;

    @FindBy(name="zip")
    public WebElement inputZip;

    @FindBy(name="card")
    public List<WebElement> cardType;

    @FindBy(xpath = "//input[@placeholder='The number on the card']")
    public WebElement inputCardNumber;

    @FindBy(xpath = "//input[@placeholder='e.g. 04/24']")
    public WebElement inputExpiryDate;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;



}
