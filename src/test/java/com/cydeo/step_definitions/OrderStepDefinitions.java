package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OrderStepDefinitions {
    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    OrderPage orderPage=new OrderPage();
    ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {


        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


        webTableLoginPage.login("Test","Tester");
        orderPage.order.click();
    }

    @When("user selects product type {string}")
    public void userSelectsProductType(String str) {
        Select select=new Select(orderPage.productDropdown);
        select.selectByVisibleText(str);
    }

//    @And("user enters quantity {int}")
//    public void userEntersQuantity(int nr) {
//        orderPage.inputQuantity.sendKeys(nr+"");
//    }


    @And("user enters customer name {string}")
    public void userEntersCustomerName(String str) {
        orderPage.inputName.sendKeys(str);
    }

    @And("user enters street {string}")
    public void userEntersStreet(String str) {
        orderPage.inputStreet.sendKeys(str);
    }

    @And("user enters city {string}")
    public void userEntersCity(String str) {
        orderPage.inputCity.sendKeys(str);
    }

    @And("user enters state {string}")
    public void userEntersState(String str) {
        orderPage.inputStreet.sendKeys(str);
    }

    @And("user enters zipcode {string}")
    public void userEntersZipcode(String str) {
        orderPage.inputZip.sendKeys(str);
    }

    @And("user selects credit card type {string}")
    public void userSelectsCreditCardType(String expectedCardType) {
        BrowserUtils.clickRadioButton(orderPage.cardType,expectedCardType);
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String str) {

        orderPage.inputCardNumber.sendKeys(str+"");
    }

    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String str) {
        orderPage.inputExpiryDate.sendKeys(str);
    }

    @And("user enters process order button")
    public void userEntersProcessOrderButton() {
        orderPage.submitButton.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String str) {
        viewAllOrdersPage.newCustomerCell.isDisplayed();
        Assert.assertTrue(viewAllOrdersPage.newCustomerCell.getText().equals(str));

    }

    @And("user enters quantity {int}")
    public void userEntersQuantity(int nr) {
        orderPage.inputQuantity.clear();
        orderPage.inputQuantity.sendKeys(nr+"");
    }
}
