package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTable_StepDefinitions {

    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    @Given("user is in the login page of the app")
    public void user_is_in_the_login_page_of_the_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        webTableLoginPage.loginButton.click();

    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyTitleContains("orders");

    }

    @When("user enters username {string}")
    public void userEntersUsername(String str) {
        webTableLoginPage.username.sendKeys(str);


    }


    @And("user enters password {string}")
    public void userEntersPassword(String str) {
        webTableLoginPage.password.sendKeys(str);
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
       webTableLoginPage.login(username,password);
    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
        webTableLoginPage.username.sendKeys(credentials.get("username"));
        webTableLoginPage.password.sendKeys(credentials.get("password"));
        webTableLoginPage.loginButton.click();

    }
}
