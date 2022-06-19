package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage=new GoogleSearchPage();

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("User is seeing title is Google");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Google");
    }

    @When("user types apple and clicks enter")
    public void user_types_apple_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

    }
    @Then("user sees apple in the Google title")
    public void user_sees_apple_in_the_google_title() {
        String expectedResult="apple - Kërko në Google";
        String actualResult=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedResult,actualResult);

    }

    @When("user types {string} and clicks enter")
    public void userTypesAndClicksEnter(String str) {
        googleSearchPage.searchBox.sendKeys("apple",Keys.ENTER);
    }

    @Then("user sees {string} in the Google title")
    public void userSeesInTheGoogleTitle(String str) {
        String expectedResult="apple - Kërko në Google";
        String actualResult=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
