package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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




}
