package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {
    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='searchInput']")

    public WebElement seachBox;

    @FindBy(xpath = "(//button[@class])[1]")

    public WebElement searchButton;

    @FindBy(xpath = "//h1")
    public WebElement header;
}
