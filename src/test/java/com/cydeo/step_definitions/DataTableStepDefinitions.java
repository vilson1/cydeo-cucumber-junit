package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTableStepDefinitions {
    @Then("should see fruits i like")
    public void should_see_fruits_i_like(List<String> fruits) {
        System.out.println(fruits);

    }

}
