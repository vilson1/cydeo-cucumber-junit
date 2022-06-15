package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should be able to see the dashboard");
    }


    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");

    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("use enters admin username")
    public void useEntersAdminUsername() {
        System.out.println("user enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters student password");
    }
}
