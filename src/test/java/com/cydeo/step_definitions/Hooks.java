package com.cydeo.step_definitions;


import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */

public class Hooks {
    //import from io.cucumber.java not from junit
    //@Before
    public void setUpScenario(){
        System.out.println("setting up browser using cucumber @Before");

    }
    @After
    public void tearDownScenario(Scenario scenario){

        if (scenario.isFailed()){
            byte[] screenShot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());

        }


        //Driver.closeDriver();
        //System.out.println("closing browser using cucumber @After");
        //System.out.println("take SS if scenario fails");
    }

    //@BeforeStep
    public void setUpStep(){
        System.out.println("-----------Applayin BeforeStep");
    }

   // @AfterStep
    public void afterStep(){
        System.out.println("========== Aplyin after step");
    }
}
