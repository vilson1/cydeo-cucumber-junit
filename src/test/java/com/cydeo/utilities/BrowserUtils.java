package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {
    //This method accepts an intiger which is for seconds and thread.sleep for the given duration.
    public static void sleep(int seconds){

        seconds*=1000;
        try {
            Thread.sleep(seconds);
        }catch (InterruptedException e){

        }

    }

    //3. When this method is called, it should switch window and verify title.

    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle){
        //4. Create a logic to switch to the tab where Etsy.com is open
        Set<String> windowHandles=Driver.getDriver().getWindowHandles();

        for (String each : windowHandles) {
            Driver.getDriver().switchTo().window(each);

            System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }
//            //5. Assert: Title contains “expectedTitle”
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    //This method accepts a String "expectedTitle" and  asserts if it's true

    public static void verifyTitle( String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    /**
     * this method will accept a string as expected value and verify if url contains it.
     * @param expectedInTitle
     */

    public static void verifyTitleContains(String expectedInTitle){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInTitle));

    }

    public static List<String> dropDownOptionsAsString(WebElement dropDownElement){


        Select select=new Select(dropDownElement);
        List<WebElement> actualOptionsAsWebElement= select.getOptions();

        List<String> actualOptionsAsString=new ArrayList<>();
        for (WebElement webElement : actualOptionsAsWebElement) {
            actualOptionsAsString.add(webElement.getText());

        }

        return  actualOptionsAsString;
    }

    public static void clickRadioButton( List<WebElement> radioButton, String attributeValue){


        for (WebElement each : radioButton) {
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }

        }

    }




}
